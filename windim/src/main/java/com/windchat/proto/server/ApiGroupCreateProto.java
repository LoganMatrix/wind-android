// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/api_group_create.proto

package com.windchat.proto.server;

public final class ApiGroupCreateProto {
  private ApiGroupCreateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiGroupCreateRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiGroupCreateRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    java.util.List<String>
        getSiteUserIdsList();
    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    int getSiteUserIdsCount();
    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    String getSiteUserIds(int index);
    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    com.google.protobuf.ByteString
        getSiteUserIdsBytes(int index);

    /**
     * <pre>
     *群名称
     * </pre>
     *
     * <code>optional string group_name = 2;</code>
     */
    String getGroupName();
    /**
     * <pre>
     *群名称
     * </pre>
     *
     * <code>optional string group_name = 2;</code>
     */
    com.google.protobuf.ByteString
        getGroupNameBytes();
  }
  /**
   * Protobuf type {@code site.ApiGroupCreateRequest}
   */
  public  static final class ApiGroupCreateRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiGroupCreateRequest, ApiGroupCreateRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiGroupCreateRequest)
      ApiGroupCreateRequestOrBuilder {
    private ApiGroupCreateRequest() {
      siteUserIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
      groupName_ = "";
    }
    private int bitField0_;
    public static final int SITE_USER_IDS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<String> siteUserIds_;
    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    public java.util.List<String> getSiteUserIdsList() {
      return siteUserIds_;
    }
    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    public int getSiteUserIdsCount() {
      return siteUserIds_.size();
    }
    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    public String getSiteUserIds(int index) {
      return siteUserIds_.get(index);
    }
    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSiteUserIdsBytes(int index) {
      return com.google.protobuf.ByteString.copyFromUtf8(
          siteUserIds_.get(index));
    }
    private void ensureSiteUserIdsIsMutable() {
      if (!siteUserIds_.isModifiable()) {
        siteUserIds_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(siteUserIds_);
       }
    }
    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    private void setSiteUserIds(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSiteUserIdsIsMutable();
      siteUserIds_.set(index, value);
    }
    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    private void addSiteUserIds(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSiteUserIdsIsMutable();
      siteUserIds_.add(value);
    }
    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    private void addAllSiteUserIds(
        Iterable<String> values) {
      ensureSiteUserIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, siteUserIds_);
    }
    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    private void clearSiteUserIds() {
      siteUserIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }
    /**
     * <pre>
     *初始建群，增加的群成员
     * </pre>
     *
     * <code>repeated string site_user_ids = 1;</code>
     */
    private void addSiteUserIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSiteUserIdsIsMutable();
      siteUserIds_.add(value.toStringUtf8());
    }

    public static final int GROUP_NAME_FIELD_NUMBER = 2;
    private String groupName_;
    /**
     * <pre>
     *群名称
     * </pre>
     *
     * <code>optional string group_name = 2;</code>
     */
    public String getGroupName() {
      return groupName_;
    }
    /**
     * <pre>
     *群名称
     * </pre>
     *
     * <code>optional string group_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGroupNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(groupName_);
    }
    /**
     * <pre>
     *群名称
     * </pre>
     *
     * <code>optional string group_name = 2;</code>
     */
    private void setGroupName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      groupName_ = value;
    }
    /**
     * <pre>
     *群名称
     * </pre>
     *
     * <code>optional string group_name = 2;</code>
     */
    private void clearGroupName() {

      groupName_ = getDefaultInstance().getGroupName();
    }
    /**
     * <pre>
     *群名称
     * </pre>
     *
     * <code>optional string group_name = 2;</code>
     */
    private void setGroupNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      groupName_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < siteUserIds_.size(); i++) {
        output.writeString(1, siteUserIds_.get(i));
      }
      if (!groupName_.isEmpty()) {
        output.writeString(2, getGroupName());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < siteUserIds_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeStringSizeNoTag(siteUserIds_.get(i));
        }
        size += dataSize;
        size += 1 * getSiteUserIdsList().size();
      }
      if (!groupName_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getGroupName());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiGroupCreateRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiGroupCreateRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiGroupCreateRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiGroupCreateRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiGroupCreateRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiGroupCreateRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiGroupCreateRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiGroupCreateRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiGroupCreateRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiGroupCreateRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiGroupCreateRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiGroupCreateRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiGroupCreateRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiGroupCreateRequest)
        ApiGroupCreateRequestOrBuilder {
      // Construct using com.windchat.proto.server.ApiGroupCreateProto.ApiGroupCreateRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *初始建群，增加的群成员
       * </pre>
       *
       * <code>repeated string site_user_ids = 1;</code>
       */
      public java.util.List<String>
          getSiteUserIdsList() {
        return java.util.Collections.unmodifiableList(
            instance.getSiteUserIdsList());
      }
      /**
       * <pre>
       *初始建群，增加的群成员
       * </pre>
       *
       * <code>repeated string site_user_ids = 1;</code>
       */
      public int getSiteUserIdsCount() {
        return instance.getSiteUserIdsCount();
      }
      /**
       * <pre>
       *初始建群，增加的群成员
       * </pre>
       *
       * <code>repeated string site_user_ids = 1;</code>
       */
      public String getSiteUserIds(int index) {
        return instance.getSiteUserIds(index);
      }
      /**
       * <pre>
       *初始建群，增加的群成员
       * </pre>
       *
       * <code>repeated string site_user_ids = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSiteUserIdsBytes(int index) {
        return instance.getSiteUserIdsBytes(index);
      }
      /**
       * <pre>
       *初始建群，增加的群成员
       * </pre>
       *
       * <code>repeated string site_user_ids = 1;</code>
       */
      public Builder setSiteUserIds(
          int index, String value) {
        copyOnWrite();
        instance.setSiteUserIds(index, value);
        return this;
      }
      /**
       * <pre>
       *初始建群，增加的群成员
       * </pre>
       *
       * <code>repeated string site_user_ids = 1;</code>
       */
      public Builder addSiteUserIds(
          String value) {
        copyOnWrite();
        instance.addSiteUserIds(value);
        return this;
      }
      /**
       * <pre>
       *初始建群，增加的群成员
       * </pre>
       *
       * <code>repeated string site_user_ids = 1;</code>
       */
      public Builder addAllSiteUserIds(
          Iterable<String> values) {
        copyOnWrite();
        instance.addAllSiteUserIds(values);
        return this;
      }
      /**
       * <pre>
       *初始建群，增加的群成员
       * </pre>
       *
       * <code>repeated string site_user_ids = 1;</code>
       */
      public Builder clearSiteUserIds() {
        copyOnWrite();
        instance.clearSiteUserIds();
        return this;
      }
      /**
       * <pre>
       *初始建群，增加的群成员
       * </pre>
       *
       * <code>repeated string site_user_ids = 1;</code>
       */
      public Builder addSiteUserIdsBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.addSiteUserIdsBytes(value);
        return this;
      }

      /**
       * <pre>
       *群名称
       * </pre>
       *
       * <code>optional string group_name = 2;</code>
       */
      public String getGroupName() {
        return instance.getGroupName();
      }
      /**
       * <pre>
       *群名称
       * </pre>
       *
       * <code>optional string group_name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getGroupNameBytes() {
        return instance.getGroupNameBytes();
      }
      /**
       * <pre>
       *群名称
       * </pre>
       *
       * <code>optional string group_name = 2;</code>
       */
      public Builder setGroupName(
          String value) {
        copyOnWrite();
        instance.setGroupName(value);
        return this;
      }
      /**
       * <pre>
       *群名称
       * </pre>
       *
       * <code>optional string group_name = 2;</code>
       */
      public Builder clearGroupName() {
        copyOnWrite();
        instance.clearGroupName();
        return this;
      }
      /**
       * <pre>
       *群名称
       * </pre>
       *
       * <code>optional string group_name = 2;</code>
       */
      public Builder setGroupNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setGroupNameBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiGroupCreateRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiGroupCreateRequest();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          siteUserIds_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          ApiGroupCreateRequest other = (ApiGroupCreateRequest) arg1;
          siteUserIds_= visitor.visitList(siteUserIds_, other.siteUserIds_);
          groupName_ = visitor.visitString(!groupName_.isEmpty(), groupName_,
              !other.groupName_.isEmpty(), other.groupName_);
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
                  String s = input.readStringRequireUtf8();
                  if (!siteUserIds_.isModifiable()) {
                    siteUserIds_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(siteUserIds_);
                  }
                  siteUserIds_.add(s);
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  groupName_ = s;
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
          if (PARSER == null) {    synchronized (ApiGroupCreateRequest.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiGroupCreateRequest)
    private static final ApiGroupCreateRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiGroupCreateRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiGroupCreateRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiGroupCreateRequest> PARSER;

    public static com.google.protobuf.Parser<ApiGroupCreateRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiGroupCreateResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiGroupCreateResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *群组信息
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 1;</code>
     */
    boolean hasProfile();
    /**
     * <pre>
     *群组信息
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 1;</code>
     */
    com.windchat.proto.core.GroupProto.GroupProfile getProfile();
  }
  /**
   * Protobuf type {@code site.ApiGroupCreateResponse}
   */
  public  static final class ApiGroupCreateResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiGroupCreateResponse, ApiGroupCreateResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiGroupCreateResponse)
      ApiGroupCreateResponseOrBuilder {
    private ApiGroupCreateResponse() {
    }
    public static final int PROFILE_FIELD_NUMBER = 1;
    private com.windchat.proto.core.GroupProto.GroupProfile profile_;
    /**
     * <pre>
     *群组信息
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 1;</code>
     */
    public boolean hasProfile() {
      return profile_ != null;
    }
    /**
     * <pre>
     *群组信息
     * </pre>
     *
     * <code>optional .core.GroupProfile profile = 1;</code>
     */
    public com.windchat.proto.core.GroupProto.GroupProfile getProfile() {
      return profile_ == null ? com.windchat.proto.core.GroupProto.GroupProfile.getDefaultInstance() : profile_;
    }
    /**
     * <pre>
     *群组信息
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
     *群组信息
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
     *群组信息
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
     *群组信息
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

    public static ApiGroupCreateResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiGroupCreateResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiGroupCreateResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiGroupCreateResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiGroupCreateResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiGroupCreateResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiGroupCreateResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiGroupCreateResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiGroupCreateResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiGroupCreateResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiGroupCreateResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiGroupCreateResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiGroupCreateResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiGroupCreateResponse)
        ApiGroupCreateResponseOrBuilder {
      // Construct using com.windchat.proto.server.ApiGroupCreateProto.ApiGroupCreateResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *群组信息
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 1;</code>
       */
      public boolean hasProfile() {
        return instance.hasProfile();
      }
      /**
       * <pre>
       *群组信息
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 1;</code>
       */
      public com.windchat.proto.core.GroupProto.GroupProfile getProfile() {
        return instance.getProfile();
      }
      /**
       * <pre>
       *群组信息
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
       *群组信息
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
       *群组信息
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
       *群组信息
       * </pre>
       *
       * <code>optional .core.GroupProfile profile = 1;</code>
       */
      public Builder clearProfile() {  copyOnWrite();
        instance.clearProfile();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiGroupCreateResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiGroupCreateResponse();
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
          ApiGroupCreateResponse other = (ApiGroupCreateResponse) arg1;
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
          if (PARSER == null) {    synchronized (ApiGroupCreateResponse.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiGroupCreateResponse)
    private static final ApiGroupCreateResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiGroupCreateResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiGroupCreateResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiGroupCreateResponse> PARSER;

    public static com.google.protobuf.Parser<ApiGroupCreateResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
