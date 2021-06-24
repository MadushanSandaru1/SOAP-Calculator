
package com.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multiplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multiplication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="num2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplication", propOrder = {
    "num1",
    "num2"
})
public class Multiplication {

    protected float num1;
    protected float num2;

    /**
     * Gets the value of the num1 property.
     * 
     */
    public float getNum1() {
        return num1;
    }

    /**
     * Sets the value of the num1 property.
     * 
     */
    public void setNum1(float value) {
        this.num1 = value;
    }

    /**
     * Gets the value of the num2 property.
     * 
     */
    public float getNum2() {
        return num2;
    }

    /**
     * Sets the value of the num2 property.
     * 
     */
    public void setNum2(float value) {
        this.num2 = value;
    }

}
