
package com.sap.bafar.ws.aceptacontrato;

import com.tsp.sct.config.Configuration;
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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ws_accept_contract", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style", wsdlLocation = "http://svecdap1.grupobafar.com:8000/sap/bc/srt/wsdl/flv_10002A111AD1/srvc_url/sap/bc/srt/rfc/sap/zws_acepta_contrat/400/ws_accept_contract/ws_bin_accep?sap-client=400")
public class WsAcceptContract
    extends Service
{

    private final static URL WSACCEPTCONTRACT_WSDL_LOCATION;
    private final static WebServiceException WSACCEPTCONTRACT_EXCEPTION;
    private final static QName WSACCEPTCONTRACT_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ws_accept_contract");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            Configuration appConfiguration = new Configuration();
            url = new URL(appConfiguration.getSapWsBafarUrlAceptaContrato());
            //url = new URL("http://svecdap1.grupobafar.com:8000/sap/bc/srt/wsdl/flv_10002A111AD1/srvc_url/sap/bc/srt/rfc/sap/zws_acepta_contrat/400/ws_accept_contract/ws_bin_accep?sap-client=400");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSACCEPTCONTRACT_WSDL_LOCATION = url;
        WSACCEPTCONTRACT_EXCEPTION = e;
    }
    
    /**
     * Autenticacion al hacer handshake con servidor SAP y obtener el WSDL
     */
    static {
        java.net.Authenticator.setDefault(new java.net.Authenticator() {

            @Override
            protected java.net.PasswordAuthentication getPasswordAuthentication() {
                Configuration appConfiguration = new Configuration();
                return new java.net.PasswordAuthentication(appConfiguration.getSapWsBafarUser(), appConfiguration.getSapWsBafarPass().toCharArray());
            }
        });
    }

    public WsAcceptContract() {
        super(__getWsdlLocation(), WSACCEPTCONTRACT_QNAME);
    }

    public WsAcceptContract(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSACCEPTCONTRACT_QNAME, features);
    }

    public WsAcceptContract(URL wsdlLocation) {
        super(wsdlLocation, WSACCEPTCONTRACT_QNAME);
    }

    public WsAcceptContract(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSACCEPTCONTRACT_QNAME, features);
    }

    public WsAcceptContract(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsAcceptContract(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ZWSACEPTAContrat
     */
    @WebEndpoint(name = "ws_bin_accep")
    public ZWSACEPTAContrat getWsBinAccep() {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ws_bin_accep"), ZWSACEPTAContrat.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZWSACEPTAContrat
     */
    @WebEndpoint(name = "ws_bin_accep")
    public ZWSACEPTAContrat getWsBinAccep(WebServiceFeature... features) {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ws_bin_accep"), ZWSACEPTAContrat.class, features);
    }

    /**
     * 
     * @return
     *     returns ZWSACEPTAContrat
     */
    @WebEndpoint(name = "ws_bin_accep_soap12")
    public ZWSACEPTAContrat getWsBinAccepSoap12() {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ws_bin_accep_soap12"), ZWSACEPTAContrat.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZWSACEPTAContrat
     */
    @WebEndpoint(name = "ws_bin_accep_soap12")
    public ZWSACEPTAContrat getWsBinAccepSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ws_bin_accep_soap12"), ZWSACEPTAContrat.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSACCEPTCONTRACT_EXCEPTION!= null) {
            throw WSACCEPTCONTRACT_EXCEPTION;
        }
        return WSACCEPTCONTRACT_WSDL_LOCATION;
    }

}
