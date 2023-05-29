// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DJDCAPHMOJB.proto

package emu.grasscutter.net.proto;

public final class DJDCAPHMOJBOuterClass {
    private DJDCAPHMOJBOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface DJDCAPHMOJBOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:DJDCAPHMOJB)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool JLJOMFIMCGA = 7;</code>
         *
         * @return The jLJOMFIMCGA.
         */
        boolean getJLJOMFIMCGA();

        /**
         * <code>int32 retcode = 5;</code>
         *
         * @return The retcode.
         */
        int getRetcode();

        /**
         * <code>uint32 id = 3;</code>
         *
         * @return The id.
         */
        int getId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 7416
     * </pre>
     *
     * Protobuf type {@code DJDCAPHMOJB}
     */
    public static final class DJDCAPHMOJB extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:DJDCAPHMOJB)
            DJDCAPHMOJBOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use DJDCAPHMOJB.newBuilder() to construct.
        private DJDCAPHMOJB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private DJDCAPHMOJB() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new DJDCAPHMOJB();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DJDCAPHMOJB(
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
                        case 24:
                            {
                                id_ = input.readUInt32();
                                break;
                            }
                        case 40:
                            {
                                retcode_ = input.readInt32();
                                break;
                            }
                        case 56:
                            {
                                jLJOMFIMCGA_ = input.readBool();
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
            return emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.internal_static_DJDCAPHMOJB_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass
                    .internal_static_DJDCAPHMOJB_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB.class,
                            emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB.Builder.class);
        }

        public static final int JLJOMFIMCGA_FIELD_NUMBER = 7;
        private boolean jLJOMFIMCGA_;
        /**
         * <code>bool JLJOMFIMCGA = 7;</code>
         *
         * @return The jLJOMFIMCGA.
         */
        @java.lang.Override
        public boolean getJLJOMFIMCGA() {
            return jLJOMFIMCGA_;
        }

        public static final int RETCODE_FIELD_NUMBER = 5;
        private int retcode_;
        /**
         * <code>int32 retcode = 5;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
        }

        public static final int ID_FIELD_NUMBER = 3;
        private int id_;
        /**
         * <code>uint32 id = 3;</code>
         *
         * @return The id.
         */
        @java.lang.Override
        public int getId() {
            return id_;
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
            if (id_ != 0) {
                output.writeUInt32(3, id_);
            }
            if (retcode_ != 0) {
                output.writeInt32(5, retcode_);
            }
            if (jLJOMFIMCGA_ != false) {
                output.writeBool(7, jLJOMFIMCGA_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, id_);
            }
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(5, retcode_);
            }
            if (jLJOMFIMCGA_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(7, jLJOMFIMCGA_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB other =
                    (emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB) obj;

            if (getJLJOMFIMCGA() != other.getJLJOMFIMCGA()) return false;
            if (getRetcode() != other.getRetcode()) return false;
            if (getId() != other.getId()) return false;
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
            hash = (37 * hash) + JLJOMFIMCGA_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getJLJOMFIMCGA());
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + getId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parseFrom(
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
                emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB prototype) {
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
         * CmdId: 7416
         * </pre>
         *
         * Protobuf type {@code DJDCAPHMOJB}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:DJDCAPHMOJB)
                emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJBOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass
                        .internal_static_DJDCAPHMOJB_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass
                        .internal_static_DJDCAPHMOJB_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB.class,
                                emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB.newBuilder()
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
                jLJOMFIMCGA_ = false;

                retcode_ = 0;

                id_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass
                        .internal_static_DJDCAPHMOJB_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB build() {
                emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB buildPartial() {
                emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB result =
                        new emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB(this);
                result.jLJOMFIMCGA_ = jLJOMFIMCGA_;
                result.retcode_ = retcode_;
                result.id_ = id_;
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
                if (other instanceof emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB) {
                    return mergeFrom((emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB other) {
                if (other
                        == emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB.getDefaultInstance())
                    return this;
                if (other.getJLJOMFIMCGA() != false) {
                    setJLJOMFIMCGA(other.getJLJOMFIMCGA());
                }
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
                }
                if (other.getId() != 0) {
                    setId(other.getId());
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
                emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean jLJOMFIMCGA_;
            /**
             * <code>bool JLJOMFIMCGA = 7;</code>
             *
             * @return The jLJOMFIMCGA.
             */
            @java.lang.Override
            public boolean getJLJOMFIMCGA() {
                return jLJOMFIMCGA_;
            }
            /**
             * <code>bool JLJOMFIMCGA = 7;</code>
             *
             * @param value The jLJOMFIMCGA to set.
             * @return This builder for chaining.
             */
            public Builder setJLJOMFIMCGA(boolean value) {

                jLJOMFIMCGA_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool JLJOMFIMCGA = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearJLJOMFIMCGA() {

                jLJOMFIMCGA_ = false;
                onChanged();
                return this;
            }

            private int retcode_;
            /**
             * <code>int32 retcode = 5;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 5;</code>
             *
             * @param value The retcode to set.
             * @return This builder for chaining.
             */
            public Builder setRetcode(int value) {

                retcode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 retcode = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
                onChanged();
                return this;
            }

            private int id_;
            /**
             * <code>uint32 id = 3;</code>
             *
             * @return The id.
             */
            @java.lang.Override
            public int getId() {
                return id_;
            }
            /**
             * <code>uint32 id = 3;</code>
             *
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(int value) {

                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 id = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0;
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

            // @@protoc_insertion_point(builder_scope:DJDCAPHMOJB)
        }

        // @@protoc_insertion_point(class_scope:DJDCAPHMOJB)
        private static final emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB();
        }

        public static emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DJDCAPHMOJB> PARSER =
                new com.google.protobuf.AbstractParser<DJDCAPHMOJB>() {
                    @java.lang.Override
                    public DJDCAPHMOJB parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new DJDCAPHMOJB(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<DJDCAPHMOJB> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DJDCAPHMOJB> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.DJDCAPHMOJBOuterClass.DJDCAPHMOJB getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_DJDCAPHMOJB_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_DJDCAPHMOJB_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021DJDCAPHMOJB.proto\"?\n\013DJDCAPHMOJB\022\023\n\013JL"
                    + "JOMFIMCGA\030\007 \001(\010\022\017\n\007retcode\030\005 \001(\005\022\n\n\002id\030\003"
                    + " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto"
                    + "3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_DJDCAPHMOJB_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DJDCAPHMOJB_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_DJDCAPHMOJB_descriptor,
                        new java.lang.String[] {
                            "JLJOMFIMCGA", "Retcode", "Id",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}