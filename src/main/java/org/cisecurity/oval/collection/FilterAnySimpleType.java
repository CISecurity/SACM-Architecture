//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.05 at 06:06:45 PM EDT 
//


package org.cisecurity.oval.collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.cisecurity.oval.common.EntitySimpleBaseType;


/**
 * The objectAnySimpleType type is extended by the entities of an individual OVAL Object. This type provides uniformity to each object entity by including the attributes found in the EntitySimpleBaseType. This specific type describes any simple data.
 * 
 * <p>Java class for FilterAnySimpleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterAnySimpleType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.cisecurity.org/XMLSchema/oval-common-6>EntitySimpleBaseType">
 *       &lt;attribute name="datatype" type="{http://oval.cisecurity.org/XMLSchema/oval-common-6}SimpleDatatypeEnumeration" default="string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterAnySimpleType")
public class FilterAnySimpleType
    extends EntitySimpleBaseType
{


}
