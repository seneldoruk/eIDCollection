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
 * <p>Java class for AttributeSelectionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AttributeSelectionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALLOWED"/>
 *     <enumeration value="PROHIBITED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AttributeSelectionType")
@XmlEnum
public enum AttributeSelectionType {

    ALLOWED,
    PROHIBITED;

    public String value() {
        return name();
    }

    public static AttributeSelectionType fromValue(String v) {
        return valueOf(v);
    }

}
