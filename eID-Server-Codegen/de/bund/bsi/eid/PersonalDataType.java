//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package de.bund.bsi.eid;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalDataType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PersonalDataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocumentType" type="{http://bsi.bund.de/eID/}DocumentType" minOccurs="0"/>
 *         <element name="IssuingState" type="{http://bsi.bund.de/eID/}ICAOCountry" minOccurs="0"/>
 *         <element name="DateOfExpiry" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="GivenNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FamilyNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ArtisticName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AcademicTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DateOfBirth" type="{http://bsi.bund.de/eID/}GeneralDateType" minOccurs="0"/>
 *         <element name="PlaceOfBirth" type="{http://bsi.bund.de/eID/}GeneralPlaceType" minOccurs="0"/>
 *         <element name="Nationality" type="{http://bsi.bund.de/eID/}ICAOCountry" minOccurs="0"/>
 *         <element name="BirthName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PlaceOfResidence" type="{http://bsi.bund.de/eID/}GeneralPlaceType" minOccurs="0"/>
 *         <element name="CommunityID" type="{http://bsi.bund.de/eID/}CommunityIDType" minOccurs="0"/>
 *         <element name="ResidencePermitI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RestrictedID" type="{http://bsi.bund.de/eID/}RestrictedIDType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalDataType", propOrder = {
    "documentType",
    "issuingState",
    "dateOfExpiry",
    "givenNames",
    "familyNames",
    "artisticName",
    "academicTitle",
    "dateOfBirth",
    "placeOfBirth",
    "nationality",
    "birthName",
    "placeOfResidence",
    "communityID",
    "residencePermitI",
    "restrictedID"
})
public class PersonalDataType {

    @XmlElement(name = "DocumentType")
    protected String documentType;
    @XmlElement(name = "IssuingState")
    protected String issuingState;
    @XmlElement(name = "DateOfExpiry")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfExpiry;
    @XmlElement(name = "GivenNames")
    protected String givenNames;
    @XmlElement(name = "FamilyNames")
    protected String familyNames;
    @XmlElement(name = "ArtisticName")
    protected String artisticName;
    @XmlElement(name = "AcademicTitle")
    protected String academicTitle;
    @XmlElement(name = "DateOfBirth")
    protected GeneralDateType dateOfBirth;
    @XmlElement(name = "PlaceOfBirth")
    protected GeneralPlaceType placeOfBirth;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "BirthName")
    protected String birthName;
    @XmlElement(name = "PlaceOfResidence")
    protected GeneralPlaceType placeOfResidence;
    @XmlElement(name = "CommunityID")
    protected String communityID;
    @XmlElement(name = "ResidencePermitI")
    protected String residencePermitI;
    @XmlElement(name = "RestrictedID")
    protected RestrictedIDType restrictedID;

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the issuingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingState() {
        return issuingState;
    }

    /**
     * Sets the value of the issuingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingState(String value) {
        this.issuingState = value;
    }

    /**
     * Gets the value of the dateOfExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfExpiry() {
        return dateOfExpiry;
    }

    /**
     * Sets the value of the dateOfExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfExpiry(XMLGregorianCalendar value) {
        this.dateOfExpiry = value;
    }

    /**
     * Gets the value of the givenNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenNames() {
        return givenNames;
    }

    /**
     * Sets the value of the givenNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenNames(String value) {
        this.givenNames = value;
    }

    /**
     * Gets the value of the familyNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyNames() {
        return familyNames;
    }

    /**
     * Sets the value of the familyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyNames(String value) {
        this.familyNames = value;
    }

    /**
     * Gets the value of the artisticName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtisticName() {
        return artisticName;
    }

    /**
     * Sets the value of the artisticName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtisticName(String value) {
        this.artisticName = value;
    }

    /**
     * Gets the value of the academicTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicTitle() {
        return academicTitle;
    }

    /**
     * Sets the value of the academicTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicTitle(String value) {
        this.academicTitle = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralDateType }
     *     
     */
    public GeneralDateType getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralDateType }
     *     
     */
    public void setDateOfBirth(GeneralDateType value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralPlaceType }
     *     
     */
    public GeneralPlaceType getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralPlaceType }
     *     
     */
    public void setPlaceOfBirth(GeneralPlaceType value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the birthName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthName() {
        return birthName;
    }

    /**
     * Sets the value of the birthName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthName(String value) {
        this.birthName = value;
    }

    /**
     * Gets the value of the placeOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralPlaceType }
     *     
     */
    public GeneralPlaceType getPlaceOfResidence() {
        return placeOfResidence;
    }

    /**
     * Sets the value of the placeOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralPlaceType }
     *     
     */
    public void setPlaceOfResidence(GeneralPlaceType value) {
        this.placeOfResidence = value;
    }

    /**
     * Gets the value of the communityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityID() {
        return communityID;
    }

    /**
     * Sets the value of the communityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityID(String value) {
        this.communityID = value;
    }

    /**
     * Gets the value of the residencePermitI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidencePermitI() {
        return residencePermitI;
    }

    /**
     * Sets the value of the residencePermitI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidencePermitI(String value) {
        this.residencePermitI = value;
    }

    /**
     * Gets the value of the restrictedID property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedIDType }
     *     
     */
    public RestrictedIDType getRestrictedID() {
        return restrictedID;
    }

    /**
     * Sets the value of the restrictedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedIDType }
     *     
     */
    public void setRestrictedID(RestrictedIDType value) {
        this.restrictedID = value;
    }

}
