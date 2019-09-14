// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: plugin/hai_friend_add.proto

package com.windchat.proto.plugin;

public final class HaiFriendAddProto {
  private HaiFriendAddProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface HaiFriendAddRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiFriendAddRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * 用户1
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    String getSiteUserId();
    /**
     * <pre>
     * 用户1
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getSiteUserIdBytes();

    /**
     * <pre>
     * 用户2
     * </pre>
     *
     * <code>optional string friend_site_user_id = 2;</code>
     */
    String getFriendSiteUserId();
    /**
     * <pre>
     * 用户2
     * </pre>
     *
     * <code>optional string friend_site_user_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getFriendSiteUserIdBytes();
  }
  /**
   * <pre>
   *### 功能
   *添加A、B两人为好友
   *### 接口名
   * /hai/friend/add
   *### 错误码
   *- success
   *- error.alert
   * </pre>
   *
   * Protobuf type {@code plugin.HaiFriendAddRequest}
   */
  public  static final class HaiFriendAddRequest extends
      com.google.protobuf.GeneratedMessageLite<
          HaiFriendAddRequest, HaiFriendAddRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiFriendAddRequest)
      HaiFriendAddRequestOrBuilder {
    private HaiFriendAddRequest() {
      siteUserId_ = "";
      friendSiteUserId_ = "";
    }
    public static final int SITE_USER_ID_FIELD_NUMBER = 1;
    private String siteUserId_;
    /**
     * <pre>
     * 用户1
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    public String getSiteUserId() {
      return siteUserId_;
    }
    /**
     * <pre>
     * 用户1
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSiteUserIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(siteUserId_);
    }
    /**
     * <pre>
     * 用户1
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    private void setSiteUserId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      siteUserId_ = value;
    }
    /**
     * <pre>
     * 用户1
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    private void clearSiteUserId() {

      siteUserId_ = getDefaultInstance().getSiteUserId();
    }
    /**
     * <pre>
     * 用户1
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    private void setSiteUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      siteUserId_ = value.toStringUtf8();
    }

    public static final int FRIEND_SITE_USER_ID_FIELD_NUMBER = 2;
    private String friendSiteUserId_;
    /**
     * <pre>
     * 用户2
     * </pre>
     *
     * <code>optional string friend_site_user_id = 2;</code>
     */
    public String getFriendSiteUserId() {
      return friendSiteUserId_;
    }
    /**
     * <pre>
     * 用户2
     * </pre>
     *
     * <code>optional string friend_site_user_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFriendSiteUserIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(friendSiteUserId_);
    }
    /**
     * <pre>
     * 用户2
     * </pre>
     *
     * <code>optional string friend_site_user_id = 2;</code>
     */
    private void setFriendSiteUserId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      friendSiteUserId_ = value;
    }
    /**
     * <pre>
     * 用户2
     * </pre>
     *
     * <code>optional string friend_site_user_id = 2;</code>
     */
    private void clearFriendSiteUserId() {

      friendSiteUserId_ = getDefaultInstance().getFriendSiteUserId();
    }
    /**
     * <pre>
     * 用户2
     * </pre>
     *
     * <code>optional string friend_site_user_id = 2;</code>
     */
    private void setFriendSiteUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      friendSiteUserId_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!siteUserId_.isEmpty()) {
        output.writeString(1, getSiteUserId());
      }
      if (!friendSiteUserId_.isEmpty()) {
        output.writeString(2, getFriendSiteUserId());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!siteUserId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSiteUserId());
      }
      if (!friendSiteUserId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getFriendSiteUserId());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static HaiFriendAddRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiFriendAddRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiFriendAddRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiFriendAddRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiFriendAddRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiFriendAddRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiFriendAddRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiFriendAddRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiFriendAddRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiFriendAddRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiFriendAddRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     *### 功能
     *添加A、B两人为好友
     *### 接口名
     * /hai/friend/add
     *### 错误码
     *- success
     *- error.alert
     * </pre>
     *
     * Protobuf type {@code plugin.HaiFriendAddRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiFriendAddRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiFriendAddRequest)
        HaiFriendAddRequestOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiFriendAddProto.HaiFriendAddRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * 用户1
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public String getSiteUserId() {
        return instance.getSiteUserId();
      }
      /**
       * <pre>
       * 用户1
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSiteUserIdBytes() {
        return instance.getSiteUserIdBytes();
      }
      /**
       * <pre>
       * 用户1
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public Builder setSiteUserId(
          String value) {
        copyOnWrite();
        instance.setSiteUserId(value);
        return this;
      }
      /**
       * <pre>
       * 用户1
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public Builder clearSiteUserId() {
        copyOnWrite();
        instance.clearSiteUserId();
        return this;
      }
      /**
       * <pre>
       * 用户1
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public Builder setSiteUserIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSiteUserIdBytes(value);
        return this;
      }

      /**
       * <pre>
       * 用户2
       * </pre>
       *
       * <code>optional string friend_site_user_id = 2;</code>
       */
      public String getFriendSiteUserId() {
        return instance.getFriendSiteUserId();
      }
      /**
       * <pre>
       * 用户2
       * </pre>
       *
       * <code>optional string friend_site_user_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getFriendSiteUserIdBytes() {
        return instance.getFriendSiteUserIdBytes();
      }
      /**
       * <pre>
       * 用户2
       * </pre>
       *
       * <code>optional string friend_site_user_id = 2;</code>
       */
      public Builder setFriendSiteUserId(
          String value) {
        copyOnWrite();
        instance.setFriendSiteUserId(value);
        return this;
      }
      /**
       * <pre>
       * 用户2
       * </pre>
       *
       * <code>optional string friend_site_user_id = 2;</code>
       */
      public Builder clearFriendSiteUserId() {
        copyOnWrite();
        instance.clearFriendSiteUserId();
        return this;
      }
      /**
       * <pre>
       * 用户2
       * </pre>
       *
       * <code>optional string friend_site_user_id = 2;</code>
       */
      public Builder setFriendSiteUserIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setFriendSiteUserIdBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:plugin.HaiFriendAddRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiFriendAddRequest();
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
          HaiFriendAddRequest other = (HaiFriendAddRequest) arg1;
          siteUserId_ = visitor.visitString(!siteUserId_.isEmpty(), siteUserId_,
              !other.siteUserId_.isEmpty(), other.siteUserId_);
          friendSiteUserId_ = visitor.visitString(!friendSiteUserId_.isEmpty(), friendSiteUserId_,
              !other.friendSiteUserId_.isEmpty(), other.friendSiteUserId_);
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

                  siteUserId_ = s;
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  friendSiteUserId_ = s;
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
          if (PARSER == null) {    synchronized (HaiFriendAddRequest.class) {
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


    // @@protoc_insertion_point(class_scope:plugin.HaiFriendAddRequest)
    private static final HaiFriendAddRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiFriendAddRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiFriendAddRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiFriendAddRequest> PARSER;

    public static com.google.protobuf.Parser<HaiFriendAddRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface HaiFriendAddResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:plugin.HaiFriendAddResponse)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code plugin.HaiFriendAddResponse}
   */
  public  static final class HaiFriendAddResponse extends
      com.google.protobuf.GeneratedMessageLite<
          HaiFriendAddResponse, HaiFriendAddResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:plugin.HaiFriendAddResponse)
      HaiFriendAddResponseOrBuilder {
    private HaiFriendAddResponse() {
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

    public static HaiFriendAddResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiFriendAddResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiFriendAddResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static HaiFriendAddResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static HaiFriendAddResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiFriendAddResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiFriendAddResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static HaiFriendAddResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static HaiFriendAddResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static HaiFriendAddResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HaiFriendAddResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code plugin.HaiFriendAddResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          HaiFriendAddResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:plugin.HaiFriendAddResponse)
        HaiFriendAddResponseOrBuilder {
      // Construct using com.windchat.proto.plugin.HaiFriendAddProto.HaiFriendAddResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:plugin.HaiFriendAddResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new HaiFriendAddResponse();
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
          HaiFriendAddResponse other = (HaiFriendAddResponse) arg1;
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
          if (PARSER == null) {    synchronized (HaiFriendAddResponse.class) {
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


    // @@protoc_insertion_point(class_scope:plugin.HaiFriendAddResponse)
    private static final HaiFriendAddResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HaiFriendAddResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static HaiFriendAddResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<HaiFriendAddResponse> PARSER;

    public static com.google.protobuf.Parser<HaiFriendAddResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
