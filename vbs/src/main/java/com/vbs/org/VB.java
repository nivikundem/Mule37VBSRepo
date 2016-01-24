//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.11 at 12:07:16 PM GMT 
//


package com.vbs.org;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}VRN"/>
 *         &lt;element ref="{}DateBooked"/>
 *         &lt;element ref="{}TimeBooked"/>
 *         &lt;element ref="{}Amount"/>
 *         &lt;element ref="{}Source"/>
 *         &lt;element ref="{}Target"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VBR" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vrn",
    "dateBooked",
    "timeBooked",
    "amount",
    "source",
    "target"
})
@XmlRootElement(name = "VB")
public class VB {

    @XmlElement(name = "VRN", required = true)
    protected String vrn;
    @XmlElement(name = "DateBooked", required = true)
    protected String dateBooked;
    @XmlElement(name = "TimeBooked", required = true)
    protected String timeBooked;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Source", required = true)
    protected String source;
    @XmlElement(name = "Target", required = true)
    protected String target;
    @XmlAttribute(name = "VBR", required = true)
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
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
