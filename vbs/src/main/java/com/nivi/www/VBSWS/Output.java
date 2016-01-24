
package com.nivi.www.VBSWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for output complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="output">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vbsDetailsResponse" type="{http://www.nivi.com/VBSWS/}vbsDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "output", propOrder = {
    "vbsDetailsResponse"
})
public class Output {

    protected VbsDetailsType vbsDetailsResponse;

    /**
     * Gets the value of the vbsDetailsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link VbsDetailsType }
     *     
     */
    public VbsDetailsType getVbsDetailsResponse() {
        return vbsDetailsResponse;
    }

    /**
     * Sets the value of the vbsDetailsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link VbsDetailsType }
     *     
     */
    public void setVbsDetailsResponse(VbsDetailsType value) {
        this.vbsDetailsResponse = value;
    }

}
