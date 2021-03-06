//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.05 at 06:06:45 PM EDT 
//


package org.cisecurity.oval.collection;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.cisecurity.oval.common.EntityComplexBaseType;


/**
 * Note that when the mask attribute is set to 'true', all child field elements must be masked regardless of the child field's mask attribute value.
 * 
 * <p>Java class for ObjectRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.cisecurity.org/XMLSchema/oval-common-6}EntityComplexBaseType">
 *       &lt;sequence>
 *         &lt;element name="field" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}ObjectFieldType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectRecordType", propOrder = {
    "field"
})
public class ObjectRecordType
    extends EntityComplexBaseType
{

    protected List<ObjectFieldType> field;

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectFieldType }
     * 
     * 
     */
    public List<ObjectFieldType> getField() {
        if (field == null) {
            field = new ArrayList<ObjectFieldType>();
        }
        return this.field;
    }

}
