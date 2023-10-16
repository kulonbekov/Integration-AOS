
package com.axelor.apps.navigation.integration.org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Good complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Good">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="HSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoodsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrossWeight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Good", propOrder = {
    "itemNum",
    "hsCode",
    "goodsName",
    "grossWeight"
})
public class Good {

    @XmlElement(name = "ItemNum")
    protected short itemNum;
    @XmlElement(name = "HSCode")
    protected String hsCode;
    @XmlElement(name = "GoodsName")
    protected String goodsName;
    @XmlElement(name = "GrossWeight", required = true)
    protected BigDecimal grossWeight;

    /**
     * Gets the value of the itemNum property.
     * 
     */
    public short getItemNum() {
        return itemNum;
    }

    /**
     * Sets the value of the itemNum property.
     * 
     */
    public void setItemNum(short value) {
        this.itemNum = value;
    }

    /**
     * Gets the value of the hsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSCode() {
        return hsCode;
    }

    /**
     * Sets the value of the hsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSCode(String value) {
        this.hsCode = value;
    }

    /**
     * Gets the value of the goodsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * Sets the value of the goodsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsName(String value) {
        this.goodsName = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossWeight(BigDecimal value) {
        this.grossWeight = value;
    }

}
