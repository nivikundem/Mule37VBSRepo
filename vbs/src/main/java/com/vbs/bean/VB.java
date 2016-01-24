package com.vbs.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "VB")
public class VB {
	
	private String vbr;
    private String VRN;
    private String DateBooked;
    private String TimeBooked;
    private String Amount;
    
    @XmlElement(name = "VBR")
	public String getVbr() {
		return vbr;
	}
	public void setVbr(String vbr) {
		this.vbr = vbr;
	}
	
	 @XmlElement(name = "VRN")
	public String getVRN() {
		return VRN;
	}
	public void setVRN(String vRN) {
		VRN = vRN;
	}
	
	 @XmlElement(name = "DateBooked")
	public String getDateBooked() {
		return DateBooked;
	}
	public void setDateBooked(String dateBooked) {
		DateBooked = dateBooked;
	}
	
	@XmlElement(name = "TimeBooked")
	public String getTimeBooked() {
		return TimeBooked;
	}
	public void setTimeBooked(String timeBooked) {
		TimeBooked = timeBooked;
	}
	
	 @XmlElement(name = "Amount")
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
    
   
	
    
    
   
}
