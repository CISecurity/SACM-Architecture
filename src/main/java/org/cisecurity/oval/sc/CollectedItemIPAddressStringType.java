//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.05 at 06:06:49 PM EDT 
//


package org.cisecurity.oval.sc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The CollectedItemIPAddressStringType type is extended by the entities of an individual item. This type provides uniformity to each entity by including the attributes found in the CollectedItemSimpleBaseType. This specific type describes any IPv4/IPv6 address, address prefix, or its string representation.
 * 
 * <p>Java class for CollectedItemIPAddressStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectedItemIPAddressStringType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6>CollectedItemSimpleBaseType">
 *       &lt;attribute name="datatype" default="string">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://oval.cisecurity.org/XMLSchema/oval-common-6}SimpleDatatypeEnumeration">
 *             &lt;enumeration value="ipv4_address"/>
 *             &lt;enumeration value="ipv6_address"/>
 *             &lt;enumeration value="string"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectedItemIPAddressStringType")
public class CollectedItemIPAddressStringType
    extends CollectedItemSimpleBaseType
{


}
