//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.25 at 09:30:05 AM MST 
//


package org.hl7.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REDS_MT010001UV.InformationRecipient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDS_MT010001UV.InformationRecipient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="healthCareProvider" type="{}REDS_MT010001UV.HealthCareProvider" form="qualified"/>
 *         &lt;element name="patient" type="{}REDS_MT010001UV.Patient" form="qualified"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REDS_MT010001UV.InformationRecipient", propOrder = {
    "healthCareProvider",
    "patient"
})
public class REDSMT010001UVInformationRecipient {

    @XmlElementRef(name = "healthCareProvider", type = JAXBElement.class)
    protected JAXBElement<REDSMT010001UVHealthCareProvider> healthCareProvider;
    @XmlElementRef(name = "patient", type = JAXBElement.class)
    protected JAXBElement<REDSMT010001UVPatient> patient;

    /**
     * Gets the value of the healthCareProvider property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVHealthCareProvider }{@code >}
     *     
     */
    public JAXBElement<REDSMT010001UVHealthCareProvider> getHealthCareProvider() {
        return healthCareProvider;
    }

    /**
     * Sets the value of the healthCareProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVHealthCareProvider }{@code >}
     *     
     */
    public void setHealthCareProvider(JAXBElement<REDSMT010001UVHealthCareProvider> value) {
        this.healthCareProvider = ((JAXBElement<REDSMT010001UVHealthCareProvider> ) value);
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVPatient }{@code >}
     *     
     */
    public JAXBElement<REDSMT010001UVPatient> getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVPatient }{@code >}
     *     
     */
    public void setPatient(JAXBElement<REDSMT010001UVPatient> value) {
        this.patient = ((JAXBElement<REDSMT010001UVPatient> ) value);
    }

}
