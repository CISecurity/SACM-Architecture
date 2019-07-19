//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.16 at 04:00:30 PM EDT 
//


package org.cisecurity.oval.sc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The CollectedItemBoolType type is extended by the entities of an individual item. This type provides uniformity to each entity by including the attributes found in the CollectedItemSimpleBaseType. This specific type describes simple boolean data. The empty string is also allowed for cases where there was an error in the data collection of an entity and a status needs to be reported.
 * 
 * <p>Java class for CollectedItemBoolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectedItemBoolType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6>CollectedItemSimpleBaseType">
 *       &lt;attribute name="datatype" use="required" type="{http://oval.cisecurity.org/XMLSchema/oval-common-6}SimpleDatatypeEnumeration" fixed="boolean" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectedItemBoolType")
public class CollectedItemBoolType
    extends CollectedItemSimpleBaseType
{


}