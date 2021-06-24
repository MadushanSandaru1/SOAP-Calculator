
package com.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for substraction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="substraction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="num1" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="num2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "substraction", propOrder = {
    "num1",
    "num2"
})
public class Substraction {

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
