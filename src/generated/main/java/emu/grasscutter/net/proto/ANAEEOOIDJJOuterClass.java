// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ANAEEOOIDJJ.proto

package emu.grasscutter.net.proto;

public final class ANAEEOOIDJJOuterClass {
  private ANAEEOOIDJJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ANAEEOOIDJJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ANAEEOOIDJJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 item_id = 1;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>uint32 item_num = 10;</code>
     * @return The itemNum.
     */
    int getItemNum();
  }
  /**
   * Protobuf type {@code ANAEEOOIDJJ}
   */
  public static final class ANAEEOOIDJJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ANAEEOOIDJJ)
      ANAEEOOIDJJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ANAEEOOIDJJ.newBuilder() to construct.
    private ANAEEOOIDJJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ANAEEOOIDJJ() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ANAEEOOIDJJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ANAEEOOIDJJ(
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

              itemId_ = input.readUInt32();
              break;
            }
            case 80: {

              itemNum_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.internal_static_ANAEEOOIDJJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.internal_static_ANAEEOOIDJJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.class, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.Builder.class);
    }

    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private int itemId_;
    /**
     * <code>uint32 item_id = 1;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }

    public static final int ITEM_NUM_FIELD_NUMBER = 10;
    private int itemNum_;
    /**
     * <code>uint32 item_num = 10;</code>
     * @return The itemNum.
     */
    @java.lang.Override
    public int getItemNum() {
      return itemNum_;
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
      if (itemId_ != 0) {
        output.writeUInt32(1, itemId_);
      }
      if (itemNum_ != 0) {
        output.writeUInt32(10, itemNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, itemId_);
      }
      if (itemNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, itemNum_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ other = (emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ) obj;

      if (getItemId()
          != other.getItemId()) return false;
      if (getItemNum()
          != other.getItemNum()) return false;
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
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (37 * hash) + ITEM_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getItemNum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ prototype) {
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
     * Protobuf type {@code ANAEEOOIDJJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ANAEEOOIDJJ)
        emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.internal_static_ANAEEOOIDJJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.internal_static_ANAEEOOIDJJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.class, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.newBuilder()
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
        itemId_ = 0;

        itemNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.internal_static_ANAEEOOIDJJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ build() {
        emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ buildPartial() {
        emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ result = new emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ(this);
        result.itemId_ = itemId_;
        result.itemNum_ = itemNum_;
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
        if (other instanceof emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ) {
          return mergeFrom((emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ other) {
        if (other == emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.getDefaultInstance()) return this;
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        if (other.getItemNum() != 0) {
          setItemNum(other.getItemNum());
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
        emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int itemId_ ;
      /**
       * <code>uint32 item_id = 1;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 1;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {
        
        itemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        
        itemId_ = 0;
        onChanged();
        return this;
      }

      private int itemNum_ ;
      /**
       * <code>uint32 item_num = 10;</code>
       * @return The itemNum.
       */
      @java.lang.Override
      public int getItemNum() {
        return itemNum_;
      }
      /**
       * <code>uint32 item_num = 10;</code>
       * @param value The itemNum to set.
       * @return This builder for chaining.
       */
      public Builder setItemNum(int value) {
        
        itemNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_num = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemNum() {
        
        itemNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ANAEEOOIDJJ)
    }

    // @@protoc_insertion_point(class_scope:ANAEEOOIDJJ)
    private static final emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ();
    }

    public static emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ANAEEOOIDJJ>
        PARSER = new com.google.protobuf.AbstractParser<ANAEEOOIDJJ>() {
      @java.lang.Override
      public ANAEEOOIDJJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ANAEEOOIDJJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ANAEEOOIDJJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ANAEEOOIDJJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ANAEEOOIDJJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ANAEEOOIDJJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ANAEEOOIDJJ.proto\"0\n\013ANAEEOOIDJJ\022\017\n\007it" +
      "em_id\030\001 \001(\r\022\020\n\010item_num\030\n \001(\rB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ANAEEOOIDJJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ANAEEOOIDJJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ANAEEOOIDJJ_descriptor,
        new java.lang.String[] { "ItemId", "ItemNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
