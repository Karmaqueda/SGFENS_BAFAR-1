
package com.tsp.ws.lco;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "consultaLCOService", targetNamespace = "http://lco.ws.tsp.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConsultaLCOService {


    /**
     * 
     * @param noCertificado
     * @param rfc
     * @return
     *     returns com.tsp.ws.lco.Lco
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByRfcAndCertificado", targetNamespace = "http://lco.ws.tsp.com/", className = "com.tsp.ws.lco.FindByRfcAndCertificado")
    @ResponseWrapper(localName = "findByRfcAndCertificadoResponse", targetNamespace = "http://lco.ws.tsp.com/", className = "com.tsp.ws.lco.FindByRfcAndCertificadoResponse")
    public Lco findByRfcAndCertificado(
        @WebParam(name = "rfc", targetNamespace = "")
        String rfc,
        @WebParam(name = "noCertificado", targetNamespace = "")
        String noCertificado);

    /**
     * 
     * @param rfc
     * @return
     *     returns java.util.List<com.tsp.ws.lco.Lco>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByRFC", targetNamespace = "http://lco.ws.tsp.com/", className = "com.tsp.ws.lco.FindByRFC")
    @ResponseWrapper(localName = "findByRFCResponse", targetNamespace = "http://lco.ws.tsp.com/", className = "com.tsp.ws.lco.FindByRFCResponse")
    public List<Lco> findByRFC(
        @WebParam(name = "rfc", targetNamespace = "")
        String rfc);

    /**
     * 
     * @param noCertificado
     * @return
     *     returns com.tsp.ws.lco.Lco
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByCertificado", targetNamespace = "http://lco.ws.tsp.com/", className = "com.tsp.ws.lco.FindByCertificado")
    @ResponseWrapper(localName = "findByCertificadoResponse", targetNamespace = "http://lco.ws.tsp.com/", className = "com.tsp.ws.lco.FindByCertificadoResponse")
    public Lco findByCertificado(
        @WebParam(name = "noCertificado", targetNamespace = "")
        String noCertificado);

}
