// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/im_site_hello.proto

package com.windchat.proto.server;

public final class ImSiteHelloProto {
  private ImSiteHelloProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ImSiteHelloRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ImSiteHelloRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *客户端版本号
     * </pre>
     *
     * <code>optional string client_version = 1;</code>
     */
    String getClientVersion();
    /**
     * <pre>
     *客户端版本号
     * </pre>
     *
     * <code>optional string client_version = 1;</code>
     */
    com.google.protobuf.ByteString
        getClientVersionBytes();
  }
  /**
   * Protobuf type {@code site.ImSiteHelloRequest}
   */
  public  static final class ImSiteHelloRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ImSiteHelloRequest, ImSiteHelloRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ImSiteHelloRequest)
      ImSiteHelloRequestOrBuilder {
    private ImSiteHelloRequest() {
      clientVersion_ = "";
    }
    public static final int CLIENT_VERSION_FIELD_NUMBER = 1;
    private String clientVersion_;
    /**
     * <pre>
     *客户端版本号
     * </pre>
     *
     * <code>optional string client_version = 1;</code>
     */
    public String getClientVersion() {
      return clientVersion_;
    }
    /**
     * <pre>
     *客户端版本号
     * </pre>
     *
     * <code>optional string client_version = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClientVersionBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(clientVersion_);
    }
    /**
     * <pre>
     *客户端版本号
     * </pre>
     *
     * <code>optional string client_version = 1;</code>
     */
    private void setClientVersion(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      clientVersion_ = value;
    }
    /**
     * <pre>
     *客户端版本号
     * </pre>
     *
     * <code>optional string client_version = 1;</code>
     */
    private void clearClientVersion() {

      clientVersion_ = getDefaultInstance().getClientVersion();
    }
    /**
     * <pre>
     *客户端版本号
     * </pre>
     *
     * <code>optional string client_version = 1;</code>
     */
    private void setClientVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      clientVersion_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!clientVersion_.isEmpty()) {
        output.writeString(1, getClientVersion());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!clientVersion_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getClientVersion());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ImSiteHelloRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ImSiteHelloRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ImSiteHelloRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ImSiteHelloRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ImSiteHelloRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ImSiteHelloRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ImSiteHelloRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ImSiteHelloRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ImSiteHelloRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ImSiteHelloRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ImSiteHelloRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ImSiteHelloRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ImSiteHelloRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ImSiteHelloRequest)
        ImSiteHelloRequestOrBuilder {
      // Construct using com.windchat.proto.server.ImSiteHelloProto.ImSiteHelloRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *客户端版本号
       * </pre>
       *
       * <code>optional string client_version = 1;</code>
       */
      public String getClientVersion() {
        return instance.getClientVersion();
      }
      /**
       * <pre>
       *客户端版本号
       * </pre>
       *
       * <code>optional string client_version = 1;</code>
       */
      public com.google.protobuf.ByteString
          getClientVersionBytes() {
        return instance.getClientVersionBytes();
      }
      /**
       * <pre>
       *客户端版本号
       * </pre>
       *
       * <code>optional string client_version = 1;</code>
       */
      public Builder setClientVersion(
          String value) {
        copyOnWrite();
        instance.setClientVersion(value);
        return this;
      }
      /**
       * <pre>
       *客户端版本号
       * </pre>
       *
       * <code>optional string client_version = 1;</code>
       */
      public Builder clearClientVersion() {
        copyOnWrite();
        instance.clearClientVersion();
        return this;
      }
      /**
       * <pre>
       *客户端版本号
       * </pre>
       *
       * <code>optional string client_version = 1;</code>
       */
      public Builder setClientVersionBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setClientVersionBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ImSiteHelloRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ImSiteHelloRequest();
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
          ImSiteHelloRequest other = (ImSiteHelloRequest) arg1;
          clientVersion_ = visitor.visitString(!clientVersion_.isEmpty(), clientVersion_,
              !other.clientVersion_.isEmpty(), other.clientVersion_);
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

                  clientVersion_ = s;
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
          if (PARSER == null) {    synchronized (ImSiteHelloRequest.class) {
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


    // @@protoc_insertion_point(class_scope:site.ImSiteHelloRequest)
    private static final ImSiteHelloRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ImSiteHelloRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ImSiteHelloRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ImSiteHelloRequest> PARSER;

    public static com.google.protobuf.Parser<ImSiteHelloRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ImSiteHelloResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ImSiteHelloResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *站点端版本号
     * </pre>
     *
     * <code>optional string site_version = 1;</code>
     */
    String getSiteVersion();
    /**
     * <pre>
     *站点端版本号
     * </pre>
     *
     * <code>optional string site_version = 1;</code>
     */
    com.google.protobuf.ByteString
        getSiteVersionBytes();
  }
  /**
   * Protobuf type {@code site.ImSiteHelloResponse}
   */
  public  static final class ImSiteHelloResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ImSiteHelloResponse, ImSiteHelloResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ImSiteHelloResponse)
      ImSiteHelloResponseOrBuilder {
    private ImSiteHelloResponse() {
      siteVersion_ = "";
    }
    public static final int SITE_VERSION_FIELD_NUMBER = 1;
    private String siteVersion_;
    /**
     * <pre>
     *站点端版本号
     * </pre>
     *
     * <code>optional string site_version = 1;</code>
     */
    public String getSiteVersion() {
      return siteVersion_;
    }
    /**
     * <pre>
     *站点端版本号
     * </pre>
     *
     * <code>optional string site_version = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSiteVersionBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(siteVersion_);
    }
    /**
     * <pre>
     *站点端版本号
     * </pre>
     *
     * <code>optional string site_version = 1;</code>
     */
    private void setSiteVersion(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      siteVersion_ = value;
    }
    /**
     * <pre>
     *站点端版本号
     * </pre>
     *
     * <code>optional string site_version = 1;</code>
     */
    private void clearSiteVersion() {

      siteVersion_ = getDefaultInstance().getSiteVersion();
    }
    /**
     * <pre>
     *站点端版本号
     * </pre>
     *
     * <code>optional string site_version = 1;</code>
     */
    private void setSiteVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      siteVersion_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!siteVersion_.isEmpty()) {
        output.writeString(1, getSiteVersion());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!siteVersion_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSiteVersion());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ImSiteHelloResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ImSiteHelloResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ImSiteHelloResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ImSiteHelloResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ImSiteHelloResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ImSiteHelloResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ImSiteHelloResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ImSiteHelloResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ImSiteHelloResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ImSiteHelloResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ImSiteHelloResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ImSiteHelloResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ImSiteHelloResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ImSiteHelloResponse)
        ImSiteHelloResponseOrBuilder {
      // Construct using com.windchat.proto.server.ImSiteHelloProto.ImSiteHelloResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *站点端版本号
       * </pre>
       *
       * <code>optional string site_version = 1;</code>
       */
      public String getSiteVersion() {
        return instance.getSiteVersion();
      }
      /**
       * <pre>
       *站点端版本号
       * </pre>
       *
       * <code>optional string site_version = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSiteVersionBytes() {
        return instance.getSiteVersionBytes();
      }
      /**
       * <pre>
       *站点端版本号
       * </pre>
       *
       * <code>optional string site_version = 1;</code>
       */
      public Builder setSiteVersion(
          String value) {
        copyOnWrite();
        instance.setSiteVersion(value);
        return this;
      }
      /**
       * <pre>
       *站点端版本号
       * </pre>
       *
       * <code>optional string site_version = 1;</code>
       */
      public Builder clearSiteVersion() {
        copyOnWrite();
        instance.clearSiteVersion();
        return this;
      }
      /**
       * <pre>
       *站点端版本号
       * </pre>
       *
       * <code>optional string site_version = 1;</code>
       */
      public Builder setSiteVersionBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSiteVersionBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ImSiteHelloResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ImSiteHelloResponse();
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
          ImSiteHelloResponse other = (ImSiteHelloResponse) arg1;
          siteVersion_ = visitor.visitString(!siteVersion_.isEmpty(), siteVersion_,
              !other.siteVersion_.isEmpty(), other.siteVersion_);
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

                  siteVersion_ = s;
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
          if (PARSER == null) {    synchronized (ImSiteHelloResponse.class) {
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


    // @@protoc_insertion_point(class_scope:site.ImSiteHelloResponse)
    private static final ImSiteHelloResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ImSiteHelloResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ImSiteHelloResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ImSiteHelloResponse> PARSER;

    public static com.google.protobuf.Parser<ImSiteHelloResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}