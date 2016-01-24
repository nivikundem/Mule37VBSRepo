package com.nivi.www.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "VBLoad")
public class VBLoad {
	
	
	private VBLoadList vbLoadList;
	private String dateGenerated;	
	
	@XmlElement(name = "DateGenerated")   
	public String getDateGenerated() {
		return dateGenerated;
	}
	public void setDateGenerated(String dateGenerated) {
		this.dateGenerated = dateGenerated;
	}
	
	
	@XmlElement(name = "VBLoadList")
	public VBLoadList getVbLoadList() {
		return vbLoadList;
	}
	public void setVbLoadList(VBLoadList vbLoadList) {
		this.vbLoadList = vbLoadList;
	}
	
	
}
