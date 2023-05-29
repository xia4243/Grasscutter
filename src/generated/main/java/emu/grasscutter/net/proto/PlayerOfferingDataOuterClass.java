// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerOfferingData.proto

package emu.grasscutter.net.proto;

public final class PlayerOfferingDataOuterClass {
    private PlayerOfferingDataOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface PlayerOfferingDataOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:PlayerOfferingData)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 IGHMDGHKADF = 8;</code>
         *
         * @return The iGHMDGHKADF.
         */
        int getIGHMDGHKADF();

        /**
         * <code>bool CJNBGNOIIJL = 4;</code>
         *
         * @return The cJNBGNOIIJL.
         */
        boolean getCJNBGNOIIJL();
    }
    /**
     *
     *
     * <pre>
     * Obf: GEFPJNAPGJK
     * </pre>
     *
     * Protobuf type {@code PlayerOfferingData}
     */
    public static final class PlayerOfferingData extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:PlayerOfferingData)
            PlayerOfferingDataOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use PlayerOfferingData.newBuilder() to construct.
        private PlayerOfferingData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private PlayerOfferingData() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new PlayerOfferingData();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PlayerOfferingData(
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
                        case 32:
                            {
                                cJNBGNOIIJL_ = input.readBool();
                                break;
                            }
                        case 64:
                            {
                                iGHMDGHKADF_ = input.readUInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.PlayerOfferingDataOuterClass
                    .internal_static_PlayerOfferingData_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.PlayerOfferingDataOuterClass
                    .internal_static_PlayerOfferingData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.class,
                            emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder
                                    .class);
        }

        public static final int IGHMDGHKADF_FIELD_NUMBER = 8;
        private int iGHMDGHKADF_;
        /**
         * <code>uint32 IGHMDGHKADF = 8;</code>
         *
         * @return The iGHMDGHKADF.
         */
        @java.lang.Override
        public int getIGHMDGHKADF() {
            return iGHMDGHKADF_;
        }

        public static final int CJNBGNOIIJL_FIELD_NUMBER = 4;
        private boolean cJNBGNOIIJL_;
        /**
         * <code>bool CJNBGNOIIJL = 4;</code>
         *
         * @return The cJNBGNOIIJL.
         */
        @java.lang.Override
        public boolean getCJNBGNOIIJL() {
            return cJNBGNOIIJL_;
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
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (cJNBGNOIIJL_ != false) {
                output.writeBool(4, cJNBGNOIIJL_);
            }
            if (iGHMDGHKADF_ != 0) {
                output.writeUInt32(8, iGHMDGHKADF_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (cJNBGNOIIJL_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, cJNBGNOIIJL_);
            }
            if (iGHMDGHKADF_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, iGHMDGHKADF_);
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
            if (!(obj
                    instanceof emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData other =
                    (emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData) obj;

            if (getIGHMDGHKADF() != other.getIGHMDGHKADF()) return false;
            if (getCJNBGNOIIJL() != other.getCJNBGNOIIJL()) return false;
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
            hash = (37 * hash) + IGHMDGHKADF_FIELD_NUMBER;
            hash = (53 * hash) + getIGHMDGHKADF();
            hash = (37 * hash) + CJNBGNOIIJL_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getCJNBGNOIIJL());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                parseFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * Obf: GEFPJNAPGJK
         * </pre>
         *
         * Protobuf type {@code PlayerOfferingData}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:PlayerOfferingData)
                emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.PlayerOfferingDataOuterClass
                        .internal_static_PlayerOfferingData_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.PlayerOfferingDataOuterClass
                        .internal_static_PlayerOfferingData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.class,
                                emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                iGHMDGHKADF_ = 0;

                cJNBGNOIIJL_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.PlayerOfferingDataOuterClass
                        .internal_static_PlayerOfferingData_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData build() {
                emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                    buildPartial() {
                emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData result =
                        new emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData(this);
                result.iGHMDGHKADF_ = iGHMDGHKADF_;
                result.cJNBGNOIIJL_ = cJNBGNOIIJL_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData other) {
                if (other
                        == emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                                .getDefaultInstance()) return this;
                if (other.getIGHMDGHKADF() != 0) {
                    setIGHMDGHKADF(other.getIGHMDGHKADF());
                }
                if (other.getCJNBGNOIIJL() != false) {
                    setCJNBGNOIIJL(other.getCJNBGNOIIJL());
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
                emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int iGHMDGHKADF_;
            /**
             * <code>uint32 IGHMDGHKADF = 8;</code>
             *
             * @return The iGHMDGHKADF.
             */
            @java.lang.Override
            public int getIGHMDGHKADF() {
                return iGHMDGHKADF_;
            }
            /**
             * <code>uint32 IGHMDGHKADF = 8;</code>
             *
             * @param value The iGHMDGHKADF to set.
             * @return This builder for chaining.
             */
            public Builder setIGHMDGHKADF(int value) {

                iGHMDGHKADF_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 IGHMDGHKADF = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIGHMDGHKADF() {

                iGHMDGHKADF_ = 0;
                onChanged();
                return this;
            }

            private boolean cJNBGNOIIJL_;
            /**
             * <code>bool CJNBGNOIIJL = 4;</code>
             *
             * @return The cJNBGNOIIJL.
             */
            @java.lang.Override
            public boolean getCJNBGNOIIJL() {
                return cJNBGNOIIJL_;
            }
            /**
             * <code>bool CJNBGNOIIJL = 4;</code>
             *
             * @param value The cJNBGNOIIJL to set.
             * @return This builder for chaining.
             */
            public Builder setCJNBGNOIIJL(boolean value) {

                cJNBGNOIIJL_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool CJNBGNOIIJL = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCJNBGNOIIJL() {

                cJNBGNOIIJL_ = false;
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

            // @@protoc_insertion_point(builder_scope:PlayerOfferingData)
        }

        // @@protoc_insertion_point(class_scope:PlayerOfferingData)
        private static final emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData();
        }

        public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<PlayerOfferingData> PARSER =
                new com.google.protobuf.AbstractParser<PlayerOfferingData>() {
                    @java.lang.Override
                    public PlayerOfferingData parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new PlayerOfferingData(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<PlayerOfferingData> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<PlayerOfferingData> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_PlayerOfferingData_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_PlayerOfferingData_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\030PlayerOfferingData.proto\">\n\022PlayerOffe"
                    + "ringData\022\023\n\013IGHMDGHKADF\030\010 \001(\r\022\023\n\013CJNBGNO"
                    + "IIJL\030\004 \001(\010B\033\n\031emu.grasscutter.net.protob"
                    + "\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_PlayerOfferingData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerOfferingData_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_PlayerOfferingData_descriptor,
                        new java.lang.String[] {
                            "IGHMDGHKADF", "CJNBGNOIIJL",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}