// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: platform/api_setting_deleteUserToken.proto

package com.windchat.proto.platform;

public final class ApiSettingDeleteUserTokenProto {
  private ApiSettingDeleteUserTokenProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiSettingDeleteUserTokenRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiSettingDeleteUserTokenRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *站点host
     * </pre>
     *
     * <code>optional string site_host = 1;</code>
     */
    String getSiteHost();
    /**
     * <pre>
     *站点host
     * </pre>
     *
     * <code>optional string site_host = 1;</code>
     */
    com.google.protobuf.ByteString
        getSiteHostBytes();

    /**
     * <pre>
     *站点port
     * </pre>
     *
     * <code>optional int32 site_port = 2;</code>
     */
    int getSitePort();
  }
  /**
   * Protobuf type {@code site.ApiSettingDeleteUserTokenRequest}
   */
  public  static final class ApiSettingDeleteUserTokenRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiSettingDeleteUserTokenRequest, ApiSettingDeleteUserTokenRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiSettingDeleteUserTokenRequest)
      ApiSettingDeleteUserTokenRequestOrBuilder {
    private ApiSettingDeleteUserTokenRequest() {
      siteHost_ = "";
    }
    public static final int SITE_HOST_FIELD_NUMBER = 1;
    private String siteHost_;
    /**
     * <pre>
     *站点host
     * </pre>
     *
     * <code>optional string site_host = 1;</code>
     */
    public String getSiteHost() {
      return siteHost_;
    }
    /**
     * <pre>
     *站点host
     * </pre>
     *
     * <code>optional string site_host = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSiteHostBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(siteHost_);
    }
    /**
     * <pre>
     *站点host
     * </pre>
     *
     * <code>optional string site_host = 1;</code>
     */
    private void setSiteHost(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      siteHost_ = value;
    }
    /**
     * <pre>
     *站点host
     * </pre>
     *
     * <code>optional string site_host = 1;</code>
     */
    private void clearSiteHost() {

      siteHost_ = getDefaultInstance().getSiteHost();
    }
    /**
     * <pre>
     *站点host
     * </pre>
     *
     * <code>optional string site_host = 1;</code>
     */
    private void setSiteHostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      siteHost_ = value.toStringUtf8();
    }

    public static final int SITE_PORT_FIELD_NUMBER = 2;
    private int sitePort_;
    /**
     * <pre>
     *站点port
     * </pre>
     *
     * <code>optional int32 site_port = 2;</code>
     */
    public int getSitePort() {
      return sitePort_;
    }
    /**
     * <pre>
     *站点port
     * </pre>
     *
     * <code>optional int32 site_port = 2;</code>
     */
    private void setSitePort(int value) {

      sitePort_ = value;
    }
    /**
     * <pre>
     *站点port
     * </pre>
     *
     * <code>optional int32 site_port = 2;</code>
     */
    private void clearSitePort() {

      sitePort_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!siteHost_.isEmpty()) {
        output.writeString(1, getSiteHost());
      }
      if (sitePort_ != 0) {
        output.writeInt32(2, sitePort_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!siteHost_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSiteHost());
      }
      if (sitePort_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, sitePort_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiSettingDeleteUserTokenRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiSettingDeleteUserTokenRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiSettingDeleteUserTokenRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiSettingDeleteUserTokenRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiSettingDeleteUserTokenRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiSettingDeleteUserTokenRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiSettingDeleteUserTokenRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiSettingDeleteUserTokenRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiSettingDeleteUserTokenRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiSettingDeleteUserTokenRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiSettingDeleteUserTokenRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiSettingDeleteUserTokenRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiSettingDeleteUserTokenRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiSettingDeleteUserTokenRequest)
        ApiSettingDeleteUserTokenRequestOrBuilder {
      // Construct using com.windchat.proto.platform.ApiSettingDeleteUserTokenProto.ApiSettingDeleteUserTokenRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *站点host
       * </pre>
       *
       * <code>optional string site_host = 1;</code>
       */
      public String getSiteHost() {
        return instance.getSiteHost();
      }
      /**
       * <pre>
       *站点host
       * </pre>
       *
       * <code>optional string site_host = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSiteHostBytes() {
        return instance.getSiteHostBytes();
      }
      /**
       * <pre>
       *站点host
       * </pre>
       *
       * <code>optional string site_host = 1;</code>
       */
      public Builder setSiteHost(
          String value) {
        copyOnWrite();
        instance.setSiteHost(value);
        return this;
      }
      /**
       * <pre>
       *站点host
       * </pre>
       *
       * <code>optional string site_host = 1;</code>
       */
      public Builder clearSiteHost() {
        copyOnWrite();
        instance.clearSiteHost();
        return this;
      }
      /**
       * <pre>
       *站点host
       * </pre>
       *
       * <code>optional string site_host = 1;</code>
       */
      public Builder setSiteHostBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSiteHostBytes(value);
        return this;
      }

      /**
       * <pre>
       *站点port
       * </pre>
       *
       * <code>optional int32 site_port = 2;</code>
       */
      public int getSitePort() {
        return instance.getSitePort();
      }
      /**
       * <pre>
       *站点port
       * </pre>
       *
       * <code>optional int32 site_port = 2;</code>
       */
      public Builder setSitePort(int value) {
        copyOnWrite();
        instance.setSitePort(value);
        return this;
      }
      /**
       * <pre>
       *站点port
       * </pre>
       *
       * <code>optional int32 site_port = 2;</code>
       */
      public Builder clearSitePort() {
        copyOnWrite();
        instance.clearSitePort();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiSettingDeleteUserTokenRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiSettingDeleteUserTokenRequest();
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
          ApiSettingDeleteUserTokenRequest other = (ApiSettingDeleteUserTokenRequest) arg1;
          siteHost_ = visitor.visitString(!siteHost_.isEmpty(), siteHost_,
              !other.siteHost_.isEmpty(), other.siteHost_);
          sitePort_ = visitor.visitInt(sitePort_ != 0, sitePort_,
              other.sitePort_ != 0, other.sitePort_);
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

                  siteHost_ = s;
                  break;
                }
                case 16: {

                  sitePort_ = input.readInt32();
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
          if (PARSER == null) {    synchronized (ApiSettingDeleteUserTokenRequest.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiSettingDeleteUserTokenRequest)
    private static final ApiSettingDeleteUserTokenRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiSettingDeleteUserTokenRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiSettingDeleteUserTokenRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiSettingDeleteUserTokenRequest> PARSER;

    public static com.google.protobuf.Parser<ApiSettingDeleteUserTokenRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiSettingDeleteUserTokenResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiSettingDeleteUserTokenResponse)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code site.ApiSettingDeleteUserTokenResponse}
   */
  public  static final class ApiSettingDeleteUserTokenResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiSettingDeleteUserTokenResponse, ApiSettingDeleteUserTokenResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiSettingDeleteUserTokenResponse)
      ApiSettingDeleteUserTokenResponseOrBuilder {
    private ApiSettingDeleteUserTokenResponse() {
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

    public static ApiSettingDeleteUserTokenResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiSettingDeleteUserTokenResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiSettingDeleteUserTokenResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiSettingDeleteUserTokenResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiSettingDeleteUserTokenResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiSettingDeleteUserTokenResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiSettingDeleteUserTokenResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiSettingDeleteUserTokenResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiSettingDeleteUserTokenResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiSettingDeleteUserTokenResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiSettingDeleteUserTokenResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiSettingDeleteUserTokenResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiSettingDeleteUserTokenResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiSettingDeleteUserTokenResponse)
        ApiSettingDeleteUserTokenResponseOrBuilder {
      // Construct using com.windchat.proto.platform.ApiSettingDeleteUserTokenProto.ApiSettingDeleteUserTokenResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:site.ApiSettingDeleteUserTokenResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiSettingDeleteUserTokenResponse();
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
          ApiSettingDeleteUserTokenResponse other = (ApiSettingDeleteUserTokenResponse) arg1;
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
          if (PARSER == null) {    synchronized (ApiSettingDeleteUserTokenResponse.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiSettingDeleteUserTokenResponse)
    private static final ApiSettingDeleteUserTokenResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiSettingDeleteUserTokenResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiSettingDeleteUserTokenResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiSettingDeleteUserTokenResponse> PARSER;

    public static com.google.protobuf.Parser<ApiSettingDeleteUserTokenResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
