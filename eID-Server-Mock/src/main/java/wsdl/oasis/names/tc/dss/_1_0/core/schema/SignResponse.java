//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.30 at 11:23:35 PM CEST 
//


package wsdl.oasis.names.tc.dss._1_0.core.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:dss:1.0:core:schema}ResponseBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignatureObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signatureObject"
})
@XmlRootElement(name = "SignResponse")
public class SignResponse
    extends ResponseBaseType
{

    @XmlElement(name = "SignatureObject")
    protected SignatureObject signatureObject;

    /**
     * Gets the value of the signatureObject property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureObject }
     *     
     */
    public SignatureObject getSignatureObject() {
        return signatureObject;
    }

    /**
     * Sets the value of the signatureObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureObject }
     *     
     */
    public void setSignatureObject(SignatureObject value) {
        this.signatureObject = value;
    }

}
