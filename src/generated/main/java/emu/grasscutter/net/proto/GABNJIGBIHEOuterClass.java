// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GABNJIGBIHE.proto

package emu.grasscutter.net.proto;

public final class GABNJIGBIHEOuterClass {
  private GABNJIGBIHEOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GABNJIGBIHEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GABNJIGBIHE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 PHKCKPOCHDF = 9;</code>
     * @return The pHKCKPOCHDF.
     */
    int getPHKCKPOCHDF();

    /**
     * <code>uint32 card_id = 1;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * Protobuf type {@code GABNJIGBIHE}
   */
  public static final class GABNJIGBIHE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GABNJIGBIHE)
      GABNJIGBIHEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GABNJIGBIHE.newBuilder() to construct.
    private GABNJIGBIHE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GABNJIGBIHE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GABNJIGBIHE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GABNJIGBIHE(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              cardId_ = input.readUInt32();
              break;
            }
            case 72: {

              pHKCKPOCHDF_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.internal_static_GABNJIGBIHE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.internal_static_GABNJIGBIHE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE.class, emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE.Builder.class);
    }

    public static final int PHKCKPOCHDF_FIELD_NUMBER = 9;
    private int pHKCKPOCHDF_;
    /**
     * <code>uint32 PHKCKPOCHDF = 9;</code>
     * @return The pHKCKPOCHDF.
     */
    @java.lang.Override
    public int getPHKCKPOCHDF() {
      return pHKCKPOCHDF_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 1;
    private int cardId_;
    /**
     * <code>uint32 card_id = 1;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
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
      if (cardId_ != 0) {
        output.writeUInt32(1, cardId_);
      }
      if (pHKCKPOCHDF_ != 0) {
        output.writeUInt32(9, pHKCKPOCHDF_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, cardId_);
      }
      if (pHKCKPOCHDF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, pHKCKPOCHDF_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE other = (emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE) obj;

      if (getPHKCKPOCHDF()
          != other.getPHKCKPOCHDF()) return false;
      if (getCardId()
          != other.getCardId()) return false;
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
      hash = (37 * hash) + PHKCKPOCHDF_FIELD_NUMBER;
      hash = (53 * hash) + getPHKCKPOCHDF();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE prototype) {
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
     * Protobuf type {@code GABNJIGBIHE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GABNJIGBIHE)
        emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.internal_static_GABNJIGBIHE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.internal_static_GABNJIGBIHE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE.class, emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE.newBuilder()
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
        pHKCKPOCHDF_ = 0;

        cardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.internal_static_GABNJIGBIHE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE build() {
        emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE buildPartial() {
        emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE result = new emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE(this);
        result.pHKCKPOCHDF_ = pHKCKPOCHDF_;
        result.cardId_ = cardId_;
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
        if (other instanceof emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE) {
          return mergeFrom((emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE other) {
        if (other == emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE.getDefaultInstance()) return this;
        if (other.getPHKCKPOCHDF() != 0) {
          setPHKCKPOCHDF(other.getPHKCKPOCHDF());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
        emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int pHKCKPOCHDF_ ;
      /**
       * <code>uint32 PHKCKPOCHDF = 9;</code>
       * @return The pHKCKPOCHDF.
       */
      @java.lang.Override
      public int getPHKCKPOCHDF() {
        return pHKCKPOCHDF_;
      }
      /**
       * <code>uint32 PHKCKPOCHDF = 9;</code>
       * @param value The pHKCKPOCHDF to set.
       * @return This builder for chaining.
       */
      public Builder setPHKCKPOCHDF(int value) {
        
        pHKCKPOCHDF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PHKCKPOCHDF = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearPHKCKPOCHDF() {
        
        pHKCKPOCHDF_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 1;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 1;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GABNJIGBIHE)
    }

    // @@protoc_insertion_point(class_scope:GABNJIGBIHE)
    private static final emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE();
    }

    public static emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GABNJIGBIHE>
        PARSER = new com.google.protobuf.AbstractParser<GABNJIGBIHE>() {
      @java.lang.Override
      public GABNJIGBIHE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GABNJIGBIHE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GABNJIGBIHE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GABNJIGBIHE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GABNJIGBIHEOuterClass.GABNJIGBIHE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GABNJIGBIHE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GABNJIGBIHE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GABNJIGBIHE.proto\"3\n\013GABNJIGBIHE\022\023\n\013PH" +
      "KCKPOCHDF\030\t \001(\r\022\017\n\007card_id\030\001 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GABNJIGBIHE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GABNJIGBIHE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GABNJIGBIHE_descriptor,
        new java.lang.String[] { "PHKCKPOCHDF", "CardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
