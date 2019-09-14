// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/api_web_auth.proto

package com.windchat.proto.server;

public final class ApiWebAuthProto {
  private ApiWebAuthProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiWebAuthRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiWebAuthRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *webim 二维码产生的验证key
     * </pre>
     *
     * <code>optional string session_id = 1;</code>
     */
    String getSessionId();
    /**
     * <pre>
     *webim 二维码产生的验证key
     * </pre>
     *
     * <code>optional string session_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getSessionIdBytes();
  }
  /**
   * Protobuf type {@code site.ApiWebAuthRequest}
   */
  public  static final class ApiWebAuthRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiWebAuthRequest, ApiWebAuthRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiWebAuthRequest)
      ApiWebAuthRequestOrBuilder {
    private ApiWebAuthRequest() {
      sessionId_ = "";
    }
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private String sessionId_;
    /**
     * <pre>
     *webim 二维码产生的验证key
     * </pre>
     *
     * <code>optional string session_id = 1;</code>
     */
    public String getSessionId() {
      return sessionId_;
    }
    /**
     * <pre>
     *webim 二维码产生的验证key
     * </pre>
     *
     * <code>optional string session_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(sessionId_);
    }
    /**
     * <pre>
     *webim 二维码产生的验证key
     * </pre>
     *
     * <code>optional string session_id = 1;</code>
     */
    private void setSessionId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      sessionId_ = value;
    }
    /**
     * <pre>
     *webim 二维码产生的验证key
     * </pre>
     *
     * <code>optional string session_id = 1;</code>
     */
    private void clearSessionId() {

      sessionId_ = getDefaultInstance().getSessionId();
    }
    /**
     * <pre>
     *webim 二维码产生的验证key
     * </pre>
     *
     * <code>optional string session_id = 1;</code>
     */
    private void setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      sessionId_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!sessionId_.isEmpty()) {
        output.writeString(1, getSessionId());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!sessionId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSessionId());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiWebAuthRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiWebAuthRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiWebAuthRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiWebAuthRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiWebAuthRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiWebAuthRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiWebAuthRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiWebAuthRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiWebAuthRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiWebAuthRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiWebAuthRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiWebAuthRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiWebAuthRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiWebAuthRequest)
        ApiWebAuthRequestOrBuilder {
      // Construct using com.windchat.proto.server.ApiWebAuthProto.ApiWebAuthRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *webim 二维码产生的验证key
       * </pre>
       *
       * <code>optional string session_id = 1;</code>
       */
      public String getSessionId() {
        return instance.getSessionId();
      }
      /**
       * <pre>
       *webim 二维码产生的验证key
       * </pre>
       *
       * <code>optional string session_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSessionIdBytes() {
        return instance.getSessionIdBytes();
      }
      /**
       * <pre>
       *webim 二维码产生的验证key
       * </pre>
       *
       * <code>optional string session_id = 1;</code>
       */
      public Builder setSessionId(
          String value) {
        copyOnWrite();
        instance.setSessionId(value);
        return this;
      }
      /**
       * <pre>
       *webim 二维码产生的验证key
       * </pre>
       *
       * <code>optional string session_id = 1;</code>
       */
      public Builder clearSessionId() {
        copyOnWrite();
        instance.clearSessionId();
        return this;
      }
      /**
       * <pre>
       *webim 二维码产生的验证key
       * </pre>
       *
       * <code>optional string session_id = 1;</code>
       */
      public Builder setSessionIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSessionIdBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiWebAuthRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiWebAuthRequest();
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
          ApiWebAuthRequest other = (ApiWebAuthRequest) arg1;
          sessionId_ = visitor.visitString(!sessionId_.isEmpty(), sessionId_,
              !other.sessionId_.isEmpty(), other.sessionId_);
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

                  sessionId_ = s;
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
          if (PARSER == null) {    synchronized (ApiWebAuthRequest.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiWebAuthRequest)
    private static final ApiWebAuthRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiWebAuthRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiWebAuthRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiWebAuthRequest> PARSER;

    public static com.google.protobuf.Parser<ApiWebAuthRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiWebAuthResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiWebAuthResponse)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code site.ApiWebAuthResponse}
   */
  public  static final class ApiWebAuthResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiWebAuthResponse, ApiWebAuthResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiWebAuthResponse)
      ApiWebAuthResponseOrBuilder {
    private ApiWebAuthResponse() {
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

    public static ApiWebAuthResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiWebAuthResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiWebAuthResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiWebAuthResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiWebAuthResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiWebAuthResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiWebAuthResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiWebAuthResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiWebAuthResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiWebAuthResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiWebAuthResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiWebAuthResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiWebAuthResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiWebAuthResponse)
        ApiWebAuthResponseOrBuilder {
      // Construct using com.windchat.proto.server.ApiWebAuthProto.ApiWebAuthResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:site.ApiWebAuthResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiWebAuthResponse();
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
          ApiWebAuthResponse other = (ApiWebAuthResponse) arg1;
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
          if (PARSER == null) {    synchronized (ApiWebAuthResponse.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiWebAuthResponse)
    private static final ApiWebAuthResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiWebAuthResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiWebAuthResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiWebAuthResponse> PARSER;

    public static com.google.protobuf.Parser<ApiWebAuthResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
