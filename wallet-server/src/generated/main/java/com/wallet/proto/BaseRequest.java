// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wallet.proto

package com.wallet.proto;

/**
 * Protobuf type {@code BaseRequest}
 */
public  final class BaseRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BaseRequest)
    BaseRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BaseRequest.newBuilder() to construct.
  private BaseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BaseRequest() {
    amount_ = "";
    currency_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BaseRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            userID_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            amount_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            currency_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wallet.proto.WalletClass.internal_static_BaseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wallet.proto.WalletClass.internal_static_BaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wallet.proto.BaseRequest.class, com.wallet.proto.BaseRequest.Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private int userID_;
  /**
   * <code>int32 userID = 1;</code>
   */
  public int getUserID() {
    return userID_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private volatile java.lang.Object amount_;
  /**
   * <code>string amount = 2;</code>
   */
  public java.lang.String getAmount() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amount_ = s;
      return s;
    }
  }
  /**
   * <code>string amount = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAmountBytes() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CURRENCY_FIELD_NUMBER = 3;
  private int currency_;
  /**
   * <code>.CURRENCY currency = 3;</code>
   */
  public int getCurrencyValue() {
    return currency_;
  }
  /**
   * <code>.CURRENCY currency = 3;</code>
   */
  public com.wallet.proto.CURRENCY getCurrency() {
    @SuppressWarnings("deprecation")
    com.wallet.proto.CURRENCY result = com.wallet.proto.CURRENCY.valueOf(currency_);
    return result == null ? com.wallet.proto.CURRENCY.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (userID_ != 0) {
      output.writeInt32(1, userID_);
    }
    if (!getAmountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, amount_);
    }
    if (currency_ != com.wallet.proto.CURRENCY.USD.getNumber()) {
      output.writeEnum(3, currency_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, userID_);
    }
    if (!getAmountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, amount_);
    }
    if (currency_ != com.wallet.proto.CURRENCY.USD.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, currency_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.wallet.proto.BaseRequest)) {
      return super.equals(obj);
    }
    com.wallet.proto.BaseRequest other = (com.wallet.proto.BaseRequest) obj;

    if (getUserID()
        != other.getUserID()) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (currency_ != other.currency_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserID();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + currency_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wallet.proto.BaseRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wallet.proto.BaseRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wallet.proto.BaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wallet.proto.BaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wallet.proto.BaseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wallet.proto.BaseRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wallet.proto.BaseRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wallet.proto.BaseRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wallet.proto.BaseRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wallet.proto.BaseRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wallet.proto.BaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wallet.proto.BaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wallet.proto.BaseRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code BaseRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BaseRequest)
      com.wallet.proto.BaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wallet.proto.WalletClass.internal_static_BaseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wallet.proto.WalletClass.internal_static_BaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wallet.proto.BaseRequest.class, com.wallet.proto.BaseRequest.Builder.class);
    }

    // Construct using com.wallet.proto.BaseRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userID_ = 0;

      amount_ = "";

      currency_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wallet.proto.WalletClass.internal_static_BaseRequest_descriptor;
    }

    @java.lang.Override
    public com.wallet.proto.BaseRequest getDefaultInstanceForType() {
      return com.wallet.proto.BaseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.wallet.proto.BaseRequest build() {
      com.wallet.proto.BaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wallet.proto.BaseRequest buildPartial() {
      com.wallet.proto.BaseRequest result = new com.wallet.proto.BaseRequest(this);
      result.userID_ = userID_;
      result.amount_ = amount_;
      result.currency_ = currency_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wallet.proto.BaseRequest) {
        return mergeFrom((com.wallet.proto.BaseRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wallet.proto.BaseRequest other) {
      if (other == com.wallet.proto.BaseRequest.getDefaultInstance()) return this;
      if (other.getUserID() != 0) {
        setUserID(other.getUserID());
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        onChanged();
      }
      if (other.currency_ != 0) {
        setCurrencyValue(other.getCurrencyValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.wallet.proto.BaseRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wallet.proto.BaseRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int userID_ ;
    /**
     * <code>int32 userID = 1;</code>
     */
    public int getUserID() {
      return userID_;
    }
    /**
     * <code>int32 userID = 1;</code>
     */
    public Builder setUserID(int value) {
      
      userID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 userID = 1;</code>
     */
    public Builder clearUserID() {
      
      userID_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <code>string amount = 2;</code>
     */
    public java.lang.String getAmount() {
      java.lang.Object ref = amount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string amount = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAmountBytes() {
      java.lang.Object ref = amount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string amount = 2;</code>
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 2;</code>
     */
    public Builder clearAmount() {
      
      amount_ = getDefaultInstance().getAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 2;</code>
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      amount_ = value;
      onChanged();
      return this;
    }

    private int currency_ = 0;
    /**
     * <code>.CURRENCY currency = 3;</code>
     */
    public int getCurrencyValue() {
      return currency_;
    }
    /**
     * <code>.CURRENCY currency = 3;</code>
     */
    public Builder setCurrencyValue(int value) {
      currency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.CURRENCY currency = 3;</code>
     */
    public com.wallet.proto.CURRENCY getCurrency() {
      @SuppressWarnings("deprecation")
      com.wallet.proto.CURRENCY result = com.wallet.proto.CURRENCY.valueOf(currency_);
      return result == null ? com.wallet.proto.CURRENCY.UNRECOGNIZED : result;
    }
    /**
     * <code>.CURRENCY currency = 3;</code>
     */
    public Builder setCurrency(com.wallet.proto.CURRENCY value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      currency_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.CURRENCY currency = 3;</code>
     */
    public Builder clearCurrency() {
      
      currency_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:BaseRequest)
  }

  // @@protoc_insertion_point(class_scope:BaseRequest)
  private static final com.wallet.proto.BaseRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wallet.proto.BaseRequest();
  }

  public static com.wallet.proto.BaseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BaseRequest>
      PARSER = new com.google.protobuf.AbstractParser<BaseRequest>() {
    @java.lang.Override
    public BaseRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BaseRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BaseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wallet.proto.BaseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

