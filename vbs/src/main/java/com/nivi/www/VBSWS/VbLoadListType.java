
package com.nivi.www.VBSWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vbLoadListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vbLoadListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VB" type="{http://www.nivi.com/VBSWS/}vbType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vbLoadListType", propOrder = {
    "vb"
})
public class VbLoadListType {

    @XmlElement(name = "VB", required = true)
    protected VbType vb;

    /**
     * Gets the value of the vb property.
     * 
     * @return
     *     possible object is
     *     {@link VbType }
     *     
     */
    public VbType getVB() {
        return vb;
    }

    /**
     * Sets the value of the vb property.
     * 
     * @param value
     *     allowed object is
     *     {@link VbType }
     *     
     */
    public void setVB(VbType value) {
        this.vb = value;
    }

}
