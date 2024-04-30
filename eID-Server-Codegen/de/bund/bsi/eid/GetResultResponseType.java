//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package de.bund.bsi.eid;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.tc.dss._1_0.core.schema.Result;


/**
 * <p>Java class for getResultResponseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getResultResponseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PersonalData" type="{http://bsi.bund.de/eID/}PersonalDataType" minOccurs="0"/>
 *         <element name="FulfilsAgeVerification" type="{http://bsi.bund.de/eID/}VerificationResultType" minOccurs="0"/>
 *         <element name="FulfilsPlaceVerification" type="{http://bsi.bund.de/eID/}VerificationResultType" minOccurs="0"/>
 *         <element name="OperationsAllowedByUser" type="{http://bsi.bund.de/eID/}OperationsResponderType" minOccurs="0"/>
 *         <element name="TransactionAttestationResponse" type="{http://bsi.bund.de/eID/}TransactionAttestationResponseType" minOccurs="0"/>
 *         <element name="LevelOfAssuranceResult" type="{http://bsi.bund.de/eID/}LevelOfAssuranceType" minOccurs="0"/>
 *         <element name="EIDTypeResponse" type="{http://bsi.bund.de/eID/}EIDTypeResponseType" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Result"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getResultResponseType", propOrder = {
    "personalData",
    "fulfilsAgeVerification",
    "fulfilsPlaceVerification",
    "operationsAllowedByUser",
    "transactionAttestationResponse",
    "levelOfAssuranceResult",
    "eidTypeResponse",
    "result"
})
public class GetResultResponseType {

    @XmlElement(name = "PersonalData")
    protected PersonalDataType personalData;
    @XmlElement(name = "FulfilsAgeVerification")
    protected VerificationResultType fulfilsAgeVerification;
    @XmlElement(name = "FulfilsPlaceVerification")
    protected VerificationResultType fulfilsPlaceVerification;
    @XmlElement(name = "OperationsAllowedByUser")
    protected OperationsResponderType operationsAllowedByUser;
    @XmlElement(name = "TransactionAttestationResponse")
    protected TransactionAttestationResponseType transactionAttestationResponse;
    @XmlElement(name = "LevelOfAssuranceResult")
    @XmlSchemaType(name = "anyURI")
    protected String levelOfAssuranceResult;
    @XmlElement(name = "EIDTypeResponse")
    protected EIDTypeResponseType eidTypeResponse;
    @XmlElement(name = "Result", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", required = true)
    protected Result result;

    /**
     * Gets the value of the personalData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDataType }
     *     
     */
    public PersonalDataType getPersonalData() {
        return personalData;
    }

    /**
     * Sets the value of the personalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDataType }
     *     
     */
    public void setPersonalData(PersonalDataType value) {
        this.personalData = value;
    }

    /**
     * Gets the value of the fulfilsAgeVerification property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationResultType }
     *     
     */
    public VerificationResultType getFulfilsAgeVerification() {
        return fulfilsAgeVerification;
    }

    /**
     * Sets the value of the fulfilsAgeVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationResultType }
     *     
     */
    public void setFulfilsAgeVerification(VerificationResultType value) {
        this.fulfilsAgeVerification = value;
    }

    /**
     * Gets the value of the fulfilsPlaceVerification property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationResultType }
     *     
     */
    public VerificationResultType getFulfilsPlaceVerification() {
        return fulfilsPlaceVerification;
    }

    /**
     * Sets the value of the fulfilsPlaceVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationResultType }
     *     
     */
    public void setFulfilsPlaceVerification(VerificationResultType value) {
        this.fulfilsPlaceVerification = value;
    }

    /**
     * Gets the value of the operationsAllowedByUser property.
     * 
     * @return
     *     possible object is
     *     {@link OperationsResponderType }
     *     
     */
    public OperationsResponderType getOperationsAllowedByUser() {
        return operationsAllowedByUser;
    }

    /**
     * Sets the value of the operationsAllowedByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationsResponderType }
     *     
     */
    public void setOperationsAllowedByUser(OperationsResponderType value) {
        this.operationsAllowedByUser = value;
    }

    /**
     * Gets the value of the transactionAttestationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAttestationResponseType }
     *     
     */
    public TransactionAttestationResponseType getTransactionAttestationResponse() {
        return transactionAttestationResponse;
    }

    /**
     * Sets the value of the transactionAttestationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAttestationResponseType }
     *     
     */
    public void setTransactionAttestationResponse(TransactionAttestationResponseType value) {
        this.transactionAttestationResponse = value;
    }

    /**
     * Gets the value of the levelOfAssuranceResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfAssuranceResult() {
        return levelOfAssuranceResult;
    }

    /**
     * Sets the value of the levelOfAssuranceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfAssuranceResult(String value) {
        this.levelOfAssuranceResult = value;
    }

    /**
     * Gets the value of the eidTypeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EIDTypeResponseType }
     *     
     */
    public EIDTypeResponseType getEIDTypeResponse() {
        return eidTypeResponse;
    }

    /**
     * Sets the value of the eidTypeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIDTypeResponseType }
     *     
     */
    public void setEIDTypeResponse(EIDTypeResponseType value) {
        this.eidTypeResponse = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

}
