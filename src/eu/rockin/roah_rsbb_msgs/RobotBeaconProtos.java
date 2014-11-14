// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RobotBeacon.proto

package eu.rockin.roah_rsbb_msgs;

public final class RobotBeaconProtos {
  private RobotBeaconProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RobotBeaconOrBuilder extends
      // @@protoc_insertion_point(interface_extends:roah_rsbb_msgs.RobotBeacon)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string team_name = 1;</code>
     *
     * <pre>
     * The team name
     * </pre>
     */
    boolean hasTeamName();
    /**
     * <code>required string team_name = 1;</code>
     *
     * <pre>
     * The team name
     * </pre>
     */
    java.lang.String getTeamName();
    /**
     * <code>required string team_name = 1;</code>
     *
     * <pre>
     * The team name
     * </pre>
     */
    com.google.protobuf.ByteString
        getTeamNameBytes();

    /**
     * <code>required string robot_name = 2;</code>
     *
     * <pre>
     * The specific robot in the team
     * (can be empty, only needed if the team has more than one robot)
     * </pre>
     */
    boolean hasRobotName();
    /**
     * <code>required string robot_name = 2;</code>
     *
     * <pre>
     * The specific robot in the team
     * (can be empty, only needed if the team has more than one robot)
     * </pre>
     */
    java.lang.String getRobotName();
    /**
     * <code>required string robot_name = 2;</code>
     *
     * <pre>
     * The specific robot in the team
     * (can be empty, only needed if the team has more than one robot)
     * </pre>
     */
    com.google.protobuf.ByteString
        getRobotNameBytes();

