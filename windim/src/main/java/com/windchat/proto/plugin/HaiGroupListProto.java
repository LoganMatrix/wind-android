// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin/hai_group_list.proto

package com.windchat.proto.plugin;

public final class HaiGroupListProto {
  private HaiGroupListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface HaiGroupListRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiGroupListRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *第几页
     * </pre>
     *
     * <code>optional int32 page_number = 1;</code>
     */
    int getPageNumber();

    /**
     * <pre>
     *每页的条数，默认100
     * </pre>
     *
     * <code>optional int32 page_size = 2;</code>
     */
    int getPageSize();
  }
  /**
   * <pre>
   **
   *获取群组列表
   *----
   *接口名
   *----
   * /hai/group/list
   *错误码
   *----
   *- success
   *- error.alert
   * </pre>
   *
   * Protobuf type {@code plugin.HaiGroupListRequest}
   */
  public  static final class HaiGroupListRequest extends
      com.google.protobuf.GeneratedMessageLite<
          HaiGroupListRequest, HaiGroupListRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiGroupListRequest)
      HaiGroupListRequestOrBuilder {
    private HaiGroupListRequest() {
    }
    public static final int PAGE_NUMBER_FIELD_NUMBER = 1;
    private int pageNumber_;
    /**
     * <pre>
     *第几页
     * </pre>
     *
     * <code>optional int32 page_number = 1;</code>
     */
    public int getPageNumber() {
      return pageNumber_;
    }
    /**
     * <pre>
     *第几页
     * </pre>
     *
     * <code>optional int32 page_number = 1;</code>
     */
    private void setPageNumber(int value) {
      
      pageNumber_ = value;
    }
    /**
     * <pre>
     *第几页
     * </pre>
     *
     * <code>optional int32 page_number = 1;</code>
     */
    private void clearPageNumber() {
      
      pageNumber_ = 0;
    }

    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    private int pageSize_;
    /**
     * <pre>
     *每页的条数，默认100
     * </pre>
     *
     * <code>optional int32 page_size = 2;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     *每页的条数，默认100
     * </pre>
     *
     * <code>optional int32 page_size = 2;</code>
     */
    private void setPageSize(int value) {
      
      pageSize_ = value;
    }
    /**
     * <pre>
     *每页的条数，默认100
     * </pre>
     *
     * <code>optional int32 page_size = 2;</code>
     */
    private void clearPageSize() {
      
      pageSize_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (pageNumber_ != 0) {
        output.writeInt32(1, pageNumber_);
      }
      if (pageSize_ != 0) {
        output.writeInt32(2, pageSize_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (pageNumber_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, pageNumber_);
      }
      if (pageSize_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, pageSize_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiGroupListRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupListRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupListRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupListRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupListRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupListRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupListRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiGroupListRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupListRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupListRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiGroupListRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     **
     *获取群组列表
     *----
     *接口名
     *----
     * /hai/group/list
     *错误码
     *----
     *- success
     *- error.alert
     * </pre>
     *
     * Protobuf type {@code plugin.HaiGroupListRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiGroupListRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiGroupListRequest)
        HaiGroupListRequestOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiGroupListProto.HaiGroupListRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *第几页
       * </pre>
       *
       * <code>optional int32 page_number = 1;</code>
       */
      public int getPageNumber() {
        return instance.getPageNumber();
      }
      /**
       * <pre>
       *第几页
       * </pre>
       *
       * <code>optional int32 page_number = 1;</code>
       */
      public Builder setPageNumber(int value) {
        copyOnWrite();
        instance.setPageNumber(value);
        return this;
      }
      /**
       * <pre>
       *第几页
       * </pre>
       *
       * <code>optional int32 page_number = 1;</code>
       */
      public Builder clearPageNumber() {
        copyOnWrite();
        instance.clearPageNumber();
        return this;
      }

      /**
       * <pre>
       *每页的条数，默认100
       * </pre>
       *
       * <code>optional int32 page_size = 2;</code>
       */
      public int getPageSize() {
        return instance.getPageSize();
      }
      /**
       * <pre>
       *每页的条数，默认100
       * </pre>
       *
       * <code>optional int32 page_size = 2;</code>
       */
      public Builder setPageSize(int value) {
        copyOnWrite();
        instance.setPageSize(value);
        return this;
      }
      /**
       * <pre>
       *每页的条数，默认100
       * </pre>
       *
       * <code>optional int32 page_size = 2;</code>
       */
      public Builder clearPageSize() {
        copyOnWrite();
        instance.clearPageSize();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:plugin.HaiGroupListRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiGroupListRequest();
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
          HaiGroupListRequest other = (HaiGroupListRequest) arg1;
          pageNumber_ = visitor.visitInt(pageNumber_ != 0, pageNumber_,
              other.pageNumber_ != 0, other.pageNumber_);
          pageSize_ = visitor.visitInt(pageSize_ != 0, pageSize_,
              other.pageSize_ != 0, other.pageSize_);
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

                  pageNumber_ = input.readInt32();
                  break;
                }
                case 16: {

                  pageSize_ = input.readInt32();
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
          if (PARSER == null) {    synchronized (HaiGroupListRequest.class) {
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


    // @@protoc_insertion_point(class_scope:plugin.HaiGroupListRequest)
    private static final HaiGroupListRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiGroupListRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiGroupListRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiGroupListRequest> PARSER;

    public static com.google.protobuf.Parser<HaiGroupListRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface HaiGroupListResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiGroupListResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    java.util.List<com.windchat.proto.core.GroupProto.SimpleGroupProfile>
        getGroupProfileList();
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    com.windchat.proto.core.GroupProto.SimpleGroupProfile getGroupProfile(int index);
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    int getGroupProfileCount();

    /**
     * <pre>
     * 一共多少页
     * </pre>
     *
     * <code>optional int32 page_total_num = 2;</code>
     */
    int getPageTotalNum();
  }
  /**
   * Protobuf type {@code plugin.HaiGroupListResponse}
   */
  public  static final class HaiGroupListResponse extends
      com.google.protobuf.GeneratedMessageLite<
          HaiGroupListResponse, HaiGroupListResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiGroupListResponse)
      HaiGroupListResponseOrBuilder {
    private HaiGroupListResponse() {
      groupProfile_ = emptyProtobufList();
    }
    private int bitField0_;
    public static final int GROUP_PROFILE_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<com.windchat.proto.core.GroupProto.SimpleGroupProfile> groupProfile_;
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    public java.util.List<com.windchat.proto.core.GroupProto.SimpleGroupProfile> getGroupProfileList() {
      return groupProfile_;
    }
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    public java.util.List<? extends com.windchat.proto.core.GroupProto.SimpleGroupProfileOrBuilder>
        getGroupProfileOrBuilderList() {
      return groupProfile_;
    }
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    public int getGroupProfileCount() {
      return groupProfile_.size();
    }
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    public com.windchat.proto.core.GroupProto.SimpleGroupProfile getGroupProfile(int index) {
      return groupProfile_.get(index);
    }
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    public com.windchat.proto.core.GroupProto.SimpleGroupProfileOrBuilder getGroupProfileOrBuilder(
        int index) {
      return groupProfile_.get(index);
    }
    private void ensureGroupProfileIsMutable() {
      if (!groupProfile_.isModifiable()) {
        groupProfile_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(groupProfile_);
       }
    }

    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    private void setGroupProfile(
        int index, com.windchat.proto.core.GroupProto.SimpleGroupProfile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGroupProfileIsMutable();
      groupProfile_.set(index, value);
    }
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    private void setGroupProfile(
        int index, com.windchat.proto.core.GroupProto.SimpleGroupProfile.Builder builderForValue) {
      ensureGroupProfileIsMutable();
      groupProfile_.set(index, builderForValue.build());
    }
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    private void addGroupProfile(com.windchat.proto.core.GroupProto.SimpleGroupProfile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGroupProfileIsMutable();
      groupProfile_.add(value);
    }
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    private void addGroupProfile(
        int index, com.windchat.proto.core.GroupProto.SimpleGroupProfile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGroupProfileIsMutable();
      groupProfile_.add(index, value);
    }
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    private void addGroupProfile(
        com.windchat.proto.core.GroupProto.SimpleGroupProfile.Builder builderForValue) {
      ensureGroupProfileIsMutable();
      groupProfile_.add(builderForValue.build());
    }
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    private void addGroupProfile(
        int index, com.windchat.proto.core.GroupProto.SimpleGroupProfile.Builder builderForValue) {
      ensureGroupProfileIsMutable();
      groupProfile_.add(index, builderForValue.build());
    }
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    private void addAllGroupProfile(
        Iterable<? extends com.windchat.proto.core.GroupProto.SimpleGroupProfile> values) {
      ensureGroupProfileIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, groupProfile_);
    }
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    private void clearGroupProfile() {
      groupProfile_ = emptyProtobufList();
    }
    /**
     * <pre>
     *用户的群列表
     * </pre>
     *
     * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
     */
    private void removeGroupProfile(int index) {
      ensureGroupProfileIsMutable();
      groupProfile_.remove(index);
    }

    public static final int PAGE_TOTAL_NUM_FIELD_NUMBER = 2;
    private int pageTotalNum_;
    /**
     * <pre>
     * 一共多少页
     * </pre>
     *
     * <code>optional int32 page_total_num = 2;</code>
     */
    public int getPageTotalNum() {
      return pageTotalNum_;
    }
    /**
     * <pre>
     * 一共多少页
     * </pre>
     *
     * <code>optional int32 page_total_num = 2;</code>
     */
    private void setPageTotalNum(int value) {

      pageTotalNum_ = value;
    }
    /**
     * <pre>
     * 一共多少页
     * </pre>
     *
     * <code>optional int32 page_total_num = 2;</code>
     */
    private void clearPageTotalNum() {

      pageTotalNum_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < groupProfile_.size(); i++) {
        output.writeMessage(1, groupProfile_.get(i));
      }
      if (pageTotalNum_ != 0) {
        output.writeInt32(2, pageTotalNum_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < groupProfile_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, groupProfile_.get(i));
      }
      if (pageTotalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, pageTotalNum_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiGroupListResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupListResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupListResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiGroupListResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiGroupListResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupListResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupListResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiGroupListResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiGroupListResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiGroupListResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiGroupListResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code plugin.HaiGroupListResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiGroupListResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiGroupListResponse)
        HaiGroupListResponseOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiGroupListProto.HaiGroupListResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *用户的群列表
       * </pre>
       *
       * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
       */
      public java.util.List<com.windchat.proto.core.GroupProto.SimpleGroupProfile> getGroupProfileList() {
        return java.util.Collections.unmodifiableList(
            instance.getGroupProfileList());
      }
      /**
       * <pre>
       *用户的群列表
       * </pre>
       *
       * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
       */
      public int getGroupProfileCount() {
        return instance.getGroupProfileCount();
      }/**
       * <pre>
       *用户的群列表
       * </pre>
       *
       * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
       */
      public com.windchat.proto.core.GroupProto.SimpleGroupProfile getGroupProfile(int index) {
        return instance.getGroupProfile(index);
      }
      /**
       * <pre>
       *用户的群列表
       * </pre>
       *
       * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
       */
      public Builder setGroupProfile(
          int index, com.windchat.proto.core.GroupProto.SimpleGroupProfile value) {
        copyOnWrite();
        instance.setGroupProfile(index, value);
        return this;
      }
      /**
       * <pre>
       *用户的群列表
       * </pre>
       *
       * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
       */
      public Builder setGroupProfile(
          int index, com.windchat.proto.core.GroupProto.SimpleGroupProfile.Builder builderForValue) {
        copyOnWrite();
        instance.setGroupProfile(index, builderForValue);
        return this;
      }
      /**
       * <pre>
       *用户的群列表
       * </pre>
       *
       * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
       */
      public Builder addGroupProfile(com.windchat.proto.core.GroupProto.SimpleGroupProfile value) {
        copyOnWrite();
        instance.addGroupProfile(value);
        return this;
      }
      /**
       * <pre>
       *用户的群列表
       * </pre>
       *
       * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
       */
      public Builder addGroupProfile(
          int index, com.windchat.proto.core.GroupProto.SimpleGroupProfile value) {
        copyOnWrite();
        instance.addGroupProfile(index, value);
        return this;
      }
      /**
       * <pre>
       *用户的群列表
       * </pre>
       *
       * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
       */
      public Builder addGroupProfile(
          com.windchat.proto.core.GroupProto.SimpleGroupProfile.Builder builderForValue) {
        copyOnWrite();
        instance.addGroupProfile(builderForValue);
        return this;
      }
      /**
       * <pre>
       *用户的群列表
       * </pre>
       *
       * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
       */
      public Builder addGroupProfile(
          int index, com.windchat.proto.core.GroupProto.SimpleGroupProfile.Builder builderForValue) {
        copyOnWrite();
        instance.addGroupProfile(index, builderForValue);
        return this;
      }
      /**
       * <pre>
       *用户的群列表
       * </pre>
       *
       * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
       */
      public Builder addAllGroupProfile(
          Iterable<? extends com.windchat.proto.core.GroupProto.SimpleGroupProfile> values) {
        copyOnWrite();
        instance.addAllGroupProfile(values);
        return this;
      }
      /**
       * <pre>
       *用户的群列表
       * </pre>
       *
       * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
       */
      public Builder clearGroupProfile() {
        copyOnWrite();
        instance.clearGroupProfile();
        return this;
      }
      /**
       * <pre>
       *用户的群列表
       * </pre>
       *
       * <code>repeated .core.SimpleGroupProfile group_profile = 1;</code>
       */
      public Builder removeGroupProfile(int index) {
        copyOnWrite();
        instance.removeGroupProfile(index);
        return this;
      }

      /**
       * <pre>
       * 一共多少页
       * </pre>
       *
       * <code>optional int32 page_total_num = 2;</code>
       */
      public int getPageTotalNum() {
        return instance.getPageTotalNum();
      }
      /**
       * <pre>
       * 一共多少页
       * </pre>
       *
       * <code>optional int32 page_total_num = 2;</code>
       */
      public Builder setPageTotalNum(int value) {
        copyOnWrite();
        instance.setPageTotalNum(value);
        return this;
      }
      /**
       * <pre>
       * 一共多少页
       * </pre>
       *
       * <code>optional int32 page_total_num = 2;</code>
       */
      public Builder clearPageTotalNum() {
        copyOnWrite();
        instance.clearPageTotalNum();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:plugin.HaiGroupListResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiGroupListResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          groupProfile_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          HaiGroupListResponse other = (HaiGroupListResponse) arg1;
          groupProfile_= visitor.visitList(groupProfile_, other.groupProfile_);
          pageTotalNum_ = visitor.visitInt(pageTotalNum_ != 0, pageTotalNum_,
              other.pageTotalNum_ != 0, other.pageTotalNum_);
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
                  if (!groupProfile_.isModifiable()) {
                    groupProfile_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(groupProfile_);
                  }
                  groupProfile_.add(
                      input.readMessage(com.windchat.proto.core.GroupProto.SimpleGroupProfile.parser(), extensionRegistry));
                  break;
                }
                case 16: {

                  pageTotalNum_ = input.readInt32();
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
          if (PARSER == null) {    synchronized (HaiGroupListResponse.class) {
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


    // @@protoc_insertion_point(class_scope:plugin.HaiGroupListResponse)
    private static final HaiGroupListResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiGroupListResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiGroupListResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiGroupListResponse> PARSER;

    public static com.google.protobuf.Parser<HaiGroupListResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
