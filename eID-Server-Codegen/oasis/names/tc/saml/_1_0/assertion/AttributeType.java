//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package oasis.names.tc.saml._1_0.assertion;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AttributeType">
 *   <complexContent>
 *     <extension base="{urn:oasis:names:tc:SAML:1.0:assertion}AttributeDesignatorType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:tc:SAML:1.0:assertion}AttributeValue" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType", propOrder = {
    "attributeValue"
})
public class AttributeType
    extends AttributeDesignatorType
{

    @XmlElement(name = "AttributeValue", required = true)
    protected List<Object> attributeValue;

    /**
     * Gets the value of the attributeValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttributeValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * </p>
     * 
     * 
     * @return
     *     The value of the attributeValue property.
     */
    public List<Object> getAttributeValue() {
        if (attributeValue == null) {
            attributeValue = new ArrayList<>();
        }
        return this.attributeValue;
    }

}