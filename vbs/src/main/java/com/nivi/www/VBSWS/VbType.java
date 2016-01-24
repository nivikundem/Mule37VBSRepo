
package com.nivi.www.VBSWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vbType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vbType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DateBooked" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TimeBooked" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Target" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VBR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vbType", propOrder = {
    "vrn",
    "dateBooked",
    "timeBooked",
    "amount",
    "source",
    "target"
})
public class VbType {

    @XmlElement(name = "VRN", required = true)
    protected String vrn;
    @XmlElement(name = "DateBooked", required = true)
    protected String dateBooked;
    @XmlElement(name = "TimeBooked", required = true)
    protected String timeBooked;
    @XmlElement(name = "Amount", required = true)
    protected String amount;
    @XmlElement(name = "Source", required = true)
    protected String source;
    @XmlElement(name = "Target", required = true)
    protected String target;
    @XmlAttribute(name = "VBR")
    protected String vbr;

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
     * Gets the value of the dateBooked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateBooked() {
        return dateBooked;
    }

    /**
     * Sets the value of the dateBooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateBooked(String value) {
        this.dateBooked = value;
    }

    /**
     * Gets the value of the timeBooked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeBooked() {
        return timeBooked;
    }

    /**
     * Sets the value of the timeBooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeBooked(String value) {
        this.timeBooked = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the vbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVBR() {
        return vbr;
    }

    /**
     * Sets the value of the vbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVBR(String value) {
        this.vbr = value;
    }

}
