
package com.calculator;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CalWS", targetNamespace = "http://calculator.com/", wsdlLocation = "http://localhost:8080/CalWS/CalWS?wsdl")
public class CalWS_Service
    extends Service
{

    private final static URL CALWS_WSDL_LOCATION;
    private final static WebServiceException CALWS_EXCEPTION;
    private final static QName CALWS_QNAME = new QName("http://calculator.com/", "CalWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CalWS/CalWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALWS_WSDL_LOCATION = url;
        CALWS_EXCEPTION = e;
    }

    public CalWS_Service() {
        super(__getWsdlLocation(), CALWS_QNAME);
    }

    public CalWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALWS_QNAME, features);
    }

    public CalWS_Service(URL wsdlLocation) {
        super(wsdlLocation, CALWS_QNAME);
    }

    public CalWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALWS_QNAME, features);
    }

    public CalWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalWS
     */
    @WebEndpoint(name = "CalWSPort")
    public CalWS getCalWSPort() {
        return super.getPort(new QName("http://calculator.com/", "CalWSPort"), CalWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalWS
     */
    @WebEndpoint(name = "CalWSPort")
    public CalWS getCalWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://calculator.com/", "CalWSPort"), CalWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALWS_EXCEPTION!= null) {
            throw CALWS_EXCEPTION;
        }
        return CALWS_WSDL_LOCATION;
    }

}
