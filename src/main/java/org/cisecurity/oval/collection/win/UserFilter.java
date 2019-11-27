//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.21 at 11:38:45 AM EST 
//


package org.cisecurity.oval.collection.win;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.cisecurity.oval.collection.FilterBoolType;
import org.cisecurity.oval.collection.FilterIntType;
import org.cisecurity.oval.collection.FilterStringType;
import org.cisecurity.oval.collection.FilterType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="group" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="last_logon" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterIntType" minOccurs="0"/>
 *         &lt;element name="full_name" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="password_age_days" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterIntType" minOccurs="0"/>
 *         &lt;element name="lockout" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="passwd_notreqd" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="dont_expire_passwd" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="encrypted_text_password_allowed" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="not_delegated" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="use_des_key_only" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="dont_require_preauth" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="password_expired" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="smartcard_required" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="trusted_for_delegation" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="trusted_to_authenticate_for_delegation" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "user",
    "enabled",
    "group",
    "lastLogon",
    "fullName",
    "comment2",
    "passwordAgeDays",
    "lockout",
    "passwdNotreqd",
    "dontExpirePasswd",
    "encryptedTextPasswordAllowed",
    "notDelegated",
    "useDesKeyOnly",
    "dontRequirePreauth",
    "passwordExpired",
    "smartcardRequired",
    "trustedForDelegation",
    "trustedToAuthenticateForDelegation"
})
public class UserFilter
    extends FilterType
{

    protected FilterStringType user;
    protected FilterBoolType enabled;
    protected FilterStringType group;
    @XmlElement(name = "last_logon")
    protected FilterIntType lastLogon;
    @XmlElement(name = "full_name")
    protected FilterStringType fullName;
    @XmlElement(name = "comment")
    protected FilterStringType comment2;
    @XmlElement(name = "password_age_days")
    protected FilterIntType passwordAgeDays;
    protected FilterBoolType lockout;
    @XmlElement(name = "passwd_notreqd")
    protected FilterBoolType passwdNotreqd;
    @XmlElement(name = "dont_expire_passwd")
    protected FilterBoolType dontExpirePasswd;
    @XmlElement(name = "encrypted_text_password_allowed")
    protected FilterBoolType encryptedTextPasswordAllowed;
    @XmlElement(name = "not_delegated")
    protected FilterBoolType notDelegated;
    @XmlElement(name = "use_des_key_only")
    protected FilterBoolType useDesKeyOnly;
    @XmlElement(name = "dont_require_preauth")
    protected FilterBoolType dontRequirePreauth;
    @XmlElement(name = "password_expired")
    protected FilterBoolType passwordExpired;
    @XmlElement(name = "smartcard_required")
    protected FilterBoolType smartcardRequired;
    @XmlElement(name = "trusted_for_delegation")
    protected FilterBoolType trustedForDelegation;
    @XmlElement(name = "trusted_to_authenticate_for_delegation")
    protected FilterBoolType trustedToAuthenticateForDelegation;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setUser(FilterStringType value) {
        this.user = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setEnabled(FilterBoolType value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setGroup(FilterStringType value) {
        this.group = value;
    }

    /**
     * Gets the value of the lastLogon property.
     * 
     * @return
     *     possible object is
     *     {@link FilterIntType }
     *     
     */
    public FilterIntType getLastLogon() {
        return lastLogon;
    }

    /**
     * Sets the value of the lastLogon property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterIntType }
     *     
     */
    public void setLastLogon(FilterIntType value) {
        this.lastLogon = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setFullName(FilterStringType value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getComment2() {
        return comment2;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setComment2(FilterStringType value) {
        this.comment2 = value;
    }

    /**
     * Gets the value of the passwordAgeDays property.
     * 
     * @return
     *     possible object is
     *     {@link FilterIntType }
     *     
     */
    public FilterIntType getPasswordAgeDays() {
        return passwordAgeDays;
    }

    /**
     * Sets the value of the passwordAgeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterIntType }
     *     
     */
    public void setPasswordAgeDays(FilterIntType value) {
        this.passwordAgeDays = value;
    }

    /**
     * Gets the value of the lockout property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getLockout() {
        return lockout;
    }

    /**
     * Sets the value of the lockout property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setLockout(FilterBoolType value) {
        this.lockout = value;
    }

    /**
     * Gets the value of the passwdNotreqd property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getPasswdNotreqd() {
        return passwdNotreqd;
    }

    /**
     * Sets the value of the passwdNotreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setPasswdNotreqd(FilterBoolType value) {
        this.passwdNotreqd = value;
    }

    /**
     * Gets the value of the dontExpirePasswd property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getDontExpirePasswd() {
        return dontExpirePasswd;
    }

    /**
     * Sets the value of the dontExpirePasswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setDontExpirePasswd(FilterBoolType value) {
        this.dontExpirePasswd = value;
    }

    /**
     * Gets the value of the encryptedTextPasswordAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getEncryptedTextPasswordAllowed() {
        return encryptedTextPasswordAllowed;
    }

    /**
     * Sets the value of the encryptedTextPasswordAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setEncryptedTextPasswordAllowed(FilterBoolType value) {
        this.encryptedTextPasswordAllowed = value;
    }

    /**
     * Gets the value of the notDelegated property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getNotDelegated() {
        return notDelegated;
    }

    /**
     * Sets the value of the notDelegated property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setNotDelegated(FilterBoolType value) {
        this.notDelegated = value;
    }

    /**
     * Gets the value of the useDesKeyOnly property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getUseDesKeyOnly() {
        return useDesKeyOnly;
    }

    /**
     * Sets the value of the useDesKeyOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setUseDesKeyOnly(FilterBoolType value) {
        this.useDesKeyOnly = value;
    }

    /**
     * Gets the value of the dontRequirePreauth property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getDontRequirePreauth() {
        return dontRequirePreauth;
    }

    /**
     * Sets the value of the dontRequirePreauth property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setDontRequirePreauth(FilterBoolType value) {
        this.dontRequirePreauth = value;
    }

    /**
     * Gets the value of the passwordExpired property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getPasswordExpired() {
        return passwordExpired;
    }

    /**
     * Sets the value of the passwordExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setPasswordExpired(FilterBoolType value) {
        this.passwordExpired = value;
    }

    /**
     * Gets the value of the smartcardRequired property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getSmartcardRequired() {
        return smartcardRequired;
    }

    /**
     * Sets the value of the smartcardRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setSmartcardRequired(FilterBoolType value) {
        this.smartcardRequired = value;
    }

    /**
     * Gets the value of the trustedForDelegation property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getTrustedForDelegation() {
        return trustedForDelegation;
    }

    /**
     * Sets the value of the trustedForDelegation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setTrustedForDelegation(FilterBoolType value) {
        this.trustedForDelegation = value;
    }

    /**
     * Gets the value of the trustedToAuthenticateForDelegation property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getTrustedToAuthenticateForDelegation() {
        return trustedToAuthenticateForDelegation;
    }

    /**
     * Sets the value of the trustedToAuthenticateForDelegation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setTrustedToAuthenticateForDelegation(FilterBoolType value) {
        this.trustedToAuthenticateForDelegation = value;
    }

}