//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.25 at 03:24:21 PM EST 
//


package org.cisecurity.csat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;choice>
 *         &lt;element ref="{http://cisecurity.org/csat}valid"/>
 *         &lt;element ref="{http://cisecurity.org/csat}invalid"/>
 *       &lt;/choice>
 *       &lt;attribute name="license-key" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "valid",
    "invalid"
})
@XmlRootElement(name = "validation")
public class Validation {

    protected Valid valid;
    protected Invalid invalid;
    @XmlAttribute(name = "license-key", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String licenseKey;

    /**
     * Gets the value of the valid property.
     * 
     * @return
     *     possible object is
     *     {@link Valid }
     *     
     */
    public Valid getValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Valid }
     *     
     */
    public void setValid(Valid value) {
        this.valid = value;
    }

    /**
     * Gets the value of the invalid property.
     * 
     * @return
     *     possible object is
     *     {@link Invalid }
     *     
     */
    public Invalid getInvalid() {
        return invalid;
    }

    /**
     * Sets the value of the invalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invalid }
     *     
     */
    public void setInvalid(Invalid value) {
        this.invalid = value;
    }

    /**
     * Gets the value of the licenseKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseKey() {
        return licenseKey;
    }

    /**
     * Sets the value of the licenseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseKey(String value) {
        this.licenseKey = value;
    }

}