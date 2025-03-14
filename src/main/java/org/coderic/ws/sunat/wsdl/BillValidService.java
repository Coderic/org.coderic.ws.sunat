
package org.coderic.ws.sunat.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "billValidService", targetNamespace = "http://service.sunat.gob.pe")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BillValidService {


    /**
     * 
     * @param fechaEmision
     * @param importeTotal
     * @param nroAutorizacion
     * @param numeroCDP
     * @param numeroDocIdReceptor
     * @param rucEmisor
     * @param serieCDP
     * @param tipoCDP
     * @param tipoDocIdReceptor
     * @return
     *     returns org.coderic.ws.sunat.wsdl.StatusResponse
     */
    @WebMethod(action = "urn:validaCDPcriterios")
    @WebResult(name = "cdpvalidado", targetNamespace = "")
    @RequestWrapper(localName = "validaCDPcriterios", targetNamespace = "http://service.sunat.gob.pe", className = "org.coderic.ws.sunat.wsdl.ValidaCDPcriterios")
    @ResponseWrapper(localName = "validaCDPcriteriosResponse", targetNamespace = "http://service.sunat.gob.pe", className = "org.coderic.ws.sunat.wsdl.ValidaCDPcriteriosResponse")
    @Action(input = "urn:validaCDPcriterios", output = "http://service.sunat.gob.pe/billValidService/validaCDPcriteriosResponse")
    public StatusResponse validaCDPcriterios(
        @WebParam(name = "rucEmisor", targetNamespace = "")
        String rucEmisor,
        @WebParam(name = "tipoCDP", targetNamespace = "")
        String tipoCDP,
        @WebParam(name = "serieCDP", targetNamespace = "")
        String serieCDP,
        @WebParam(name = "numeroCDP", targetNamespace = "")
        String numeroCDP,
        @WebParam(name = "tipoDocIdReceptor", targetNamespace = "")
        String tipoDocIdReceptor,
        @WebParam(name = "numeroDocIdReceptor", targetNamespace = "")
        String numeroDocIdReceptor,
        @WebParam(name = "fechaEmision", targetNamespace = "")
        String fechaEmision,
        @WebParam(name = "importeTotal", targetNamespace = "")
        Double importeTotal,
        @WebParam(name = "nroAutorizacion", targetNamespace = "")
        String nroAutorizacion);

    /**
     * 
     * @param archivo
     * @param nombre
     * @return
     *     returns org.coderic.ws.sunat.wsdl.StatusResponse
     */
    @WebMethod(action = "urn:verificaCPEarchivo")
    @WebResult(name = "archivoverificado", targetNamespace = "")
    @RequestWrapper(localName = "verificaCPEarchivo", targetNamespace = "http://service.sunat.gob.pe", className = "org.coderic.ws.sunat.wsdl.VerificaCPEarchivo")
    @ResponseWrapper(localName = "verificaCPEarchivoResponse", targetNamespace = "http://service.sunat.gob.pe", className = "org.coderic.ws.sunat.wsdl.VerificaCPEarchivoResponse")
    @Action(input = "urn:verificaCPEarchivo", output = "http://service.sunat.gob.pe/billValidService/verificaCPEarchivoResponse")
    public StatusResponse verificaCPEarchivo(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "archivo", targetNamespace = "")
        String archivo);

}
