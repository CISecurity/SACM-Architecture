//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.20 at 09:27:07 AM EDT 
//


package org.cisecurity.oval.sc.ind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.cisecurity.oval.sc.CollectedItemAnySimpleType;
import org.cisecurity.oval.sc.CollectedItemStringType;
import org.cisecurity.oval.sc.CollectedItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemAnySimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "environmentvariable_item", namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "value"
})
public class EnvironmentvariableItem extends CollectedItemType {

    protected CollectedItemStringType name;
    protected CollectedItemAnySimpleType value;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemStringType }
     *     
     */
    public CollectedItemStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemStringType }
     *     
     */
    public void setName(CollectedItemStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemAnySimpleType }
     *     
     */
    public CollectedItemAnySimpleType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemAnySimpleType }
     *     
     */
    public void setValue(CollectedItemAnySimpleType value) {
        this.value = value;
    }

}
