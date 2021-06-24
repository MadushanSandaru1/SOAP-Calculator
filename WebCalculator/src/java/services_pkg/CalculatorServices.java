
package services_pkg;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class CalculatorServices {
    @WebMethod
    public float addition(@WebParam(name="number1")float num1, @WebParam(name="number2") float num2){
        return num1 + num2;
    }
    
    @WebMethod
    public float substraction(@WebParam(name="number1")float num1, @WebParam(name="number2") float num2){
        return num1 - num2;
    }
    
    @WebMethod
    public float multiplication(@WebParam(name="number1")float num1, @WebParam(name="number2") float num2){
        return num1 * num2;
    }
    
    @WebMethod
    public float divition(@WebParam(name="number1")float num1, @WebParam(name="number2") float num2){
        return num1 / num2;
    }
}
