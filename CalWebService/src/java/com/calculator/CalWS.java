/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Sandaruwan
 */
@WebService(serviceName = "CalWS")
@Stateless()
public class CalWS {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param num1
     * @param num2
     * @return 
     */
    @WebMethod(operationName = "addition")
    public float addition(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        //TODO write your implementation code here:
        return num1 + num2;
    }

    /**
     * Web service operation
     * @param num1
     * @param num2
     * @return 
     */
    @WebMethod(operationName = "substraction")
    public float substraction(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        //TODO write your implementation code here:
        return num1 - num2;
    }

    /**
     * Web service operation
     * @param num1
     * @param num2
     * @return 
     */
    @WebMethod(operationName = "multiplication")
    public float multiplication(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        //TODO write your implementation code here:
        return num1 * num2;
    }

    /**
     * Web service operation
     * @param num1
     * @param num2
     * @return 
     */
    @WebMethod(operationName = "divition")
    public float divition(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        //TODO write your implementation code here:
        return num1 / num2;
    }

}
