package com.nivi.www.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "VBLoadStart")
public class VBLoadStart {
		
	private VBLoad vbLoad;

	@XmlElement(name = "VBLoad")  
	public VBLoad getVbLoad() {
		return vbLoad;
	}

	public void setVbLoad(VBLoad vbLoad) {
		this.vbLoad = vbLoad;
	}
	
}
