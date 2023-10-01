
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestTDResult" type="{http://tempuri.org/}TransitDeclarationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestTDResult"
})
@XmlRootElement(name = "RequestTDResponse")
public class RequestTDResponse {

    @XmlElement(name = "RequestTDResult")
    protected TransitDeclarationResponse requestTDResult;

    /**
     * Gets the value of the requestTDResult property.
     * 
     * @return
     *     possible object is
     *     {@link TransitDeclarationResponse }
     *     
     */
    public TransitDeclarationResponse getRequestTDResult() {
        return requestTDResult;
    }

    /**
     * Sets the value of the requestTDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitDeclarationResponse }
     *     
     */
    public void setRequestTDResult(TransitDeclarationResponse value) {
        this.requestTDResult = value;
    }

}
