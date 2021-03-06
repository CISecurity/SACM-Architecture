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
import org.cisecurity.oval.collection.FilterIPAddressStringType;
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
 *         &lt;element name="name" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="index" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterIntType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterInterfaceTypeType" minOccurs="0"/>
 *         &lt;element name="hardware_addr" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="inet_addr" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="broadcast_addr" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="netmask" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="addr_type" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAddrTypeType" minOccurs="0"/>
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
    "name",
    "index",
    "type",
    "hardwareAddr",
    "inetAddr",
    "broadcastAddr",
    "netmask",
    "addrType"
})
public class InterfaceFilter
    extends FilterType
{

    protected FilterStringType name;
    protected FilterIntType index;
    protected FilterInterfaceTypeType type;
    @XmlElement(name = "hardware_addr")
    protected FilterStringType hardwareAddr;
    @XmlElement(name = "inet_addr")
    protected FilterIPAddressStringType inetAddr;
    @XmlElement(name = "broadcast_addr")
    protected FilterIPAddressStringType broadcastAddr;
    protected FilterIPAddressStringType netmask;
    @XmlElement(name = "addr_type")
    protected FilterAddrTypeType addrType;

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
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link FilterIntType }
     *     
     */
    public FilterIntType getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterIntType }
     *     
     */
    public void setIndex(FilterIntType value) {
        this.index = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FilterInterfaceTypeType }
     *     
     */
    public FilterInterfaceTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterInterfaceTypeType }
     *     
     */
    public void setType(FilterInterfaceTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the hardwareAddr property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getHardwareAddr() {
        return hardwareAddr;
    }

    /**
     * Sets the value of the hardwareAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setHardwareAddr(FilterStringType value) {
        this.hardwareAddr = value;
    }

    /**
     * Gets the value of the inetAddr property.
     * 
     * @return
     *     possible object is
     *     {@link FilterIPAddressStringType }
     *     
     */
    public FilterIPAddressStringType getInetAddr() {
        return inetAddr;
    }

    /**
     * Sets the value of the inetAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterIPAddressStringType }
     *     
     */
    public void setInetAddr(FilterIPAddressStringType value) {
        this.inetAddr = value;
    }

    /**
     * Gets the value of the broadcastAddr property.
     * 
     * @return
     *     possible object is
     *     {@link FilterIPAddressStringType }
     *     
     */
    public FilterIPAddressStringType getBroadcastAddr() {
        return broadcastAddr;
    }

    /**
     * Sets the value of the broadcastAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterIPAddressStringType }
     *     
     */
    public void setBroadcastAddr(FilterIPAddressStringType value) {
        this.broadcastAddr = value;
    }

    /**
     * Gets the value of the netmask property.
     * 
     * @return
     *     possible object is
     *     {@link FilterIPAddressStringType }
     *     
     */
    public FilterIPAddressStringType getNetmask() {
        return netmask;
    }

    /**
     * Sets the value of the netmask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterIPAddressStringType }
     *     
     */
    public void setNetmask(FilterIPAddressStringType value) {
        this.netmask = value;
    }

    /**
     * Gets the value of the addrType property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAddrTypeType }
     *     
     */
    public FilterAddrTypeType getAddrType() {
        return addrType;
    }

    /**
     * Sets the value of the addrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAddrTypeType }
     *     
     */
    public void setAddrType(FilterAddrTypeType value) {
        this.addrType = value;
    }

}
