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
 * <p>Java class for TransactionAttestationRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TransactionAttestationRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TransactionAttestationFormat" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="TransactionContext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAttestationRequestType", propOrder = {
    "transactionAttestationFormat",
    "transactionContext"
})
public class TransactionAttestationRequestType {

    @XmlElement(name = "TransactionAttestationFormat", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String transactionAttestationFormat;
    @XmlElement(name = "TransactionContext", required = true)
    protected String transactionContext;

    /**
     * Gets the value of the transactionAttestationFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionAttestationFormat() {
        return transactionAttestationFormat;
    }

    /**
     * Sets the value of the transactionAttestationFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionAttestationFormat(String value) {
        this.transactionAttestationFormat = value;
    }

    /**
     * Gets the value of the transactionContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionContext() {
        return transactionContext;
    }

    /**
     * Sets the value of the transactionContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionContext(String value) {
        this.transactionContext = value;
    }

}
