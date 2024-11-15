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
 * <p>Java class for getResultRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getResultRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Session" type="{http://bsi.bund.de/eID/}SessionType"/>
 *         <element name="RequestCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getResultRequestType", propOrder = {
    "session",
    "requestCounter"
})
public class GetResultRequestType {

    @XmlElement(name = "Session", required = true)
    protected SessionType session;
    @XmlElement(name = "RequestCounter")
    protected int requestCounter;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link SessionType }
     *     
     */
    public SessionType getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionType }
     *     
     */
    public void setSession(SessionType value) {
        this.session = value;
    }

    /**
     * Gets the value of the requestCounter property.
     * 
     */
    public int getRequestCounter() {
        return requestCounter;
    }

    /**
     * Sets the value of the requestCounter property.
     * 
     */
    public void setRequestCounter(int value) {
        this.requestCounter = value;
    }

}
