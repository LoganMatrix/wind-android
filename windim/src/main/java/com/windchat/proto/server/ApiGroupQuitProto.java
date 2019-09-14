// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/api_group_quit.proto

package com.windchat.proto.server;

public final class ApiGroupQuitProto {
  private ApiGroupQuitProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiGroupQuitRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiGroupQuitRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *当前用户退出的群组
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    String getGroupId();
    /**
     * <pre>
     *当前用户退出的群组
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupIdBytes();
  }
  /**
   * Protobuf type {@code site.ApiGroupQuitRequest}
   */
  public  static final class ApiGroupQuitRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiGroupQuitRequest, ApiGroupQuitRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiGroupQuitRequest)
      ApiGroupQuitRequestOrBuilder {
    private ApiGroupQuitRequest() {
      groupId_ = "";
    }
    public static final int GROUP_ID_FIELD_NUMBER = 1;
    private String groupId_;
    /**
     * <pre>
     *当前用户退出的群组
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public String getGroupId() {
      return groupId_;
    }
    /**
     * <pre>
     *当前用户退出的群组
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
     *当前用户退出的群组
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
     *当前用户退出的群组
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    private void clearGroupId() {

      groupId_ = getDefaultInstance().getGroupId();
    }
    /**
     * <pre>
     *当前用户退出的群组
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

    public static ApiGroupQuitRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiGroupQuitRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiGroupQuitRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiGroupQuitRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiGroupQuitRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiGroupQuitRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiGroupQuitRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiGroupQuitRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiGroupQuitRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiGroupQuitRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiGroupQuitRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiGroupQuitRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiGroupQuitRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiGroupQuitRequest)
        ApiGroupQuitRequestOrBuilder {
      // Construct using com.windchat.proto.server.ApiGroupQuitProto.ApiGroupQuitRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *当前用户退出的群组
       * </pre>
       *
       * <code>optional string group_id = 1;</code>
       */
      public String getGroupId() {
        return instance.getGroupId();
      }
      /**
       * <pre>
       *当前用户退出的群组
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
       *当前用户退出的群组
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
       *当前用户退出的群组
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
       *当前用户退出的群组
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

      // @@protoc_insertion_point(builder_scope:site.ApiGroupQuitRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiGroupQuitRequest();
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
          ApiGroupQuitRequest other = (ApiGroupQuitRequest) arg1;
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
          if (PARSER == null) {    synchronized (ApiGroupQuitRequest.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiGroupQuitRequest)
    private static final ApiGroupQuitRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiGroupQuitRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiGroupQuitRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiGroupQuitRequest> PARSER;

    public static com.google.protobuf.Parser<ApiGroupQuitRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiGroupQuitResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiGroupQuitResponse)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code site.ApiGroupQuitResponse}
   */
  public  static final class ApiGroupQuitResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiGroupQuitResponse, ApiGroupQuitResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiGroupQuitResponse)
      ApiGroupQuitResponseOrBuilder {
    private ApiGroupQuitResponse() {
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

    public static ApiGroupQuitResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiGroupQuitResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiGroupQuitResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiGroupQuitResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiGroupQuitResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiGroupQuitResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiGroupQuitResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiGroupQuitResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiGroupQuitResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiGroupQuitResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiGroupQuitResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiGroupQuitResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiGroupQuitResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiGroupQuitResponse)
        ApiGroupQuitResponseOrBuilder {
      // Construct using com.windchat.proto.server.ApiGroupQuitProto.ApiGroupQuitResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:site.ApiGroupQuitResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiGroupQuitResponse();
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
          ApiGroupQuitResponse other = (ApiGroupQuitResponse) arg1;
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
          if (PARSER == null) {    synchronized (ApiGroupQuitResponse.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiGroupQuitResponse)
    private static final ApiGroupQuitResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiGroupQuitResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiGroupQuitResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiGroupQuitResponse> PARSER;

    public static com.google.protobuf.Parser<ApiGroupQuitResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
