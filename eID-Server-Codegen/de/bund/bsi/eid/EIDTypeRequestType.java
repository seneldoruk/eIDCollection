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


/**
 * <p>Java class for EIDTypeRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EIDTypeRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardCertified" type="{http://bsi.bund.de/eID/}EIDTypeSelectionType" minOccurs="0"/>
 *         <element name="SECertified" type="{http://bsi.bund.de/eID/}EIDTypeSelectionType" minOccurs="0"/>
 *         <element name="SEEndorsed" type="{http://bsi.bund.de/eID/}EIDTypeSelectionType" minOccurs="0"/>
 *         <element name="HWKeyStore" type="{http://bsi.bund.de/eID/}EIDTypeSelectionType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIDTypeRequestType", propOrder = {
    "cardCertified",
    "seCertified",
    "seEndorsed",
    "hwKeyStore"
})
public class EIDTypeRequestType {

    @XmlElement(name = "CardCertified")
    @XmlSchemaType(name = "string")
    protected EIDTypeSelectionType cardCertified;
    @XmlElement(name = "SECertified")
    @XmlSchemaType(name = "string")
    protected EIDTypeSelectionType seCertified;
    @XmlElement(name = "SEEndorsed")
    @XmlSchemaType(name = "string")
    protected EIDTypeSelectionType seEndorsed;
    @XmlElement(name = "HWKeyStore")
    @XmlSchemaType(name = "string")
    protected EIDTypeSelectionType hwKeyStore;

    /**
     * Gets the value of the cardCertified property.
     * 
     * @return
     *     possible object is
     *     {@link EIDTypeSelectionType }
     *     
     */
    public EIDTypeSelectionType getCardCertified() {
        return cardCertified;
    }

    /**
     * Sets the value of the cardCertified property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIDTypeSelectionType }
     *     
     */
    public void setCardCertified(EIDTypeSelectionType value) {
        this.cardCertified = value;
    }

    /**
     * Gets the value of the seCertified property.
     * 
     * @return
     *     possible object is
     *     {@link EIDTypeSelectionType }
     *     
     */
    public EIDTypeSelectionType getSECertified() {
        return seCertified;
    }

    /**
     * Sets the value of the seCertified property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIDTypeSelectionType }
     *     
     */
    public void setSECertified(EIDTypeSelectionType value) {
        this.seCertified = value;
    }

    /**
     * Gets the value of the seEndorsed property.
     * 
     * @return
     *     possible object is
     *     {@link EIDTypeSelectionType }
     *     
     */
    public EIDTypeSelectionType getSEEndorsed() {
        return seEndorsed;
    }

    /**
     * Sets the value of the seEndorsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIDTypeSelectionType }
     *     
     */
    public void setSEEndorsed(EIDTypeSelectionType value) {
        this.seEndorsed = value;
    }

    /**
     * Gets the value of the hwKeyStore property.
     * 
     * @return
     *     possible object is
     *     {@link EIDTypeSelectionType }
     *     
     */
    public EIDTypeSelectionType getHWKeyStore() {
        return hwKeyStore;
    }

    /**
     * Sets the value of the hwKeyStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIDTypeSelectionType }
     *     
     */
    public void setHWKeyStore(EIDTypeSelectionType value) {
        this.hwKeyStore = value;
    }

}
