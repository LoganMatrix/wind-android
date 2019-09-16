// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin/hai_group_profile.proto

package com.windchat.proto.plugin;

public final class HaiGroupProfileProto {
  private HaiGroupProfileProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface HaiGroupProfileRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiGroupProfileRequest)
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
   * <pre>
   **
   *获取群组资料
   *----
   *接口名
   *----
   * /hai/group/profile
   *错误码
   *----
   *- success
   *- error.alert
   * </pre>
   *
   * Protobuf type {@code plugin.HaiGroupProfileRequest}
   */
  public  static final class HaiGroupProfileRequest extends
      com.google.protobuf.GeneratedMessageLite<
          HaiGroupProfileRequest, HaiGroupProfileRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiGroupProfileRequest)
      HaiGroupProfileRequestOrBuilder {
    private HaiGroupProfileRequest() {
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

    public static HaiGroupProfileRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupProfileRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupProfileRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupProfileRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupProfileRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupProfileRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupProfileRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiGroupProfileRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupProfileRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupProfileRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiGroupProfileRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     **
     *获取群组资料
     *----
     *接口名
     *----
     * /hai/group/profile
     *错误码
     *----
     *- success
     *- error.alert
     * </pre>
     *
     * Protobuf type {@code plugin.HaiGroupProfileRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiGroupProfileRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiGroupProfileRequest)
        HaiGroupProfileRequestOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiGroupProfileProto.HaiGroupProfileRequest.newBuilder()
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

      // @@protoc_insertion_point(builder_scope:plugin.HaiGroupProfileRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiGroupProfileRequest();
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
          HaiGroupProfileRequest other = (HaiGroupProfileRequest) arg1;
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
          if (PARSER == null) {    synchronized (HaiGroupProfileRequest.class) {
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


    // @@protoc_insertion_point(class_scope:plugin.HaiGroupProfileRequest)
    private static final HaiGroupProfileRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiGroupProfileRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiGroupProfileRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiGroupProfileRequest> PARSER;

    public static com.google.protobuf.Parser<HaiGroupProfileRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface HaiGroupProfileResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiGroupProfileResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *群组资料页信息
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 1;</code>
     */
    boolean hasProfile();
    /**
     * <pre>
     *群组资料页信息
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 1;</code>
     */
    com.windchat.proto.core.GroupProto.GroupProfile getProfile();
  }
  /**
   * Protobuf type {@code plugin.HaiGroupProfileResponse}
   */
  public  static final class HaiGroupProfileResponse extends
      com.google.protobuf.GeneratedMessageLite<
          HaiGroupProfileResponse, HaiGroupProfileResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiGroupProfileResponse)
      HaiGroupProfileResponseOrBuilder {
    private HaiGroupProfileResponse() {
    }
    public static final int PROFILE_FIELD_NUMBER = 1;
    private com.windchat.proto.core.GroupProto.GroupProfile profile_;
    /**
     * <pre>
     *群组资料页信息
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 1;</code>
     */
    public boolean hasProfile() {
      return profile_ != null;
    }
    /**
     * <pre>
     *群组资料页信息
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 1;</code>
     */
    public com.windchat.proto.core.GroupProto.GroupProfile getProfile() {
      return profile_ == null ? com.windchat.proto.core.GroupProto.GroupProfile.getDefaultInstance() : profile_;
    }
    /**
     * <pre>
     *群组资料页信息
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 1;</code>
     */
    private void setProfile(com.windchat.proto.core.GroupProto.GroupProfile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      profile_ = value;

      }
    /**
     * <pre>
     *群组资料页信息
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 1;</code>
     */
    private void setProfile(
        com.windchat.proto.core.GroupProto.GroupProfile.Builder builderForValue) {
      profile_ = builderForValue.build();

    }
    /**
     * <pre>
     *群组资料页信息
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 1;</code>
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
     *群组资料页信息
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 1;</code>
     */
    private void clearProfile() {  profile_ = null;

    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (profile_ != null) {
        output.writeMessage(1, getProfile());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (profile_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getProfile());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiGroupProfileResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupProfileResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupProfileResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupProfileResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupProfileResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupProfileResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupProfileResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiGroupProfileResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupProfileResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupProfileResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiGroupProfileResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code plugin.HaiGroupProfileResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiGroupProfileResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiGroupProfileResponse)
        HaiGroupProfileResponseOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiGroupProfileProto.HaiGroupProfileResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *群组资料页信息
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 1;</code>
       */
      public boolean hasProfile() {
        return instance.hasProfile();
      }
      /**
       * <pre>
       *群组资料页信息
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 1;</code>
       */
      public com.windchat.proto.core.GroupProto.GroupProfile getProfile() {
        return instance.getProfile();
      }
      /**
       * <pre>
       *群组资料页信息
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 1;</code>
       */
      public Builder setProfile(com.windchat.proto.core.GroupProto.GroupProfile value) {
        copyOnWrite();
        instance.setProfile(value);
        return this;
        }
      /**
       * <pre>
       *群组资料页信息
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 1;</code>
       */
      public Builder setProfile(
          com.windchat.proto.core.GroupProto.GroupProfile.Builder builderForValue) {
        copyOnWrite();
        instance.setProfile(builderForValue);
        return this;
      }
      /**
       * <pre>
       *群组资料页信息
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 1;</code>
       */
      public Builder mergeProfile(com.windchat.proto.core.GroupProto.GroupProfile value) {
        copyOnWrite();
        instance.mergeProfile(value);
        return this;
      }
      /**
       * <pre>
       *群组资料页信息
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 1;</code>
       */
      public Builder clearProfile() {  copyOnWrite();
        instance.clearProfile();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:plugin.HaiGroupProfileResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiGroupProfileResponse();
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
          HaiGroupProfileResponse other = (HaiGroupProfileResponse) arg1;
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
          if (PARSER == null) {    synchronized (HaiGroupProfileResponse.class) {
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


    // @@protoc_insertion_point(class_scope:plugin.HaiGroupProfileResponse)
    private static final HaiGroupProfileResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiGroupProfileResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiGroupProfileResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiGroupProfileResponse> PARSER;

    public static com.google.protobuf.Parser<HaiGroupProfileResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}