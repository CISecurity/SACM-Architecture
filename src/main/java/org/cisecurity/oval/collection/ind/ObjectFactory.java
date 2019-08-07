//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.05 at 06:06:48 PM EDT 
//


package org.cisecurity.oval.collection.ind;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.cisecurity.oval.collection.FilterType;
import org.cisecurity.oval.collection.ObjectIntType;
import org.cisecurity.oval.collection.ObjectStringType;
import org.cisecurity.oval.collection.ObjectType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.cisecurity.oval.collection.ind package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnvironmentvariableFilter_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "environmentvariable_filter");
    private final static QName _XmlfilecontentObject_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "xmlfilecontent_object");
    private final static QName _ProcessenvironmentObject_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "processenvironment_object");
    private final static QName _TextfilecontentFilter_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "textfilecontent_filter");
    private final static QName _FilehashObject_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "filehash_object");
    private final static QName _SqlObject_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "sql_object");
//    private final static QName _Object_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6", "object");
    private final static QName _EnvironmentvariableObject_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "environmentvariable_object");
    private final static QName _LdapObject_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "ldap_object");
    private final static QName _FamilyObject_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "family_object");
    private final static QName _LdapFilter_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "ldap_filter");
    private final static QName _ProcessenvironmentFilter_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "processenvironment_filter");
    private final static QName _TextfilecontentObject_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "textfilecontent_object");
    private final static QName _XmlfilecontentFilter_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "xmlfilecontent_filter");
    private final static QName _FilehashFilter_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "filehash_filter");
    private final static QName _SqlFilter_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "sql_filter");
