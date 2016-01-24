/**
 * VBSSOAPImpl.java
 *  http://localhost:8080/VBSSoap/services/VBSPort?WSDL
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nivi.www.VBSWS;

public class VBSSOAPImpl implements com.nivi.www.VBSWS.VBSWS_PortType{
    public com.nivi.www.VBSWS.VbsDetailsType sendVBSDetails(com.nivi.www.VBSWS.VbLoadType VBLoad) throws java.rmi.RemoteException {
    	System.out.println("nivi");
    	VbsDetailsType vdt = new VbsDetailsType();
    	vdt.setStatus("Success");
    	vdt.setVRN(VBLoad.getVBLoadList().getVB().getVRN());
        return vdt;
    }

    public com.nivi.www.VBSWS.GetDetailsType getVBSDetails() throws java.rmi.RemoteException {
    	
    	
    	System.out.println("nivi2");
		GetDetailsType gdt = new GetDetailsType();
		
		gdt.setDateGenerated("07-01-2016");
		
		
	
		VbLoadListTypeIn vblltypein = new VbLoadListTypeIn();		
		VbTypeIn vtIn = new VbTypeIn();
		vtIn.setVBR("100");
		vtIn.setVRN("A100");
		vtIn.setAmount("100.00");
		vtIn.setDateBooked("01-01-2016");
		vtIn.setTimeBooked("20:00");
		
		vblltypein.setVB(vtIn);
		gdt.setVBLoadList(vblltypein);
        return gdt;
    }

}
