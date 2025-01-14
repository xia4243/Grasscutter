// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleFleurFairInfo.proto

package emu.grasscutter.net.proto;

public final class InBattleFleurFairInfoOuterClass {
  private InBattleFleurFairInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleFleurFairInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleFleurFairInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 CHEAJDKKPDB = 4;</code>
     * @return The cHEAJDKKPDB.
     */
    int getCHEAJDKKPDB();

    /**
     * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
     * @return A list containing the dCFOAPKHMAK.
     */
    java.util.List<java.lang.Integer> getDCFOAPKHMAKList();
    /**
     * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
     * @return The count of dCFOAPKHMAK.
     */
    int getDCFOAPKHMAKCount();
    /**
     * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
     * @param index The index of the element to return.
     * @return The dCFOAPKHMAK at the given index.
     */
    int getDCFOAPKHMAK(int index);

    /**
     * <code>uint32 KMGIKOOKPOB = 8;</code>
     * @return The kMGIKOOKPOB.
     */
    int getKMGIKOOKPOB();

    /**
     * <code>uint32 LPOCDLNJLBH = 1;</code>
     * @return The lPOCDLNJLBH.
     */
    int getLPOCDLNJLBH();

    /**
     * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
     * @return A list containing the dNCLCJMNNLK.
     */
    java.util.List<java.lang.Integer> getDNCLCJMNNLKList();
    /**
     * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
     * @return The count of dNCLCJMNNLK.
     */
    int getDNCLCJMNNLKCount();
    /**
     * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
     * @param index The index of the element to return.
     * @return The dNCLCJMNNLK at the given index.
     */
    int getDNCLCJMNNLK(int index);
  }
  /**
   * <pre>
   * Obf: EPOBLGMCAPA
   * </pre>
   *
   * Protobuf type {@code InBattleFleurFairInfo}
   */
  public static final class InBattleFleurFairInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleFleurFairInfo)
      InBattleFleurFairInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleFleurFairInfo.newBuilder() to construct.
    private InBattleFleurFairInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleFleurFairInfo() {
      dCFOAPKHMAK_ = emptyIntList();
      dNCLCJMNNLK_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleFleurFairInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InBattleFleurFairInfo(
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

              lPOCDLNJLBH_ = input.readUInt32();
              break;
            }
            case 32: {

              cHEAJDKKPDB_ = input.readUInt32();
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                dNCLCJMNNLK_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              dNCLCJMNNLK_.addInt(input.readUInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                dNCLCJMNNLK_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                dNCLCJMNNLK_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 64: {

              kMGIKOOKPOB_ = input.readUInt32();
              break;
            }
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dCFOAPKHMAK_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              dCFOAPKHMAK_.addInt(input.readUInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                dCFOAPKHMAK_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                dCFOAPKHMAK_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          dNCLCJMNNLK_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          dCFOAPKHMAK_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.internal_static_InBattleFleurFairInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.internal_static_InBattleFleurFairInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo.class, emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo.Builder.class);
    }

    public static final int CHEAJDKKPDB_FIELD_NUMBER = 4;
    private int cHEAJDKKPDB_;
    /**
     * <code>uint32 CHEAJDKKPDB = 4;</code>
     * @return The cHEAJDKKPDB.
     */
    @java.lang.Override
    public int getCHEAJDKKPDB() {
      return cHEAJDKKPDB_;
    }

    public static final int DCFOAPKHMAK_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList dCFOAPKHMAK_;
    /**
     * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
     * @return A list containing the dCFOAPKHMAK.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDCFOAPKHMAKList() {
      return dCFOAPKHMAK_;
    }
    /**
     * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
     * @return The count of dCFOAPKHMAK.
     */
    public int getDCFOAPKHMAKCount() {
      return dCFOAPKHMAK_.size();
    }
    /**
     * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
     * @param index The index of the element to return.
     * @return The dCFOAPKHMAK at the given index.
     */
    public int getDCFOAPKHMAK(int index) {
      return dCFOAPKHMAK_.getInt(index);
    }
    private int dCFOAPKHMAKMemoizedSerializedSize = -1;

    public static final int KMGIKOOKPOB_FIELD_NUMBER = 8;
    private int kMGIKOOKPOB_;
    /**
     * <code>uint32 KMGIKOOKPOB = 8;</code>
     * @return The kMGIKOOKPOB.
     */
    @java.lang.Override
    public int getKMGIKOOKPOB() {
      return kMGIKOOKPOB_;
    }

    public static final int LPOCDLNJLBH_FIELD_NUMBER = 1;
    private int lPOCDLNJLBH_;
    /**
     * <code>uint32 LPOCDLNJLBH = 1;</code>
     * @return The lPOCDLNJLBH.
     */
    @java.lang.Override
    public int getLPOCDLNJLBH() {
      return lPOCDLNJLBH_;
    }

    public static final int DNCLCJMNNLK_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList dNCLCJMNNLK_;
    /**
     * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
     * @return A list containing the dNCLCJMNNLK.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDNCLCJMNNLKList() {
      return dNCLCJMNNLK_;
    }
    /**
     * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
     * @return The count of dNCLCJMNNLK.
     */
    public int getDNCLCJMNNLKCount() {
      return dNCLCJMNNLK_.size();
    }
    /**
     * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
     * @param index The index of the element to return.
     * @return The dNCLCJMNNLK at the given index.
     */
    public int getDNCLCJMNNLK(int index) {
      return dNCLCJMNNLK_.getInt(index);
    }
    private int dNCLCJMNNLKMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (lPOCDLNJLBH_ != 0) {
        output.writeUInt32(1, lPOCDLNJLBH_);
      }
      if (cHEAJDKKPDB_ != 0) {
        output.writeUInt32(4, cHEAJDKKPDB_);
      }
      if (getDNCLCJMNNLKList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(dNCLCJMNNLKMemoizedSerializedSize);
      }
      for (int i = 0; i < dNCLCJMNNLK_.size(); i++) {
        output.writeUInt32NoTag(dNCLCJMNNLK_.getInt(i));
      }
      if (kMGIKOOKPOB_ != 0) {
        output.writeUInt32(8, kMGIKOOKPOB_);
      }
      if (getDCFOAPKHMAKList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(dCFOAPKHMAKMemoizedSerializedSize);
      }
      for (int i = 0; i < dCFOAPKHMAK_.size(); i++) {
        output.writeUInt32NoTag(dCFOAPKHMAK_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lPOCDLNJLBH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, lPOCDLNJLBH_);
      }
      if (cHEAJDKKPDB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, cHEAJDKKPDB_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < dNCLCJMNNLK_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dNCLCJMNNLK_.getInt(i));
        }
        size += dataSize;
        if (!getDNCLCJMNNLKList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        dNCLCJMNNLKMemoizedSerializedSize = dataSize;
      }
      if (kMGIKOOKPOB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, kMGIKOOKPOB_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < dCFOAPKHMAK_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dCFOAPKHMAK_.getInt(i));
        }
        size += dataSize;
        if (!getDCFOAPKHMAKList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        dCFOAPKHMAKMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo other = (emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo) obj;

      if (getCHEAJDKKPDB()
          != other.getCHEAJDKKPDB()) return false;
      if (!getDCFOAPKHMAKList()
          .equals(other.getDCFOAPKHMAKList())) return false;
      if (getKMGIKOOKPOB()
          != other.getKMGIKOOKPOB()) return false;
      if (getLPOCDLNJLBH()
          != other.getLPOCDLNJLBH()) return false;
      if (!getDNCLCJMNNLKList()
          .equals(other.getDNCLCJMNNLKList())) return false;
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
      hash = (37 * hash) + CHEAJDKKPDB_FIELD_NUMBER;
      hash = (53 * hash) + getCHEAJDKKPDB();
      if (getDCFOAPKHMAKCount() > 0) {
        hash = (37 * hash) + DCFOAPKHMAK_FIELD_NUMBER;
        hash = (53 * hash) + getDCFOAPKHMAKList().hashCode();
      }
      hash = (37 * hash) + KMGIKOOKPOB_FIELD_NUMBER;
      hash = (53 * hash) + getKMGIKOOKPOB();
      hash = (37 * hash) + LPOCDLNJLBH_FIELD_NUMBER;
      hash = (53 * hash) + getLPOCDLNJLBH();
      if (getDNCLCJMNNLKCount() > 0) {
        hash = (37 * hash) + DNCLCJMNNLK_FIELD_NUMBER;
        hash = (53 * hash) + getDNCLCJMNNLKList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo prototype) {
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
     * <pre>
     * Obf: EPOBLGMCAPA
     * </pre>
     *
     * Protobuf type {@code InBattleFleurFairInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleFleurFairInfo)
        emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.internal_static_InBattleFleurFairInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.internal_static_InBattleFleurFairInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo.class, emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo.newBuilder()
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
        cHEAJDKKPDB_ = 0;

        dCFOAPKHMAK_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        kMGIKOOKPOB_ = 0;

        lPOCDLNJLBH_ = 0;

        dNCLCJMNNLK_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.internal_static_InBattleFleurFairInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo build() {
        emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo buildPartial() {
        emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo result = new emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo(this);
        int from_bitField0_ = bitField0_;
        result.cHEAJDKKPDB_ = cHEAJDKKPDB_;
        if (((bitField0_ & 0x00000001) != 0)) {
          dCFOAPKHMAK_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dCFOAPKHMAK_ = dCFOAPKHMAK_;
        result.kMGIKOOKPOB_ = kMGIKOOKPOB_;
        result.lPOCDLNJLBH_ = lPOCDLNJLBH_;
        if (((bitField0_ & 0x00000002) != 0)) {
          dNCLCJMNNLK_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.dNCLCJMNNLK_ = dNCLCJMNNLK_;
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
        if (other instanceof emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo) {
          return mergeFrom((emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo other) {
        if (other == emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo.getDefaultInstance()) return this;
        if (other.getCHEAJDKKPDB() != 0) {
          setCHEAJDKKPDB(other.getCHEAJDKKPDB());
        }
        if (!other.dCFOAPKHMAK_.isEmpty()) {
          if (dCFOAPKHMAK_.isEmpty()) {
            dCFOAPKHMAK_ = other.dCFOAPKHMAK_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDCFOAPKHMAKIsMutable();
            dCFOAPKHMAK_.addAll(other.dCFOAPKHMAK_);
          }
          onChanged();
        }
        if (other.getKMGIKOOKPOB() != 0) {
          setKMGIKOOKPOB(other.getKMGIKOOKPOB());
        }
        if (other.getLPOCDLNJLBH() != 0) {
          setLPOCDLNJLBH(other.getLPOCDLNJLBH());
        }
        if (!other.dNCLCJMNNLK_.isEmpty()) {
          if (dNCLCJMNNLK_.isEmpty()) {
            dNCLCJMNNLK_ = other.dNCLCJMNNLK_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDNCLCJMNNLKIsMutable();
            dNCLCJMNNLK_.addAll(other.dNCLCJMNNLK_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int cHEAJDKKPDB_ ;
      /**
       * <code>uint32 CHEAJDKKPDB = 4;</code>
       * @return The cHEAJDKKPDB.
       */
      @java.lang.Override
      public int getCHEAJDKKPDB() {
        return cHEAJDKKPDB_;
      }
      /**
       * <code>uint32 CHEAJDKKPDB = 4;</code>
       * @param value The cHEAJDKKPDB to set.
       * @return This builder for chaining.
       */
      public Builder setCHEAJDKKPDB(int value) {
        
        cHEAJDKKPDB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CHEAJDKKPDB = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCHEAJDKKPDB() {
        
        cHEAJDKKPDB_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList dCFOAPKHMAK_ = emptyIntList();
      private void ensureDCFOAPKHMAKIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dCFOAPKHMAK_ = mutableCopy(dCFOAPKHMAK_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
       * @return A list containing the dCFOAPKHMAK.
       */
      public java.util.List<java.lang.Integer>
          getDCFOAPKHMAKList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(dCFOAPKHMAK_) : dCFOAPKHMAK_;
      }
      /**
       * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
       * @return The count of dCFOAPKHMAK.
       */
      public int getDCFOAPKHMAKCount() {
        return dCFOAPKHMAK_.size();
      }
      /**
       * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
       * @param index The index of the element to return.
       * @return The dCFOAPKHMAK at the given index.
       */
      public int getDCFOAPKHMAK(int index) {
        return dCFOAPKHMAK_.getInt(index);
      }
      /**
       * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
       * @param index The index to set the value at.
       * @param value The dCFOAPKHMAK to set.
       * @return This builder for chaining.
       */
      public Builder setDCFOAPKHMAK(
          int index, int value) {
        ensureDCFOAPKHMAKIsMutable();
        dCFOAPKHMAK_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
       * @param value The dCFOAPKHMAK to add.
       * @return This builder for chaining.
       */
      public Builder addDCFOAPKHMAK(int value) {
        ensureDCFOAPKHMAKIsMutable();
        dCFOAPKHMAK_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
       * @param values The dCFOAPKHMAK to add.
       * @return This builder for chaining.
       */
      public Builder addAllDCFOAPKHMAK(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDCFOAPKHMAKIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dCFOAPKHMAK_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DCFOAPKHMAK = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearDCFOAPKHMAK() {
        dCFOAPKHMAK_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int kMGIKOOKPOB_ ;
      /**
       * <code>uint32 KMGIKOOKPOB = 8;</code>
       * @return The kMGIKOOKPOB.
       */
      @java.lang.Override
      public int getKMGIKOOKPOB() {
        return kMGIKOOKPOB_;
      }
      /**
       * <code>uint32 KMGIKOOKPOB = 8;</code>
       * @param value The kMGIKOOKPOB to set.
       * @return This builder for chaining.
       */
      public Builder setKMGIKOOKPOB(int value) {
        
        kMGIKOOKPOB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KMGIKOOKPOB = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearKMGIKOOKPOB() {
        
        kMGIKOOKPOB_ = 0;
        onChanged();
        return this;
      }

      private int lPOCDLNJLBH_ ;
      /**
       * <code>uint32 LPOCDLNJLBH = 1;</code>
       * @return The lPOCDLNJLBH.
       */
      @java.lang.Override
      public int getLPOCDLNJLBH() {
        return lPOCDLNJLBH_;
      }
      /**
       * <code>uint32 LPOCDLNJLBH = 1;</code>
       * @param value The lPOCDLNJLBH to set.
       * @return This builder for chaining.
       */
      public Builder setLPOCDLNJLBH(int value) {
        
        lPOCDLNJLBH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LPOCDLNJLBH = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLPOCDLNJLBH() {
        
        lPOCDLNJLBH_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList dNCLCJMNNLK_ = emptyIntList();
      private void ensureDNCLCJMNNLKIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          dNCLCJMNNLK_ = mutableCopy(dNCLCJMNNLK_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
       * @return A list containing the dNCLCJMNNLK.
       */
      public java.util.List<java.lang.Integer>
          getDNCLCJMNNLKList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(dNCLCJMNNLK_) : dNCLCJMNNLK_;
      }
      /**
       * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
       * @return The count of dNCLCJMNNLK.
       */
      public int getDNCLCJMNNLKCount() {
        return dNCLCJMNNLK_.size();
      }
      /**
       * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
       * @param index The index of the element to return.
       * @return The dNCLCJMNNLK at the given index.
       */
      public int getDNCLCJMNNLK(int index) {
        return dNCLCJMNNLK_.getInt(index);
      }
      /**
       * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
       * @param index The index to set the value at.
       * @param value The dNCLCJMNNLK to set.
       * @return This builder for chaining.
       */
      public Builder setDNCLCJMNNLK(
          int index, int value) {
        ensureDNCLCJMNNLKIsMutable();
        dNCLCJMNNLK_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
       * @param value The dNCLCJMNNLK to add.
       * @return This builder for chaining.
       */
      public Builder addDNCLCJMNNLK(int value) {
        ensureDNCLCJMNNLKIsMutable();
        dNCLCJMNNLK_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
       * @param values The dNCLCJMNNLK to add.
       * @return This builder for chaining.
       */
      public Builder addAllDNCLCJMNNLK(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDNCLCJMNNLKIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dNCLCJMNNLK_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DNCLCJMNNLK = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDNCLCJMNNLK() {
        dNCLCJMNNLK_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:InBattleFleurFairInfo)
    }

    // @@protoc_insertion_point(class_scope:InBattleFleurFairInfo)
    private static final emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo();
    }

    public static emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleFleurFairInfo>
        PARSER = new com.google.protobuf.AbstractParser<InBattleFleurFairInfo>() {
      @java.lang.Override
      public InBattleFleurFairInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InBattleFleurFairInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InBattleFleurFairInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleFleurFairInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InBattleFleurFairInfoOuterClass.InBattleFleurFairInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleFleurFairInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleFleurFairInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033InBattleFleurFairInfo.proto\"\200\001\n\025InBatt" +
      "leFleurFairInfo\022\023\n\013CHEAJDKKPDB\030\004 \001(\r\022\023\n\013" +
      "DCFOAPKHMAK\030\t \003(\r\022\023\n\013KMGIKOOKPOB\030\010 \001(\r\022\023" +
      "\n\013LPOCDLNJLBH\030\001 \001(\r\022\023\n\013DNCLCJMNNLK\030\005 \003(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleFleurFairInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleFleurFairInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleFleurFairInfo_descriptor,
        new java.lang.String[] { "CHEAJDKKPDB", "DCFOAPKHMAK", "KMGIKOOKPOB", "LPOCDLNJLBH", "DNCLCJMNNLK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
