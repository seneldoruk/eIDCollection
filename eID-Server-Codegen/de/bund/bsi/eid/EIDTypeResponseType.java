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
 * <p>Java class for EIDTypeResponseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EIDTypeResponseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CardCertified" type="{http://bsi.bund.de/eID/}EIDTypeUsedType"/>
 *         <element name="SECertified" type="{http://bsi.bund.de/eID/}EIDTypeUsedType"/>
 *         <element name="SEEndorsed" type="{http://bsi.bund.de/eID/}EIDTypeUsedType"/>
 *         <element name="HWKeyStore" type="{http://bsi.bund.de/eID/}EIDTypeUsedType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIDTypeResponseType", propOrder = {
    "cardCertified",
    "seCertified",
    "seEndorsed",
    "hwKeyStore"
})
public class EIDTypeResponseType {

    @XmlElement(name = "CardCertified")
    @XmlSchemaType(name = "string")
    protected EIDTypeUsedType cardCertified;
    @XmlElement(name = "SECertified")
    @XmlSchemaType(name = "string")
    protected EIDTypeUsedType seCertified;
    @XmlElement(name = "SEEndorsed")
    @XmlSchemaType(name = "string")
    protected EIDTypeUsedType seEndorsed;
    @XmlElement(name = "HWKeyStore")
    @XmlSchemaType(name = "string")
    protected EIDTypeUsedType hwKeyStore;

    /**
     * Gets the value of the cardCertified property.
     * 
     * @return
     *     possible object is
     *     {@link EIDTypeUsedType }
     *     
     */
    public EIDTypeUsedType getCardCertified() {
        return cardCertified;
    }

    /**
     * Sets the value of the cardCertified property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIDTypeUsedType }
     *     
     */
    public void setCardCertified(EIDTypeUsedType value) {
        this.cardCertified = value;
    }

    /**
     * Gets the value of the seCertified property.
     * 
     * @return
     *     possible object is
     *     {@link EIDTypeUsedType }
     *     
     */
    public EIDTypeUsedType getSECertified() {
        return seCertified;
    }

    /**
     * Sets the value of the seCertified property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIDTypeUsedType }
     *     
     */
    public void setSECertified(EIDTypeUsedType value) {
        this.seCertified = value;
    }

    /**
     * Gets the value of the seEndorsed property.
     * 
     * @return
     *     possible object is
     *     {@link EIDTypeUsedType }
     *     
     */
    public EIDTypeUsedType getSEEndorsed() {
        return seEndorsed;
    }

    /**
     * Sets the value of the seEndorsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIDTypeUsedType }
     *     
     */
    public void setSEEndorsed(EIDTypeUsedType value) {
        this.seEndorsed = value;
    }

    /**
     * Gets the value of the hwKeyStore property.
     * 
     * @return
     *     possible object is
     *     {@link EIDTypeUsedType }
     *     
     */
    public EIDTypeUsedType getHWKeyStore() {
        return hwKeyStore;
    }

    /**
     * Sets the value of the hwKeyStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIDTypeUsedType }
     *     
     */
    public void setHWKeyStore(EIDTypeUsedType value) {
        this.hwKeyStore = value;
    }

}