//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.16 at 01:40:47 PM EDT 
//


package org.cisecurity.oval.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The VariableComponentType complex type defines a specific value obtained by looking at the value of another OVAL Variable. The required var_ref attribute provides a reference to the variable. One must make sure that the variable reference does not point to the parent variable that uses this component to avoid a race condition.
 * 
 * <p>Java class for VariableComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="var_ref" use="required" type="{http://oval.cisecurity.org/XMLSchema/oval-common-6}VariableIDPattern" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableComponentType")
public class VariableComponentType {

    @XmlAttribute(name = "var_ref", required = true)
    protected String varRef;

    /**
     * Gets the value of the varRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarRef() {
        return varRef;
    }

    /**
     * Sets the value of the varRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarRef(String value) {
        this.varRef = value;
    }

}
