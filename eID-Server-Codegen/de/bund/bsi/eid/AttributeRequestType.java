//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package de.bund.bsi.eid;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AttributeRequestType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AttributeRequestType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REQUIRED"/>
 *     <enumeration value="ALLOWED"/>
 *     <enumeration value="PROHIBITED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AttributeRequestType")
@XmlEnum
public enum AttributeRequestType {

    REQUIRED,
    ALLOWED,
    PROHIBITED;

    public String value() {
        return name();
    }

    public static AttributeRequestType fromValue(String v) {
        return valueOf(v);
    }

}
