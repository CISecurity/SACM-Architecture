//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.16 at 01:40:48 PM EDT 
//


package org.cisecurity.oval.collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.cisecurity.oval.common.EntitySimpleBaseType;


/**
 * The EntityBinaryType type is extended by the entities of an individual OVAL Object. This type provides uniformity to each object entity by including the attributes found in the EntitySimpleBaseType. This specific type describes simple binary data. The empty string is also allowed when using a variable reference with an element.
 * 
 * <p>Java class for FilterBinaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterBinaryType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.cisecurity.org/XMLSchema/oval-common-6>EntitySimpleBaseType">
 *       &lt;attribute name="datatype" use="required" type="{http://oval.cisecurity.org/XMLSchema/oval-common-6}SimpleDatatypeEnumeration" fixed="binary" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterBinaryType")
public class FilterBinaryType
    extends EntitySimpleBaseType
{


}
