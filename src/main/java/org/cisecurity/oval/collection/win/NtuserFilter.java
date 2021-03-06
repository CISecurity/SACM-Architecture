//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.21 at 11:38:45 AM EST 
//


package org.cisecurity.oval.collection.win;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.cisecurity.oval.collection.FilterAnySimpleType;
import org.cisecurity.oval.collection.FilterBoolType;
import org.cisecurity.oval.collection.FilterIntType;
import org.cisecurity.oval.collection.FilterStringType;
import org.cisecurity.oval.collection.FilterType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="sid" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="username" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="account_type" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterNTUserAccountTypeType" minOccurs="0"/>
 *         &lt;element name="logged_on" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="date_modified" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterIntType" minOccurs="0"/>
 *         &lt;element name="days_since_modified" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterIntType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="last_write_time" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterIntType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterRegistryTypeType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterAnySimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "key",
    "name",
    "sid",
    "username",
    "accountType",
    "loggedOn",
    "enabled",
    "dateModified",
    "daysSinceModified",
    "filepath",
    "lastWriteTime",
    "type",
    "value"
})
public class NtuserFilter
    extends FilterType
{

    protected FilterStringType key;
    protected FilterStringType name;
    protected FilterStringType sid;
    protected FilterStringType username;
    @XmlElement(name = "account_type")
    protected FilterNTUserAccountTypeType accountType;
    @XmlElement(name = "logged_on")
    protected FilterBoolType loggedOn;
    protected FilterBoolType enabled;
    @XmlElement(name = "date_modified")
    protected FilterIntType dateModified;
    @XmlElement(name = "days_since_modified")
    protected FilterIntType daysSinceModified;
    protected FilterStringType filepath;
    @XmlElement(name = "last_write_time")
    protected FilterIntType lastWriteTime;
    protected FilterRegistryTypeType type;
    protected FilterAnySimpleType value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setKey(FilterStringType value) {
        this.key = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setName(FilterStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setSid(FilterStringType value) {
        this.sid = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setUsername(FilterStringType value) {
        this.username = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link FilterNTUserAccountTypeType }
     *     
     */
    public FilterNTUserAccountTypeType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterNTUserAccountTypeType }
     *     
     */
    public void setAccountType(FilterNTUserAccountTypeType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the loggedOn property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getLoggedOn() {
        return loggedOn;
    }

    /**
     * Sets the value of the loggedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setLoggedOn(FilterBoolType value) {
        this.loggedOn = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setEnabled(FilterBoolType value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the dateModified property.
     * 
     * @return
     *     possible object is
     *     {@link FilterIntType }
     *     
     */
    public FilterIntType getDateModified() {
        return dateModified;
    }

    /**
     * Sets the value of the dateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterIntType }
     *     
     */
    public void setDateModified(FilterIntType value) {
        this.dateModified = value;
    }

    /**
     * Gets the value of the daysSinceModified property.
     * 
     * @return
     *     possible object is
     *     {@link FilterIntType }
     *     
     */
    public FilterIntType getDaysSinceModified() {
        return daysSinceModified;
    }

    /**
     * Sets the value of the daysSinceModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterIntType }
     *     
     */
    public void setDaysSinceModified(FilterIntType value) {
        this.daysSinceModified = value;
    }

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setFilepath(FilterStringType value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the lastWriteTime property.
     * 
     * @return
     *     possible object is
     *     {@link FilterIntType }
     *     
     */
    public FilterIntType getLastWriteTime() {
        return lastWriteTime;
    }

    /**
     * Sets the value of the lastWriteTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterIntType }
     *     
     */
    public void setLastWriteTime(FilterIntType value) {
        this.lastWriteTime = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FilterRegistryTypeType }
     *     
     */
    public FilterRegistryTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterRegistryTypeType }
     *     
     */
    public void setType(FilterRegistryTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAnySimpleType }
     *     
     */
    public FilterAnySimpleType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAnySimpleType }
     *     
     */
    public void setValue(FilterAnySimpleType value) {
        this.value = value;
    }

}
