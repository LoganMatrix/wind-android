// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: platform/api_phone_verifyCode.proto

package com.windchat.proto.platform;

public final class ApiPhoneVerifyCodeProto {
  private ApiPhoneVerifyCodeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiPhoneVerifyCodeRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:platform.ApiPhoneVerifyCodeRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *需要发送验证码的手机号
     * </pre>
     *
     * <code>optional string phone_id = 1;</code>
     */
    String getPhoneId();
    /**
     * <pre>
     *需要发送验证码的手机号
     * </pre>
     *
     * <code>optional string phone_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getPhoneIdBytes();

    /**
     * <pre>
     *手机验证码类型 phone.proto中VCType
     * </pre>
     *
     * <code>optional int32 vc_type = 2;</code>
     */
    int getVcType();

    /**
     * <pre>
     *+86
     * </pre>
     *
     * <code>optional string country_code = 3;</code>
     */
    String getCountryCode();
    /**
     * <pre>
     *+86
     * </pre>
     *
     * <code>optional string country_code = 3;</code>
     */
    com.google.protobuf.ByteString
        getCountryCodeBytes();

    /**
     * <pre>
     *站点地址
     * </pre>
     *
     * <code>optional string site_address = 4;</code>
     */
    String getSiteAddress();
    /**
     * <pre>
     *站点地址
     * </pre>
     *
     * <code>optional string site_address = 4;</code>
     */
    com.google.protobuf.ByteString
        getSiteAddressBytes();
  }
  /**
   * Protobuf type {@code platform.ApiPhoneVerifyCodeRequest}
   */
  public  static final class ApiPhoneVerifyCodeRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiPhoneVerifyCodeRequest, ApiPhoneVerifyCodeRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:platform.ApiPhoneVerifyCodeRequest)
      ApiPhoneVerifyCodeRequestOrBuilder {
    private ApiPhoneVerifyCodeRequest() {
      phoneId_ = "";
      countryCode_ = "";
      siteAddress_ = "";
    }
    public static final int PHONE_ID_FIELD_NUMBER = 1;
    private String phoneId_;
    /**
     * <pre>
     *需要发送验证码的手机号
     * </pre>
     *
     * <code>optional string phone_id = 1;</code>
     */
    public String getPhoneId() {
      return phoneId_;
    }
    /**
     * <pre>
     *需要发送验证码的手机号
     * </pre>
     *
     * <code>optional string phone_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(phoneId_);
    }
    /**
     * <pre>
     *需要发送验证码的手机号
     * </pre>
     *
     * <code>optional string phone_id = 1;</code>
     */
    private void setPhoneId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      phoneId_ = value;
    }
    /**
     * <pre>
     *需要发送验证码的手机号
     * </pre>
     *
     * <code>optional string phone_id = 1;</code>
     */
    private void clearPhoneId() {

      phoneId_ = getDefaultInstance().getPhoneId();
    }
    /**
     * <pre>
     *需要发送验证码的手机号
     * </pre>
     *
     * <code>optional string phone_id = 1;</code>
     */
    private void setPhoneIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      phoneId_ = value.toStringUtf8();
    }

    public static final int VC_TYPE_FIELD_NUMBER = 2;
    private int vcType_;
    /**
     * <pre>
     *手机验证码类型 phone.proto中VCType
     * </pre>
     *
     * <code>optional int32 vc_type = 2;</code>
     */
    public int getVcType() {
      return vcType_;
    }
    /**
     * <pre>
     *手机验证码类型 phone.proto中VCType
     * </pre>
     *
     * <code>optional int32 vc_type = 2;</code>
     */
    private void setVcType(int value) {

      vcType_ = value;
    }
    /**
     * <pre>
     *手机验证码类型 phone.proto中VCType
     * </pre>
     *
     * <code>optional int32 vc_type = 2;</code>
     */
    private void clearVcType() {

      vcType_ = 0;
    }

    public static final int COUNTRY_CODE_FIELD_NUMBER = 3;
    private String countryCode_;
    /**
     * <pre>
     *+86
     * </pre>
     *
     * <code>optional string country_code = 3;</code>
     */
    public String getCountryCode() {
      return countryCode_;
    }
    /**
     * <pre>
     *+86
     * </pre>
     *
     * <code>optional string country_code = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCountryCodeBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(countryCode_);
    }
    /**
     * <pre>
     *+86
     * </pre>
     *
     * <code>optional string country_code = 3;</code>
     */
    private void setCountryCode(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      countryCode_ = value;
    }
    /**
     * <pre>
     *+86
     * </pre>
     *
     * <code>optional string country_code = 3;</code>
     */
    private void clearCountryCode() {

      countryCode_ = getDefaultInstance().getCountryCode();
    }
    /**
     * <pre>
     *+86
     * </pre>
     *
     * <code>optional string country_code = 3;</code>
     */
    private void setCountryCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      countryCode_ = value.toStringUtf8();
    }

    public static final int SITE_ADDRESS_FIELD_NUMBER = 4;
    private String siteAddress_;
    /**
     * <pre>
     *站点地址
     * </pre>
     *
     * <code>optional string site_address = 4;</code>
     */
    public String getSiteAddress() {
      return siteAddress_;
    }
    /**
     * <pre>
     *站点地址
     * </pre>
     *
     * <code>optional string site_address = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSiteAddressBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(siteAddress_);
    }
    /**
     * <pre>
     *站点地址
     * </pre>
     *
     * <code>optional string site_address = 4;</code>
     */
    private void setSiteAddress(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      siteAddress_ = value;
    }
    /**
     * <pre>
     *站点地址
     * </pre>
     *
     * <code>optional string site_address = 4;</code>
     */
    private void clearSiteAddress() {

      siteAddress_ = getDefaultInstance().getSiteAddress();
    }
    /**
     * <pre>
     *站点地址
     * </pre>
     *
     * <code>optional string site_address = 4;</code>
     */
    private void setSiteAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      siteAddress_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!phoneId_.isEmpty()) {
        output.writeString(1, getPhoneId());
      }
      if (vcType_ != 0) {
        output.writeInt32(2, vcType_);
      }
      if (!countryCode_.isEmpty()) {
        output.writeString(3, getCountryCode());
      }
      if (!siteAddress_.isEmpty()) {
        output.writeString(4, getSiteAddress());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!phoneId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getPhoneId());
      }
      if (vcType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, vcType_);
      }
      if (!countryCode_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getCountryCode());
      }
      if (!siteAddress_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getSiteAddress());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiPhoneVerifyCodeRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiPhoneVerifyCodeRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiPhoneVerifyCodeRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiPhoneVerifyCodeRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiPhoneVerifyCodeRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiPhoneVerifyCodeRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiPhoneVerifyCodeRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiPhoneVerifyCodeRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiPhoneVerifyCodeRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiPhoneVerifyCodeRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiPhoneVerifyCodeRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code platform.ApiPhoneVerifyCodeRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiPhoneVerifyCodeRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:platform.ApiPhoneVerifyCodeRequest)
        ApiPhoneVerifyCodeRequestOrBuilder {
      // Construct using com.windchat.proto.platform.ApiPhoneVerifyCodeProto.ApiPhoneVerifyCodeRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *需要发送验证码的手机号
       * </pre>
       *
       * <code>optional string phone_id = 1;</code>
       */
      public String getPhoneId() {
        return instance.getPhoneId();
      }
      /**
       * <pre>
       *需要发送验证码的手机号
       * </pre>
       *
       * <code>optional string phone_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getPhoneIdBytes() {
        return instance.getPhoneIdBytes();
      }
      /**
       * <pre>
       *需要发送验证码的手机号
       * </pre>
       *
       * <code>optional string phone_id = 1;</code>
       */
      public Builder setPhoneId(
          String value) {
        copyOnWrite();
        instance.setPhoneId(value);
        return this;
      }
      /**
       * <pre>
       *需要发送验证码的手机号
       * </pre>
       *
       * <code>optional string phone_id = 1;</code>
       */
      public Builder clearPhoneId() {
        copyOnWrite();
        instance.clearPhoneId();
        return this;
      }
      /**
       * <pre>
       *需要发送验证码的手机号
       * </pre>
       *
       * <code>optional string phone_id = 1;</code>
       */
      public Builder setPhoneIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPhoneIdBytes(value);
        return this;
      }

      /**
       * <pre>
       *手机验证码类型 phone.proto中VCType
       * </pre>
       *
       * <code>optional int32 vc_type = 2;</code>
       */
      public int getVcType() {
        return instance.getVcType();
      }
      /**
       * <pre>
       *手机验证码类型 phone.proto中VCType
       * </pre>
       *
       * <code>optional int32 vc_type = 2;</code>
       */
      public Builder setVcType(int value) {
        copyOnWrite();
        instance.setVcType(value);
        return this;
      }
      /**
       * <pre>
       *手机验证码类型 phone.proto中VCType
       * </pre>
       *
       * <code>optional int32 vc_type = 2;</code>
       */
      public Builder clearVcType() {
        copyOnWrite();
        instance.clearVcType();
        return this;
      }

      /**
       * <pre>
       *+86
       * </pre>
       *
       * <code>optional string country_code = 3;</code>
       */
      public String getCountryCode() {
        return instance.getCountryCode();
      }
      /**
       * <pre>
       *+86
       * </pre>
       *
       * <code>optional string country_code = 3;</code>
       */
      public com.google.protobuf.ByteString
          getCountryCodeBytes() {
        return instance.getCountryCodeBytes();
      }
      /**
       * <pre>
       *+86
       * </pre>
       *
       * <code>optional string country_code = 3;</code>
       */
      public Builder setCountryCode(
          String value) {
        copyOnWrite();
        instance.setCountryCode(value);
        return this;
      }
      /**
       * <pre>
       *+86
       * </pre>
       *
       * <code>optional string country_code = 3;</code>
       */
      public Builder clearCountryCode() {
        copyOnWrite();
        instance.clearCountryCode();
        return this;
      }
      /**
       * <pre>
       *+86
       * </pre>
       *
       * <code>optional string country_code = 3;</code>
       */
      public Builder setCountryCodeBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setCountryCodeBytes(value);
        return this;
      }

      /**
       * <pre>
       *站点地址
       * </pre>
       *
       * <code>optional string site_address = 4;</code>
       */
      public String getSiteAddress() {
        return instance.getSiteAddress();
      }
      /**
       * <pre>
       *站点地址
       * </pre>
       *
       * <code>optional string site_address = 4;</code>
       */
      public com.google.protobuf.ByteString
          getSiteAddressBytes() {
        return instance.getSiteAddressBytes();
      }
      /**
       * <pre>
       *站点地址
       * </pre>
       *
       * <code>optional string site_address = 4;</code>
       */
      public Builder setSiteAddress(
          String value) {
        copyOnWrite();
        instance.setSiteAddress(value);
        return this;
      }
      /**
       * <pre>
       *站点地址
       * </pre>
       *
       * <code>optional string site_address = 4;</code>
       */
      public Builder clearSiteAddress() {
        copyOnWrite();
        instance.clearSiteAddress();
        return this;
      }
      /**
       * <pre>
       *站点地址
       * </pre>
       *
       * <code>optional string site_address = 4;</code>
       */
      public Builder setSiteAddressBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSiteAddressBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:platform.ApiPhoneVerifyCodeRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiPhoneVerifyCodeRequest();
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
          ApiPhoneVerifyCodeRequest other = (ApiPhoneVerifyCodeRequest) arg1;
          phoneId_ = visitor.visitString(!phoneId_.isEmpty(), phoneId_,
              !other.phoneId_.isEmpty(), other.phoneId_);
          vcType_ = visitor.visitInt(vcType_ != 0, vcType_,
              other.vcType_ != 0, other.vcType_);
          countryCode_ = visitor.visitString(!countryCode_.isEmpty(), countryCode_,
              !other.countryCode_.isEmpty(), other.countryCode_);
          siteAddress_ = visitor.visitString(!siteAddress_.isEmpty(), siteAddress_,
              !other.siteAddress_.isEmpty(), other.siteAddress_);
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

                  phoneId_ = s;
                  break;
                }
                case 16: {

                  vcType_ = input.readInt32();
                  break;
                }
                case 26: {
                  String s = input.readStringRequireUtf8();

                  countryCode_ = s;
                  break;
                }
                case 34: {
                  String s = input.readStringRequireUtf8();

                  siteAddress_ = s;
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
          if (PARSER == null) {    synchronized (ApiPhoneVerifyCodeRequest.class) {
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


    // @@protoc_insertion_point(class_scope:platform.ApiPhoneVerifyCodeRequest)
    private static final ApiPhoneVerifyCodeRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiPhoneVerifyCodeRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiPhoneVerifyCodeRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiPhoneVerifyCodeRequest> PARSER;

    public static com.google.protobuf.Parser<ApiPhoneVerifyCodeRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiPhoneVerifyCodeResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:platform.ApiPhoneVerifyCodeResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *手机验证码过期时间
     * </pre>
     *
     * <code>optional int32 expire_time = 1;</code>
     */
    int getExpireTime();
  }
  /**
   * Protobuf type {@code platform.ApiPhoneVerifyCodeResponse}
   */
  public  static final class ApiPhoneVerifyCodeResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiPhoneVerifyCodeResponse, ApiPhoneVerifyCodeResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:platform.ApiPhoneVerifyCodeResponse)
      ApiPhoneVerifyCodeResponseOrBuilder {
    private ApiPhoneVerifyCodeResponse() {
    }
    public static final int EXPIRE_TIME_FIELD_NUMBER = 1;
    private int expireTime_;
    /**
     * <pre>
     *手机验证码过期时间
     * </pre>
     *
     * <code>optional int32 expire_time = 1;</code>
     */
    public int getExpireTime() {
      return expireTime_;
    }
    /**
     * <pre>
     *手机验证码过期时间
     * </pre>
     *
     * <code>optional int32 expire_time = 1;</code>
     */
    private void setExpireTime(int value) {

      expireTime_ = value;
    }
    /**
     * <pre>
     *手机验证码过期时间
     * </pre>
     *
     * <code>optional int32 expire_time = 1;</code>
     */
    private void clearExpireTime() {

      expireTime_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (expireTime_ != 0) {
        output.writeInt32(1, expireTime_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (expireTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, expireTime_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiPhoneVerifyCodeResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiPhoneVerifyCodeResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiPhoneVerifyCodeResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiPhoneVerifyCodeResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiPhoneVerifyCodeResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiPhoneVerifyCodeResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiPhoneVerifyCodeResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiPhoneVerifyCodeResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiPhoneVerifyCodeResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiPhoneVerifyCodeResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiPhoneVerifyCodeResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code platform.ApiPhoneVerifyCodeResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiPhoneVerifyCodeResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:platform.ApiPhoneVerifyCodeResponse)
        ApiPhoneVerifyCodeResponseOrBuilder {
      // Construct using com.windchat.proto.platform.ApiPhoneVerifyCodeProto.ApiPhoneVerifyCodeResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *手机验证码过期时间
       * </pre>
       *
       * <code>optional int32 expire_time = 1;</code>
       */
      public int getExpireTime() {
        return instance.getExpireTime();
      }
      /**
       * <pre>
       *手机验证码过期时间
       * </pre>
       *
       * <code>optional int32 expire_time = 1;</code>
       */
      public Builder setExpireTime(int value) {
        copyOnWrite();
        instance.setExpireTime(value);
        return this;
      }
      /**
       * <pre>
       *手机验证码过期时间
       * </pre>
       *
       * <code>optional int32 expire_time = 1;</code>
       */
      public Builder clearExpireTime() {
        copyOnWrite();
        instance.clearExpireTime();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:platform.ApiPhoneVerifyCodeResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiPhoneVerifyCodeResponse();
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
          ApiPhoneVerifyCodeResponse other = (ApiPhoneVerifyCodeResponse) arg1;
          expireTime_ = visitor.visitInt(expireTime_ != 0, expireTime_,
              other.expireTime_ != 0, other.expireTime_);
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

                  expireTime_ = input.readInt32();
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
          if (PARSER == null) {    synchronized (ApiPhoneVerifyCodeResponse.class) {
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


    // @@protoc_insertion_point(class_scope:platform.ApiPhoneVerifyCodeResponse)
    private static final ApiPhoneVerifyCodeResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiPhoneVerifyCodeResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiPhoneVerifyCodeResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiPhoneVerifyCodeResponse> PARSER;

    public static com.google.protobuf.Parser<ApiPhoneVerifyCodeResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
