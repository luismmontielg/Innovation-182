//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.25 at 09:30:05 AM MST 
//


package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REDS_MT010001UV.Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDS_MT010001UV.Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="languageCommunication" type="{}REDS_MT010001UV.LanguageCommunication" maxOccurs="unbounded" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REDS_MT010001UV.Person", propOrder = {
    "languageCommunication"
})
public class REDSMT010001UVPerson {

    @XmlElement(required = true, nillable = true)
    protected List<REDSMT010001UVLanguageCommunication> languageCommunication;

    /**
     * Gets the value of the languageCommunication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageCommunication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REDSMT010001UVLanguageCommunication }
     * 
     * 
     */
    public List<REDSMT010001UVLanguageCommunication> getLanguageCommunication() {
        if (languageCommunication == null) {
            languageCommunication = new ArrayList<REDSMT010001UVLanguageCommunication>();
        }
        return this.languageCommunication;
    }

}
