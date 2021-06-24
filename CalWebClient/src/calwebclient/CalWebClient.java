/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calwebclient;

/**
 *
 * @author Sandaruwan
 */
public class CalWebClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println("Addition: "+addition(10, 7));
        } catch (Exception e) {
        }
    }

    private static float addition(float num1, float num2) {
        com.calculator.CalWS_Service service = new com.calculator.CalWS_Service();
        com.calculator.CalWS port = service.getCalWSPort();
        return port.addition(num1, num2);
    }

    private static float substraction(float num1, float num2) {
        com.calculator.CalWS_Service service = new com.calculator.CalWS_Service();
        com.calculator.CalWS port = service.getCalWSPort();
        return port.substraction(num1, num2);
    }

    private static float multiplication(float num1, float num2) {
        com.calculator.CalWS_Service service = new com.calculator.CalWS_Service();
        com.calculator.CalWS port = service.getCalWSPort();
        return port.multiplication(num1, num2);
    }

    private static float divition(float num1, float num2) {
        com.calculator.CalWS_Service service = new com.calculator.CalWS_Service();
        com.calculator.CalWS port = service.getCalWSPort();
        return port.divition(num1, num2);
    }
    
}