    /**
     * <code>required .roah_rsbb_msgs.Time time = 3;</code>
     *
     * <pre>
     * UTC time, to check clock synchronization
     * </pre>
     */
    boolean hasTime();
    /**
     * <code>required .roah_rsbb_msgs.Time time = 3;</code>
     *
     * <pre>
     * UTC time, to check clock synchronization
     * </pre>
     */
    eu.rockin.roah_rsbb_msgs.TimeProtos.Time getTime();
    /**
     * <code>required .roah_rsbb_msgs.Time time = 3;</code>
     *
     * <pre>
     * UTC time, to check clock synchronization
     * </pre>
     */
    eu.rockin.roah_rsbb_msgs.TimeProtos.TimeOrBuilder getTimeOrBuilder();
  }
  /**
   * Protobuf type {@code roah_rsbb_msgs.RobotBeacon}
   */
  public static final class RobotBeacon extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:roah_rsbb_msgs.RobotBeacon)
      RobotBeaconOrBuilder {
    // Use RobotBeacon.newBuilder() to construct.
    private RobotBeacon(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RobotBeacon(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RobotBeacon defaultInstance;
    public static RobotBeacon getDefaultInstance() {
      return defaultInstance;
    }

    public RobotBeacon getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RobotBeacon(
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
              teamName_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              robotName_ = bs;
              break;
            }
            case 26: {
              eu.rockin.roah_rsbb_msgs.TimeProtos.Time.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = time_.toBuilder();
              }
              time_ = input.readMessage(eu.rockin.roah_rsbb_msgs.TimeProtos.Time.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(time_);
                time_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
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
      return eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.internal_static_roah_rsbb_msgs_RobotBeacon_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.internal_static_roah_rsbb_msgs_RobotBeacon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon.class, eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon.Builder.class);
    }

    public static com.google.protobuf.Parser<RobotBeacon> PARSER =
        new com.google.protobuf.AbstractParser<RobotBeacon>() {
      public RobotBeacon parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RobotBeacon(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RobotBeacon> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code roah_rsbb_msgs.RobotBeacon.CompType}
     */
    public enum CompType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>COMP_ID = 6666;</code>
       */
      COMP_ID(0, 6666),
      /**
       * <code>MSG_TYPE = 30;</code>
       */
      MSG_TYPE(1, 30),
      ;

      /**
       * <code>COMP_ID = 6666;</code>
       */
      public static final int COMP_ID_VALUE = 6666;
      /**
       * <code>MSG_TYPE = 30;</code>
       */
      public static final int MSG_TYPE_VALUE = 30;


      public final int getNumber() { return value; }

      public static CompType valueOf(int value) {
        switch (value) {
          case 6666: return COMP_ID;
          case 30: return MSG_TYPE;
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
        return eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:roah_rsbb_msgs.RobotBeacon.CompType)
    }

    private int bitField0_;
    public static final int TEAM_NAME_FIELD_NUMBER = 1;
    private java.lang.Object teamName_;
    /**
     * <code>required string team_name = 1;</code>
     *
     * <pre>
     * The team name
     * </pre>
     */
    public boolean hasTeamName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string team_name = 1;</code>
     *
     * <pre>
     * The team name
     * </pre>
     */
    public java.lang.String getTeamName() {
      java.lang.Object ref = teamName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          teamName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string team_name = 1;</code>
     *
     * <pre>
     * The team name
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTeamNameBytes() {
      java.lang.Object ref = teamName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        teamName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROBOT_NAME_FIELD_NUMBER = 2;
    private java.lang.Object robotName_;
    /**
     * <code>required string robot_name = 2;</code>
     *
     * <pre>
     * The specific robot in the team
     * (can be empty, only needed if the team has more than one robot)
     * </pre>
     */
    public boolean hasRobotName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string robot_name = 2;</code>
     *
     * <pre>
     * The specific robot in the team
     * (can be empty, only needed if the team has more than one robot)
     * </pre>
     */
    public java.lang.String getRobotName() {
      java.lang.Object ref = robotName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          robotName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string robot_name = 2;</code>
     *
     * <pre>
     * The specific robot in the team
     * (can be empty, only needed if the team has more than one robot)
     * </pre>
     */
    public com.google.protobuf.ByteString
        getRobotNameBytes() {
      java.lang.Object ref = robotName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        robotName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIME_FIELD_NUMBER = 3;
    private eu.rockin.roah_rsbb_msgs.TimeProtos.Time time_;
    /**
     * <code>required .roah_rsbb_msgs.Time time = 3;</code>
     *
     * <pre>
     * UTC time, to check clock synchronization
     * </pre>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .roah_rsbb_msgs.Time time = 3;</code>
     *
     * <pre>
     * UTC time, to check clock synchronization
     * </pre>
     */
    public eu.rockin.roah_rsbb_msgs.TimeProtos.Time getTime() {
      return time_;
    }
    /**
     * <code>required .roah_rsbb_msgs.Time time = 3;</code>
     *
     * <pre>
     * UTC time, to check clock synchronization
     * </pre>
     */
    public eu.rockin.roah_rsbb_msgs.TimeProtos.TimeOrBuilder getTimeOrBuilder() {
      return time_;
    }

    private void initFields() {
      teamName_ = "";
      robotName_ = "";
      time_ = eu.rockin.roah_rsbb_msgs.TimeProtos.Time.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTeamName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRobotName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTime().isInitialized()) {
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
        output.writeBytes(1, getTeamNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getRobotNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, time_);
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
          .computeBytesSize(1, getTeamNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getRobotNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, time_);
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

    public static eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon prototype) {
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
     * Protobuf type {@code roah_rsbb_msgs.RobotBeacon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:roah_rsbb_msgs.RobotBeacon)
        eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeaconOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.internal_static_roah_rsbb_msgs_RobotBeacon_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.internal_static_roah_rsbb_msgs_RobotBeacon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon.class, eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon.Builder.class);
      }

      // Construct using eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon.newBuilder()
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
          getTimeFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        teamName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        robotName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (timeBuilder_ == null) {
          time_ = eu.rockin.roah_rsbb_msgs.TimeProtos.Time.getDefaultInstance();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.internal_static_roah_rsbb_msgs_RobotBeacon_descriptor;
      }

      public eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon getDefaultInstanceForType() {
        return eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon.getDefaultInstance();
      }

      public eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon build() {
        eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon buildPartial() {
        eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon result = new eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.teamName_ = teamName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.robotName_ = robotName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (timeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = timeBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon) {
          return mergeFrom((eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon other) {
        if (other == eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon.getDefaultInstance()) return this;
        if (other.hasTeamName()) {
          bitField0_ |= 0x00000001;
          teamName_ = other.teamName_;
          onChanged();
        }
        if (other.hasRobotName()) {
          bitField0_ |= 0x00000002;
          robotName_ = other.robotName_;
          onChanged();
        }
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTeamName()) {
          
          return false;
        }
        if (!hasRobotName()) {
          
          return false;
        }
        if (!hasTime()) {
          
          return false;
        }
        if (!getTime().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (eu.rockin.roah_rsbb_msgs.RobotBeaconProtos.RobotBeacon) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object teamName_ = "";
      /**
       * <code>required string team_name = 1;</code>
       *
       * <pre>
       * The team name
       * </pre>
       */
      public boolean hasTeamName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string team_name = 1;</code>
       *
       * <pre>
       * The team name
       * </pre>
       */
      public java.lang.String getTeamName() {
        java.lang.Object ref = teamName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            teamName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string team_name = 1;</code>
       *
       * <pre>
       * The team name
       * </pre>
       */
      public com.google.protobuf.ByteString
          getTeamNameBytes() {
        java.lang.Object ref = teamName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          teamName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string team_name = 1;</code>
       *
       * <pre>
       * The team name
       * </pre>
       */
      public Builder setTeamName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        teamName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string team_name = 1;</code>
       *
       * <pre>
       * The team name
       * </pre>
       */
      public Builder clearTeamName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        teamName_ = getDefaultInstance().getTeamName();
        onChanged();
        return this;
      }
      /**
       * <code>required string team_name = 1;</code>
       *
       * <pre>
       * The team name
       * </pre>
       */
      public Builder setTeamNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        teamName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object robotName_ = "";
      /**
       * <code>required string robot_name = 2;</code>
       *
       * <pre>
       * The specific robot in the team
       * (can be empty, only needed if the team has more than one robot)
       * </pre>
       */
      public boolean hasRobotName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string robot_name = 2;</code>
       *
       * <pre>
       * The specific robot in the team
       * (can be empty, only needed if the team has more than one robot)
       * </pre>
       */
      public java.lang.String getRobotName() {
        java.lang.Object ref = robotName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            robotName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string robot_name = 2;</code>
       *
       * <pre>
       * The specific robot in the team
       * (can be empty, only needed if the team has more than one robot)
       * </pre>
       */
      public com.google.protobuf.ByteString
          getRobotNameBytes() {
        java.lang.Object ref = robotName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          robotName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string robot_name = 2;</code>
       *
       * <pre>
       * The specific robot in the team
       * (can be empty, only needed if the team has more than one robot)
       * </pre>
       */
      public Builder setRobotName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        robotName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string robot_name = 2;</code>
       *
       * <pre>
       * The specific robot in the team
       * (can be empty, only needed if the team has more than one robot)
       * </pre>
       */
      public Builder clearRobotName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        robotName_ = getDefaultInstance().getRobotName();
        onChanged();
        return this;
      }
      /**
       * <code>required string robot_name = 2;</code>
       *
       * <pre>
       * The specific robot in the team
       * (can be empty, only needed if the team has more than one robot)
       * </pre>
       */
      public Builder setRobotNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        robotName_ = value;
        onChanged();
        return this;
      }

      private eu.rockin.roah_rsbb_msgs.TimeProtos.Time time_ = eu.rockin.roah_rsbb_msgs.TimeProtos.Time.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          eu.rockin.roah_rsbb_msgs.TimeProtos.Time, eu.rockin.roah_rsbb_msgs.TimeProtos.Time.Builder, eu.rockin.roah_rsbb_msgs.TimeProtos.TimeOrBuilder> timeBuilder_;
      /**
       * <code>required .roah_rsbb_msgs.Time time = 3;</code>
       *
       * <pre>
       * UTC time, to check clock synchronization
       * </pre>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .roah_rsbb_msgs.Time time = 3;</code>
       *
       * <pre>
       * UTC time, to check clock synchronization
       * </pre>
       */
      public eu.rockin.roah_rsbb_msgs.TimeProtos.Time getTime() {
        if (timeBuilder_ == null) {
          return time_;
        } else {
          return timeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .roah_rsbb_msgs.Time time = 3;</code>
       *
       * <pre>
       * UTC time, to check clock synchronization
       * </pre>
       */
      public Builder setTime(eu.rockin.roah_rsbb_msgs.TimeProtos.Time value) {
        if (timeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          time_ = value;
          onChanged();
        } else {
          timeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .roah_rsbb_msgs.Time time = 3;</code>
       *
       * <pre>
       * UTC time, to check clock synchronization
       * </pre>
       */
      public Builder setTime(
          eu.rockin.roah_rsbb_msgs.TimeProtos.Time.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
          onChanged();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .roah_rsbb_msgs.Time time = 3;</code>
       *
       * <pre>
       * UTC time, to check clock synchronization
       * </pre>
       */
      public Builder mergeTime(eu.rockin.roah_rsbb_msgs.TimeProtos.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              time_ != eu.rockin.roah_rsbb_msgs.TimeProtos.Time.getDefaultInstance()) {
            time_ =
              eu.rockin.roah_rsbb_msgs.TimeProtos.Time.newBuilder(time_).mergeFrom(value).buildPartial();
          } else {
            time_ = value;
          }
          onChanged();
        } else {
          timeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .roah_rsbb_msgs.Time time = 3;</code>
       *
       * <pre>
       * UTC time, to check clock synchronization
       * </pre>
       */
      public Builder clearTime() {
        if (timeBuilder_ == null) {
          time_ = eu.rockin.roah_rsbb_msgs.TimeProtos.Time.getDefaultInstance();
          onChanged();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>required .roah_rsbb_msgs.Time time = 3;</code>
       *
       * <pre>
       * UTC time, to check clock synchronization
       * </pre>
       */
      public eu.rockin.roah_rsbb_msgs.TimeProtos.Time.Builder getTimeBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .roah_rsbb_msgs.Time time = 3;</code>
       *
       * <pre>
       * UTC time, to check clock synchronization
       * </pre>
       */
      public eu.rockin.roah_rsbb_msgs.TimeProtos.TimeOrBuilder getTimeOrBuilder() {
        if (timeBuilder_ != null) {
          return timeBuilder_.getMessageOrBuilder();
        } else {
          return time_;
        }
      }
      /**
       * <code>required .roah_rsbb_msgs.Time time = 3;</code>
       *
       * <pre>
       * UTC time, to check clock synchronization
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          eu.rockin.roah_rsbb_msgs.TimeProtos.Time, eu.rockin.roah_rsbb_msgs.TimeProtos.Time.Builder, eu.rockin.roah_rsbb_msgs.TimeProtos.TimeOrBuilder> 
          getTimeFieldBuilder() {
        if (timeBuilder_ == null) {
          timeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              eu.rockin.roah_rsbb_msgs.TimeProtos.Time, eu.rockin.roah_rsbb_msgs.TimeProtos.Time.Builder, eu.rockin.roah_rsbb_msgs.TimeProtos.TimeOrBuilder>(
                  getTime(),
                  getParentForChildren(),
                  isClean());
          time_ = null;
        }
        return timeBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:roah_rsbb_msgs.RobotBeacon)
    }

    static {
      defaultInstance = new RobotBeacon(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:roah_rsbb_msgs.RobotBeacon)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_roah_rsbb_msgs_RobotBeacon_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_roah_rsbb_msgs_RobotBeacon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021RobotBeacon.proto\022\016roah_rsbb_msgs\032\nTim" +
      "e.proto\"\200\001\n\013RobotBeacon\022\021\n\tteam_name\030\001 \002" +
      "(\t\022\022\n\nrobot_name\030\002 \002(\t\022\"\n\004time\030\003 \002(\0132\024.r" +
      "oah_rsbb_msgs.Time\"&\n\010CompType\022\014\n\007COMP_I" +
      "D\020\2124\022\014\n\010MSG_TYPE\020\036B-\n\030eu.rockin.roah_rsb" +
      "b_msgsB\021RobotBeaconProtos"
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
          eu.rockin.roah_rsbb_msgs.TimeProtos.getDescriptor(),
        }, assigner);
    internal_static_roah_rsbb_msgs_RobotBeacon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_roah_rsbb_msgs_RobotBeacon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_roah_rsbb_msgs_RobotBeacon_descriptor,
        new java.lang.String[] { "TeamName", "RobotName", "Time", });
    eu.rockin.roah_rsbb_msgs.TimeProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}