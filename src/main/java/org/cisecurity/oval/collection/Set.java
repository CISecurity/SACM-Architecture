//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.16 at 01:40:48 PM EDT 
//


package org.cisecurity.oval.collection;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}set" maxOccurs="2"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="Object_reference" type="{http://oval.cisecurity.org/XMLSchema/oval-common-6}ObjectIDPattern" maxOccurs="2"/>
 *           &lt;element ref="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}filter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attribute name="set_operator" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}SetOperatorEnumeration" default="UNION" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "set",
    "objectReference",
    "filter"
})
@XmlRootElement(name = "set")
public class Set {

    protected List<Set> set;
    @XmlElement(name = "Object_reference")
    protected List<String> objectReference;
    protected List<FilterType> filter;
    @XmlAttribute(name = "set_operator")
    protected SetOperatorEnumeration setOperator;

    /**
     * Gets the value of the set property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the set property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Set }
     * 
     * 
     */
    public List<Set> getSet() {
        if (set == null) {
            set = new ArrayList<Set>();
        }
        return this.set;
    }

    /**
     * Gets the value of the objectReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectReference() {
        if (objectReference == null) {
            objectReference = new ArrayList<String>();
        }
        return this.objectReference;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getFilter() {
        if (filter == null) {
            filter = new ArrayList<FilterType>();
        }
        return this.filter;
    }

    /**
     * Gets the value of the setOperator property.
     * 
     * @return
     *     possible object is
     *     {@link SetOperatorEnumeration }
     *     
     */
    public SetOperatorEnumeration getSetOperator() {
        if (setOperator == null) {
            return SetOperatorEnumeration.UNION;
        } else {
            return setOperator;
        }
    }

    /**
     * Sets the value of the setOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOperatorEnumeration }
     *     
     */
    public void setSetOperator(SetOperatorEnumeration value) {
        this.setOperator = value;
    }

}
