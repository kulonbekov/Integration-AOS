
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransitDeclarationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransitDeclarationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="GA_TDId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehicleRegCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransportNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrailerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrailerNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SemiTrailerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SemiTrailerNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomsOrigCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomsOrigName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomsOrigFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomsOrigCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomsDestCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomsDestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomsDestFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomsDestCoutryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Goods" type="{http://tempuri.org/}ArrayOfGood" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitDeclarationResponse", propOrder = {
    "id",
    "gatdId",
    "sendCountry",
    "destinationCountry",
    "counterPartyName",
    "registrationCountry",
    "vehicleType",
    "vehicleRegCountry",
    "transportNumbers",
    "trailerType",
    "trailerNumbers",
    "semiTrailerType",
    "semiTrailerNumbers",
    "customsOrigCode",
    "customsOrigName",
    "customsOrigFullName",
    "customsOrigCountryCode",
    "customsDestCode",
    "customsDestName",
    "customsDestFullName",
    "customsDestCoutryCode",
    "goods",
    "errorMessage"
})
public class TransitDeclarationResponse {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "GA_TDId")
    protected String gatdId;
    @XmlElement(name = "SendCountry")
    protected String sendCountry;
    @XmlElement(name = "DestinationCountry")
    protected String destinationCountry;
    @XmlElement(name = "CounterPartyName")
    protected String counterPartyName;
    @XmlElement(name = "RegistrationCountry")
    protected String registrationCountry;
    @XmlElement(name = "VehicleType")
    protected String vehicleType;
    @XmlElement(name = "VehicleRegCountry")
    protected String vehicleRegCountry;
    @XmlElement(name = "TransportNumbers")
    protected String transportNumbers;
    @XmlElement(name = "TrailerType")
    protected String trailerType;
    @XmlElement(name = "TrailerNumbers")
    protected String trailerNumbers;
    @XmlElement(name = "SemiTrailerType")
    protected String semiTrailerType;
    @XmlElement(name = "SemiTrailerNumbers")
    protected String semiTrailerNumbers;
    @XmlElement(name = "CustomsOrigCode")
    protected String customsOrigCode;
    @XmlElement(name = "CustomsOrigName")
    protected String customsOrigName;
    @XmlElement(name = "CustomsOrigFullName")
    protected String customsOrigFullName;
    @XmlElement(name = "CustomsOrigCountryCode")
    protected String customsOrigCountryCode;
    @XmlElement(name = "CustomsDestCode")
    protected String customsDestCode;
    @XmlElement(name = "CustomsDestName")
    protected String customsDestName;
    @XmlElement(name = "CustomsDestFullName")
    protected String customsDestFullName;
    @XmlElement(name = "CustomsDestCoutryCode")
    protected String customsDestCoutryCode;
    @XmlElement(name = "Goods")
    protected ArrayOfGood goods;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the gatdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGATDId() {
        return gatdId;
    }

    /**
     * Sets the value of the gatdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGATDId(String value) {
        this.gatdId = value;
    }

    /**
     * Gets the value of the sendCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendCountry() {
        return sendCountry;
    }

    /**
     * Sets the value of the sendCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendCountry(String value) {
        this.sendCountry = value;
    }

    /**
     * Gets the value of the destinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * Sets the value of the destinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountry(String value) {
        this.destinationCountry = value;
    }

    /**
     * Gets the value of the counterPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterPartyName() {
        return counterPartyName;
    }

    /**
     * Sets the value of the counterPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterPartyName(String value) {
        this.counterPartyName = value;
    }

    /**
     * Gets the value of the registrationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationCountry() {
        return registrationCountry;
    }

    /**
     * Sets the value of the registrationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationCountry(String value) {
        this.registrationCountry = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the vehicleRegCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegCountry() {
        return vehicleRegCountry;
    }

    /**
     * Sets the value of the vehicleRegCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegCountry(String value) {
        this.vehicleRegCountry = value;
    }

    /**
     * Gets the value of the transportNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportNumbers() {
        return transportNumbers;
    }

    /**
     * Sets the value of the transportNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportNumbers(String value) {
        this.transportNumbers = value;
    }

    /**
     * Gets the value of the trailerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerType() {
        return trailerType;
    }

    /**
     * Sets the value of the trailerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerType(String value) {
        this.trailerType = value;
    }

    /**
     * Gets the value of the trailerNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerNumbers() {
        return trailerNumbers;
    }

    /**
     * Sets the value of the trailerNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerNumbers(String value) {
        this.trailerNumbers = value;
    }

    /**
     * Gets the value of the semiTrailerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemiTrailerType() {
        return semiTrailerType;
    }

    /**
     * Sets the value of the semiTrailerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemiTrailerType(String value) {
        this.semiTrailerType = value;
    }

    /**
     * Gets the value of the semiTrailerNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemiTrailerNumbers() {
        return semiTrailerNumbers;
    }

    /**
     * Sets the value of the semiTrailerNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemiTrailerNumbers(String value) {
        this.semiTrailerNumbers = value;
    }

    /**
     * Gets the value of the customsOrigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOrigCode() {
        return customsOrigCode;
    }

    /**
     * Sets the value of the customsOrigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOrigCode(String value) {
        this.customsOrigCode = value;
    }

    /**
     * Gets the value of the customsOrigName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOrigName() {
        return customsOrigName;
    }

    /**
     * Sets the value of the customsOrigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOrigName(String value) {
        this.customsOrigName = value;
    }

    /**
     * Gets the value of the customsOrigFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOrigFullName() {
        return customsOrigFullName;
    }

    /**
     * Sets the value of the customsOrigFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOrigFullName(String value) {
        this.customsOrigFullName = value;
    }

    /**
     * Gets the value of the customsOrigCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOrigCountryCode() {
        return customsOrigCountryCode;
    }

    /**
     * Sets the value of the customsOrigCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOrigCountryCode(String value) {
        this.customsOrigCountryCode = value;
    }

    /**
     * Gets the value of the customsDestCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsDestCode() {
        return customsDestCode;
    }

    /**
     * Sets the value of the customsDestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsDestCode(String value) {
        this.customsDestCode = value;
    }

    /**
     * Gets the value of the customsDestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsDestName() {
        return customsDestName;
    }

    /**
     * Sets the value of the customsDestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsDestName(String value) {
        this.customsDestName = value;
    }

    /**
     * Gets the value of the customsDestFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsDestFullName() {
        return customsDestFullName;
    }

    /**
     * Sets the value of the customsDestFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsDestFullName(String value) {
        this.customsDestFullName = value;
    }

    /**
     * Gets the value of the customsDestCoutryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsDestCoutryCode() {
        return customsDestCoutryCode;
    }

    /**
     * Sets the value of the customsDestCoutryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsDestCoutryCode(String value) {
        this.customsDestCoutryCode = value;
    }

    /**
     * Gets the value of the goods property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGood }
     *     
     */
    public ArrayOfGood getGoods() {
        return goods;
    }

    /**
     * Sets the value of the goods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGood }
     *     
     */
    public void setGoods(ArrayOfGood value) {
        this.goods = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
