// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/api_plugin_proxy.proto

package com.windchat.proto.server;

public final class ApiPluginProxyProto {
  private ApiPluginProxyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiPluginProxyRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiPluginProxyRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *插件ID
     * </pre>
     *
     * <code>optional string plugin_id = 1;</code>
     */
    String getPluginId();
    /**
     * <pre>
     *插件ID
     * </pre>
     *
     * <code>optional string plugin_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getPluginIdBytes();

    /**
     * <pre>
     *插件执行的接口
     * </pre>
     *
     * <code>optional string api = 2;</code>
     */
    String getApi();
    /**
     * <pre>
     *插件执行的接口
     * </pre>
     *
     * <code>optional string api = 2;</code>
     */
    com.google.protobuf.ByteString
        getApiBytes();

    /**
     * <pre>
     *调用接口所需参数
     * </pre>
     *
     * <code>optional string params = 3;</code>
     */
    String getParams();
    /**
     * <pre>
     *调用接口所需参数
     * </pre>
     *
     * <code>optional string params = 3;</code>
     */
    com.google.protobuf.ByteString
        getParamsBytes();
  }
  /**
   * Protobuf type {@code site.ApiPluginProxyRequest}
   */
  public  static final class ApiPluginProxyRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiPluginProxyRequest, ApiPluginProxyRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiPluginProxyRequest)
      ApiPluginProxyRequestOrBuilder {
    private ApiPluginProxyRequest() {
      pluginId_ = "";
      api_ = "";
      params_ = "";
    }
    public static final int PLUGIN_ID_FIELD_NUMBER = 1;
    private String pluginId_;
    /**
     * <pre>
     *插件ID
     * </pre>
     *
     * <code>optional string plugin_id = 1;</code>
     */
    public String getPluginId() {
      return pluginId_;
    }
    /**
     * <pre>
     *插件ID
     * </pre>
     *
     * <code>optional string plugin_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPluginIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(pluginId_);
    }
    /**
     * <pre>
     *插件ID
     * </pre>
     *
     * <code>optional string plugin_id = 1;</code>
     */
    private void setPluginId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      pluginId_ = value;
    }
    /**
     * <pre>
     *插件ID
     * </pre>
     *
     * <code>optional string plugin_id = 1;</code>
     */
    private void clearPluginId() {

      pluginId_ = getDefaultInstance().getPluginId();
    }
    /**
     * <pre>
     *插件ID
     * </pre>
     *
     * <code>optional string plugin_id = 1;</code>
     */
    private void setPluginIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      pluginId_ = value.toStringUtf8();
    }

    public static final int API_FIELD_NUMBER = 2;
    private String api_;
    /**
     * <pre>
     *插件执行的接口
     * </pre>
     *
     * <code>optional string api = 2;</code>
     */
    public String getApi() {
      return api_;
    }
    /**
     * <pre>
     *插件执行的接口
     * </pre>
     *
     * <code>optional string api = 2;</code>
     */
    public com.google.protobuf.ByteString
        getApiBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(api_);
    }
    /**
     * <pre>
     *插件执行的接口
     * </pre>
     *
     * <code>optional string api = 2;</code>
     */
    private void setApi(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      api_ = value;
    }
    /**
     * <pre>
     *插件执行的接口
     * </pre>
     *
     * <code>optional string api = 2;</code>
     */
    private void clearApi() {

      api_ = getDefaultInstance().getApi();
    }
    /**
     * <pre>
     *插件执行的接口
     * </pre>
     *
     * <code>optional string api = 2;</code>
     */
    private void setApiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      api_ = value.toStringUtf8();
    }

    public static final int PARAMS_FIELD_NUMBER = 3;
    private String params_;
    /**
     * <pre>
     *调用接口所需参数
     * </pre>
     *
     * <code>optional string params = 3;</code>
     */
    public String getParams() {
      return params_;
    }
    /**
     * <pre>
     *调用接口所需参数
     * </pre>
     *
     * <code>optional string params = 3;</code>
     */
    public com.google.protobuf.ByteString
        getParamsBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(params_);
    }
    /**
     * <pre>
     *调用接口所需参数
     * </pre>
     *
     * <code>optional string params = 3;</code>
     */
    private void setParams(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      params_ = value;
    }
    /**
     * <pre>
     *调用接口所需参数
     * </pre>
     *
     * <code>optional string params = 3;</code>
     */
    private void clearParams() {

      params_ = getDefaultInstance().getParams();
    }
    /**
     * <pre>
     *调用接口所需参数
     * </pre>
     *
     * <code>optional string params = 3;</code>
     */
    private void setParamsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      params_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!pluginId_.isEmpty()) {
        output.writeString(1, getPluginId());
      }
      if (!api_.isEmpty()) {
        output.writeString(2, getApi());
      }
      if (!params_.isEmpty()) {
        output.writeString(3, getParams());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!pluginId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getPluginId());
      }
      if (!api_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getApi());
      }
      if (!params_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getParams());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiPluginProxyRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiPluginProxyRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiPluginProxyRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiPluginProxyRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiPluginProxyRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiPluginProxyRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiPluginProxyRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiPluginProxyRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiPluginProxyRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiPluginProxyRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiPluginProxyRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiPluginProxyRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiPluginProxyRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiPluginProxyRequest)
        ApiPluginProxyRequestOrBuilder {
      // Construct using com.windchat.proto.server.ApiPluginProxyProto.ApiPluginProxyRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *插件ID
       * </pre>
       *
       * <code>optional string plugin_id = 1;</code>
       */
      public String getPluginId() {
        return instance.getPluginId();
      }
      /**
       * <pre>
       *插件ID
       * </pre>
       *
       * <code>optional string plugin_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getPluginIdBytes() {
        return instance.getPluginIdBytes();
      }
      /**
       * <pre>
       *插件ID
       * </pre>
       *
       * <code>optional string plugin_id = 1;</code>
       */
      public Builder setPluginId(
          String value) {
        copyOnWrite();
        instance.setPluginId(value);
        return this;
      }
      /**
       * <pre>
       *插件ID
       * </pre>
       *
       * <code>optional string plugin_id = 1;</code>
       */
      public Builder clearPluginId() {
        copyOnWrite();
        instance.clearPluginId();
        return this;
      }
      /**
       * <pre>
       *插件ID
       * </pre>
       *
       * <code>optional string plugin_id = 1;</code>
       */
      public Builder setPluginIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPluginIdBytes(value);
        return this;
      }

      /**
       * <pre>
       *插件执行的接口
       * </pre>
       *
       * <code>optional string api = 2;</code>
       */
      public String getApi() {
        return instance.getApi();
      }
      /**
       * <pre>
       *插件执行的接口
       * </pre>
       *
       * <code>optional string api = 2;</code>
       */
      public com.google.protobuf.ByteString
          getApiBytes() {
        return instance.getApiBytes();
      }
      /**
       * <pre>
       *插件执行的接口
       * </pre>
       *
       * <code>optional string api = 2;</code>
       */
      public Builder setApi(
          String value) {
        copyOnWrite();
        instance.setApi(value);
        return this;
      }
      /**
       * <pre>
       *插件执行的接口
       * </pre>
       *
       * <code>optional string api = 2;</code>
       */
      public Builder clearApi() {
        copyOnWrite();
        instance.clearApi();
        return this;
      }
      /**
       * <pre>
       *插件执行的接口
       * </pre>
       *
       * <code>optional string api = 2;</code>
       */
      public Builder setApiBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setApiBytes(value);
        return this;
      }

      /**
       * <pre>
       *调用接口所需参数
       * </pre>
       *
       * <code>optional string params = 3;</code>
       */
      public String getParams() {
        return instance.getParams();
      }
      /**
       * <pre>
       *调用接口所需参数
       * </pre>
       *
       * <code>optional string params = 3;</code>
       */
      public com.google.protobuf.ByteString
          getParamsBytes() {
        return instance.getParamsBytes();
      }
      /**
       * <pre>
       *调用接口所需参数
       * </pre>
       *
       * <code>optional string params = 3;</code>
       */
      public Builder setParams(
          String value) {
        copyOnWrite();
        instance.setParams(value);
        return this;
      }
      /**
       * <pre>
       *调用接口所需参数
       * </pre>
       *
       * <code>optional string params = 3;</code>
       */
      public Builder clearParams() {
        copyOnWrite();
        instance.clearParams();
        return this;
      }
      /**
       * <pre>
       *调用接口所需参数
       * </pre>
       *
       * <code>optional string params = 3;</code>
       */
      public Builder setParamsBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setParamsBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiPluginProxyRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiPluginProxyRequest();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          ApiPluginProxyRequest other = (ApiPluginProxyRequest) arg1;
          pluginId_ = visitor.visitString(!pluginId_.isEmpty(), pluginId_,
              !other.pluginId_.isEmpty(), other.pluginId_);
          api_ = visitor.visitString(!api_.isEmpty(), api_,
              !other.api_.isEmpty(), other.api_);
          params_ = visitor.visitString(!params_.isEmpty(), params_,
              !other.params_.isEmpty(), other.params_);
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  String s = input.readStringRequireUtf8();

                  pluginId_ = s;
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  api_ = s;
                  break;
                }
                case 26: {
                  String s = input.readStringRequireUtf8();

                  params_ = s;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (ApiPluginProxyRequest.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:site.ApiPluginProxyRequest)
    private static final ApiPluginProxyRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiPluginProxyRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiPluginProxyRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiPluginProxyRequest> PARSER;

    public static com.google.protobuf.Parser<ApiPluginProxyRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiPluginProxyResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiPluginProxyResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *返回的数据
     * </pre>
     *
     * <code>optional bytes data = 1;</code>
     */
    com.google.protobuf.ByteString getData();

    /**
     * <pre>
     *客户端需要的cookie
     * </pre>
     *
     * <code>map&lt;string, string&gt; cookie = 2;</code>
     */
    int getCookieCount();
    /**
     * <pre>
     *客户端需要的cookie
     * </pre>
     *
     * <code>map&lt;string, string&gt; cookie = 2;</code>
     */
    boolean containsCookie(
            String key);
    /**
     * Use {@link #getCookieMap()} instead.
     */
    @Deprecated
    java.util.Map<String, String>
    getCookie();
    /**
     * <pre>
     *客户端需要的cookie
     * </pre>
     *
     * <code>map&lt;string, string&gt; cookie = 2;</code>
     */
    java.util.Map<String, String>
    getCookieMap();
    /**
     * <pre>
     *客户端需要的cookie
     * </pre>
     *
     * <code>map&lt;string, string&gt; cookie = 2;</code>
     */

    String getCookieOrDefault(
            String key,
            String defaultValue);
    /**
     * <pre>
     *客户端需要的cookie
     * </pre>
     *
     * <code>map&lt;string, string&gt; cookie = 2;</code>
     */

    String getCookieOrThrow(
            String key);
  }
  /**
   * Protobuf type {@code site.ApiPluginProxyResponse}
   */
  public  static final class ApiPluginProxyResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiPluginProxyResponse, ApiPluginProxyResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiPluginProxyResponse)
      ApiPluginProxyResponseOrBuilder {
    private ApiPluginProxyResponse() {
      data_ = com.google.protobuf.ByteString.EMPTY;
    }
    private int bitField0_;
    public static final int DATA_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString data_;
    /**
     * <pre>
     *返回的数据
     * </pre>
     *
     * <code>optional bytes data = 1;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     *返回的数据
     * </pre>
     *
     * <code>optional bytes data = 1;</code>
     */
    private void setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }

      data_ = value;
    }
    /**
     * <pre>
     *返回的数据
     * </pre>
     *
     * <code>optional bytes data = 1;</code>
     */
    private void clearData() {

      data_ = getDefaultInstance().getData();
    }

    public static final int COOKIE_FIELD_NUMBER = 2;
    private static final class CookieDefaultEntryHolder {
      static final com.google.protobuf.MapEntryLite<
          String, String> defaultEntry =
              com.google.protobuf.MapEntryLite
              .<String, String>newDefaultInstance(
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "");
    }
    private com.google.protobuf.MapFieldLite<
        String, String> cookie_ =
            com.google.protobuf.MapFieldLite.emptyMapField();
    private com.google.protobuf.MapFieldLite<String, String>
    internalGetCookie() {
      return cookie_;
    }
    private com.google.protobuf.MapFieldLite<String, String>
    internalGetMutableCookie() {
      if (!cookie_.isMutable()) {
        cookie_ = cookie_.mutableCopy();
      }
      return cookie_;
    }

    public int getCookieCount() {
      return internalGetCookie().size();
    }
    /**
     * <pre>
     *客户端需要的cookie
     * </pre>
     *
     * <code>map&lt;string, string&gt; cookie = 2;</code>
     */

    public boolean containsCookie(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      return internalGetCookie().containsKey(key);
    }
    /**
     * Use {@link #getCookieMap()} instead.
     */
    @Deprecated
    public java.util.Map<String, String> getCookie() {
      return getCookieMap();
    }
    /**
     * <pre>
     *客户端需要的cookie
     * </pre>
     *
     * <code>map&lt;string, string&gt; cookie = 2;</code>
     */

    public java.util.Map<String, String> getCookieMap() {
      return java.util.Collections.unmodifiableMap(
          internalGetCookie());
    }
    /**
     * <pre>
     *客户端需要的cookie
     * </pre>
     *
     * <code>map&lt;string, string&gt; cookie = 2;</code>
     */

    public String getCookieOrDefault(
        String key,
        String defaultValue) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetCookie();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     *客户端需要的cookie
     * </pre>
     *
     * <code>map&lt;string, string&gt; cookie = 2;</code>
     */

    public String getCookieOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetCookie();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }
    /**
     * <pre>
     *客户端需要的cookie
     * </pre>
     *
     * <code>map&lt;string, string&gt; cookie = 2;</code>
     */
    private java.util.Map<String, String>
    getMutableCookieMap() {
      return internalGetMutableCookie();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!data_.isEmpty()) {
        output.writeBytes(1, data_);
      }
      for (java.util.Map.Entry<String, String> entry
           : internalGetCookie().entrySet()) {
        CookieDefaultEntryHolder.defaultEntry.serializeTo(
            output, 2, entry.getKey(), entry.getValue());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!data_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, data_);
      }
      for (java.util.Map.Entry<String, String> entry
           : internalGetCookie().entrySet()) {
        size += CookieDefaultEntryHolder.defaultEntry.computeMessageSize(
          2, entry.getKey(), entry.getValue());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiPluginProxyResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiPluginProxyResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiPluginProxyResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiPluginProxyResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiPluginProxyResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiPluginProxyResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiPluginProxyResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiPluginProxyResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiPluginProxyResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiPluginProxyResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiPluginProxyResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiPluginProxyResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiPluginProxyResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiPluginProxyResponse)
        ApiPluginProxyResponseOrBuilder {
      // Construct using com.windchat.proto.server.ApiPluginProxyProto.ApiPluginProxyResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *返回的数据
       * </pre>
       *
       * <code>optional bytes data = 1;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return instance.getData();
      }
      /**
       * <pre>
       *返回的数据
       * </pre>
       *
       * <code>optional bytes data = 1;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setData(value);
        return this;
      }
      /**
       * <pre>
       *返回的数据
       * </pre>
       *
       * <code>optional bytes data = 1;</code>
       */
      public Builder clearData() {
        copyOnWrite();
        instance.clearData();
        return this;
      }


      public int getCookieCount() {
        return instance.getCookieMap().size();
      }
      /**
       * <pre>
       *客户端需要的cookie
       * </pre>
       *
       * <code>map&lt;string, string&gt; cookie = 2;</code>
       */

      public boolean containsCookie(
          String key) {
        if (key == null) { throw new NullPointerException(); }
        return instance.getCookieMap().containsKey(key);
      }

      public Builder clearCookie() {
        copyOnWrite();
        instance.getMutableCookieMap().clear();
        return this;
      }
      /**
       * <pre>
       *客户端需要的cookie
       * </pre>
       *
       * <code>map&lt;string, string&gt; cookie = 2;</code>
       */

      public Builder removeCookie(
          String key) {
        if (key == null) { throw new NullPointerException(); }
        copyOnWrite();
        instance.getMutableCookieMap().remove(key);
        return this;
      }
      /**
       * Use {@link #getCookieMap()} instead.
       */
      @Deprecated
      public java.util.Map<String, String> getCookie() {
        return getCookieMap();
      }
      /**
       * <pre>
       *客户端需要的cookie
       * </pre>
       *
       * <code>map&lt;string, string&gt; cookie = 2;</code>
       */
      public java.util.Map<String, String> getCookieMap() {
        return java.util.Collections.unmodifiableMap(
            instance.getCookieMap());
      }
      /**
       * <pre>
       *客户端需要的cookie
       * </pre>
       *
       * <code>map&lt;string, string&gt; cookie = 2;</code>
       */

      public String getCookieOrDefault(
          String key,
          String defaultValue) {
        if (key == null) { throw new NullPointerException(); }
        java.util.Map<String, String> map =
            instance.getCookieMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <pre>
       *客户端需要的cookie
       * </pre>
       *
       * <code>map&lt;string, string&gt; cookie = 2;</code>
       */

      public String getCookieOrThrow(
          String key) {
        if (key == null) { throw new NullPointerException(); }
        java.util.Map<String, String> map =
            instance.getCookieMap();
        if (!map.containsKey(key)) {
          throw new IllegalArgumentException();
        }
        return map.get(key);
      }
      /**
       * <pre>
       *客户端需要的cookie
       * </pre>
       *
       * <code>map&lt;string, string&gt; cookie = 2;</code>
       */
      public Builder putCookie(
          String key,
          String value) {
        if (key == null) { throw new NullPointerException(); }
        if (value == null) { throw new NullPointerException(); }
        copyOnWrite();
        instance.getMutableCookieMap().put(key, value);
        return this;
      }
      /**
       * <pre>
       *客户端需要的cookie
       * </pre>
       *
       * <code>map&lt;string, string&gt; cookie = 2;</code>
       */
      public Builder putAllCookie(
          java.util.Map<String, String> values) {
        copyOnWrite();
        instance.getMutableCookieMap().putAll(values);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiPluginProxyResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiPluginProxyResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          cookie_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          ApiPluginProxyResponse other = (ApiPluginProxyResponse) arg1;
          data_ = visitor.visitByteString(data_ != com.google.protobuf.ByteString.EMPTY, data_,
              other.data_ != com.google.protobuf.ByteString.EMPTY, other.data_);
          cookie_ = visitor.visitMap(
              cookie_, other.internalGetCookie());
          if (visitor == MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 10: {

                  data_ = input.readBytes();
                  break;
                }
                case 18: {
                  if (!cookie_.isMutable()) {
                    cookie_ = cookie_.mutableCopy();
                  }
                  CookieDefaultEntryHolder.defaultEntry.parseInto(cookie_, input, extensionRegistry);  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (ApiPluginProxyResponse.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:site.ApiPluginProxyResponse)
    private static final ApiPluginProxyResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiPluginProxyResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiPluginProxyResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiPluginProxyResponse> PARSER;

    public static com.google.protobuf.Parser<ApiPluginProxyResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
