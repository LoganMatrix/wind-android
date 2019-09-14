// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/api_friend_mute.proto

package com.windchat.proto.server;

public final class ApiFriendMuteProto {
  private ApiFriendMuteProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiFriendMuteRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiFriendMuteRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *好友用户ID
     * </pre>
     *
     * <code>optional string site_friend_id = 1;</code>
     */
    String getSiteFriendId();
    /**
     * <pre>
     *好友用户ID
     * </pre>
     *
     * <code>optional string site_friend_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getSiteFriendIdBytes();
  }
  /**
   * Protobuf type {@code site.ApiFriendMuteRequest}
   */
  public  static final class ApiFriendMuteRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiFriendMuteRequest, ApiFriendMuteRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiFriendMuteRequest)
      ApiFriendMuteRequestOrBuilder {
    private ApiFriendMuteRequest() {
      siteFriendId_ = "";
    }
    public static final int SITE_FRIEND_ID_FIELD_NUMBER = 1;
    private String siteFriendId_;
    /**
     * <pre>
     *好友用户ID
     * </pre>
     *
     * <code>optional string site_friend_id = 1;</code>
     */
    public String getSiteFriendId() {
      return siteFriendId_;
    }
    /**
     * <pre>
     *好友用户ID
     * </pre>
     *
     * <code>optional string site_friend_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSiteFriendIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(siteFriendId_);
    }
    /**
     * <pre>
     *好友用户ID
     * </pre>
     *
     * <code>optional string site_friend_id = 1;</code>
     */
    private void setSiteFriendId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      siteFriendId_ = value;
    }
    /**
     * <pre>
     *好友用户ID
     * </pre>
     *
     * <code>optional string site_friend_id = 1;</code>
     */
    private void clearSiteFriendId() {

      siteFriendId_ = getDefaultInstance().getSiteFriendId();
    }
    /**
     * <pre>
     *好友用户ID
     * </pre>
     *
     * <code>optional string site_friend_id = 1;</code>
     */
    private void setSiteFriendIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      siteFriendId_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!siteFriendId_.isEmpty()) {
        output.writeString(1, getSiteFriendId());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!siteFriendId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSiteFriendId());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiFriendMuteRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFriendMuteRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFriendMuteRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFriendMuteRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFriendMuteRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFriendMuteRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFriendMuteRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiFriendMuteRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFriendMuteRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFriendMuteRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiFriendMuteRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiFriendMuteRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiFriendMuteRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiFriendMuteRequest)
        ApiFriendMuteRequestOrBuilder {
      // Construct using com.windchat.proto.server.ApiFriendMuteProto.ApiFriendMuteRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *好友用户ID
       * </pre>
       *
       * <code>optional string site_friend_id = 1;</code>
       */
      public String getSiteFriendId() {
        return instance.getSiteFriendId();
      }
      /**
       * <pre>
       *好友用户ID
       * </pre>
       *
       * <code>optional string site_friend_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSiteFriendIdBytes() {
        return instance.getSiteFriendIdBytes();
      }
      /**
       * <pre>
       *好友用户ID
       * </pre>
       *
       * <code>optional string site_friend_id = 1;</code>
       */
      public Builder setSiteFriendId(
          String value) {
        copyOnWrite();
        instance.setSiteFriendId(value);
        return this;
      }
      /**
       * <pre>
       *好友用户ID
       * </pre>
       *
       * <code>optional string site_friend_id = 1;</code>
       */
      public Builder clearSiteFriendId() {
        copyOnWrite();
        instance.clearSiteFriendId();
        return this;
      }
      /**
       * <pre>
       *好友用户ID
       * </pre>
       *
       * <code>optional string site_friend_id = 1;</code>
       */
      public Builder setSiteFriendIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSiteFriendIdBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiFriendMuteRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiFriendMuteRequest();
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
          ApiFriendMuteRequest other = (ApiFriendMuteRequest) arg1;
          siteFriendId_ = visitor.visitString(!siteFriendId_.isEmpty(), siteFriendId_,
              !other.siteFriendId_.isEmpty(), other.siteFriendId_);
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

                  siteFriendId_ = s;
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
          if (PARSER == null) {    synchronized (ApiFriendMuteRequest.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiFriendMuteRequest)
    private static final ApiFriendMuteRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiFriendMuteRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiFriendMuteRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiFriendMuteRequest> PARSER;

    public static com.google.protobuf.Parser<ApiFriendMuteRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiFriendMuteResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiFriendMuteResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *消息免打扰 mute notifications
     * </pre>
     *
     * <code>optional bool mute = 1;</code>
     */
    boolean getMute();
  }
  /**
   * Protobuf type {@code site.ApiFriendMuteResponse}
   */
  public  static final class ApiFriendMuteResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiFriendMuteResponse, ApiFriendMuteResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiFriendMuteResponse)
      ApiFriendMuteResponseOrBuilder {
    private ApiFriendMuteResponse() {
    }
    public static final int MUTE_FIELD_NUMBER = 1;
    private boolean mute_;
    /**
     * <pre>
     *消息免打扰 mute notifications
     * </pre>
     *
     * <code>optional bool mute = 1;</code>
     */
    public boolean getMute() {
      return mute_;
    }
    /**
     * <pre>
     *消息免打扰 mute notifications
     * </pre>
     *
     * <code>optional bool mute = 1;</code>
     */
    private void setMute(boolean value) {

      mute_ = value;
    }
    /**
     * <pre>
     *消息免打扰 mute notifications
     * </pre>
     *
     * <code>optional bool mute = 1;</code>
     */
    private void clearMute() {

      mute_ = false;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (mute_ != false) {
        output.writeBool(1, mute_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (mute_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, mute_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiFriendMuteResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFriendMuteResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFriendMuteResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFriendMuteResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFriendMuteResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFriendMuteResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFriendMuteResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiFriendMuteResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFriendMuteResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFriendMuteResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiFriendMuteResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiFriendMuteResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiFriendMuteResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiFriendMuteResponse)
        ApiFriendMuteResponseOrBuilder {
      // Construct using com.windchat.proto.server.ApiFriendMuteProto.ApiFriendMuteResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *消息免打扰 mute notifications
       * </pre>
       *
       * <code>optional bool mute = 1;</code>
       */
      public boolean getMute() {
        return instance.getMute();
      }
      /**
       * <pre>
       *消息免打扰 mute notifications
       * </pre>
       *
       * <code>optional bool mute = 1;</code>
       */
      public Builder setMute(boolean value) {
        copyOnWrite();
        instance.setMute(value);
        return this;
      }
      /**
       * <pre>
       *消息免打扰 mute notifications
       * </pre>
       *
       * <code>optional bool mute = 1;</code>
       */
      public Builder clearMute() {
        copyOnWrite();
        instance.clearMute();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiFriendMuteResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiFriendMuteResponse();
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
          ApiFriendMuteResponse other = (ApiFriendMuteResponse) arg1;
          mute_ = visitor.visitBoolean(mute_ != false, mute_,
              other.mute_ != false, other.mute_);
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
                case 8: {

                  mute_ = input.readBool();
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
          if (PARSER == null) {    synchronized (ApiFriendMuteResponse.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiFriendMuteResponse)
    private static final ApiFriendMuteResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiFriendMuteResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiFriendMuteResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiFriendMuteResponse> PARSER;

    public static com.google.protobuf.Parser<ApiFriendMuteResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
