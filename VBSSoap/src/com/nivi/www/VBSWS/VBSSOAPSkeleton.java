/**
 * VBSSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nivi.www.VBSWS;

public class VBSSOAPSkeleton implements com.nivi.www.VBSWS.VBSWS_PortType, org.apache.axis.wsdl.Skeleton {
    private com.nivi.www.VBSWS.VBSWS_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "VBLoad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.nivi.com/VBSWS/", "vbLoadType"), com.nivi.www.VBSWS.VbLoadType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sendVBSDetails", _params, new javax.xml.namespace.QName("", "vbsDetailsResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.nivi.com/VBSWS/", "vbsDetailsType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.nivi.com/VBSWS/", "sendVBSDetails"));
        _oper.setSoapAction("urn:SendVBSDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sendVBSDetails") == null) {
            _myOperations.put("sendVBSDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sendVBSDetails")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getVBSDetails", _params, new javax.xml.namespace.QName("", "VBLoad"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.nivi.com/VBSWS/", "getDetailsType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.nivi.com/VBSWS/", "getVBSDetails"));
        _oper.setSoapAction("urn:GetVBSDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getVBSDetails") == null) {
            _myOperations.put("getVBSDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getVBSDetails")).add(_oper);
    }

    public VBSSOAPSkeleton() {
        this.impl = new com.nivi.www.VBSWS.VBSSOAPImpl();
    }

    public VBSSOAPSkeleton(com.nivi.www.VBSWS.VBSWS_PortType impl) {
        this.impl = impl;
    }
    public com.nivi.www.VBSWS.VbsDetailsType sendVBSDetails(com.nivi.www.VBSWS.VbLoadType VBLoad) throws java.rmi.RemoteException
    {
        com.nivi.www.VBSWS.VbsDetailsType ret = impl.sendVBSDetails(VBLoad);
        return ret;
    }

    public com.nivi.www.VBSWS.GetDetailsType getVBSDetails() throws java.rmi.RemoteException
    {
        com.nivi.www.VBSWS.GetDetailsType ret = impl.getVBSDetails();
        return ret;
    }

}
