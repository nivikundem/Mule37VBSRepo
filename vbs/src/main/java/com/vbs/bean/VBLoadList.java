package com.vbs.bean;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "VBLoadList")
public class VBLoadList {	

	private List<VB> vbList;

	@XmlElement(name = "VB")   
	public List<VB> getVbList() {
		return vbList;
	}

	public void setVbList(List<VB> vbList) {
		this.vbList = vbList;
	}	
	
}
