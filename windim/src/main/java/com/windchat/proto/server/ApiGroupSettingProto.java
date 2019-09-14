// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/api_group_setting.proto

package com.windchat.proto.server;

public final class ApiGroupSettingProto {
  private ApiGroupSettingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiGroupSettingRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiGroupSettingRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *当前用户获取群组ID的资料信息
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    String getGroupId();
    /**
     * <pre>
     *当前用户获取群组ID的资料信息
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupIdBytes();
  }
  /**
   * Protobuf type {@code site.ApiGroupSettingRequest}
   */
  public  static final class ApiGroupSettingRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiGroupSettingRequest, ApiGroupSettingRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiGroupSettingRequest)
      ApiGroupSettingRequestOrBuilder {
    private ApiGroupSettingRequest() {
      groupId_ = "";
    }
    public static final int GROUP_ID_FIELD_NUMBER = 1;
    private String groupId_;
    /**
     * <pre>
     *当前用户获取群组ID的资料信息
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public String getGroupId() {
      return groupId_;
    }
    /**
     * <pre>
     *当前用户获取群组ID的资料信息
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(groupId_);
    }
    /**
     * <pre>
     *当前用户获取群组ID的资料信息
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    private void setGroupId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      groupId_ = value;
    }
    /**
     * <pre>
     *当前用户获取群组ID的资料信息
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    private void clearGroupId() {

      groupId_ = getDefaultInstance().getGroupId();
    }
    /**
     * <pre>
     *当前用户获取群组ID的资料信息
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    private void setGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      groupId_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!groupId_.isEmpty()) {
        output.writeString(1, getGroupId());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!groupId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getGroupId());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiGroupSettingRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiGroupSettingRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiGroupSettingRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiGroupSettingRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiGroupSettingRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiGroupSettingRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiGroupSettingRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiGroupSettingRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiGroupSettingRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiGroupSettingRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiGroupSettingRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiGroupSettingRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiGroupSettingRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiGroupSettingRequest)
        ApiGroupSettingRequestOrBuilder {
      // Construct using com.windchat.proto.server.ApiGroupSettingProto.ApiGroupSettingRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *当前用户获取群组ID的资料信息
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public String getGroupId() {
        return instance.getGroupId();
      }
      /**
       * <pre>
       *当前用户获取群组ID的资料信息
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupIdBytes() {
        return instance.getGroupIdBytes();
      }
      /**
       * <pre>
       *当前用户获取群组ID的资料信息
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public Builder setGroupId(
          String value) {
        copyOnWrite();
        instance.setGroupId(value);
        return this;
      }
      /**
       * <pre>
       *当前用户获取群组ID的资料信息
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public Builder clearGroupId() {
        copyOnWrite();
        instance.clearGroupId();
        return this;
      }
      /**
       * <pre>
       *当前用户获取群组ID的资料信息
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public Builder setGroupIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setGroupIdBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiGroupSettingRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiGroupSettingRequest();
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
          ApiGroupSettingRequest other = (ApiGroupSettingRequest) arg1;
          groupId_ = visitor.visitString(!groupId_.isEmpty(), groupId_,
              !other.groupId_.isEmpty(), other.groupId_);
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

                  groupId_ = s;
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
          if (PARSER == null) {    synchronized (ApiGroupSettingRequest.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiGroupSettingRequest)
    private static final ApiGroupSettingRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiGroupSettingRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiGroupSettingRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiGroupSettingRequest> PARSER;

    public static com.google.protobuf.Parser<ApiGroupSettingRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiGroupSettingResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiGroupSettingResponse)
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
   * Protobuf type {@code site.ApiGroupSettingResponse}
   */
  public  static final class ApiGroupSettingResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiGroupSettingResponse, ApiGroupSettingResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiGroupSettingResponse)
      ApiGroupSettingResponseOrBuilder {
    private ApiGroupSettingResponse() {
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

    public static ApiGroupSettingResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiGroupSettingResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiGroupSettingResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiGroupSettingResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiGroupSettingResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiGroupSettingResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiGroupSettingResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiGroupSettingResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiGroupSettingResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiGroupSettingResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiGroupSettingResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiGroupSettingResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiGroupSettingResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiGroupSettingResponse)
        ApiGroupSettingResponseOrBuilder {
      // Construct using com.windchat.proto.server.ApiGroupSettingProto.ApiGroupSettingResponse.newBuilder()
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

      // @@protoc_insertion_point(builder_scope:site.ApiGroupSettingResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiGroupSettingResponse();
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
          ApiGroupSettingResponse other = (ApiGroupSettingResponse) arg1;
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
          if (PARSER == null) {    synchronized (ApiGroupSettingResponse.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiGroupSettingResponse)
    private static final ApiGroupSettingResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiGroupSettingResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiGroupSettingResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiGroupSettingResponse> PARSER;

    public static com.google.protobuf.Parser<ApiGroupSettingResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
