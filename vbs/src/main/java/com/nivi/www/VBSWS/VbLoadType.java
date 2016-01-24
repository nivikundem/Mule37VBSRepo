
package com.nivi.www.VBSWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vbLoadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vbLoadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateGenerated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VBLoadList" type="{http://www.nivi.com/VBSWS/}vbLoadListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vbLoadType", propOrder = {
    "dateGenerated",
    "vbLoadList"
})
public class VbLoadType {

    @XmlElement(name = "DateGenerated", required = true)
    protected String dateGenerated;
    @XmlElement(name = "VBLoadList", required = true)
    protected VbLoadListType vbLoadList;

    /**
     * Gets the value of the dateGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateGenerated() {
        return dateGenerated;
    }

    /**
     * Sets the value of the dateGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateGenerated(String value) {
        this.dateGenerated = value;
    }

    /**
     * Gets the value of the vbLoadList property.
     * 
     * @return
     *     possible object is
     *     {@link VbLoadListType }
     *     
     */
    public VbLoadListType getVBLoadList() {
        return vbLoadList;
    }

    /**
     * Sets the value of the vbLoadList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VbLoadListType }
     *     
     */
    public void setVBLoadList(VbLoadListType value) {
        this.vbLoadList = value;
    }

}
