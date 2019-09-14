// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/api_file_download.proto

package com.windchat.proto.server;

public final class ApiFileDownloadProto {
  private ApiFileDownloadProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiFileDownloadRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiFileDownloadRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *下载资源标识ID
     * </pre>
     *
     * <code>optional string file_id = 1;</code>
     */
    String getFileId();
    /**
     * <pre>
     *下载资源标识ID
     * </pre>
     *
     * <code>optional string file_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getFileIdBytes();
  }
  /**
   * Protobuf type {@code site.ApiFileDownloadRequest}
   */
  public  static final class ApiFileDownloadRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiFileDownloadRequest, ApiFileDownloadRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiFileDownloadRequest)
      ApiFileDownloadRequestOrBuilder {
    private ApiFileDownloadRequest() {
      fileId_ = "";
    }
    public static final int FILE_ID_FIELD_NUMBER = 1;
    private String fileId_;
    /**
     * <pre>
     *下载资源标识ID
     * </pre>
     *
     * <code>optional string file_id = 1;</code>
     */
    public String getFileId() {
      return fileId_;
    }
    /**
     * <pre>
     *下载资源标识ID
     * </pre>
     *
     * <code>optional string file_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFileIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(fileId_);
    }
    /**
     * <pre>
     *下载资源标识ID
     * </pre>
     *
     * <code>optional string file_id = 1;</code>
     */
    private void setFileId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      fileId_ = value;
    }
    /**
     * <pre>
     *下载资源标识ID
     * </pre>
     *
     * <code>optional string file_id = 1;</code>
     */
    private void clearFileId() {

      fileId_ = getDefaultInstance().getFileId();
    }
    /**
     * <pre>
     *下载资源标识ID
     * </pre>
     *
     * <code>optional string file_id = 1;</code>
     */
    private void setFileIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      fileId_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!fileId_.isEmpty()) {
        output.writeString(1, getFileId());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!fileId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getFileId());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiFileDownloadRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFileDownloadRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFileDownloadRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFileDownloadRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFileDownloadRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFileDownloadRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFileDownloadRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiFileDownloadRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFileDownloadRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFileDownloadRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiFileDownloadRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiFileDownloadRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiFileDownloadRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiFileDownloadRequest)
        ApiFileDownloadRequestOrBuilder {
      // Construct using com.windchat.proto.server.ApiFileDownloadProto.ApiFileDownloadRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *下载资源标识ID
       * </pre>
       *
       * <code>optional string file_id = 1;</code>
       */
      public String getFileId() {
        return instance.getFileId();
      }
      /**
       * <pre>
       *下载资源标识ID
       * </pre>
       *
       * <code>optional string file_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getFileIdBytes() {
        return instance.getFileIdBytes();
      }
      /**
       * <pre>
       *下载资源标识ID
       * </pre>
       *
       * <code>optional string file_id = 1;</code>
       */
      public Builder setFileId(
          String value) {
        copyOnWrite();
        instance.setFileId(value);
        return this;
      }
      /**
       * <pre>
       *下载资源标识ID
       * </pre>
       *
       * <code>optional string file_id = 1;</code>
       */
      public Builder clearFileId() {
        copyOnWrite();
        instance.clearFileId();
        return this;
      }
      /**
       * <pre>
       *下载资源标识ID
       * </pre>
       *
       * <code>optional string file_id = 1;</code>
       */
      public Builder setFileIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setFileIdBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiFileDownloadRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiFileDownloadRequest();
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
          ApiFileDownloadRequest other = (ApiFileDownloadRequest) arg1;
          fileId_ = visitor.visitString(!fileId_.isEmpty(), fileId_,
              !other.fileId_.isEmpty(), other.fileId_);
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

                  fileId_ = s;
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
          if (PARSER == null) {    synchronized (ApiFileDownloadRequest.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiFileDownloadRequest)
    private static final ApiFileDownloadRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiFileDownloadRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiFileDownloadRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiFileDownloadRequest> PARSER;

    public static com.google.protobuf.Parser<ApiFileDownloadRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiFileDownloadResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiFileDownloadResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *通过资源标示ID下载的资源文件
     * </pre>
     *
     * <code>optional .core.File file = 1;</code>
     */
    boolean hasFile();
    /**
     * <pre>
     *通过资源标示ID下载的资源文件
     * </pre>
     *
     * <code>optional .core.File file = 1;</code>
     */
    com.windchat.proto.core.FileProto.File getFile();
  }
  /**
   * Protobuf type {@code site.ApiFileDownloadResponse}
   */
  public  static final class ApiFileDownloadResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiFileDownloadResponse, ApiFileDownloadResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiFileDownloadResponse)
      ApiFileDownloadResponseOrBuilder {
    private ApiFileDownloadResponse() {
    }
    public static final int FILE_FIELD_NUMBER = 1;
    private com.windchat.proto.core.FileProto.File file_;
    /**
     * <pre>
     *通过资源标示ID下载的资源文件
     * </pre>
     *
     * <code>optional .core.File file = 1;</code>
     */
    public boolean hasFile() {
      return file_ != null;
    }
    /**
     * <pre>
     *通过资源标示ID下载的资源文件
     * </pre>
     *
     * <code>optional .core.File file = 1;</code>
     */
    public com.windchat.proto.core.FileProto.File getFile() {
      return file_ == null ? com.windchat.proto.core.FileProto.File.getDefaultInstance() : file_;
    }
    /**
     * <pre>
     *通过资源标示ID下载的资源文件
     * </pre>
     *
     * <code>optional .core.File file = 1;</code>
     */
    private void setFile(com.windchat.proto.core.FileProto.File value) {
      if (value == null) {
        throw new NullPointerException();
      }
      file_ = value;

      }
    /**
     * <pre>
     *通过资源标示ID下载的资源文件
     * </pre>
     *
     * <code>optional .core.File file = 1;</code>
     */
    private void setFile(
        com.windchat.proto.core.FileProto.File.Builder builderForValue) {
      file_ = builderForValue.build();

    }
    /**
     * <pre>
     *通过资源标示ID下载的资源文件
     * </pre>
     *
     * <code>optional .core.File file = 1;</code>
     */
    private void mergeFile(com.windchat.proto.core.FileProto.File value) {
      if (file_ != null &&
          file_ != com.windchat.proto.core.FileProto.File.getDefaultInstance()) {
        file_ =
          com.windchat.proto.core.FileProto.File.newBuilder(file_).mergeFrom(value).buildPartial();
      } else {
        file_ = value;
      }

    }
    /**
     * <pre>
     *通过资源标示ID下载的资源文件
     * </pre>
     *
     * <code>optional .core.File file = 1;</code>
     */
    private void clearFile() {  file_ = null;

    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (file_ != null) {
        output.writeMessage(1, getFile());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (file_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getFile());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiFileDownloadResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFileDownloadResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFileDownloadResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFileDownloadResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFileDownloadResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFileDownloadResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFileDownloadResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiFileDownloadResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFileDownloadResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFileDownloadResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiFileDownloadResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiFileDownloadResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiFileDownloadResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiFileDownloadResponse)
        ApiFileDownloadResponseOrBuilder {
      // Construct using com.windchat.proto.server.ApiFileDownloadProto.ApiFileDownloadResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *通过资源标示ID下载的资源文件
       * </pre>
       *
       * <code>optional .core.File file = 1;</code>
       */
      public boolean hasFile() {
        return instance.hasFile();
      }
      /**
       * <pre>
       *通过资源标示ID下载的资源文件
       * </pre>
       *
       * <code>optional .core.File file = 1;</code>
       */
      public com.windchat.proto.core.FileProto.File getFile() {
        return instance.getFile();
      }
      /**
       * <pre>
       *通过资源标示ID下载的资源文件
       * </pre>
       *
       * <code>optional .core.File file = 1;</code>
       */
      public Builder setFile(com.windchat.proto.core.FileProto.File value) {
        copyOnWrite();
        instance.setFile(value);
        return this;
        }
      /**
       * <pre>
       *通过资源标示ID下载的资源文件
       * </pre>
       *
       * <code>optional .core.File file = 1;</code>
       */
      public Builder setFile(
          com.windchat.proto.core.FileProto.File.Builder builderForValue) {
        copyOnWrite();
        instance.setFile(builderForValue);
        return this;
      }
      /**
       * <pre>
       *通过资源标示ID下载的资源文件
       * </pre>
       *
       * <code>optional .core.File file = 1;</code>
       */
      public Builder mergeFile(com.windchat.proto.core.FileProto.File value) {
        copyOnWrite();
        instance.mergeFile(value);
        return this;
      }
      /**
       * <pre>
       *通过资源标示ID下载的资源文件
       * </pre>
       *
       * <code>optional .core.File file = 1;</code>
       */
      public Builder clearFile() {  copyOnWrite();
        instance.clearFile();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiFileDownloadResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiFileDownloadResponse();
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
          ApiFileDownloadResponse other = (ApiFileDownloadResponse) arg1;
          file_ = visitor.visitMessage(file_, other.file_);
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
                  com.windchat.proto.core.FileProto.File.Builder subBuilder = null;
                  if (file_ != null) {
                    subBuilder = file_.toBuilder();
                  }
                  file_ = input.readMessage(com.windchat.proto.core.FileProto.File.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(file_);
                    file_ = subBuilder.buildPartial();
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
          if (PARSER == null) {    synchronized (ApiFileDownloadResponse.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiFileDownloadResponse)
    private static final ApiFileDownloadResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiFileDownloadResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiFileDownloadResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiFileDownloadResponse> PARSER;

    public static com.google.protobuf.Parser<ApiFileDownloadResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
