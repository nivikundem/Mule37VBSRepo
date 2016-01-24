/**
 * VbType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nivi.www.VBSWS;

public class VbType  implements java.io.Serializable {
    private java.lang.String VRN;

    private java.lang.String dateBooked;

    private java.lang.String timeBooked;

    private java.lang.String amount;

    private java.lang.String source;

    private java.lang.String target;

    private java.lang.String VBR;  // attribute

    public VbType() {
    }

    public VbType(
           java.lang.String VRN,
           java.lang.String dateBooked,
           java.lang.String timeBooked,
           java.lang.String amount,
           java.lang.String source,
           java.lang.String target,
           java.lang.String VBR) {
           this.VRN = VRN;
           this.dateBooked = dateBooked;
           this.timeBooked = timeBooked;
           this.amount = amount;
           this.source = source;
           this.target = target;
           this.VBR = VBR;
    }


    /**
     * Gets the VRN value for this VbType.
     * 
     * @return VRN
     */
    public java.lang.String getVRN() {
        return VRN;
    }


    /**
     * Sets the VRN value for this VbType.
     * 
     * @param VRN
     */
    public void setVRN(java.lang.String VRN) {
        this.VRN = VRN;
    }


    /**
     * Gets the dateBooked value for this VbType.
     * 
     * @return dateBooked
     */
    public java.lang.String getDateBooked() {
        return dateBooked;
    }


    /**
     * Sets the dateBooked value for this VbType.
     * 
     * @param dateBooked
     */
    public void setDateBooked(java.lang.String dateBooked) {
        this.dateBooked = dateBooked;
    }


    /**
     * Gets the timeBooked value for this VbType.
     * 
     * @return timeBooked
     */
    public java.lang.String getTimeBooked() {
        return timeBooked;
    }


    /**
     * Sets the timeBooked value for this VbType.
     * 
     * @param timeBooked
     */
    public void setTimeBooked(java.lang.String timeBooked) {
        this.timeBooked = timeBooked;
    }


    /**
     * Gets the amount value for this VbType.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this VbType.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the source value for this VbType.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this VbType.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the target value for this VbType.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this VbType.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the VBR value for this VbType.
     * 
     * @return VBR
     */
    public java.lang.String getVBR() {
        return VBR;
    }


    /**
     * Sets the VBR value for this VbType.
     * 
     * @param VBR
     */
    public void setVBR(java.lang.String VBR) {
        this.VBR = VBR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VbType)) return false;
        VbType other = (VbType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VRN==null && other.getVRN()==null) || 
             (this.VRN!=null &&
              this.VRN.equals(other.getVRN()))) &&
            ((this.dateBooked==null && other.getDateBooked()==null) || 
             (this.dateBooked!=null &&
              this.dateBooked.equals(other.getDateBooked()))) &&
            ((this.timeBooked==null && other.getTimeBooked()==null) || 
             (this.timeBooked!=null &&
              this.timeBooked.equals(other.getTimeBooked()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.VBR==null && other.getVBR()==null) || 
             (this.VBR!=null &&
              this.VBR.equals(other.getVBR())));
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
        if (getVRN() != null) {
            _hashCode += getVRN().hashCode();
        }
        if (getDateBooked() != null) {
            _hashCode += getDateBooked().hashCode();
        }
        if (getTimeBooked() != null) {
            _hashCode += getTimeBooked().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getVBR() != null) {
            _hashCode += getVBR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VbType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nivi.com/VBSWS/", "vbType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("VBR");
        attrField.setXmlName(new javax.xml.namespace.QName("", "VBR"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VRN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateBooked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateBooked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeBooked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TimeBooked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
