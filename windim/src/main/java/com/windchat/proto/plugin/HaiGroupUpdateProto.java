// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin/hai_group_update.proto

package com.windchat.proto.plugin;

public final class HaiGroupUpdateProto {
  private HaiGroupUpdateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface HaiGroupUpdateRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiGroupUpdateRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * 显示的设置群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    String getGroupId();
    /**
     * <pre>
     * 显示的设置群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupIdBytes();

    /**
     * <pre>
     *需要更新的群组资料
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 2;</code>
     */
    boolean hasProfile();
    /**
     * <pre>
     *需要更新的群组资料
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 2;</code>
     */
    com.windchat.proto.core.GroupProto.GroupProfile getProfile();
  }
  /**
   * <pre>
   **
   *更新群资料
   *----
   *接口名
   *----
   * /hai/group/update
   *错误码
   *----
   *- success
   *- error.alert
   * </pre>
   *
   * Protobuf type {@code plugin.HaiGroupUpdateRequest}
   */
  public  static final class HaiGroupUpdateRequest extends
      com.google.protobuf.GeneratedMessageLite<
          HaiGroupUpdateRequest, HaiGroupUpdateRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiGroupUpdateRequest)
      HaiGroupUpdateRequestOrBuilder {
    private HaiGroupUpdateRequest() {
      groupId_ = "";
    }
    public static final int GROUP_ID_FIELD_NUMBER = 1;
    private String groupId_;
    /**
     * <pre>
     * 显示的设置群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public String getGroupId() {
      return groupId_;
    }
    /**
     * <pre>
     * 显示的设置群组ID
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
     * 显示的设置群组ID
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
     * 显示的设置群组ID
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    private void clearGroupId() {

      groupId_ = getDefaultInstance().getGroupId();
    }
    /**
     * <pre>
     * 显示的设置群组ID
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

    public static final int PROFILE_FIELD_NUMBER = 2;
    private com.windchat.proto.core.GroupProto.GroupProfile profile_;
    /**
     * <pre>
     *需要更新的群组资料
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 2;</code>
     */
    public boolean hasProfile() {
      return profile_ != null;
    }
    /**
     * <pre>
     *需要更新的群组资料
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 2;</code>
     */
    public com.windchat.proto.core.GroupProto.GroupProfile getProfile() {
      return profile_ == null ? com.windchat.proto.core.GroupProto.GroupProfile.getDefaultInstance() : profile_;
    }
    /**
     * <pre>
     *需要更新的群组资料
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 2;</code>
     */
    private void setProfile(com.windchat.proto.core.GroupProto.GroupProfile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      profile_ = value;

      }
    /**
     * <pre>
     *需要更新的群组资料
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 2;</code>
     */
    private void setProfile(
        com.windchat.proto.core.GroupProto.GroupProfile.Builder builderForValue) {
      profile_ = builderForValue.build();

    }
    /**
     * <pre>
     *需要更新的群组资料
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 2;</code>
     */
    private void mergeProfile(com.windchat.proto.core.GroupProto.GroupProfile value) {
      if (profile_ != null &&
          profile_ != com.windchat.proto.core.GroupProto.GroupProfile.getDefaultInstance()) {
        profile_ =
          com.windchat.proto.core.GroupProto.GroupProfile.newBuilder(profile_).mergeFrom(value).buildPartial();
      } else {
        profile_ = value;
      }

    }
    /**
     * <pre>
     *需要更新的群组资料
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 2;</code>
     */
    private void clearProfile() {  profile_ = null;

    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!groupId_.isEmpty()) {
        output.writeString(1, getGroupId());
      }
      if (profile_ != null) {
        output.writeMessage(2, getProfile());
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
      if (profile_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getProfile());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiGroupUpdateRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupUpdateRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupUpdateRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupUpdateRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupUpdateRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupUpdateRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupUpdateRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiGroupUpdateRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupUpdateRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupUpdateRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiGroupUpdateRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     **
     *更新群资料
     *----
     *接口名
     *----
     * /hai/group/update
     *错误码
     *----
     *- success
     *- error.alert
     * </pre>
     *
     * Protobuf type {@code plugin.HaiGroupUpdateRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiGroupUpdateRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiGroupUpdateRequest)
        HaiGroupUpdateRequestOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiGroupUpdateProto.HaiGroupUpdateRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * 显示的设置群组ID
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public String getGroupId() {
        return instance.getGroupId();
      }
      /**
       * <pre>
       * 显示的设置群组ID
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
       * 显示的设置群组ID
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
       * 显示的设置群组ID
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
       * 显示的设置群组ID
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

      /**
       * <pre>
       *需要更新的群组资料
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 2;</code>
       */
      public boolean hasProfile() {
        return instance.hasProfile();
      }
      /**
       * <pre>
       *需要更新的群组资料
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 2;</code>
       */
      public com.windchat.proto.core.GroupProto.GroupProfile getProfile() {
        return instance.getProfile();
      }
      /**
       * <pre>
       *需要更新的群组资料
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 2;</code>
       */
      public Builder setProfile(com.windchat.proto.core.GroupProto.GroupProfile value) {
        copyOnWrite();
        instance.setProfile(value);
        return this;
        }
      /**
       * <pre>
       *需要更新的群组资料
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 2;</code>
       */
      public Builder setProfile(
          com.windchat.proto.core.GroupProto.GroupProfile.Builder builderForValue) {
        copyOnWrite();
        instance.setProfile(builderForValue);
        return this;
      }
      /**
       * <pre>
       *需要更新的群组资料
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 2;</code>
       */
      public Builder mergeProfile(com.windchat.proto.core.GroupProto.GroupProfile value) {
        copyOnWrite();
        instance.mergeProfile(value);
        return this;
      }
      /**
       * <pre>
       *需要更新的群组资料
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 2;</code>
       */
      public Builder clearProfile() {  copyOnWrite();
        instance.clearProfile();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:plugin.HaiGroupUpdateRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiGroupUpdateRequest();
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
          HaiGroupUpdateRequest other = (HaiGroupUpdateRequest) arg1;
          groupId_ = visitor.visitString(!groupId_.isEmpty(), groupId_,
              !other.groupId_.isEmpty(), other.groupId_);
          profile_ = visitor.visitMessage(profile_, other.profile_);
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
                case 18: {
                  com.windchat.proto.core.GroupProto.GroupProfile.Builder subBuilder = null;
                  if (profile_ != null) {
                    subBuilder = profile_.toBuilder();
                  }
                  profile_ = input.readMessage(com.windchat.proto.core.GroupProto.GroupProfile.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(profile_);
                    profile_ = subBuilder.buildPartial();
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
          if (PARSER == null) {    synchronized (HaiGroupUpdateRequest.class) {
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


    // @@protoc_insertion_point(class_scope:plugin.HaiGroupUpdateRequest)
    private static final HaiGroupUpdateRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiGroupUpdateRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiGroupUpdateRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiGroupUpdateRequest> PARSER;

    public static com.google.protobuf.Parser<HaiGroupUpdateRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface HaiGroupUpdateResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiGroupUpdateResponse)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code plugin.HaiGroupUpdateResponse}
   */
  public  static final class HaiGroupUpdateResponse extends
      com.google.protobuf.GeneratedMessageLite<
          HaiGroupUpdateResponse, HaiGroupUpdateResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiGroupUpdateResponse)
      HaiGroupUpdateResponseOrBuilder {
    private HaiGroupUpdateResponse() {
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

    public static HaiGroupUpdateResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupUpdateResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupUpdateResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupUpdateResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupUpdateResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupUpdateResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupUpdateResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiGroupUpdateResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupUpdateResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupUpdateResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiGroupUpdateResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code plugin.HaiGroupUpdateResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiGroupUpdateResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiGroupUpdateResponse)
        HaiGroupUpdateResponseOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiGroupUpdateProto.HaiGroupUpdateResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:plugin.HaiGroupUpdateResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiGroupUpdateResponse();
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
          HaiGroupUpdateResponse other = (HaiGroupUpdateResponse) arg1;
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
          if (PARSER == null) {    synchronized (HaiGroupUpdateResponse.class) {
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


    // @@protoc_insertion_point(class_scope:plugin.HaiGroupUpdateResponse)
    private static final HaiGroupUpdateResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiGroupUpdateResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiGroupUpdateResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiGroupUpdateResponse> PARSER;

    public static com.google.protobuf.Parser<HaiGroupUpdateResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
