//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.20 at 09:27:07 AM EDT 
//


package org.cisecurity.oval.sc.ind;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

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
 *         &lt;element name="suffix" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" minOccurs="0"/>
 *         &lt;element name="relative_dn" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" minOccurs="0"/>
 *         &lt;element name="object_class" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" minOccurs="0"/>
 *         &lt;element name="ldaptype" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent}EntityItemLdaptypeType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemAnySimpleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ldap_item")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "suffix",
    "relativeDn",
    "attribute",
    "objectClass",
    "ldaptype",
    "value"
})
public class LdapItem
    extends CollectedItemType
{

    protected CollectedItemStringType suffix;
    @XmlElementRef(name = "relative_dn", namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", type = JAXBElement.class, required = false)
    protected JAXBElement<CollectedItemStringType> relativeDn;
    @XmlElementRef(name = "attribute", namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", type = JAXBElement.class, required = false)
    protected JAXBElement<CollectedItemStringType> attribute;
    @XmlElement(name = "object_class")
    protected CollectedItemStringType objectClass;
    protected EntityItemLdaptypeType ldaptype;
    protected List<CollectedItemAnySimpleType> value;

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemStringType }
     *     
     */
    public CollectedItemStringType getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemStringType }
     *     
     */
    public void setSuffix(CollectedItemStringType value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the relativeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollectedItemStringType }{@code >}
     *     
     */
    public JAXBElement<CollectedItemStringType> getRelativeDn() {
        return relativeDn;
    }

    /**
     * Sets the value of the relativeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollectedItemStringType }{@code >}
     *     
     */
    public void setRelativeDn(JAXBElement<CollectedItemStringType> value) {
        this.relativeDn = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollectedItemStringType }{@code >}
     *     
     */
    public JAXBElement<CollectedItemStringType> getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollectedItemStringType }{@code >}
     *     
     */
    public void setAttribute(JAXBElement<CollectedItemStringType> value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the objectClass property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemStringType }
     *     
     */
    public CollectedItemStringType getObjectClass() {
        return objectClass;
    }

    /**
     * Sets the value of the objectClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemStringType }
     *     
     */
    public void setObjectClass(CollectedItemStringType value) {
        this.objectClass = value;
    }

    /**
     * Gets the value of the ldaptype property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemLdaptypeType }
     *     
     */
    public EntityItemLdaptypeType getLdaptype() {
        return ldaptype;
    }

    /**
     * Sets the value of the ldaptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemLdaptypeType }
     *     
     */
    public void setLdaptype(EntityItemLdaptypeType value) {
        this.ldaptype = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectedItemAnySimpleType }
     * 
     * 
     */
    public List<CollectedItemAnySimpleType> getValue() {
        if (value == null) {
            value = new ArrayList<CollectedItemAnySimpleType>();
        }
        return this.value;
    }

}