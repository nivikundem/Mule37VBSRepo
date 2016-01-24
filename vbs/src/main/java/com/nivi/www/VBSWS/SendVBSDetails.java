
package com.nivi.www.VBSWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VBLoad" type="{http://www.nivi.com/VBSWS/}vbLoadType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vbLoad"
})
@XmlRootElement(name = "sendVBSDetails")
public class SendVBSDetails {

    @XmlElement(name = "VBLoad", required = true)
    protected VbLoadType vbLoad;

    /**
     * Gets the value of the vbLoad property.
     * 
     * @return
     *     possible object is
     *     {@link VbLoadType }
     *     
     */
    public VbLoadType getVBLoad() {
        return vbLoad;
    }

    /**
     * Sets the value of the vbLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link VbLoadType }
     *     
     */
    public void setVBLoad(VbLoadType value) {
        this.vbLoad = value;
    }

}
