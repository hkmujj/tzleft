/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.travelzen.farerule;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaxStay implements org.apache.thrift.TBase<MaxStay, MaxStay._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MaxStay");

  private static final org.apache.thrift.protocol.TField MAX_STAY_ITEM_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("maxStayItemList", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MaxStayStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MaxStayTupleSchemeFactory());
  }

  public List<com.travelzen.farerule.rule.MaxStayItem> maxStayItemList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MAX_STAY_ITEM_LIST((short)1, "maxStayItemList");

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
        case 1: // MAX_STAY_ITEM_LIST
          return MAX_STAY_ITEM_LIST;
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
  private _Fields optionals[] = {_Fields.MAX_STAY_ITEM_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAX_STAY_ITEM_LIST, new org.apache.thrift.meta_data.FieldMetaData("maxStayItemList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.travelzen.farerule.rule.MaxStayItem.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MaxStay.class, metaDataMap);
  }

  public MaxStay() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MaxStay(MaxStay other) {
    if (other.isSetMaxStayItemList()) {
      List<com.travelzen.farerule.rule.MaxStayItem> __this__maxStayItemList = new ArrayList<com.travelzen.farerule.rule.MaxStayItem>();
      for (com.travelzen.farerule.rule.MaxStayItem other_element : other.maxStayItemList) {
        __this__maxStayItemList.add(new com.travelzen.farerule.rule.MaxStayItem(other_element));
      }
      this.maxStayItemList = __this__maxStayItemList;
    }
  }

  public MaxStay deepCopy() {
    return new MaxStay(this);
  }

  @Override
  public void clear() {
    this.maxStayItemList = null;
  }

  public int getMaxStayItemListSize() {
    return (this.maxStayItemList == null) ? 0 : this.maxStayItemList.size();
  }

  public java.util.Iterator<com.travelzen.farerule.rule.MaxStayItem> getMaxStayItemListIterator() {
    return (this.maxStayItemList == null) ? null : this.maxStayItemList.iterator();
  }

  public void addToMaxStayItemList(com.travelzen.farerule.rule.MaxStayItem elem) {
    if (this.maxStayItemList == null) {
      this.maxStayItemList = new ArrayList<com.travelzen.farerule.rule.MaxStayItem>();
    }
    this.maxStayItemList.add(elem);
  }

  public List<com.travelzen.farerule.rule.MaxStayItem> getMaxStayItemList() {
    return this.maxStayItemList;
  }

  public MaxStay setMaxStayItemList(List<com.travelzen.farerule.rule.MaxStayItem> maxStayItemList) {
    this.maxStayItemList = maxStayItemList;
    return this;
  }

  public void unsetMaxStayItemList() {
    this.maxStayItemList = null;
  }

  /** Returns true if field maxStayItemList is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxStayItemList() {
    return this.maxStayItemList != null;
  }

  public void setMaxStayItemListIsSet(boolean value) {
    if (!value) {
      this.maxStayItemList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MAX_STAY_ITEM_LIST:
      if (value == null) {
        unsetMaxStayItemList();
      } else {
        setMaxStayItemList((List<com.travelzen.farerule.rule.MaxStayItem>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MAX_STAY_ITEM_LIST:
      return getMaxStayItemList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MAX_STAY_ITEM_LIST:
      return isSetMaxStayItemList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MaxStay)
      return this.equals((MaxStay)that);
    return false;
  }

  public boolean equals(MaxStay that) {
    if (that == null)
      return false;

    boolean this_present_maxStayItemList = true && this.isSetMaxStayItemList();
    boolean that_present_maxStayItemList = true && that.isSetMaxStayItemList();
    if (this_present_maxStayItemList || that_present_maxStayItemList) {
      if (!(this_present_maxStayItemList && that_present_maxStayItemList))
        return false;
      if (!this.maxStayItemList.equals(that.maxStayItemList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(MaxStay other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MaxStay typedOther = (MaxStay)other;

    lastComparison = Boolean.valueOf(isSetMaxStayItemList()).compareTo(typedOther.isSetMaxStayItemList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxStayItemList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxStayItemList, typedOther.maxStayItemList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MaxStay(");
    boolean first = true;

    if (isSetMaxStayItemList()) {
      sb.append("maxStayItemList:");
      if (this.maxStayItemList == null) {
        sb.append("null");
      } else {
        sb.append(this.maxStayItemList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MaxStayStandardSchemeFactory implements SchemeFactory {
    public MaxStayStandardScheme getScheme() {
      return new MaxStayStandardScheme();
    }
  }

  private static class MaxStayStandardScheme extends StandardScheme<MaxStay> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MaxStay struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAX_STAY_ITEM_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list40 = iprot.readListBegin();
                struct.maxStayItemList = new ArrayList<com.travelzen.farerule.rule.MaxStayItem>(_list40.size);
                for (int _i41 = 0; _i41 < _list40.size; ++_i41)
                {
                  com.travelzen.farerule.rule.MaxStayItem _elem42; // required
                  _elem42 = new com.travelzen.farerule.rule.MaxStayItem();
                  _elem42.read(iprot);
                  struct.maxStayItemList.add(_elem42);
                }
                iprot.readListEnd();
              }
              struct.setMaxStayItemListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MaxStay struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.maxStayItemList != null) {
        if (struct.isSetMaxStayItemList()) {
          oprot.writeFieldBegin(MAX_STAY_ITEM_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.maxStayItemList.size()));
            for (com.travelzen.farerule.rule.MaxStayItem _iter43 : struct.maxStayItemList)
            {
              _iter43.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MaxStayTupleSchemeFactory implements SchemeFactory {
    public MaxStayTupleScheme getScheme() {
      return new MaxStayTupleScheme();
    }
  }

  private static class MaxStayTupleScheme extends TupleScheme<MaxStay> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MaxStay struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMaxStayItemList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMaxStayItemList()) {
        {
          oprot.writeI32(struct.maxStayItemList.size());
          for (com.travelzen.farerule.rule.MaxStayItem _iter44 : struct.maxStayItemList)
          {
            _iter44.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MaxStay struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.maxStayItemList = new ArrayList<com.travelzen.farerule.rule.MaxStayItem>(_list45.size);
          for (int _i46 = 0; _i46 < _list45.size; ++_i46)
          {
            com.travelzen.farerule.rule.MaxStayItem _elem47; // required
            _elem47 = new com.travelzen.farerule.rule.MaxStayItem();
            _elem47.read(iprot);
            struct.maxStayItemList.add(_elem47);
          }
        }
        struct.setMaxStayItemListIsSet(true);
      }
    }
  }

}

