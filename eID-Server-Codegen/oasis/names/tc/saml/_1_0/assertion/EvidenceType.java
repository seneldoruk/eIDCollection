//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package oasis.names.tc.saml._1_0.assertion;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EvidenceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EvidenceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded">
 *         <element ref="{urn:oasis:names:tc:SAML:1.0:assertion}AssertionIDReference"/>
 *         <element ref="{urn:oasis:names:tc:SAML:1.0:assertion}Assertion"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvidenceType", propOrder = {
    "assertionIDReferenceOrAssertion"
})
public class EvidenceType {

    @XmlElementRefs({
        @XmlElementRef(name = "AssertionIDReference", namespace = "urn:oasis:names:tc:SAML:1.0:assertion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Assertion", namespace = "urn:oasis:names:tc:SAML:1.0:assertion", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> assertionIDReferenceOrAssertion;

    /**
     * Gets the value of the assertionIDReferenceOrAssertion property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assertionIDReferenceOrAssertion property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAssertionIDReferenceOrAssertion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link AssertionType }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the assertionIDReferenceOrAssertion property.
     */
    public List<JAXBElement<?>> getAssertionIDReferenceOrAssertion() {
        if (assertionIDReferenceOrAssertion == null) {
            assertionIDReferenceOrAssertion = new ArrayList<>();
        }
        return this.assertionIDReferenceOrAssertion;
    }

}
