//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.30 at 11:23:35 PM CEST 
//


package wsdl.oasis.names.tc.dss._1_0.core.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Document"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}TransformedData"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}DocumentHash"/&gt;
 *           &lt;element name="Other" type="{urn:oasis:names:tc:dss:1.0:core:schema}AnyType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentOrTransformedDataOrDocumentHash"
})
@XmlRootElement(name = "InputDocuments")
public class InputDocuments {

    @XmlElements({
        @XmlElement(name = "Document", type = DocumentType.class),
        @XmlElement(name = "TransformedData", type = TransformedData.class),
        @XmlElement(name = "DocumentHash", type = DocumentHash.class),
        @XmlElement(name = "Other", type = AnyType.class)
    })
    protected List<Object> documentOrTransformedDataOrDocumentHash;

    /**
     * Gets the value of the documentOrTransformedDataOrDocumentHash property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the documentOrTransformedDataOrDocumentHash property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentOrTransformedDataOrDocumentHash().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     * {@link TransformedData }
     * {@link DocumentHash }
     * {@link AnyType }
     * 
     * 
     */
    public List<Object> getDocumentOrTransformedDataOrDocumentHash() {
        if (documentOrTransformedDataOrDocumentHash == null) {
            documentOrTransformedDataOrDocumentHash = new ArrayList<Object>();
        }
        return this.documentOrTransformedDataOrDocumentHash;
    }

}
