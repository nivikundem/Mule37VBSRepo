/**
 * VbLoadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nivi.www.VBSWS;

public class VbLoadType  implements java.io.Serializable {
    private java.lang.String dateGenerated;

    private com.nivi.www.VBSWS.VbLoadListType VBLoadList;

    public VbLoadType() {
    }

    public VbLoadType(
           java.lang.String dateGenerated,
           com.nivi.www.VBSWS.VbLoadListType VBLoadList) {
           this.dateGenerated = dateGenerated;
           this.VBLoadList = VBLoadList;
    }


    /**
     * Gets the dateGenerated value for this VbLoadType.
     * 
     * @return dateGenerated
     */
    public java.lang.String getDateGenerated() {
        return dateGenerated;
    }


    /**
     * Sets the dateGenerated value for this VbLoadType.
     * 
     * @param dateGenerated
     */
    public void setDateGenerated(java.lang.String dateGenerated) {
        this.dateGenerated = dateGenerated;
    }


    /**
     * Gets the VBLoadList value for this VbLoadType.
     * 
     * @return VBLoadList
     */
    public com.nivi.www.VBSWS.VbLoadListType getVBLoadList() {
        return VBLoadList;
    }


    /**
     * Sets the VBLoadList value for this VbLoadType.
     * 
     * @param VBLoadList
     */
    public void setVBLoadList(com.nivi.www.VBSWS.VbLoadListType VBLoadList) {
        this.VBLoadList = VBLoadList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VbLoadType)) return false;
        VbLoadType other = (VbLoadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateGenerated==null && other.getDateGenerated()==null) || 
             (this.dateGenerated!=null &&
              this.dateGenerated.equals(other.getDateGenerated()))) &&
            ((this.VBLoadList==null && other.getVBLoadList()==null) || 
             (this.VBLoadList!=null &&
              this.VBLoadList.equals(other.getVBLoadList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDateGenerated() != null) {
            _hashCode += getDateGenerated().hashCode();
        }
        if (getVBLoadList() != null) {
            _hashCode += getVBLoadList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VbLoadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nivi.com/VBSWS/", "vbLoadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateGenerated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateGenerated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VBLoadList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VBLoadList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nivi.com/VBSWS/", "vbLoadListType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
