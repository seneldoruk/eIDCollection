//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.30 at 11:23:35 PM CEST 
//


package wsdl.de.bund.bsi.eid;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeResponseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AttributeResponseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOTONCHIP"/&gt;
 *     &lt;enumeration value="ALLOWED"/&gt;
 *     &lt;enumeration value="PROHIBITED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttributeResponseType")
@XmlEnum
public enum AttributeResponseType {

    NOTONCHIP,
    ALLOWED,
    PROHIBITED;

    public String value() {
        return name();
    }

    public static AttributeResponseType fromValue(String v) {
        return valueOf(v);
    }

}
