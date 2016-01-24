
package com.nivi.www.VBSWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vbsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vbsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vbsDetailsType", propOrder = {
    "vrn",
    "status"
})
public class VbsDetailsType {

    @XmlElement(name = "VRN", required = true)
    protected String vrn;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the vrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRN() {
        return vrn;
    }

    /**
     * Sets the value of the vrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRN(String value) {
        this.vrn = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
