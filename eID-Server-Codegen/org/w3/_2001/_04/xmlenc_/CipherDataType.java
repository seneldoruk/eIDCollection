//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.w3._2001._04.xmlenc_;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CipherDataType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CipherDataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CipherValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         <element ref="{http://www.w3.org/2001/04/xmlenc#}CipherReference"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CipherDataType", propOrder = {
    "cipherValue",
    "cipherReference"
})
public class CipherDataType {

    @XmlElement(name = "CipherValue")
    protected byte[] cipherValue;
    @XmlElement(name = "CipherReference")
    protected CipherReferenceType cipherReference;

    /**
     * Gets the value of the cipherValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCipherValue() {
        return cipherValue;
    }

    /**
     * Sets the value of the cipherValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCipherValue(byte[] value) {
        this.cipherValue = value;
    }

    /**
     * Gets the value of the cipherReference property.
     * 
     * @return
     *     possible object is
     *     {@link CipherReferenceType }
     *     
     */
    public CipherReferenceType getCipherReference() {
        return cipherReference;
    }

    /**
     * Sets the value of the cipherReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CipherReferenceType }
     *     
     */
    public void setCipherReference(CipherReferenceType value) {
        this.cipherReference = value;
    }

}