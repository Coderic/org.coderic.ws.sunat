
package org.coderic.ws.sunat.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verificaCPEarchivoResponse complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType name="verificaCPEarchivoResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="archivoverificado" type="{http://service.sunat.gob.pe}statusResponse" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificaCPEarchivoResponse", propOrder = {
    "archivoverificado"
})
public class VerificaCPEarchivoResponse {

    protected StatusResponse archivoverificado;

    /**
     * Obtiene el valor de la propiedad archivoverificado.
     * 
     * @return
     *     possible object is
     *     {@link StatusResponse }
     *     
     */
    public StatusResponse getArchivoverificado() {
        return archivoverificado;
    }

    /**
     * Define el valor de la propiedad archivoverificado.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusResponse }
     *     
     */
    public void setArchivoverificado(StatusResponse value) {
        this.archivoverificado = value;
    }

}
