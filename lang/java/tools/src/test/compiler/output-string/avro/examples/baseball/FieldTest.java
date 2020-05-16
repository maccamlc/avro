/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro.examples.baseball;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Test various field types */
@org.apache.avro.specific.AvroGenerated
public class FieldTest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4609235620572341636L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FieldTest\",\"namespace\":\"avro.examples.baseball\",\"doc\":\"Test various field types\",\"fields\":[{\"name\":\"number\",\"type\":\"int\",\"doc\":\"The number of the player\"},{\"name\":\"last_name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"timestamp\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"timestampMicros\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}},{\"name\":\"timeMillis\",\"type\":{\"type\":\"int\",\"logicalType\":\"time-millis\"}},{\"name\":\"timeMicros\",\"type\":{\"type\":\"long\",\"logicalType\":\"time-micros\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimeMillisConversion());
  }

  private static final BinaryMessageEncoder<FieldTest> ENCODER =
      new BinaryMessageEncoder<FieldTest>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FieldTest> DECODER =
      new BinaryMessageDecoder<FieldTest>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<FieldTest> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<FieldTest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<FieldTest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<FieldTest>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this FieldTest to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a FieldTest from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a FieldTest instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static FieldTest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The number of the player */
   private int number;
   private java.lang.String last_name;
   private java.time.Instant timestamp;
   private java.time.Instant timestampMicros;
   private java.time.LocalTime timeMillis;
   private java.time.LocalTime timeMicros;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FieldTest() {}

  /**
   * All-args constructor.
   * @param number The number of the player
   * @param last_name The new value for last_name
   * @param timestamp The new value for timestamp
   * @param timestampMicros The new value for timestampMicros
   * @param timeMillis The new value for timeMillis
   * @param timeMicros The new value for timeMicros
   */
  public FieldTest(java.lang.Integer number, java.lang.String last_name, java.time.Instant timestamp, java.time.Instant timestampMicros, java.time.LocalTime timeMillis, java.time.LocalTime timeMicros) {
    this.number = number;
    this.last_name = last_name;
    this.timestamp = timestamp.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
    this.timestampMicros = timestampMicros.truncatedTo(java.time.temporal.ChronoUnit.MICROS);
    this.timeMillis = timeMillis.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
    this.timeMicros = timeMicros.truncatedTo(java.time.temporal.ChronoUnit.MICROS);
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return number;
    case 1: return last_name;
    case 2: return timestamp;
    case 3: return timestampMicros;
    case 4: return timeMillis;
    case 5: return timeMicros;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      new org.apache.avro.data.TimeConversions.TimestampMicrosConversion(),
      new org.apache.avro.data.TimeConversions.TimeMillisConversion(),
      new org.apache.avro.data.TimeConversions.TimeMicrosConversion(),
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: number = (java.lang.Integer)value$; break;
    case 1: last_name = value$ != null ? value$.toString() : null; break;
    case 2: timestamp = (java.time.Instant)value$; break;
    case 3: timestampMicros = (java.time.Instant)value$; break;
    case 4: timeMillis = (java.time.LocalTime)value$; break;
    case 5: timeMicros = (java.time.LocalTime)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'number' field.
   * @return The number of the player
   */
  public int getNumber() {
    return number;
  }


  /**
   * Sets the value of the 'number' field.
   * The number of the player
   * @param value the value to set.
   */
  public void setNumber(int value) {
    this.number = value;
  }

  /**
   * Gets the value of the 'last_name' field.
   * @return The value of the 'last_name' field.
   */
  public java.lang.String getLastName() {
    return last_name;
  }


  /**
   * Sets the value of the 'last_name' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.String value) {
    this.last_name = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.time.Instant getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.time.Instant value) {
    this.timestamp = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Gets the value of the 'timestampMicros' field.
   * @return The value of the 'timestampMicros' field.
   */
  public java.time.Instant getTimestampMicros() {
    return timestampMicros;
  }


  /**
   * Sets the value of the 'timestampMicros' field.
   * @param value the value to set.
   */
  public void setTimestampMicros(java.time.Instant value) {
    this.timestampMicros = value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);
  }

  /**
   * Gets the value of the 'timeMillis' field.
   * @return The value of the 'timeMillis' field.
   */
  public java.time.LocalTime getTimeMillis() {
    return timeMillis;
  }


  /**
   * Sets the value of the 'timeMillis' field.
   * @param value the value to set.
   */
  public void setTimeMillis(java.time.LocalTime value) {
    this.timeMillis = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Gets the value of the 'timeMicros' field.
   * @return The value of the 'timeMicros' field.
   */
  public java.time.LocalTime getTimeMicros() {
    return timeMicros;
  }


  /**
   * Sets the value of the 'timeMicros' field.
   * @param value the value to set.
   */
  public void setTimeMicros(java.time.LocalTime value) {
    this.timeMicros = value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);
  }

  /**
   * Creates a new FieldTest RecordBuilder.
   * @return A new FieldTest RecordBuilder
   */
  public static avro.examples.baseball.FieldTest.Builder newBuilder() {
    return new avro.examples.baseball.FieldTest.Builder();
  }

  /**
   * Creates a new FieldTest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FieldTest RecordBuilder
   */
  public static avro.examples.baseball.FieldTest.Builder newBuilder(avro.examples.baseball.FieldTest.Builder other) {
    if (other == null) {
      return new avro.examples.baseball.FieldTest.Builder();
    } else {
      return new avro.examples.baseball.FieldTest.Builder(other);
    }
  }

  /**
   * Creates a new FieldTest RecordBuilder by copying an existing FieldTest instance.
   * @param other The existing instance to copy.
   * @return A new FieldTest RecordBuilder
   */
  public static avro.examples.baseball.FieldTest.Builder newBuilder(avro.examples.baseball.FieldTest other) {
    if (other == null) {
      return new avro.examples.baseball.FieldTest.Builder();
    } else {
      return new avro.examples.baseball.FieldTest.Builder(other);
    }
  }

  /**
   * RecordBuilder for FieldTest instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FieldTest>
    implements org.apache.avro.data.RecordBuilder<FieldTest> {

    /** The number of the player */
    private int number;
    private java.lang.String last_name;
    private java.time.Instant timestamp;
    private java.time.Instant timestampMicros;
    private java.time.LocalTime timeMillis;
    private java.time.LocalTime timeMicros;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.examples.baseball.FieldTest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.number)) {
        this.number = data().deepCopy(fields()[0].schema(), other.number);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.last_name)) {
        this.last_name = data().deepCopy(fields()[1].schema(), other.last_name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.timestampMicros)) {
        this.timestampMicros = data().deepCopy(fields()[3].schema(), other.timestampMicros);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.timeMillis)) {
        this.timeMillis = data().deepCopy(fields()[4].schema(), other.timeMillis);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.timeMicros)) {
        this.timeMicros = data().deepCopy(fields()[5].schema(), other.timeMicros);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing FieldTest instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.examples.baseball.FieldTest other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.number)) {
        this.number = data().deepCopy(fields()[0].schema(), other.number);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.last_name)) {
        this.last_name = data().deepCopy(fields()[1].schema(), other.last_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timestampMicros)) {
        this.timestampMicros = data().deepCopy(fields()[3].schema(), other.timestampMicros);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timeMillis)) {
        this.timeMillis = data().deepCopy(fields()[4].schema(), other.timeMillis);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.timeMicros)) {
        this.timeMicros = data().deepCopy(fields()[5].schema(), other.timeMicros);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'number' field.
      * The number of the player
      * @return The value.
      */
    public int getNumber() {
      return number;
    }


    /**
      * Sets the value of the 'number' field.
      * The number of the player
      * @param value The value of 'number'.
      * @return This builder.
      */
    public avro.examples.baseball.FieldTest.Builder setNumber(int value) {
      validate(fields()[0], value);
      this.number = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'number' field has been set.
      * The number of the player
      * @return True if the 'number' field has been set, false otherwise.
      */
    public boolean hasNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'number' field.
      * The number of the player
      * @return This builder.
      */
    public avro.examples.baseball.FieldTest.Builder clearNumber() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'last_name' field.
      * @return The value.
      */
    public java.lang.String getLastName() {
      return last_name;
    }


    /**
      * Sets the value of the 'last_name' field.
      * @param value The value of 'last_name'.
      * @return This builder.
      */
    public avro.examples.baseball.FieldTest.Builder setLastName(java.lang.String value) {
      validate(fields()[1], value);
      this.last_name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'last_name' field has been set.
      * @return True if the 'last_name' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'last_name' field.
      * @return This builder.
      */
    public avro.examples.baseball.FieldTest.Builder clearLastName() {
      last_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.time.Instant getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public avro.examples.baseball.FieldTest.Builder setTimestamp(java.time.Instant value) {
      validate(fields()[2], value);
      this.timestamp = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public avro.examples.baseball.FieldTest.Builder clearTimestamp() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestampMicros' field.
      * @return The value.
      */
    public java.time.Instant getTimestampMicros() {
      return timestampMicros;
    }


    /**
      * Sets the value of the 'timestampMicros' field.
      * @param value The value of 'timestampMicros'.
      * @return This builder.
      */
    public avro.examples.baseball.FieldTest.Builder setTimestampMicros(java.time.Instant value) {
      validate(fields()[3], value);
      this.timestampMicros = value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'timestampMicros' field has been set.
      * @return True if the 'timestampMicros' field has been set, false otherwise.
      */
    public boolean hasTimestampMicros() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'timestampMicros' field.
      * @return This builder.
      */
    public avro.examples.baseball.FieldTest.Builder clearTimestampMicros() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'timeMillis' field.
      * @return The value.
      */
    public java.time.LocalTime getTimeMillis() {
      return timeMillis;
    }


    /**
      * Sets the value of the 'timeMillis' field.
      * @param value The value of 'timeMillis'.
      * @return This builder.
      */
    public avro.examples.baseball.FieldTest.Builder setTimeMillis(java.time.LocalTime value) {
      validate(fields()[4], value);
      this.timeMillis = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'timeMillis' field has been set.
      * @return True if the 'timeMillis' field has been set, false otherwise.
      */
    public boolean hasTimeMillis() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'timeMillis' field.
      * @return This builder.
      */
    public avro.examples.baseball.FieldTest.Builder clearTimeMillis() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'timeMicros' field.
      * @return The value.
      */
    public java.time.LocalTime getTimeMicros() {
      return timeMicros;
    }


    /**
      * Sets the value of the 'timeMicros' field.
      * @param value The value of 'timeMicros'.
      * @return This builder.
      */
    public avro.examples.baseball.FieldTest.Builder setTimeMicros(java.time.LocalTime value) {
      validate(fields()[5], value);
      this.timeMicros = value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'timeMicros' field has been set.
      * @return True if the 'timeMicros' field has been set, false otherwise.
      */
    public boolean hasTimeMicros() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'timeMicros' field.
      * @return This builder.
      */
    public avro.examples.baseball.FieldTest.Builder clearTimeMicros() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FieldTest build() {
      try {
        FieldTest record = new FieldTest();
        record.number = fieldSetFlags()[0] ? this.number : (java.lang.Integer) defaultValue(fields()[0]);
        record.last_name = fieldSetFlags()[1] ? this.last_name : (java.lang.String) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.time.Instant) defaultValue(fields()[2]);
        record.timestampMicros = fieldSetFlags()[3] ? this.timestampMicros : (java.time.Instant) defaultValue(fields()[3]);
        record.timeMillis = fieldSetFlags()[4] ? this.timeMillis : (java.time.LocalTime) defaultValue(fields()[4]);
        record.timeMicros = fieldSetFlags()[5] ? this.timeMicros : (java.time.LocalTime) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FieldTest>
    WRITER$ = (org.apache.avro.io.DatumWriter<FieldTest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FieldTest>
    READER$ = (org.apache.avro.io.DatumReader<FieldTest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










