// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NNGHANCBFGE.proto

package emu.grasscutter.net.proto;

public final class NNGHANCBFGEOuterClass {
  private NNGHANCBFGEOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NNGHANCBFGEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NNGHANCBFGE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector MHMGJKOFDBE = 5;</code>
     * @return Whether the mHMGJKOFDBE field is set.
     */
    boolean hasMHMGJKOFDBE();
    /**
     * <code>.Vector MHMGJKOFDBE = 5;</code>
     * @return The mHMGJKOFDBE.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getMHMGJKOFDBE();
    /**
     * <code>.Vector MHMGJKOFDBE = 5;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getMHMGJKOFDBEOrBuilder();

    /**
     * <code>.Vector target_pos = 12;</code>
     * @return Whether the targetPos field is set.
     */
    boolean hasTargetPos();
    /**
     * <code>.Vector target_pos = 12;</code>
     * @return The targetPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getTargetPos();
    /**
     * <code>.Vector target_pos = 12;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder();

    /**
     * <code>uint32 entity_id = 4;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * Protobuf type {@code NNGHANCBFGE}
   */
  public static final class NNGHANCBFGE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NNGHANCBFGE)
      NNGHANCBFGEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NNGHANCBFGE.newBuilder() to construct.
    private NNGHANCBFGE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NNGHANCBFGE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NNGHANCBFGE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NNGHANCBFGE(
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
            case 32: {

              entityId_ = input.readUInt32();
              break;
            }
            case 42: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (mHMGJKOFDBE_ != null) {
                subBuilder = mHMGJKOFDBE_.toBuilder();
              }
              mHMGJKOFDBE_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(mHMGJKOFDBE_);
                mHMGJKOFDBE_ = subBuilder.buildPartial();
              }

              break;
            }
            case 98: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (targetPos_ != null) {
                subBuilder = targetPos_.toBuilder();
              }
              targetPos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetPos_);
                targetPos_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.internal_static_NNGHANCBFGE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.internal_static_NNGHANCBFGE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE.class, emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE.Builder.class);
    }

    public static final int MHMGJKOFDBE_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector mHMGJKOFDBE_;
    /**
     * <code>.Vector MHMGJKOFDBE = 5;</code>
     * @return Whether the mHMGJKOFDBE field is set.
     */
    @java.lang.Override
    public boolean hasMHMGJKOFDBE() {
      return mHMGJKOFDBE_ != null;
    }
    /**
     * <code>.Vector MHMGJKOFDBE = 5;</code>
     * @return The mHMGJKOFDBE.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getMHMGJKOFDBE() {
      return mHMGJKOFDBE_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : mHMGJKOFDBE_;
    }
    /**
     * <code>.Vector MHMGJKOFDBE = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getMHMGJKOFDBEOrBuilder() {
      return getMHMGJKOFDBE();
    }

    public static final int TARGET_POS_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector targetPos_;
    /**
     * <code>.Vector target_pos = 12;</code>
     * @return Whether the targetPos field is set.
     */
    @java.lang.Override
    public boolean hasTargetPos() {
      return targetPos_ != null;
    }
    /**
     * <code>.Vector target_pos = 12;</code>
     * @return The targetPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getTargetPos() {
      return targetPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : targetPos_;
    }
    /**
     * <code>.Vector target_pos = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder() {
      return getTargetPos();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 4;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 4;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(4, entityId_);
      }
      if (mHMGJKOFDBE_ != null) {
        output.writeMessage(5, getMHMGJKOFDBE());
      }
      if (targetPos_ != null) {
        output.writeMessage(12, getTargetPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, entityId_);
      }
      if (mHMGJKOFDBE_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getMHMGJKOFDBE());
      }
      if (targetPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getTargetPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE other = (emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE) obj;

      if (hasMHMGJKOFDBE() != other.hasMHMGJKOFDBE()) return false;
      if (hasMHMGJKOFDBE()) {
        if (!getMHMGJKOFDBE()
            .equals(other.getMHMGJKOFDBE())) return false;
      }
      if (hasTargetPos() != other.hasTargetPos()) return false;
      if (hasTargetPos()) {
        if (!getTargetPos()
            .equals(other.getTargetPos())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (hasMHMGJKOFDBE()) {
        hash = (37 * hash) + MHMGJKOFDBE_FIELD_NUMBER;
        hash = (53 * hash) + getMHMGJKOFDBE().hashCode();
      }
      if (hasTargetPos()) {
        hash = (37 * hash) + TARGET_POS_FIELD_NUMBER;
        hash = (53 * hash) + getTargetPos().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE prototype) {
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
     * Protobuf type {@code NNGHANCBFGE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NNGHANCBFGE)
        emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.internal_static_NNGHANCBFGE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.internal_static_NNGHANCBFGE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE.class, emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE.newBuilder()
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
        if (mHMGJKOFDBEBuilder_ == null) {
          mHMGJKOFDBE_ = null;
        } else {
          mHMGJKOFDBE_ = null;
          mHMGJKOFDBEBuilder_ = null;
        }
        if (targetPosBuilder_ == null) {
          targetPos_ = null;
        } else {
          targetPos_ = null;
          targetPosBuilder_ = null;
        }
        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.internal_static_NNGHANCBFGE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE build() {
        emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE buildPartial() {
        emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE result = new emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE(this);
        if (mHMGJKOFDBEBuilder_ == null) {
          result.mHMGJKOFDBE_ = mHMGJKOFDBE_;
        } else {
          result.mHMGJKOFDBE_ = mHMGJKOFDBEBuilder_.build();
        }
        if (targetPosBuilder_ == null) {
          result.targetPos_ = targetPos_;
        } else {
          result.targetPos_ = targetPosBuilder_.build();
        }
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE) {
          return mergeFrom((emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE other) {
        if (other == emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE.getDefaultInstance()) return this;
        if (other.hasMHMGJKOFDBE()) {
          mergeMHMGJKOFDBE(other.getMHMGJKOFDBE());
        }
        if (other.hasTargetPos()) {
          mergeTargetPos(other.getTargetPos());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector mHMGJKOFDBE_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> mHMGJKOFDBEBuilder_;
      /**
       * <code>.Vector MHMGJKOFDBE = 5;</code>
       * @return Whether the mHMGJKOFDBE field is set.
       */
      public boolean hasMHMGJKOFDBE() {
        return mHMGJKOFDBEBuilder_ != null || mHMGJKOFDBE_ != null;
      }
      /**
       * <code>.Vector MHMGJKOFDBE = 5;</code>
       * @return The mHMGJKOFDBE.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getMHMGJKOFDBE() {
        if (mHMGJKOFDBEBuilder_ == null) {
          return mHMGJKOFDBE_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : mHMGJKOFDBE_;
        } else {
          return mHMGJKOFDBEBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector MHMGJKOFDBE = 5;</code>
       */
      public Builder setMHMGJKOFDBE(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (mHMGJKOFDBEBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          mHMGJKOFDBE_ = value;
          onChanged();
        } else {
          mHMGJKOFDBEBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector MHMGJKOFDBE = 5;</code>
       */
      public Builder setMHMGJKOFDBE(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (mHMGJKOFDBEBuilder_ == null) {
          mHMGJKOFDBE_ = builderForValue.build();
          onChanged();
        } else {
          mHMGJKOFDBEBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector MHMGJKOFDBE = 5;</code>
       */
      public Builder mergeMHMGJKOFDBE(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (mHMGJKOFDBEBuilder_ == null) {
          if (mHMGJKOFDBE_ != null) {
            mHMGJKOFDBE_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(mHMGJKOFDBE_).mergeFrom(value).buildPartial();
          } else {
            mHMGJKOFDBE_ = value;
          }
          onChanged();
        } else {
          mHMGJKOFDBEBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector MHMGJKOFDBE = 5;</code>
       */
      public Builder clearMHMGJKOFDBE() {
        if (mHMGJKOFDBEBuilder_ == null) {
          mHMGJKOFDBE_ = null;
          onChanged();
        } else {
          mHMGJKOFDBE_ = null;
          mHMGJKOFDBEBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector MHMGJKOFDBE = 5;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getMHMGJKOFDBEBuilder() {
        
        onChanged();
        return getMHMGJKOFDBEFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector MHMGJKOFDBE = 5;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getMHMGJKOFDBEOrBuilder() {
        if (mHMGJKOFDBEBuilder_ != null) {
          return mHMGJKOFDBEBuilder_.getMessageOrBuilder();
        } else {
          return mHMGJKOFDBE_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : mHMGJKOFDBE_;
        }
      }
      /**
       * <code>.Vector MHMGJKOFDBE = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getMHMGJKOFDBEFieldBuilder() {
        if (mHMGJKOFDBEBuilder_ == null) {
          mHMGJKOFDBEBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getMHMGJKOFDBE(),
                  getParentForChildren(),
                  isClean());
          mHMGJKOFDBE_ = null;
        }
        return mHMGJKOFDBEBuilder_;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector targetPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> targetPosBuilder_;
      /**
       * <code>.Vector target_pos = 12;</code>
       * @return Whether the targetPos field is set.
       */
      public boolean hasTargetPos() {
        return targetPosBuilder_ != null || targetPos_ != null;
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       * @return The targetPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getTargetPos() {
        if (targetPosBuilder_ == null) {
          return targetPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : targetPos_;
        } else {
          return targetPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      public Builder setTargetPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (targetPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetPos_ = value;
          onChanged();
        } else {
          targetPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      public Builder setTargetPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (targetPosBuilder_ == null) {
          targetPos_ = builderForValue.build();
          onChanged();
        } else {
          targetPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      public Builder mergeTargetPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (targetPosBuilder_ == null) {
          if (targetPos_ != null) {
            targetPos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(targetPos_).mergeFrom(value).buildPartial();
          } else {
            targetPos_ = value;
          }
          onChanged();
        } else {
          targetPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      public Builder clearTargetPos() {
        if (targetPosBuilder_ == null) {
          targetPos_ = null;
          onChanged();
        } else {
          targetPos_ = null;
          targetPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getTargetPosBuilder() {
        
        onChanged();
        return getTargetPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder() {
        if (targetPosBuilder_ != null) {
          return targetPosBuilder_.getMessageOrBuilder();
        } else {
          return targetPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : targetPos_;
        }
      }
      /**
       * <code>.Vector target_pos = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getTargetPosFieldBuilder() {
        if (targetPosBuilder_ == null) {
          targetPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getTargetPos(),
                  getParentForChildren(),
                  isClean());
          targetPos_ = null;
        }
        return targetPosBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 4;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 4;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:NNGHANCBFGE)
    }

    // @@protoc_insertion_point(class_scope:NNGHANCBFGE)
    private static final emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE();
    }

    public static emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NNGHANCBFGE>
        PARSER = new com.google.protobuf.AbstractParser<NNGHANCBFGE>() {
      @java.lang.Override
      public NNGHANCBFGE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NNGHANCBFGE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NNGHANCBFGE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NNGHANCBFGE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NNGHANCBFGEOuterClass.NNGHANCBFGE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NNGHANCBFGE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NNGHANCBFGE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NNGHANCBFGE.proto\032\014Vector.proto\"[\n\013NNG" +
      "HANCBFGE\022\034\n\013MHMGJKOFDBE\030\005 \001(\0132\007.Vector\022\033" +
      "\n\ntarget_pos\030\014 \001(\0132\007.Vector\022\021\n\tentity_id" +
      "\030\004 \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_NNGHANCBFGE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NNGHANCBFGE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NNGHANCBFGE_descriptor,
        new java.lang.String[] { "MHMGJKOFDBE", "TargetPos", "EntityId", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
