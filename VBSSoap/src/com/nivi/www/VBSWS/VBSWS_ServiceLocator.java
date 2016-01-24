/**
 * VBSWS_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nivi.www.VBSWS;

public class VBSWS_ServiceLocator extends org.apache.axis.client.Service implements com.nivi.www.VBSWS.VBSWS_Service {

    public VBSWS_ServiceLocator() {
    }


    public VBSWS_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VBSWS_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VBSPort
    private java.lang.String VBSPort_address = "http://localhost:8080/QE/services/VBSPort";

    public java.lang.String getVBSPortAddress() {
        return VBSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VBSPortWSDDServiceName = "VBSPort";

    public java.lang.String getVBSPortWSDDServiceName() {
        return VBSPortWSDDServiceName;
    }

    public void setVBSPortWSDDServiceName(java.lang.String name) {
        VBSPortWSDDServiceName = name;
    }

    public com.nivi.www.VBSWS.VBSWS_PortType getVBSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VBSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVBSPort(endpoint);
    }

    public com.nivi.www.VBSWS.VBSWS_PortType getVBSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.nivi.www.VBSWS.VBSSOAPStub _stub = new com.nivi.www.VBSWS.VBSSOAPStub(portAddress, this);
            _stub.setPortName(getVBSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVBSPortEndpointAddress(java.lang.String address) {
        VBSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.nivi.www.VBSWS.VBSWS_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.nivi.www.VBSWS.VBSSOAPStub _stub = new com.nivi.www.VBSWS.VBSSOAPStub(new java.net.URL(VBSPort_address), this);
                _stub.setPortName(getVBSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("VBSPort".equals(inputPortName)) {
            return getVBSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.nivi.com/VBSWS/", "VBSWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.nivi.com/VBSWS/", "VBSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VBSPort".equals(portName)) {
            setVBSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
