// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Book.proto

package org.ninetripods.mq.study;

public final class BookProto {
  private BookProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  /**
   * Protobuf enum {@code Season}
   */
  public enum Season
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>SPRING = 0;</code>
     */
    SPRING(0),
    /**
     * <code>SUMMER = 1;</code>
     */
    SUMMER(1),
    /**
     * <code>AUTUMN = 2;</code>
     */
    AUTUMN(2),
    /**
     * <code>WINTER = 3;</code>
     */
    WINTER(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SPRING = 0;</code>
     */
    public static final int SPRING_VALUE = 0;
    /**
     * <code>SUMMER = 1;</code>
     */
    public static final int SUMMER_VALUE = 1;
    /**
     * <code>AUTUMN = 2;</code>
     */
    public static final int AUTUMN_VALUE = 2;
    /**
     * <code>WINTER = 3;</code>
     */
    public static final int WINTER_VALUE = 3;


    @java.lang.Override
    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Season valueOf(int value) {
      return forNumber(value);
    }

    public static Season forNumber(int value) {
      switch (value) {
        case 0: return SPRING;
        case 1: return SUMMER;
        case 2: return AUTUMN;
        case 3: return WINTER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Season>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Season> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Season>() {
            @java.lang.Override
            public Season findValueByNumber(int number) {
              return Season.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return SeasonVerifier.INSTANCE;
    }

    private static final class SeasonVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new SeasonVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return Season.forNumber(number) != null;
            }
          };

    private final int value;

    private Season(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Season)
  }

  public interface BookOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Book)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * 格式：类型 + 名称 + 编号
     * </pre>
     *
     * <code>string bookName = 1;</code>
     * @return The bookName.
     */
    java.lang.String getBookName();
    /**
     * <pre>
     * 格式：类型 + 名称 + 编号
     * </pre>
     *
     * <code>string bookName = 1;</code>
     * @return The bytes for bookName.
     */
    com.google.protobuf.ByteString
        getBookNameBytes();

    /**
     * <pre>
     *价格
     * </pre>
     *
     * <code>float price = 2;</code>
     * @return The price.
     */
    float getPrice();

    /**
     * <pre>
     *序列号
     * </pre>
     *
     * <code>int32 serialNum = 3;</code>
     * @return The serialNum.
     */
    int getSerialNum();

    /**
     * <pre>
     *是否是学科类
     * </pre>
     *
     * <code>bool isSubject = 4;</code>
     * @return The isSubject.
     */
    boolean getIsSubject();

    /**
     * <pre>
     *拥有者
     * </pre>
     *
     * <code>.Owner owner = 5;</code>
     * @return Whether the owner field is set.
     */
    boolean hasOwner();
    /**
     * <pre>
     *拥有者
     * </pre>
     *
     * <code>.Owner owner = 5;</code>
     * @return The owner.
     */
    org.ninetripods.mq.study.BookProto.Owner getOwner();

