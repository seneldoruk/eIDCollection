//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package de.bund.bsi.eid;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VersionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VersionString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Major" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Minor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Bugfix" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionType", propOrder = {
    "versionString",
    "major",
    "minor",
    "bugfix"
})
public class VersionType {

    @XmlElement(name = "VersionString", required = true)
    protected String versionString;
    @XmlElement(name = "Major")
    protected int major;
    @XmlElement(name = "Minor")
    protected int minor;
    @XmlElement(name = "Bugfix")
    protected Integer bugfix;

    /**
     * Gets the value of the versionString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionString() {
        return versionString;
    }

    /**
     * Sets the value of the versionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionString(String value) {
        this.versionString = value;
    }

    /**
     * Gets the value of the major property.
     * 
     */
    public int getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     * 
     */
    public void setMajor(int value) {
        this.major = value;
    }

    /**
     * Gets the value of the minor property.
     * 
     */
    public int getMinor() {
        return minor;
    }

    /**
     * Sets the value of the minor property.
     * 
     */
    public void setMinor(int value) {
        this.minor = value;
    }

    /**
     * Gets the value of the bugfix property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBugfix() {
        return bugfix;
    }

    /**
     * Sets the value of the bugfix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBugfix(Integer value) {
        this.bugfix = value;
    }

}
