// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/api_friend_setting.proto

package com.windchat.proto.server;

public final class ApiFriendSettingProto {
  private ApiFriendSettingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiFriendSettingRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiFriendSettingRequest)
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
   * Protobuf type {@code site.ApiFriendSettingRequest}
   */
  public  static final class ApiFriendSettingRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiFriendSettingRequest, ApiFriendSettingRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiFriendSettingRequest)
      ApiFriendSettingRequestOrBuilder {
    private ApiFriendSettingRequest() {
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

    public static ApiFriendSettingRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFriendSettingRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFriendSettingRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFriendSettingRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFriendSettingRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFriendSettingRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFriendSettingRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiFriendSettingRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFriendSettingRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFriendSettingRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiFriendSettingRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiFriendSettingRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiFriendSettingRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiFriendSettingRequest)
        ApiFriendSettingRequestOrBuilder {
      // Construct using com.windchat.proto.server.ApiFriendSettingProto.ApiFriendSettingRequest.newBuilder()
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

      // @@protoc_insertion_point(builder_scope:site.ApiFriendSettingRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiFriendSettingRequest();
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
          ApiFriendSettingRequest other = (ApiFriendSettingRequest) arg1;
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
          if (PARSER == null) {    synchronized (ApiFriendSettingRequest.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiFriendSettingRequest)
    private static final ApiFriendSettingRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiFriendSettingRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiFriendSettingRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiFriendSettingRequest> PARSER;

    public static com.google.protobuf.Parser<ApiFriendSettingRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiFriendSettingResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiFriendSettingResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *消息免打扰 mute notifications
     * </pre>
     *
     * <code>optional bool message_mute = 1;</code>
     */
    boolean getMessageMute();
  }
  /**
   * Protobuf type {@code site.ApiFriendSettingResponse}
   */
  public  static final class ApiFriendSettingResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiFriendSettingResponse, ApiFriendSettingResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiFriendSettingResponse)
      ApiFriendSettingResponseOrBuilder {
    private ApiFriendSettingResponse() {
    }
    public static final int MESSAGE_MUTE_FIELD_NUMBER = 1;
    private boolean messageMute_;
    /**
     * <pre>
     *消息免打扰 mute notifications
     * </pre>
     *
     * <code>optional bool message_mute = 1;</code>
     */
    public boolean getMessageMute() {
      return messageMute_;
    }
    /**
     * <pre>
     *消息免打扰 mute notifications
     * </pre>
     *
     * <code>optional bool message_mute = 1;</code>
     */
    private void setMessageMute(boolean value) {

      messageMute_ = value;
    }
    /**
     * <pre>
     *消息免打扰 mute notifications
     * </pre>
     *
     * <code>optional bool message_mute = 1;</code>
     */
    private void clearMessageMute() {

      messageMute_ = false;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (messageMute_ != false) {
        output.writeBool(1, messageMute_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (messageMute_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, messageMute_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiFriendSettingResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFriendSettingResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFriendSettingResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFriendSettingResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFriendSettingResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFriendSettingResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFriendSettingResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiFriendSettingResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFriendSettingResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFriendSettingResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiFriendSettingResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiFriendSettingResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiFriendSettingResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiFriendSettingResponse)
        ApiFriendSettingResponseOrBuilder {
      // Construct using com.windchat.proto.server.ApiFriendSettingProto.ApiFriendSettingResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *消息免打扰 mute notifications
       * </pre>
       *
       * <code>optional bool message_mute = 1;</code>
       */
      public boolean getMessageMute() {
        return instance.getMessageMute();
      }
      /**
       * <pre>
       *消息免打扰 mute notifications
       * </pre>
       *
       * <code>optional bool message_mute = 1;</code>
       */
      public Builder setMessageMute(boolean value) {
        copyOnWrite();
        instance.setMessageMute(value);
        return this;
      }
      /**
       * <pre>
       *消息免打扰 mute notifications
       * </pre>
       *
       * <code>optional bool message_mute = 1;</code>
       */
      public Builder clearMessageMute() {
        copyOnWrite();
        instance.clearMessageMute();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiFriendSettingResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiFriendSettingResponse();
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
          ApiFriendSettingResponse other = (ApiFriendSettingResponse) arg1;
          messageMute_ = visitor.visitBoolean(messageMute_ != false, messageMute_,
              other.messageMute_ != false, other.messageMute_);
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

                  messageMute_ = input.readBool();
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
          if (PARSER == null) {    synchronized (ApiFriendSettingResponse.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiFriendSettingResponse)
    private static final ApiFriendSettingResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiFriendSettingResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiFriendSettingResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiFriendSettingResponse> PARSER;

    public static com.google.protobuf.Parser<ApiFriendSettingResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
