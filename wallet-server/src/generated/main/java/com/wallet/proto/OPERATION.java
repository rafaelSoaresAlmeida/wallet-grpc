// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wallet.proto

package com.wallet.proto;

/**
 * Protobuf enum {@code OPERATION}
 */
public enum OPERATION
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEPOSIT = 0;</code>
   */
  DEPOSIT(0),
  /**
   * <code>WITHDRAW = 1;</code>
   */
  WITHDRAW(1),
  /**
   * <code>BALANCE = 2;</code>
   */
  BALANCE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DEPOSIT = 0;</code>
   */
  public static final int DEPOSIT_VALUE = 0;
  /**
   * <code>WITHDRAW = 1;</code>
   */
  public static final int WITHDRAW_VALUE = 1;
  /**
   * <code>BALANCE = 2;</code>
   */
  public static final int BALANCE_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static OPERATION valueOf(int value) {
    return forNumber(value);
  }

  public static OPERATION forNumber(int value) {
    switch (value) {
      case 0: return DEPOSIT;
      case 1: return WITHDRAW;
      case 2: return BALANCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OPERATION>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OPERATION> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OPERATION>() {
          public OPERATION findValueByNumber(int number) {
            return OPERATION.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.wallet.proto.WalletClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final OPERATION[] VALUES = values();

  public static OPERATION valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private OPERATION(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:OPERATION)
}

