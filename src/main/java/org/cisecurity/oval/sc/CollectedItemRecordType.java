//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.16 at 04:00:30 PM EDT 
//


package org.cisecurity.oval.sc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Note that when the mask attribute is set to 'true', all child field elements must be masked regardless of the child field's mask attribute value.
 * 
 * <p>Java class for CollectedItemRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectedItemRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemComplexBaseType">
 *       &lt;sequence>
 *         &lt;element name="field" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemFieldType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectedItemRecordType", propOrder = {
    "field"
})
public class CollectedItemRecordType
    extends CollectedItemComplexBaseType
{

    protected List<CollectedItemFieldType> field;

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
     * {@link CollectedItemFieldType }
     * 
     * 
     */
    public List<CollectedItemFieldType> getField() {
        if (field == null) {
            field = new ArrayList<CollectedItemFieldType>();
        }
        return this.field;
    }

}
