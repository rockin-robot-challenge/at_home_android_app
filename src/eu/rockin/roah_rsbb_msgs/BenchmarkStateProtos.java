// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BenchmarkState.proto

package eu.rockin.roah_rsbb_msgs;

public final class BenchmarkStateProtos {
  private BenchmarkStateProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BenchmarkStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:roah_rsbb_msgs.BenchmarkState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string benchmark_type = 1;</code>
     *
     * <pre>
     * The type of benchmark ([tf][123])
     * </pre>
     */
    boolean hasBenchmarkType();
    /**
     * <code>required string benchmark_type = 1;</code>
     *
     * <pre>
     * The type of benchmark ([tf][123])
     * </pre>
     */
    java.lang.String getBenchmarkType();
    /**
     * <code>required string benchmark_type = 1;</code>
     *
     * <pre>
     * The type of benchmark ([tf][123])
     * </pre>
     */
    com.google.protobuf.ByteString
        getBenchmarkTypeBytes();

    /**
     * <code>required string benchmark_state = 2;</code>
     *
     * <pre>
     * The state TODO
     * </pre>
     */
    boolean hasBenchmarkState();
    /**
     * <code>required string benchmark_state = 2;</code>
     *
     * <pre>
     * The state TODO
     * </pre>
     */
    java.lang.String getBenchmarkState();
    /**
     * <code>required string benchmark_state = 2;</code>
     *
     * <pre>
     * The state TODO
     * </pre>
     */
    com.google.protobuf.ByteString
        getBenchmarkStateBytes();
  }
  /**
   * Protobuf type {@code roah_rsbb_msgs.BenchmarkState}
   */
  public static final class BenchmarkState extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:roah_rsbb_msgs.BenchmarkState)
      BenchmarkStateOrBuilder {
    // Use BenchmarkState.newBuilder() to construct.
    private BenchmarkState(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BenchmarkState(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BenchmarkState defaultInstance;
    public static BenchmarkState getDefaultInstance() {
      return defaultInstance;
    }

    public BenchmarkState getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BenchmarkState(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              benchmarkType_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              benchmarkState_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.internal_static_roah_rsbb_msgs_BenchmarkState_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.internal_static_roah_rsbb_msgs_BenchmarkState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState.class, eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState.Builder.class);
    }

    public static com.google.protobuf.Parser<BenchmarkState> PARSER =
        new com.google.protobuf.AbstractParser<BenchmarkState>() {
      public BenchmarkState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BenchmarkState(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BenchmarkState> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code roah_rsbb_msgs.BenchmarkState.CompType}
     */
    public enum CompType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>COMP_ID = 6666;</code>
       */
      COMP_ID(0, 6666),
      /**
       * <code>MSG_TYPE = 20;</code>
       */
      MSG_TYPE(1, 20),
      ;

      /**
       * <code>COMP_ID = 6666;</code>
       */
      public static final int COMP_ID_VALUE = 6666;
      /**
       * <code>MSG_TYPE = 20;</code>
       */
      public static final int MSG_TYPE_VALUE = 20;


      public final int getNumber() { return value; }

      public static CompType valueOf(int value) {
        switch (value) {
          case 6666: return COMP_ID;
          case 20: return MSG_TYPE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CompType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<CompType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CompType>() {
              public CompType findValueByNumber(int number) {
                return CompType.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState.getDescriptor().getEnumTypes().get(0);
      }

      private static final CompType[] VALUES = values();

      public static CompType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private CompType(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:roah_rsbb_msgs.BenchmarkState.CompType)
    }

    private int bitField0_;
    public static final int BENCHMARK_TYPE_FIELD_NUMBER = 1;
    private java.lang.Object benchmarkType_;
    /**
     * <code>required string benchmark_type = 1;</code>
     *
     * <pre>
     * The type of benchmark ([tf][123])
     * </pre>
     */
    public boolean hasBenchmarkType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string benchmark_type = 1;</code>
     *
     * <pre>
     * The type of benchmark ([tf][123])
     * </pre>
     */
    public java.lang.String getBenchmarkType() {
      java.lang.Object ref = benchmarkType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          benchmarkType_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string benchmark_type = 1;</code>
     *
     * <pre>
     * The type of benchmark ([tf][123])
     * </pre>
     */
    public com.google.protobuf.ByteString
        getBenchmarkTypeBytes() {
      java.lang.Object ref = benchmarkType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        benchmarkType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BENCHMARK_STATE_FIELD_NUMBER = 2;
    private java.lang.Object benchmarkState_;
    /**
     * <code>required string benchmark_state = 2;</code>
     *
     * <pre>
     * The state TODO
     * </pre>
     */
    public boolean hasBenchmarkState() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string benchmark_state = 2;</code>
     *
     * <pre>
     * The state TODO
     * </pre>
     */
    public java.lang.String getBenchmarkState() {
      java.lang.Object ref = benchmarkState_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          benchmarkState_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string benchmark_state = 2;</code>
     *
     * <pre>
     * The state TODO
     * </pre>
     */
    public com.google.protobuf.ByteString
        getBenchmarkStateBytes() {
      java.lang.Object ref = benchmarkState_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        benchmarkState_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      benchmarkType_ = "";
      benchmarkState_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasBenchmarkType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBenchmarkState()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getBenchmarkTypeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getBenchmarkStateBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getBenchmarkTypeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getBenchmarkStateBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code roah_rsbb_msgs.BenchmarkState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:roah_rsbb_msgs.BenchmarkState)
        eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.internal_static_roah_rsbb_msgs_BenchmarkState_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.internal_static_roah_rsbb_msgs_BenchmarkState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState.class, eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState.Builder.class);
      }

      // Construct using eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        benchmarkType_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        benchmarkState_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.internal_static_roah_rsbb_msgs_BenchmarkState_descriptor;
      }

      public eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState getDefaultInstanceForType() {
        return eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState.getDefaultInstance();
      }

      public eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState build() {
        eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState buildPartial() {
        eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState result = new eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.benchmarkType_ = benchmarkType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.benchmarkState_ = benchmarkState_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState) {
          return mergeFrom((eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState other) {
        if (other == eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState.getDefaultInstance()) return this;
        if (other.hasBenchmarkType()) {
          bitField0_ |= 0x00000001;
          benchmarkType_ = other.benchmarkType_;
          onChanged();
        }
        if (other.hasBenchmarkState()) {
          bitField0_ |= 0x00000002;
          benchmarkState_ = other.benchmarkState_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBenchmarkType()) {
          
          return false;
        }
        if (!hasBenchmarkState()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (eu.rockin.roah_rsbb_msgs.BenchmarkStateProtos.BenchmarkState) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object benchmarkType_ = "";
      /**
       * <code>required string benchmark_type = 1;</code>
       *
       * <pre>
       * The type of benchmark ([tf][123])
       * </pre>
       */
      public boolean hasBenchmarkType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string benchmark_type = 1;</code>
       *
       * <pre>
       * The type of benchmark ([tf][123])
       * </pre>
       */
      public java.lang.String getBenchmarkType() {
        java.lang.Object ref = benchmarkType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            benchmarkType_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string benchmark_type = 1;</code>
       *
       * <pre>
       * The type of benchmark ([tf][123])
       * </pre>
       */
      public com.google.protobuf.ByteString
          getBenchmarkTypeBytes() {
        java.lang.Object ref = benchmarkType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          benchmarkType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string benchmark_type = 1;</code>
       *
       * <pre>
       * The type of benchmark ([tf][123])
       * </pre>
       */
      public Builder setBenchmarkType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        benchmarkType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string benchmark_type = 1;</code>
       *
       * <pre>
       * The type of benchmark ([tf][123])
       * </pre>
       */
      public Builder clearBenchmarkType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        benchmarkType_ = getDefaultInstance().getBenchmarkType();
        onChanged();
        return this;
      }
      /**
       * <code>required string benchmark_type = 1;</code>
       *
       * <pre>
       * The type of benchmark ([tf][123])
       * </pre>
       */
      public Builder setBenchmarkTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        benchmarkType_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object benchmarkState_ = "";
      /**
       * <code>required string benchmark_state = 2;</code>
       *
       * <pre>
       * The state TODO
       * </pre>
       */
      public boolean hasBenchmarkState() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string benchmark_state = 2;</code>
       *
       * <pre>
       * The state TODO
       * </pre>
       */
      public java.lang.String getBenchmarkState() {
        java.lang.Object ref = benchmarkState_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            benchmarkState_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string benchmark_state = 2;</code>
       *
       * <pre>
       * The state TODO
       * </pre>
       */
      public com.google.protobuf.ByteString
          getBenchmarkStateBytes() {
        java.lang.Object ref = benchmarkState_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          benchmarkState_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string benchmark_state = 2;</code>
       *
       * <pre>
       * The state TODO
       * </pre>
       */
      public Builder setBenchmarkState(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        benchmarkState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string benchmark_state = 2;</code>
       *
       * <pre>
       * The state TODO
       * </pre>
       */
      public Builder clearBenchmarkState() {
        bitField0_ = (bitField0_ & ~0x00000002);
        benchmarkState_ = getDefaultInstance().getBenchmarkState();
        onChanged();
        return this;
      }
      /**
       * <code>required string benchmark_state = 2;</code>
       *
       * <pre>
       * The state TODO
       * </pre>
       */
      public Builder setBenchmarkStateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        benchmarkState_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:roah_rsbb_msgs.BenchmarkState)
    }

    static {
      defaultInstance = new BenchmarkState(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:roah_rsbb_msgs.BenchmarkState)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_roah_rsbb_msgs_BenchmarkState_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_roah_rsbb_msgs_BenchmarkState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BenchmarkState.proto\022\016roah_rsbb_msgs\"i" +
      "\n\016BenchmarkState\022\026\n\016benchmark_type\030\001 \002(\t" +
      "\022\027\n\017benchmark_state\030\002 \002(\t\"&\n\010CompType\022\014\n" +
      "\007COMP_ID\020\2124\022\014\n\010MSG_TYPE\020\024B0\n\030eu.rockin.r" +
      "oah_rsbb_msgsB\024BenchmarkStateProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_roah_rsbb_msgs_BenchmarkState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_roah_rsbb_msgs_BenchmarkState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_roah_rsbb_msgs_BenchmarkState_descriptor,
        new java.lang.String[] { "BenchmarkType", "BenchmarkState", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
