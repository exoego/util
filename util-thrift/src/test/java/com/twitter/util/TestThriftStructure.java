/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.twitter.util;

import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.TFieldRequirementType;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.protocol.TType;

public class TestThriftStructure implements TBase<TestThriftStructure, TestThriftStructure._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("TestThriftStructure");

  private static final TField A_STRING_FIELD_DESC = new TField("aString", TType.STRING, (short)1);
  private static final TField A_NUMBER_FIELD_DESC = new TField("aNumber", TType.I32, (short)2);

  public String aString;
  public int aNumber;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    A_STRING((short)1, "aString"),
    A_NUMBER((short)2, "aNumber");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // A_STRING
          return A_STRING;
        case 2: // A_NUMBER
          return A_NUMBER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ANUMBER_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.A_STRING, new FieldMetaData("aString", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.A_NUMBER, new FieldMetaData("aNumber", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(TestThriftStructure.class, metaDataMap);
  }

  public TestThriftStructure() {
  }

  public TestThriftStructure(
    String aString,
    int aNumber)
  {
    this();
    this.aString = aString;
    this.aNumber = aNumber;
    setANumberIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TestThriftStructure(TestThriftStructure other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetAString()) {
      this.aString = other.aString;
    }
    this.aNumber = other.aNumber;
  }

  public TestThriftStructure deepCopy() {
    return new TestThriftStructure(this);
  }

  @Override
  public void clear() {
    this.aString = null;
    setANumberIsSet(false);
    this.aNumber = 0;
  }

  public String getAString() {
    return this.aString;
  }

  public TestThriftStructure setAString(String aString) {
    this.aString = aString;
    return this;
  }

  public void unsetAString() {
    this.aString = null;
  }

  /** Returns true if field aString is set (has been assigned a value) and false otherwise */
  public boolean isSetAString() {
    return this.aString != null;
  }

  public void setAStringIsSet(boolean value) {
    if (!value) {
      this.aString = null;
    }
  }

  public int getANumber() {
    return this.aNumber;
  }

  public TestThriftStructure setANumber(int aNumber) {
    this.aNumber = aNumber;
    setANumberIsSet(true);
    return this;
  }

  public void unsetANumber() {
    __isset_bit_vector.clear(__ANUMBER_ISSET_ID);
  }

  /** Returns true if field aNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetANumber() {
    return __isset_bit_vector.get(__ANUMBER_ISSET_ID);
  }

  public void setANumberIsSet(boolean value) {
    __isset_bit_vector.set(__ANUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case A_STRING:
      if (value == null) {
        unsetAString();
      } else {
        setAString((String)value);
      }
      break;

    case A_NUMBER:
      if (value == null) {
        unsetANumber();
      } else {
        setANumber((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case A_STRING:
      return getAString();

    case A_NUMBER:
      return new Integer(getANumber());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case A_STRING:
      return isSetAString();
    case A_NUMBER:
      return isSetANumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TestThriftStructure)
      return this.equals((TestThriftStructure)that);
    return false;
  }

  public boolean equals(TestThriftStructure that) {
    if (that == null)
      return false;

    boolean this_present_aString = true && this.isSetAString();
    boolean that_present_aString = true && that.isSetAString();
    if (this_present_aString || that_present_aString) {
      if (!(this_present_aString && that_present_aString))
        return false;
      if (!this.aString.equals(that.aString))
        return false;
    }

    boolean this_present_aNumber = true;
    boolean that_present_aNumber = true;
    if (this_present_aNumber || that_present_aNumber) {
      if (!(this_present_aNumber && that_present_aNumber))
        return false;
      if (this.aNumber != that.aNumber)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TestThriftStructure other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TestThriftStructure typedOther = other;

    lastComparison = Boolean.valueOf(isSetAString()).compareTo(typedOther.isSetAString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAString()) {
      lastComparison = TBaseHelper.compareTo(this.aString, typedOther.aString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetANumber()).compareTo(typedOther.isSetANumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetANumber()) {
      lastComparison = TBaseHelper.compareTo(this.aNumber, typedOther.aNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // A_STRING
          if (field.type == TType.STRING) {
            this.aString = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // A_NUMBER
          if (field.type == TType.I32) {
            this.aNumber = iprot.readI32();
            setANumberIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.aString != null) {
      oprot.writeFieldBegin(A_STRING_FIELD_DESC);
      oprot.writeString(this.aString);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(A_NUMBER_FIELD_DESC);
    oprot.writeI32(this.aNumber);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TestThriftStructure(");
    boolean first = true;

    sb.append("aString:");
    if (this.aString == null) {
      sb.append("null");
    } else {
      sb.append(this.aString);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("aNumber:");
    sb.append(this.aNumber);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

