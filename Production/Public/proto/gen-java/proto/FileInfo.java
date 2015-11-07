/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package proto;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2015-11-07")
public class FileInfo implements org.apache.thrift.TBase<FileInfo, FileInfo._Fields>, java.io.Serializable, Cloneable, Comparable<FileInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FileInfo");

  private static final org.apache.thrift.protocol.TField FILENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("filename", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FILESIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("filesize", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_MODIFIED_FIELD_DESC = new org.apache.thrift.protocol.TField("lastModified", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FileInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FileInfoTupleSchemeFactory());
  }

  public String filename; // required
  public String filesize; // required
  public String lastModified; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FILENAME((short)1, "filename"),
    FILESIZE((short)2, "filesize"),
    LAST_MODIFIED((short)3, "lastModified");

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
        case 1: // FILENAME
          return FILENAME;
        case 2: // FILESIZE
          return FILESIZE;
        case 3: // LAST_MODIFIED
          return LAST_MODIFIED;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILENAME, new org.apache.thrift.meta_data.FieldMetaData("filename", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FILESIZE, new org.apache.thrift.meta_data.FieldMetaData("filesize", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_MODIFIED, new org.apache.thrift.meta_data.FieldMetaData("lastModified", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FileInfo.class, metaDataMap);
  }

  public FileInfo() {
  }

  public FileInfo(
    String filename,
    String filesize,
    String lastModified)
  {
    this();
    this.filename = filename;
    this.filesize = filesize;
    this.lastModified = lastModified;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FileInfo(FileInfo other) {
    if (other.isSetFilename()) {
      this.filename = other.filename;
    }
    if (other.isSetFilesize()) {
      this.filesize = other.filesize;
    }
    if (other.isSetLastModified()) {
      this.lastModified = other.lastModified;
    }
  }

  public FileInfo deepCopy() {
    return new FileInfo(this);
  }

  @Override
  public void clear() {
    this.filename = null;
    this.filesize = null;
    this.lastModified = null;
  }

  public String getFilename() {
    return this.filename;
  }

  public FileInfo setFilename(String filename) {
    this.filename = filename;
    return this;
  }

  public void unsetFilename() {
    this.filename = null;
  }

  /** Returns true if field filename is set (has been assigned a value) and false otherwise */
  public boolean isSetFilename() {
    return this.filename != null;
  }

  public void setFilenameIsSet(boolean value) {
    if (!value) {
      this.filename = null;
    }
  }

  public String getFilesize() {
    return this.filesize;
  }

  public FileInfo setFilesize(String filesize) {
    this.filesize = filesize;
    return this;
  }

  public void unsetFilesize() {
    this.filesize = null;
  }

  /** Returns true if field filesize is set (has been assigned a value) and false otherwise */
  public boolean isSetFilesize() {
    return this.filesize != null;
  }

  public void setFilesizeIsSet(boolean value) {
    if (!value) {
      this.filesize = null;
    }
  }

  public String getLastModified() {
    return this.lastModified;
  }

  public FileInfo setLastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  public void unsetLastModified() {
    this.lastModified = null;
  }

  /** Returns true if field lastModified is set (has been assigned a value) and false otherwise */
  public boolean isSetLastModified() {
    return this.lastModified != null;
  }

  public void setLastModifiedIsSet(boolean value) {
    if (!value) {
      this.lastModified = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILENAME:
      if (value == null) {
        unsetFilename();
      } else {
        setFilename((String)value);
      }
      break;

    case FILESIZE:
      if (value == null) {
        unsetFilesize();
      } else {
        setFilesize((String)value);
      }
      break;

    case LAST_MODIFIED:
      if (value == null) {
        unsetLastModified();
      } else {
        setLastModified((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILENAME:
      return getFilename();

    case FILESIZE:
      return getFilesize();

    case LAST_MODIFIED:
      return getLastModified();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILENAME:
      return isSetFilename();
    case FILESIZE:
      return isSetFilesize();
    case LAST_MODIFIED:
      return isSetLastModified();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FileInfo)
      return this.equals((FileInfo)that);
    return false;
  }

  public boolean equals(FileInfo that) {
    if (that == null)
      return false;

    boolean this_present_filename = true && this.isSetFilename();
    boolean that_present_filename = true && that.isSetFilename();
    if (this_present_filename || that_present_filename) {
      if (!(this_present_filename && that_present_filename))
        return false;
      if (!this.filename.equals(that.filename))
        return false;
    }

    boolean this_present_filesize = true && this.isSetFilesize();
    boolean that_present_filesize = true && that.isSetFilesize();
    if (this_present_filesize || that_present_filesize) {
      if (!(this_present_filesize && that_present_filesize))
        return false;
      if (!this.filesize.equals(that.filesize))
        return false;
    }

    boolean this_present_lastModified = true && this.isSetLastModified();
    boolean that_present_lastModified = true && that.isSetLastModified();
    if (this_present_lastModified || that_present_lastModified) {
      if (!(this_present_lastModified && that_present_lastModified))
        return false;
      if (!this.lastModified.equals(that.lastModified))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_filename = true && (isSetFilename());
    list.add(present_filename);
    if (present_filename)
      list.add(filename);

    boolean present_filesize = true && (isSetFilesize());
    list.add(present_filesize);
    if (present_filesize)
      list.add(filesize);

    boolean present_lastModified = true && (isSetLastModified());
    list.add(present_lastModified);
    if (present_lastModified)
      list.add(lastModified);

    return list.hashCode();
  }

  @Override
  public int compareTo(FileInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFilename()).compareTo(other.isSetFilename());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilename()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filename, other.filename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFilesize()).compareTo(other.isSetFilesize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilesize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filesize, other.filesize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastModified()).compareTo(other.isSetLastModified());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastModified()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastModified, other.lastModified);
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
    StringBuilder sb = new StringBuilder("FileInfo(");
    boolean first = true;

    sb.append("filename:");
    if (this.filename == null) {
      sb.append("null");
    } else {
      sb.append(this.filename);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("filesize:");
    if (this.filesize == null) {
      sb.append("null");
    } else {
      sb.append(this.filesize);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastModified:");
    if (this.lastModified == null) {
      sb.append("null");
    } else {
      sb.append(this.lastModified);
    }
    first = false;
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

  private static class FileInfoStandardSchemeFactory implements SchemeFactory {
    public FileInfoStandardScheme getScheme() {
      return new FileInfoStandardScheme();
    }
  }

  private static class FileInfoStandardScheme extends StandardScheme<FileInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FileInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.filename = iprot.readString();
              struct.setFilenameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FILESIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.filesize = iprot.readString();
              struct.setFilesizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_MODIFIED
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lastModified = iprot.readString();
              struct.setLastModifiedIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FileInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.filename != null) {
        oprot.writeFieldBegin(FILENAME_FIELD_DESC);
        oprot.writeString(struct.filename);
        oprot.writeFieldEnd();
      }
      if (struct.filesize != null) {
        oprot.writeFieldBegin(FILESIZE_FIELD_DESC);
        oprot.writeString(struct.filesize);
        oprot.writeFieldEnd();
      }
      if (struct.lastModified != null) {
        oprot.writeFieldBegin(LAST_MODIFIED_FIELD_DESC);
        oprot.writeString(struct.lastModified);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FileInfoTupleSchemeFactory implements SchemeFactory {
    public FileInfoTupleScheme getScheme() {
      return new FileInfoTupleScheme();
    }
  }

  private static class FileInfoTupleScheme extends TupleScheme<FileInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FileInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFilename()) {
        optionals.set(0);
      }
      if (struct.isSetFilesize()) {
        optionals.set(1);
      }
      if (struct.isSetLastModified()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetFilename()) {
        oprot.writeString(struct.filename);
      }
      if (struct.isSetFilesize()) {
        oprot.writeString(struct.filesize);
      }
      if (struct.isSetLastModified()) {
        oprot.writeString(struct.lastModified);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FileInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.filename = iprot.readString();
        struct.setFilenameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.filesize = iprot.readString();
        struct.setFilesizeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastModified = iprot.readString();
        struct.setLastModifiedIsSet(true);
      }
    }
  }

}

