// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: platform/api_temp_upload.proto

package com.windchat.proto.platform;

public final class ApiTempUploadProto {
  private ApiTempUploadProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiTempUploadRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:platform.ApiTempUploadRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *上传的位置空间名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    String getName();
    /**
     * <pre>
     *上传的位置空间名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     *上传内容
     * </pre>
     *
     * <code>optional bytes content = 2;</code>
     */
    com.google.protobuf.ByteString getContent();
  }
  /**
   * Protobuf type {@code platform.ApiTempUploadRequest}
   */
  public  static final class ApiTempUploadRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiTempUploadRequest, ApiTempUploadRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:platform.ApiTempUploadRequest)
      ApiTempUploadRequestOrBuilder {
    private ApiTempUploadRequest() {
      name_ = "";
      content_ = com.google.protobuf.ByteString.EMPTY;
    }
    public static final int NAME_FIELD_NUMBER = 1;
    private String name_;
    /**
     * <pre>
     *上传的位置空间名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public String getName() {
      return name_;
    }
    /**
     * <pre>
     *上传的位置空间名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }
    /**
     * <pre>
     *上传的位置空间名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    private void setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      name_ = value;
    }
    /**
     * <pre>
     *上传的位置空间名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    private void clearName() {

      name_ = getDefaultInstance().getName();
    }
    /**
     * <pre>
     *上传的位置空间名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    private void setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      name_ = value.toStringUtf8();
    }

    public static final int CONTENT_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString content_;
    /**
     * <pre>
     *上传内容
     * </pre>
     *
     * <code>optional bytes content = 2;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }
    /**
     * <pre>
     *上传内容
     * </pre>
     *
     * <code>optional bytes content = 2;</code>
     */
    private void setContent(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }

      content_ = value;
    }
    /**
     * <pre>
     *上传内容
     * </pre>
     *
     * <code>optional bytes content = 2;</code>
     */
    private void clearContent() {

      content_ = getDefaultInstance().getContent();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!name_.isEmpty()) {
        output.writeString(1, getName());
      }
      if (!content_.isEmpty()) {
        output.writeBytes(2, content_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!name_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getName());
      }
      if (!content_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, content_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiTempUploadRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiTempUploadRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiTempUploadRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiTempUploadRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiTempUploadRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiTempUploadRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiTempUploadRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiTempUploadRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiTempUploadRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiTempUploadRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiTempUploadRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code platform.ApiTempUploadRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiTempUploadRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:platform.ApiTempUploadRequest)
        ApiTempUploadRequestOrBuilder {
      // Construct using com.windchat.proto.platform.ApiTempUploadProto.ApiTempUploadRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *上传的位置空间名称
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public String getName() {
        return instance.getName();
      }
      /**
       * <pre>
       *上传的位置空间名称
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        return instance.getNameBytes();
      }
      /**
       * <pre>
       *上传的位置空间名称
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setName(
          String value) {
        copyOnWrite();
        instance.setName(value);
        return this;
      }
      /**
       * <pre>
       *上传的位置空间名称
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        copyOnWrite();
        instance.clearName();
        return this;
      }
      /**
       * <pre>
       *上传的位置空间名称
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNameBytes(value);
        return this;
      }

      /**
       * <pre>
       *上传内容
       * </pre>
       *
       * <code>optional bytes content = 2;</code>
       */
      public com.google.protobuf.ByteString getContent() {
        return instance.getContent();
      }
      /**
       * <pre>
       *上传内容
       * </pre>
       *
       * <code>optional bytes content = 2;</code>
       */
      public Builder setContent(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setContent(value);
        return this;
      }
      /**
       * <pre>
       *上传内容
       * </pre>
       *
       * <code>optional bytes content = 2;</code>
       */
      public Builder clearContent() {
        copyOnWrite();
        instance.clearContent();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:platform.ApiTempUploadRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiTempUploadRequest();
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
          ApiTempUploadRequest other = (ApiTempUploadRequest) arg1;
          name_ = visitor.visitString(!name_.isEmpty(), name_,
              !other.name_.isEmpty(), other.name_);
          content_ = visitor.visitByteString(content_ != com.google.protobuf.ByteString.EMPTY, content_,
              other.content_ != com.google.protobuf.ByteString.EMPTY, other.content_);
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

                  name_ = s;
                  break;
                }
                case 18: {

                  content_ = input.readBytes();
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
          if (PARSER == null) {    synchronized (ApiTempUploadRequest.class) {
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


    // @@protoc_insertion_point(class_scope:platform.ApiTempUploadRequest)
    private static final ApiTempUploadRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiTempUploadRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiTempUploadRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiTempUploadRequest> PARSER;

    public static com.google.protobuf.Parser<ApiTempUploadRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiTempUploadResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:platform.ApiTempUploadResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *临时空间存储内容的位置名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    String getName();
    /**
     * <pre>
     *临时空间存储内容的位置名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code platform.ApiTempUploadResponse}
   */
  public  static final class ApiTempUploadResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiTempUploadResponse, ApiTempUploadResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:platform.ApiTempUploadResponse)
      ApiTempUploadResponseOrBuilder {
    private ApiTempUploadResponse() {
      name_ = "";
    }
    public static final int NAME_FIELD_NUMBER = 1;
    private String name_;
    /**
     * <pre>
     *临时空间存储内容的位置名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public String getName() {
      return name_;
    }
    /**
     * <pre>
     *临时空间存储内容的位置名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }
    /**
     * <pre>
     *临时空间存储内容的位置名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    private void setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      name_ = value;
    }
    /**
     * <pre>
     *临时空间存储内容的位置名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    private void clearName() {

      name_ = getDefaultInstance().getName();
    }
    /**
     * <pre>
     *临时空间存储内容的位置名称
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    private void setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      name_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!name_.isEmpty()) {
        output.writeString(1, getName());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!name_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getName());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiTempUploadResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiTempUploadResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiTempUploadResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiTempUploadResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiTempUploadResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiTempUploadResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiTempUploadResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiTempUploadResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiTempUploadResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiTempUploadResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiTempUploadResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code platform.ApiTempUploadResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiTempUploadResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:platform.ApiTempUploadResponse)
        ApiTempUploadResponseOrBuilder {
      // Construct using com.windchat.proto.platform.ApiTempUploadProto.ApiTempUploadResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *临时空间存储内容的位置名称
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public String getName() {
        return instance.getName();
      }
      /**
       * <pre>
       *临时空间存储内容的位置名称
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        return instance.getNameBytes();
      }
      /**
       * <pre>
       *临时空间存储内容的位置名称
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setName(
          String value) {
        copyOnWrite();
        instance.setName(value);
        return this;
      }
      /**
       * <pre>
       *临时空间存储内容的位置名称
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        copyOnWrite();
        instance.clearName();
        return this;
      }
      /**
       * <pre>
       *临时空间存储内容的位置名称
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNameBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:platform.ApiTempUploadResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiTempUploadResponse();
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
          ApiTempUploadResponse other = (ApiTempUploadResponse) arg1;
          name_ = visitor.visitString(!name_.isEmpty(), name_,
              !other.name_.isEmpty(), other.name_);
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

                  name_ = s;
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
          if (PARSER == null) {    synchronized (ApiTempUploadResponse.class) {
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


    // @@protoc_insertion_point(class_scope:platform.ApiTempUploadResponse)
    private static final ApiTempUploadResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiTempUploadResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiTempUploadResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiTempUploadResponse> PARSER;

    public static com.google.protobuf.Parser<ApiTempUploadResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
