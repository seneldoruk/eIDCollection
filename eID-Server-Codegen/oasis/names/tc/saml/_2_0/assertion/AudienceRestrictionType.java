//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package oasis.names.tc.saml._2_0.assertion;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceRestrictionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AudienceRestrictionType">
 *   <complexContent>
 *     <extension base="{urn:oasis:names:tc:SAML:2.0:assertion}ConditionAbstractType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:tc:SAML:2.0:assertion}Audience" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceRestrictionType", propOrder = {
    "audience"
})
public class AudienceRestrictionType
    extends ConditionAbstractType
{

    @XmlElement(name = "Audience", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> audience;

    /**
     * Gets the value of the audience property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audience property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAudience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the audience property.
     */
    public List<String> getAudience() {
        if (audience == null) {
            audience = new ArrayList<>();
        }
        return this.audience;
    }

}