    /**
     * <pre>
     *季节
     * </pre>
     *
     * <code>.Season season = 6;</code>
     * @return The enum numeric value on the wire for season.
     */
    int getSeasonValue();
    /**
     * <pre>
     *季节
     * </pre>
     *
     * <code>.Season season = 6;</code>
     * @return The season.
     */
    org.ninetripods.mq.study.BookProto.Season getSeason();
  }
  /**
   * Protobuf type {@code Book}
   */
  public  static final class Book extends
      com.google.protobuf.GeneratedMessageLite<
          Book, Book.Builder> implements
      // @@protoc_insertion_point(message_implements:Book)
      BookOrBuilder {
    private Book() {
      bookName_ = "";
    }
    public static final int BOOKNAME_FIELD_NUMBER = 1;
    private java.lang.String bookName_;
    /**
     * <pre>
     * 格式：类型 + 名称 + 编号
     * </pre>
     *
     * <code>string bookName = 1;</code>
     * @return The bookName.
     */
    @java.lang.Override
    public java.lang.String getBookName() {
      return bookName_;
    }
    /**
     * <pre>
     * 格式：类型 + 名称 + 编号
     * </pre>
     *
     * <code>string bookName = 1;</code>
     * @return The bytes for bookName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBookNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(bookName_);
    }
    /**
     * <pre>
     * 格式：类型 + 名称 + 编号
     * </pre>
     *
     * <code>string bookName = 1;</code>
     * @param value The bookName to set.
     */
    private void setBookName(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      bookName_ = value;
    }
    /**
     * <pre>
     * 格式：类型 + 名称 + 编号
     * </pre>
     *
     * <code>string bookName = 1;</code>
     */
    private void clearBookName() {
      
      bookName_ = getDefaultInstance().getBookName();
    }
    /**
     * <pre>
     * 格式：类型 + 名称 + 编号
     * </pre>
     *
     * <code>string bookName = 1;</code>
     * @param value The bytes for bookName to set.
     */
    private void setBookNameBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      bookName_ = value.toStringUtf8();
      
    }

    public static final int PRICE_FIELD_NUMBER = 2;
    private float price_;
    /**
     * <pre>
     *价格
     * </pre>
     *
     * <code>float price = 2;</code>
     * @return The price.
     */
    @java.lang.Override
    public float getPrice() {
      return price_;
    }
    /**
     * <pre>
     *价格
     * </pre>
     *
     * <code>float price = 2;</code>
     * @param value The price to set.
     */
    private void setPrice(float value) {
      
      price_ = value;
    }
    /**
     * <pre>
     *价格
     * </pre>
     *
     * <code>float price = 2;</code>
     */
    private void clearPrice() {
      
      price_ = 0F;
    }

    public static final int SERIALNUM_FIELD_NUMBER = 3;
    private int serialNum_;
    /**
     * <pre>
     *序列号
     * </pre>
     *
     * <code>int32 serialNum = 3;</code>
     * @return The serialNum.
     */
    @java.lang.Override
    public int getSerialNum() {
      return serialNum_;
    }
    /**
     * <pre>
     *序列号
     * </pre>
     *
     * <code>int32 serialNum = 3;</code>
     * @param value The serialNum to set.
     */
    private void setSerialNum(int value) {
      
      serialNum_ = value;
    }
    /**
     * <pre>
     *序列号
     * </pre>
     *
     * <code>int32 serialNum = 3;</code>
     */
    private void clearSerialNum() {
      
      serialNum_ = 0;
    }

    public static final int ISSUBJECT_FIELD_NUMBER = 4;
    private boolean isSubject_;
    /**
     * <pre>
     *是否是学科类
     * </pre>
     *
     * <code>bool isSubject = 4;</code>
     * @return The isSubject.
     */
    @java.lang.Override
    public boolean getIsSubject() {
      return isSubject_;
    }
    /**
     * <pre>
     *是否是学科类
     * </pre>
     *
     * <code>bool isSubject = 4;</code>
     * @param value The isSubject to set.
     */
    private void setIsSubject(boolean value) {
      
      isSubject_ = value;
    }
    /**
     * <pre>
     *是否是学科类
     * </pre>
     *
     * <code>bool isSubject = 4;</code>
     */
    private void clearIsSubject() {
      
      isSubject_ = false;
    }

    public static final int OWNER_FIELD_NUMBER = 5;
    private org.ninetripods.mq.study.BookProto.Owner owner_;
    /**
     * <pre>
     *拥有者
     * </pre>
     *
     * <code>.Owner owner = 5;</code>
     */
    @java.lang.Override
    public boolean hasOwner() {
      return owner_ != null;
    }
    /**
     * <pre>
     *拥有者
     * </pre>
     *
     * <code>.Owner owner = 5;</code>
     */
    @java.lang.Override
    public org.ninetripods.mq.study.BookProto.Owner getOwner() {
      return owner_ == null ? org.ninetripods.mq.study.BookProto.Owner.getDefaultInstance() : owner_;
    }
    /**
     * <pre>
     *拥有者
     * </pre>
     *
     * <code>.Owner owner = 5;</code>
     */
    private void setOwner(org.ninetripods.mq.study.BookProto.Owner value) {
      value.getClass();
  owner_ = value;
      
      }
    /**
     * <pre>
     *拥有者
     * </pre>
     *
     * <code>.Owner owner = 5;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeOwner(org.ninetripods.mq.study.BookProto.Owner value) {
      value.getClass();
  if (owner_ != null &&
          owner_ != org.ninetripods.mq.study.BookProto.Owner.getDefaultInstance()) {
        owner_ =
          org.ninetripods.mq.study.BookProto.Owner.newBuilder(owner_).mergeFrom(value).buildPartial();
      } else {
        owner_ = value;
      }
      
    }
    /**
     * <pre>
     *拥有者
     * </pre>
     *
     * <code>.Owner owner = 5;</code>
     */
    private void clearOwner() {  owner_ = null;
      
    }

    public static final int SEASON_FIELD_NUMBER = 6;
    private int season_;
    /**
     * <pre>
     *季节
     * </pre>
     *
     * <code>.Season season = 6;</code>
     * @return The enum numeric value on the wire for season.
     */
    @java.lang.Override
    public int getSeasonValue() {
      return season_;
    }
    /**
     * <pre>
     *季节
     * </pre>
     *
     * <code>.Season season = 6;</code>
     * @return The season.
     */
    @java.lang.Override
    public org.ninetripods.mq.study.BookProto.Season getSeason() {
      org.ninetripods.mq.study.BookProto.Season result = org.ninetripods.mq.study.BookProto.Season.forNumber(season_);
      return result == null ? org.ninetripods.mq.study.BookProto.Season.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *季节
     * </pre>
     *
     * <code>.Season season = 6;</code>
     * @param value The enum numeric value on the wire for season to set.
     */
    private void setSeasonValue(int value) {
        season_ = value;
    }
    /**
     * <pre>
     *季节
     * </pre>
     *
     * <code>.Season season = 6;</code>
     * @param value The season to set.
     */
    private void setSeason(org.ninetripods.mq.study.BookProto.Season value) {
      season_ = value.getNumber();
      
    }
    /**
     * <pre>
     *季节
     * </pre>
     *
     * <code>.Season season = 6;</code>
     */
    private void clearSeason() {
      
      season_ = 0;
    }

    public static org.ninetripods.mq.study.BookProto.Book parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.ninetripods.mq.study.BookProto.Book parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.ninetripods.mq.study.BookProto.Book parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.ninetripods.mq.study.BookProto.Book parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.ninetripods.mq.study.BookProto.Book parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.ninetripods.mq.study.BookProto.Book parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.ninetripods.mq.study.BookProto.Book parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.ninetripods.mq.study.BookProto.Book parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.ninetripods.mq.study.BookProto.Book parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.ninetripods.mq.study.BookProto.Book parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.ninetripods.mq.study.BookProto.Book parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.ninetripods.mq.study.BookProto.Book parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.ninetripods.mq.study.BookProto.Book prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code Book}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.ninetripods.mq.study.BookProto.Book, Builder> implements
        // @@protoc_insertion_point(builder_implements:Book)
        org.ninetripods.mq.study.BookProto.BookOrBuilder {
      // Construct using org.ninetripods.mq.study.BookProto.Book.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * 格式：类型 + 名称 + 编号
       * </pre>
       *
       * <code>string bookName = 1;</code>
       * @return The bookName.
       */
      @java.lang.Override
      public java.lang.String getBookName() {
        return instance.getBookName();
      }
      /**
       * <pre>
       * 格式：类型 + 名称 + 编号
       * </pre>
       *
       * <code>string bookName = 1;</code>
       * @return The bytes for bookName.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getBookNameBytes() {
        return instance.getBookNameBytes();
      }
      /**
       * <pre>
       * 格式：类型 + 名称 + 编号
       * </pre>
       *
       * <code>string bookName = 1;</code>
       * @param value The bookName to set.
       * @return This builder for chaining.
       */
      public Builder setBookName(
          java.lang.String value) {
        copyOnWrite();
        instance.setBookName(value);
        return this;
      }
      /**
       * <pre>
       * 格式：类型 + 名称 + 编号
       * </pre>
       *
       * <code>string bookName = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearBookName() {
        copyOnWrite();
        instance.clearBookName();
        return this;
      }
      /**
       * <pre>
       * 格式：类型 + 名称 + 编号
       * </pre>
       *
       * <code>string bookName = 1;</code>
       * @param value The bytes for bookName to set.
       * @return This builder for chaining.
       */
      public Builder setBookNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setBookNameBytes(value);
        return this;
      }

      /**
       * <pre>
       *价格
       * </pre>
       *
       * <code>float price = 2;</code>
       * @return The price.
       */
      @java.lang.Override
      public float getPrice() {
        return instance.getPrice();
      }
      /**
       * <pre>
       *价格
       * </pre>
       *
       * <code>float price = 2;</code>
       * @param value The price to set.
       * @return This builder for chaining.
       */
      public Builder setPrice(float value) {
        copyOnWrite();
        instance.setPrice(value);
        return this;
      }
      /**
       * <pre>
       *价格
       * </pre>
       *
       * <code>float price = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPrice() {
        copyOnWrite();
        instance.clearPrice();
        return this;
      }

      /**
       * <pre>
       *序列号
       * </pre>
       *
       * <code>int32 serialNum = 3;</code>
       * @return The serialNum.
       */
      @java.lang.Override
      public int getSerialNum() {
        return instance.getSerialNum();
      }
      /**
       * <pre>
       *序列号
       * </pre>
       *
       * <code>int32 serialNum = 3;</code>
       * @param value The serialNum to set.
       * @return This builder for chaining.
       */
      public Builder setSerialNum(int value) {
        copyOnWrite();
        instance.setSerialNum(value);
        return this;
      }
      /**
       * <pre>
       *序列号
       * </pre>
       *
       * <code>int32 serialNum = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSerialNum() {
        copyOnWrite();
        instance.clearSerialNum();
        return this;
      }

      /**
       * <pre>
       *是否是学科类
       * </pre>
       *
       * <code>bool isSubject = 4;</code>
       * @return The isSubject.
       */
      @java.lang.Override
      public boolean getIsSubject() {
        return instance.getIsSubject();
      }
      /**
       * <pre>
       *是否是学科类
       * </pre>
       *
       * <code>bool isSubject = 4;</code>
       * @param value The isSubject to set.
       * @return This builder for chaining.
       */
      public Builder setIsSubject(boolean value) {
        copyOnWrite();
        instance.setIsSubject(value);
        return this;
      }
      /**
       * <pre>
       *是否是学科类
       * </pre>
       *
       * <code>bool isSubject = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSubject() {
        copyOnWrite();
        instance.clearIsSubject();
        return this;
      }

      /**
       * <pre>
       *拥有者
       * </pre>
       *
       * <code>.Owner owner = 5;</code>
       */
      @java.lang.Override
      public boolean hasOwner() {
        return instance.hasOwner();
      }
      /**
       * <pre>
       *拥有者
       * </pre>
       *
       * <code>.Owner owner = 5;</code>
       */
      @java.lang.Override
      public org.ninetripods.mq.study.BookProto.Owner getOwner() {
        return instance.getOwner();
      }
      /**
       * <pre>
       *拥有者
       * </pre>
       *
       * <code>.Owner owner = 5;</code>
       */
      public Builder setOwner(org.ninetripods.mq.study.BookProto.Owner value) {
        copyOnWrite();
        instance.setOwner(value);
        return this;
        }
      /**
       * <pre>
       *拥有者
       * </pre>
       *
       * <code>.Owner owner = 5;</code>
       */
      public Builder setOwner(
          org.ninetripods.mq.study.BookProto.Owner.Builder builderForValue) {
        copyOnWrite();
        instance.setOwner(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       *拥有者
       * </pre>
       *
       * <code>.Owner owner = 5;</code>
       */
      public Builder mergeOwner(org.ninetripods.mq.study.BookProto.Owner value) {
        copyOnWrite();
        instance.mergeOwner(value);
        return this;
      }
      /**
       * <pre>
       *拥有者
       * </pre>
       *
       * <code>.Owner owner = 5;</code>
       */
      public Builder clearOwner() {  copyOnWrite();
        instance.clearOwner();
        return this;
      }

      /**
       * <pre>
       *季节
       * </pre>
       *
       * <code>.Season season = 6;</code>
       * @return The enum numeric value on the wire for season.
       */
      @java.lang.Override
      public int getSeasonValue() {
        return instance.getSeasonValue();
      }
      /**
       * <pre>
       *季节
       * </pre>
       *
       * <code>.Season season = 6;</code>
       * @param value The season to set.
       * @return This builder for chaining.
       */
      public Builder setSeasonValue(int value) {
        copyOnWrite();
        instance.setSeasonValue(value);
        return this;
      }
      /**
       * <pre>
       *季节
       * </pre>
       *
       * <code>.Season season = 6;</code>
       * @return The season.
       */
      @java.lang.Override
      public org.ninetripods.mq.study.BookProto.Season getSeason() {
        return instance.getSeason();
      }
      /**
       * <pre>
       *季节
       * </pre>
       *
       * <code>.Season season = 6;</code>
       * @param value The enum numeric value on the wire for season to set.
       * @return This builder for chaining.
       */
      public Builder setSeason(org.ninetripods.mq.study.BookProto.Season value) {
        copyOnWrite();
        instance.setSeason(value);
        return this;
      }
      /**
       * <pre>
       *季节
       * </pre>
       *
       * <code>.Season season = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeason() {
        copyOnWrite();
        instance.clearSeason();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Book)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.ninetripods.mq.study.BookProto.Book();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bookName_",
              "price_",
              "serialNum_",
              "isSubject_",
              "owner_",
              "season_",
            };
            java.lang.String info =
                "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0001" +
                "\u0003\u0004\u0004\u0007\u0005\t\u0006\f";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.ninetripods.mq.study.BookProto.Book> parser = PARSER;
          if (parser == null) {
            synchronized (org.ninetripods.mq.study.BookProto.Book.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.ninetripods.mq.study.BookProto.Book>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:Book)
    private static final org.ninetripods.mq.study.BookProto.Book DEFAULT_INSTANCE;
    static {
      Book defaultInstance = new Book();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Book.class, defaultInstance);
    }

    public static org.ninetripods.mq.study.BookProto.Book getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Book> PARSER;

    public static com.google.protobuf.Parser<Book> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface OwnerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Owner)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *人名
     * </pre>
     *
     * <code>string pName = 1;</code>
     * @return The pName.
     */
    java.lang.String getPName();
    /**
     * <pre>
     *人名
     * </pre>
     *
     * <code>string pName = 1;</code>
     * @return The bytes for pName.
     */
    com.google.protobuf.ByteString
        getPNameBytes();

    /**
     * <pre>
     *年龄
     * </pre>
     *
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    int getAge();
  }
  /**
   * Protobuf type {@code Owner}
   */
  public  static final class Owner extends
      com.google.protobuf.GeneratedMessageLite<
          Owner, Owner.Builder> implements
      // @@protoc_insertion_point(message_implements:Owner)
      OwnerOrBuilder {
    private Owner() {
      pName_ = "";
    }
    public static final int PNAME_FIELD_NUMBER = 1;
    private java.lang.String pName_;
    /**
     * <pre>
     *人名
     * </pre>
     *
     * <code>string pName = 1;</code>
     * @return The pName.
     */
    @java.lang.Override
    public java.lang.String getPName() {
      return pName_;
    }
    /**
     * <pre>
     *人名
     * </pre>
     *
     * <code>string pName = 1;</code>
     * @return The bytes for pName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(pName_);
    }
    /**
     * <pre>
     *人名
     * </pre>
     *
     * <code>string pName = 1;</code>
     * @param value The pName to set.
     */
    private void setPName(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      pName_ = value;
    }
    /**
     * <pre>
     *人名
     * </pre>
     *
     * <code>string pName = 1;</code>
     */
    private void clearPName() {
      
      pName_ = getDefaultInstance().getPName();
    }
    /**
     * <pre>
     *人名
     * </pre>
     *
     * <code>string pName = 1;</code>
     * @param value The bytes for pName to set.
     */
    private void setPNameBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      pName_ = value.toStringUtf8();
      
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private int age_;
    /**
     * <pre>
     *年龄
     * </pre>
     *
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    @java.lang.Override
    public int getAge() {
      return age_;
    }
    /**
     * <pre>
     *年龄
     * </pre>
     *
     * <code>int32 age = 2;</code>
     * @param value The age to set.
     */
    private void setAge(int value) {
      
      age_ = value;
    }
    /**
     * <pre>
     *年龄
     * </pre>
     *
     * <code>int32 age = 2;</code>
     */
    private void clearAge() {
      
      age_ = 0;
    }

    public static org.ninetripods.mq.study.BookProto.Owner parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.ninetripods.mq.study.BookProto.Owner parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.ninetripods.mq.study.BookProto.Owner parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.ninetripods.mq.study.BookProto.Owner parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.ninetripods.mq.study.BookProto.Owner parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.ninetripods.mq.study.BookProto.Owner parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.ninetripods.mq.study.BookProto.Owner parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.ninetripods.mq.study.BookProto.Owner parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.ninetripods.mq.study.BookProto.Owner parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.ninetripods.mq.study.BookProto.Owner parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.ninetripods.mq.study.BookProto.Owner parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.ninetripods.mq.study.BookProto.Owner parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.ninetripods.mq.study.BookProto.Owner prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code Owner}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.ninetripods.mq.study.BookProto.Owner, Builder> implements
        // @@protoc_insertion_point(builder_implements:Owner)
        org.ninetripods.mq.study.BookProto.OwnerOrBuilder {
      // Construct using org.ninetripods.mq.study.BookProto.Owner.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *人名
       * </pre>
       *
       * <code>string pName = 1;</code>
       * @return The pName.
       */
      @java.lang.Override
      public java.lang.String getPName() {
        return instance.getPName();
      }
      /**
       * <pre>
       *人名
       * </pre>
       *
       * <code>string pName = 1;</code>
       * @return The bytes for pName.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getPNameBytes() {
        return instance.getPNameBytes();
      }
      /**
       * <pre>
       *人名
       * </pre>
       *
       * <code>string pName = 1;</code>
       * @param value The pName to set.
       * @return This builder for chaining.
       */
      public Builder setPName(
          java.lang.String value) {
        copyOnWrite();
        instance.setPName(value);
        return this;
      }
      /**
       * <pre>
       *人名
       * </pre>
       *
       * <code>string pName = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPName() {
        copyOnWrite();
        instance.clearPName();
        return this;
      }
      /**
       * <pre>
       *人名
       * </pre>
       *
       * <code>string pName = 1;</code>
       * @param value The bytes for pName to set.
       * @return This builder for chaining.
       */
      public Builder setPNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPNameBytes(value);
        return this;
      }

      /**
       * <pre>
       *年龄
       * </pre>
       *
       * <code>int32 age = 2;</code>
       * @return The age.
       */
      @java.lang.Override
      public int getAge() {
        return instance.getAge();
      }
      /**
       * <pre>
       *年龄
       * </pre>
       *
       * <code>int32 age = 2;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(int value) {
        copyOnWrite();
        instance.setAge(value);
        return this;
      }
      /**
       * <pre>
       *年龄
       * </pre>
       *
       * <code>int32 age = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        copyOnWrite();
        instance.clearAge();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Owner)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.ninetripods.mq.study.BookProto.Owner();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "pName_",
              "age_",
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0004" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.ninetripods.mq.study.BookProto.Owner> parser = PARSER;
          if (parser == null) {
            synchronized (org.ninetripods.mq.study.BookProto.Owner.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.ninetripods.mq.study.BookProto.Owner>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:Owner)
    private static final org.ninetripods.mq.study.BookProto.Owner DEFAULT_INSTANCE;
    static {
      Owner defaultInstance = new Owner();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Owner.class, defaultInstance);
    }

    public static org.ninetripods.mq.study.BookProto.Owner getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Owner> PARSER;

    public static com.google.protobuf.Parser<Owner> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
