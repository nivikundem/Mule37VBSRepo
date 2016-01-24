/**
 * VBSWS_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nivi.www.VBSWS;
// http://localhost:8080/VBSSoap/services/VBSPort?WSDL

public interface VBSWS_Service extends javax.xml.rpc.Service {
    public java.lang.String getVBSPortAddress();

    public com.nivi.www.VBSWS.VBSWS_PortType getVBSPort() throws javax.xml.rpc.ServiceException;

    public com.nivi.www.VBSWS.VBSWS_PortType getVBSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