//    private final static QName _ItemFilter_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6", "item_filter");
    private final static QName _VariableFilter_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "variable_filter");
    private final static QName _VariableObject_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "variable_object");
    private final static QName _ProcessenvironmentObjectPid_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "pid");
    private final static QName _LdapObjectRelativeDn_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "relative_dn");
    private final static QName _LdapObjectAttribute_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", "attribute");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.cisecurity.oval.collection.ind
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessenvironmentFilter }
     * 
     */
    public ProcessenvironmentFilter createProcessenvironmentFilter() {
        return new ProcessenvironmentFilter();
    }

    /**
     * Create an instance of {@link TextfilecontentObject }
     * 
     */
    public TextfilecontentObject createTextfilecontentObject() {
        return new TextfilecontentObject();
    }

    /**
     * Create an instance of {@link XmlfilecontentFilter }
     * 
     */
    public XmlfilecontentFilter createXmlfilecontentFilter() {
        return new XmlfilecontentFilter();
    }

    /**
     * Create an instance of {@link FilehashFilter }
     * 
     */
    public FilehashFilter createFilehashFilter() {
        return new FilehashFilter();
    }

    /**
     * Create an instance of {@link SqlFilter }
     * 
     */
    public SqlFilter createSqlFilter() {
        return new SqlFilter();
    }

    /**
     * Create an instance of {@link LdapFilter }
     * 
     */
    public LdapFilter createLdapFilter() {
        return new LdapFilter();
    }

    /**
     * Create an instance of {@link VariableFilter }
     * 
     */
    public VariableFilter createVariableFilter() {
        return new VariableFilter();
    }

    /**
     * Create an instance of {@link VariableObject }
     * 
     */
    public VariableObject createVariableObject() {
        return new VariableObject();
    }

    /**
     * Create an instance of {@link XmlfilecontentObject }
     * 
     */
    public XmlfilecontentObject createXmlfilecontentObject() {
        return new XmlfilecontentObject();
    }

    /**
     * Create an instance of {@link ProcessenvironmentObject }
     * 
     */
    public ProcessenvironmentObject createProcessenvironmentObject() {
        return new ProcessenvironmentObject();
    }

    /**
     * Create an instance of {@link TextfilecontentFilter }
     * 
     */
    public TextfilecontentFilter createTextfilecontentFilter() {
        return new TextfilecontentFilter();
    }

    /**
     * Create an instance of {@link FilehashObject }
     * 
     */
    public FilehashObject createFilehashObject() {
        return new FilehashObject();
    }

    /**
     * Create an instance of {@link SqlObject }
     * 
     */
    public SqlObject createSqlObject() {
        return new SqlObject();
    }

    /**
     * Create an instance of {@link EnvironmentvariableFilter }
     * 
     */
    public EnvironmentvariableFilter createEnvironmentvariableFilter() {
        return new EnvironmentvariableFilter();
    }

    /**
     * Create an instance of {@link EnvironmentvariableObject }
     * 
     */
    public EnvironmentvariableObject createEnvironmentvariableObject() {
        return new EnvironmentvariableObject();
    }

    /**
     * Create an instance of {@link LdapObject }
     * 
     */
    public LdapObject createLdapObject() {
        return new LdapObject();
    }

    /**
     * Create an instance of {@link FamilyObject }
     * 
     */
    public FamilyObject createFamilyObject() {
        return new FamilyObject();
    }

    /**
     * Create an instance of {@link FilterEngineType }
     * 
     */
    public FilterEngineType createFilterEngineType() {
        return new FilterEngineType();
    }

    /**
     * Create an instance of {@link TextfilecontentBehaviors }
     * 
     */
    public TextfilecontentBehaviors createTextfilecontentBehaviors() {
        return new TextfilecontentBehaviors();
    }

    /**
     * Create an instance of {@link FilterLdaptypeType }
     * 
     */
    public FilterLdaptypeType createFilterLdaptypeType() {
        return new FilterLdaptypeType();
    }

    /**
     * Create an instance of {@link LdapBehaviors }
     * 
     */
    public LdapBehaviors createLdapBehaviors() {
        return new LdapBehaviors();
    }

    /**
     * Create an instance of {@link FilterHashTypeType }
     * 
     */
    public FilterHashTypeType createFilterHashTypeType() {
        return new FilterHashTypeType();
    }

    /**
     * Create an instance of {@link FileBehaviors }
     * 
     */
    public FileBehaviors createFileBehaviors() {
        return new FileBehaviors();
    }

    /**
     * Create an instance of {@link FilterWindowsViewType }
     * 
     */
    public FilterWindowsViewType createFilterWindowsViewType() {
        return new FilterWindowsViewType();
    }

    /**
     * Create an instance of {@link ObjectHashTypeType }
     * 
     */
    public ObjectHashTypeType createObjectHashTypeType() {
        return new ObjectHashTypeType();
    }

    /**
     * Create an instance of {@link ObjectVariableRefType }
     * 
     */
    public ObjectVariableRefType createObjectVariableRefType() {
        return new ObjectVariableRefType();
    }

    /**
     * Create an instance of {@link ObjectEngineType }
     * 
     */
    public ObjectEngineType createObjectEngineType() {
        return new ObjectEngineType();
    }

    /**
     * Create an instance of {@link FilterVariableRefType }
     * 
     */
    public FilterVariableRefType createFilterVariableRefType() {
        return new FilterVariableRefType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentvariableFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "environmentvariable_filter", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "item_filter")
    public JAXBElement<EnvironmentvariableFilter> createEnvironmentvariableFilter(EnvironmentvariableFilter value) {
        return new JAXBElement<EnvironmentvariableFilter>(_EnvironmentvariableFilter_QNAME, EnvironmentvariableFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlfilecontentObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "xmlfilecontent_object", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "object")
    public JAXBElement<XmlfilecontentObject> createXmlfilecontentObject(XmlfilecontentObject value) {
        return new JAXBElement<XmlfilecontentObject>(_XmlfilecontentObject_QNAME, XmlfilecontentObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessenvironmentObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "processenvironment_object", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "object")
    public JAXBElement<ProcessenvironmentObject> createProcessenvironmentObject(ProcessenvironmentObject value) {
        return new JAXBElement<ProcessenvironmentObject>(_ProcessenvironmentObject_QNAME, ProcessenvironmentObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextfilecontentFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "textfilecontent_filter", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "item_filter")
    public JAXBElement<TextfilecontentFilter> createTextfilecontentFilter(TextfilecontentFilter value) {
        return new JAXBElement<TextfilecontentFilter>(_TextfilecontentFilter_QNAME, TextfilecontentFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilehashObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "filehash_object", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "object")
    public JAXBElement<FilehashObject> createFilehashObject(FilehashObject value) {
        return new JAXBElement<FilehashObject>(_FilehashObject_QNAME, FilehashObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SqlObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "sql_object", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "object")
    public JAXBElement<SqlObject> createSqlObject(SqlObject value) {
        return new JAXBElement<SqlObject>(_SqlObject_QNAME, SqlObject.class, null, value);
    }

//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}}
//     *
//     */
//    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", name = "object")
//    public JAXBElement<ObjectType> createObject(ObjectType value) {
//        return new JAXBElement<ObjectType>(_Object_QNAME, ObjectType.class, null, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentvariableObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "environmentvariable_object", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "object")
    public JAXBElement<EnvironmentvariableObject> createEnvironmentvariableObject(EnvironmentvariableObject value) {
        return new JAXBElement<EnvironmentvariableObject>(_EnvironmentvariableObject_QNAME, EnvironmentvariableObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LdapObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "ldap_object", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "object")
    public JAXBElement<LdapObject> createLdapObject(LdapObject value) {
        return new JAXBElement<LdapObject>(_LdapObject_QNAME, LdapObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilyObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "family_object", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "object")
    public JAXBElement<FamilyObject> createFamilyObject(FamilyObject value) {
        return new JAXBElement<FamilyObject>(_FamilyObject_QNAME, FamilyObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LdapFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "ldap_filter", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "item_filter")
    public JAXBElement<LdapFilter> createLdapFilter(LdapFilter value) {
        return new JAXBElement<LdapFilter>(_LdapFilter_QNAME, LdapFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessenvironmentFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "processenvironment_filter", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "item_filter")
    public JAXBElement<ProcessenvironmentFilter> createProcessenvironmentFilter(ProcessenvironmentFilter value) {
        return new JAXBElement<ProcessenvironmentFilter>(_ProcessenvironmentFilter_QNAME, ProcessenvironmentFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextfilecontentObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "textfilecontent_object", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "object")
    public JAXBElement<TextfilecontentObject> createTextfilecontentObject(TextfilecontentObject value) {
        return new JAXBElement<TextfilecontentObject>(_TextfilecontentObject_QNAME, TextfilecontentObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlfilecontentFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "xmlfilecontent_filter", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "item_filter")
    public JAXBElement<XmlfilecontentFilter> createXmlfilecontentFilter(XmlfilecontentFilter value) {
        return new JAXBElement<XmlfilecontentFilter>(_XmlfilecontentFilter_QNAME, XmlfilecontentFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilehashFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "filehash_filter", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "item_filter")
    public JAXBElement<FilehashFilter> createFilehashFilter(FilehashFilter value) {
        return new JAXBElement<FilehashFilter>(_FilehashFilter_QNAME, FilehashFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SqlFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "sql_filter", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "item_filter")
    public JAXBElement<SqlFilter> createSqlFilter(SqlFilter value) {
        return new JAXBElement<SqlFilter>(_SqlFilter_QNAME, SqlFilter.class, null, value);
    }

//    /**
//     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
//     *
//     */
//    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", name = "item_filter")
//    public JAXBElement<FilterType> createItemFilter(FilterType value) {
//        return new JAXBElement<FilterType>(_ItemFilter_QNAME, FilterType.class, null, value);
//    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "variable_filter", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "item_filter")
    public JAXBElement<VariableFilter> createVariableFilter(VariableFilter value) {
        return new JAXBElement<VariableFilter>(_VariableFilter_QNAME, VariableFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "variable_object", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6", substitutionHeadName = "object")
    public JAXBElement<VariableObject> createVariableObject(VariableObject value) {
        return new JAXBElement<VariableObject>(_VariableObject_QNAME, VariableObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "pid", scope = ProcessenvironmentObject.class)
    public JAXBElement<ObjectIntType> createProcessenvironmentObjectPid(ObjectIntType value) {
        return new JAXBElement<ObjectIntType>(_ProcessenvironmentObjectPid_QNAME, ObjectIntType.class, ProcessenvironmentObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "relative_dn", scope = LdapObject.class)
    public JAXBElement<ObjectStringType> createLdapObjectRelativeDn(ObjectStringType value) {
        return new JAXBElement<ObjectStringType>(_LdapObjectRelativeDn_QNAME, ObjectStringType.class, LdapObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent", name = "attribute", scope = LdapObject.class)
    public JAXBElement<ObjectStringType> createLdapObjectAttribute(ObjectStringType value) {
        return new JAXBElement<ObjectStringType>(_LdapObjectAttribute_QNAME, ObjectStringType.class, LdapObject.class, value);
    }

}
