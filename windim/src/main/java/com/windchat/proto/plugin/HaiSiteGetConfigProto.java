// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin/hai_site_getConfig.proto

package com.windchat.proto.plugin;

public final class HaiSiteGetConfigProto {
  private HaiSiteGetConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface HaiSiteGetConfigRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiSiteGetConfigRequest)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * <pre>
   **
   *获取站点的配置
   *----
   *接口名
   *----
   * /hai/site/getConfig
   *错误码
   *----
   *- success
   *- error.alert
   * </pre>
   *
   * Protobuf type {@code plugin.HaiSiteGetConfigRequest}
   */
  public  static final class HaiSiteGetConfigRequest extends
      com.google.protobuf.GeneratedMessageLite<
          HaiSiteGetConfigRequest, HaiSiteGetConfigRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiSiteGetConfigRequest)
      HaiSiteGetConfigRequestOrBuilder {
    private HaiSiteGetConfigRequest() {
    }
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiSiteGetConfigRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiSiteGetConfigRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiSiteGetConfigRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiSiteGetConfigRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiSiteGetConfigRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiSiteGetConfigRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiSiteGetConfigRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiSiteGetConfigRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiSiteGetConfigRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiSiteGetConfigRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiSiteGetConfigRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     **
     *获取站点的配置
     *----
     *接口名
     *----
     * /hai/site/getConfig
     *错误码
     *----
     *- success
     *- error.alert
     * </pre>
     *
     * Protobuf type {@code plugin.HaiSiteGetConfigRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiSiteGetConfigRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiSiteGetConfigRequest)
        HaiSiteGetConfigRequestOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiSiteGetConfigProto.HaiSiteGetConfigRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:plugin.HaiSiteGetConfigRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiSiteGetConfigRequest();
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
          HaiSiteGetConfigRequest other = (HaiSiteGetConfigRequest) arg1;
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
          if (PARSER == null) {    synchronized (HaiSiteGetConfigRequest.class) {
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


    // @@protoc_insertion_point(class_scope:plugin.HaiSiteGetConfigRequest)
    private static final HaiSiteGetConfigRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiSiteGetConfigRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiSiteGetConfigRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiSiteGetConfigRequest> PARSER;

    public static com.google.protobuf.Parser<HaiSiteGetConfigRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface HaiSiteGetConfigResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiSiteGetConfigResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteBackConfig site_config = 1;</code>
     */
    boolean hasSiteConfig();
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteBackConfig site_config = 1;</code>
     */
    com.windchat.proto.core.ConfigProto.SiteBackConfig getSiteConfig();
  }
  /**
   * Protobuf type {@code plugin.HaiSiteGetConfigResponse}
   */
  public  static final class HaiSiteGetConfigResponse extends
      com.google.protobuf.GeneratedMessageLite<
          HaiSiteGetConfigResponse, HaiSiteGetConfigResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiSiteGetConfigResponse)
      HaiSiteGetConfigResponseOrBuilder {
    private HaiSiteGetConfigResponse() {
    }
    public static final int SITE_CONFIG_FIELD_NUMBER = 1;
    private com.windchat.proto.core.ConfigProto.SiteBackConfig siteConfig_;
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteBackConfig site_config = 1;</code>
     */
    public boolean hasSiteConfig() {
      return siteConfig_ != null;
    }
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteBackConfig site_config = 1;</code>
     */
    public com.windchat.proto.core.ConfigProto.SiteBackConfig getSiteConfig() {
      return siteConfig_ == null ? com.windchat.proto.core.ConfigProto.SiteBackConfig.getDefaultInstance() : siteConfig_;
    }
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteBackConfig site_config = 1;</code>
     */
    private void setSiteConfig(com.windchat.proto.core.ConfigProto.SiteBackConfig value) {
      if (value == null) {
        throw new NullPointerException();
      }
      siteConfig_ = value;

      }
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteBackConfig site_config = 1;</code>
     */
    private void setSiteConfig(
        com.windchat.proto.core.ConfigProto.SiteBackConfig.Builder builderForValue) {
      siteConfig_ = builderForValue.build();

    }
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteBackConfig site_config = 1;</code>
     */
    private void mergeSiteConfig(com.windchat.proto.core.ConfigProto.SiteBackConfig value) {
      if (siteConfig_ != null &&
          siteConfig_ != com.windchat.proto.core.ConfigProto.SiteBackConfig.getDefaultInstance()) {
        siteConfig_ =
          com.windchat.proto.core.ConfigProto.SiteBackConfig.newBuilder(siteConfig_).mergeFrom(value).buildPartial();
      } else {
        siteConfig_ = value;
      }

    }
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteBackConfig site_config = 1;</code>
     */
    private void clearSiteConfig() {  siteConfig_ = null;

    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (siteConfig_ != null) {
        output.writeMessage(1, getSiteConfig());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (siteConfig_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSiteConfig());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiSiteGetConfigResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiSiteGetConfigResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiSiteGetConfigResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiSiteGetConfigResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiSiteGetConfigResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiSiteGetConfigResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiSiteGetConfigResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiSiteGetConfigResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiSiteGetConfigResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiSiteGetConfigResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiSiteGetConfigResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code plugin.HaiSiteGetConfigResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiSiteGetConfigResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiSiteGetConfigResponse)
        HaiSiteGetConfigResponseOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiSiteGetConfigProto.HaiSiteGetConfigResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *信息配置，Key为SiteConfigKey
       * </pre>
       *
       * <code>optional .core.SiteBackConfig site_config = 1;</code>
       */
      public boolean hasSiteConfig() {
        return instance.hasSiteConfig();
      }
      /**
       * <pre>
       *信息配置，Key为SiteConfigKey
       * </pre>
       *
       * <code>optional .core.SiteBackConfig site_config = 1;</code>
       */
      public com.windchat.proto.core.ConfigProto.SiteBackConfig getSiteConfig() {
        return instance.getSiteConfig();
      }
      /**
       * <pre>
       *信息配置，Key为SiteConfigKey
       * </pre>
       *
       * <code>optional .core.SiteBackConfig site_config = 1;</code>
       */
      public Builder setSiteConfig(com.windchat.proto.core.ConfigProto.SiteBackConfig value) {
        copyOnWrite();
        instance.setSiteConfig(value);
        return this;
        }
      /**
       * <pre>
       *信息配置，Key为SiteConfigKey
       * </pre>
       *
       * <code>optional .core.SiteBackConfig site_config = 1;</code>
       */
      public Builder setSiteConfig(
          com.windchat.proto.core.ConfigProto.SiteBackConfig.Builder builderForValue) {
        copyOnWrite();
        instance.setSiteConfig(builderForValue);
        return this;
      }
      /**
       * <pre>
       *信息配置，Key为SiteConfigKey
       * </pre>
       *
       * <code>optional .core.SiteBackConfig site_config = 1;</code>
       */
      public Builder mergeSiteConfig(com.windchat.proto.core.ConfigProto.SiteBackConfig value) {
        copyOnWrite();
        instance.mergeSiteConfig(value);
        return this;
      }
      /**
       * <pre>
       *信息配置，Key为SiteConfigKey
       * </pre>
       *
       * <code>optional .core.SiteBackConfig site_config = 1;</code>
       */
      public Builder clearSiteConfig() {  copyOnWrite();
        instance.clearSiteConfig();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:plugin.HaiSiteGetConfigResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiSiteGetConfigResponse();
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
          HaiSiteGetConfigResponse other = (HaiSiteGetConfigResponse) arg1;
          siteConfig_ = visitor.visitMessage(siteConfig_, other.siteConfig_);
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
                  com.windchat.proto.core.ConfigProto.SiteBackConfig.Builder subBuilder = null;
                  if (siteConfig_ != null) {
                    subBuilder = siteConfig_.toBuilder();
                  }
                  siteConfig_ = input.readMessage(com.windchat.proto.core.ConfigProto.SiteBackConfig.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(siteConfig_);
                    siteConfig_ = subBuilder.buildPartial();
                  }

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
          if (PARSER == null) {    synchronized (HaiSiteGetConfigResponse.class) {
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


    // @@protoc_insertion_point(class_scope:plugin.HaiSiteGetConfigResponse)
    private static final HaiSiteGetConfigResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiSiteGetConfigResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiSiteGetConfigResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiSiteGetConfigResponse> PARSER;

    public static com.google.protobuf.Parser<HaiSiteGetConfigResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
