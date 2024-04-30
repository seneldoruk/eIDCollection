//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package oasis.names.tc.dss._1_0.core.schema;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SigningTimeInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SigningTimeInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SigningTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="SigningTimeBoundaries" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="LowerBoundary" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   <element name="UpperBoundary" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SigningTimeInfoType", propOrder = {
    "signingTime",
    "signingTimeBoundaries"
})
public class SigningTimeInfoType {

    @XmlElement(name = "SigningTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signingTime;
    @XmlElement(name = "SigningTimeBoundaries")
    protected SigningTimeInfoType.SigningTimeBoundaries signingTimeBoundaries;

    /**
     * Gets the value of the signingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSigningTime() {
        return signingTime;
    }

    /**
     * Sets the value of the signingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSigningTime(XMLGregorianCalendar value) {
        this.signingTime = value;
    }

    /**
     * Gets the value of the signingTimeBoundaries property.
     * 
     * @return
     *     possible object is
     *     {@link SigningTimeInfoType.SigningTimeBoundaries }
     *     
     */
    public SigningTimeInfoType.SigningTimeBoundaries getSigningTimeBoundaries() {
        return signingTimeBoundaries;
    }

    /**
     * Sets the value of the signingTimeBoundaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigningTimeInfoType.SigningTimeBoundaries }
     *     
     */
    public void setSigningTimeBoundaries(SigningTimeInfoType.SigningTimeBoundaries value) {
        this.signingTimeBoundaries = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="LowerBoundary" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         <element name="UpperBoundary" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lowerBoundary",
        "upperBoundary"
    })
    public static class SigningTimeBoundaries {

        @XmlElement(name = "LowerBoundary")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lowerBoundary;
        @XmlElement(name = "UpperBoundary")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar upperBoundary;

        /**
         * Gets the value of the lowerBoundary property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLowerBoundary() {
            return lowerBoundary;
        }

        /**
         * Sets the value of the lowerBoundary property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLowerBoundary(XMLGregorianCalendar value) {
            this.lowerBoundary = value;
        }

        /**
         * Gets the value of the upperBoundary property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getUpperBoundary() {
            return upperBoundary;
        }

        /**
         * Sets the value of the upperBoundary property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setUpperBoundary(XMLGregorianCalendar value) {
            this.upperBoundary = value;
        }

    }

}
