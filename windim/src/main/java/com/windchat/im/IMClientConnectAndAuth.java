package com.windchat.im;


import com.windchat.im.bean.Site;
import com.windchat.im.bean.Version;
import com.windchat.im.socket.Connection;
import com.windchat.im.socket.TransportPackageForRequest;
import com.windchat.im.socket.TransportPackageForResponse;
import com.windchat.logger.ZalyLogUtils;
import com.windchat.proto.server.ImSiteAuthProto;
import com.windchat.proto.server.ImSiteHelloProto;

import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.Callable;

import static com.windchat.im.socket.Connection.STATUS_AUTH_LOGIN;
import static com.windchat.im.socket.Connection.STATUS_AUTH_SUCCESS;

/**
 * Created by sssl on 09/06/2018.
 */

public class IMClientConnectAndAuth implements Callable<Boolean> {

    private String logTag = "IMClient.ConnectAndAuth";

    private IMClient client;
    private Site site;

    public IMClientConnectAndAuth(IMClient client) {
        this.client = client;
        site = new Site(client.address.getHost(), client.address.getPort());
    }

    // 打日志
    private String logMessage(String log) {
        return String.format(
                "%s site:%s",
                log,
                this.client.address.getFullUrl()
        );
    }

    /**
     * IM hello
     *
     * @return
     */
    protected boolean hello() throws Exception {
        ImSiteHelloProto.ImSiteHelloRequest request = ImSiteHelloProto.ImSiteHelloRequest.newBuilder()
                .setClientVersion("0.0.1")
                .build();

        TransportPackageForRequest tRequest = new TransportPackageForRequest(ZalyIM.Action.Hello, request);
        TransportPackageForResponse tResponse = this.client.imConnection.requestAndResponse(tRequest, false);

        ImSiteHelloProto.ImSiteHelloResponse response = ImSiteHelloProto.ImSiteHelloResponse.parseFrom(tResponse.data.getData());
        if (response != null) {
            Version siteVersion = new Version(response.getSiteVersion());
            return siteVersion.isCorrect();
        }
        return false;
    }

    /**
     * IM 认证
     *
     * @return
     */
    protected boolean auth(Site site) {

        try {
            Site siteInfo = site;
            String sessionId = siteInfo.getSiteSessionId();

            if (StringUtils.isEmpty(sessionId)) {
                throw new Exception("ZalyIM.userSessionId is empty!");
            }

            ZalyLogUtils.getInstance().debug(
                    this.logTag,
                    " siteAddress is " + this.client.address.getFullUrl()
                            + " userId is " + siteInfo.getSiteUserId()
                            + " session id Is " + sessionId
            );

            ImSiteAuthProto.ImSiteAuthRequest request = ImSiteAuthProto.ImSiteAuthRequest.newBuilder()
                    .setSiteSessionId(sessionId)
                    .setSiteUserId(siteInfo.getSiteUserId())
                    .build();

            TransportPackageForRequest tRequest = new TransportPackageForRequest(ZalyIM.Action.Auth, request);
            TransportPackageForResponse tResponse = this.client.imConnection.requestAndResponse(tRequest, false);

            if (tResponse.data.getErr() != null) {
                try {
                    return ZalyIM.IM_SUCCESS.equals(tResponse.data.getErr().getCode());
                } catch (Exception e) {
                    ZalyLogUtils.getInstance().debug(this.logTag, e.getMessage());
                    return false;
                }
            }
        } catch (Exception e) {
            ZalyLogUtils.getInstance().debug(this.logTag, e.getClass().getName() + " " + e.getMessage());
        }
        return false;
    }

    @Override
    public Boolean call() throws Exception {

        boolean isError = false;

        try {
            ZalyLogUtils.getInstance().debug(logTag, logMessage("doConnectTask "));

            this.client.imConnection.connect();

            if (hello()) {
                if (auth(site)) {
                    this.client.authSuccessed = true;
                    this.client.keepAlivedWorker.start();
                    this.client.sendConnectionStatus(STATUS_AUTH_SUCCESS);
                    return true;
                } else {
                    isError = true;
                    this.client.sendConnectionStatus(STATUS_AUTH_LOGIN);
                    return false;
                    // 通知某个地方去登录换取Session
                    ///throw new Exception("auth fail");
                }
            } else {
                ZalyLogUtils.getInstance().debug(logTag, logMessage("hello action fail "));
            }

            isError = true;
            this.client.sendConnectionStatus(Connection.STATUS_AUTH_FAIL);
        } catch (Exception e) {
            isError = true;

            ZalyLogUtils.getInstance().error(logTag, e, "");

            // 不处理注册，login接口处理注册

            this.client.sendConnectionStatus(Connection.STATUS_CONN_RETRY);
            return false;
        } finally {
            // 状态修改
            this.client.isDoingConnectAndAuth = false;

            if (isError) {
                this.client.closeSocketWithError(new RuntimeException("hello/auth failed."));
            }
        }
        return false;
    }

}
