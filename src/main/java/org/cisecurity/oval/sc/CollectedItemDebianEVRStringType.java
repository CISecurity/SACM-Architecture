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
 * The CollectedItemDebianEVRStringType type is extended by the entities of an individual item. This type provides uniformity to each entity by including the attributes found in the CollectedItemSimpleBaseType. This type represents the epoch, upstream_version, and debian_revision fields, for a Debian package, as a single version string. It has the form "EPOCH:UPSTREAM_VERSION-DEBIAN_REVISION". Note that a null epoch (or '(none)' as returned by dpkg) is equivalent to '0' and would hence have the form 0:UPSTREAM_VERSION-DEBIAN_REVISION. Comparisons involving this datatype should follow the algorithm outlined in Chapter 5 of the "Debian Policy Manual" (https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-Version). An implementation of this is the cmpversions() function in dpkg's enquiry.c.
 * 
 * <p>Java class for CollectedItemDebianEVRStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectedItemDebianEVRStringType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6>CollectedItemSimpleBaseType">
 *       &lt;attribute name="datatype" use="required" type="{http://oval.cisecurity.org/XMLSchema/oval-common-6}SimpleDatatypeEnumeration" fixed="debian_evr_string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectedItemDebianEVRStringType")
public class CollectedItemDebianEVRStringType
    extends CollectedItemSimpleBaseType
{


}