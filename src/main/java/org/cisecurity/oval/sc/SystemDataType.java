//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.16 at 04:00:30 PM EDT 
//


package org.cisecurity.oval.sc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * The SystemDataType complex type is a container for one or more item elements. Each item defines a specific piece of data on the system.
 * 
 * <p>Java class for SystemDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}collected_item" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemDataType", propOrder = {
    "collectedItem"
})
public class SystemDataType {

    //@XmlElement(name = "collected_item", required = true)
    @XmlAnyElement(lax = true)
    //@XmlElementRef
    protected List<CollectedItemType> collectedItem;

    /**
     * Gets the value of the collectedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectedItemType }
     * 
     * 
     */
    public List<CollectedItemType> getCollectedItem() {
        if (collectedItem == null) {
            collectedItem = new ArrayList<CollectedItemType>();
        }
        return this.collectedItem;
    }

}
