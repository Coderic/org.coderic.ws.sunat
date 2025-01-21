
package org.coderic.ws.sunat.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sendBillResponse complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType name="sendBillResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="applicationResponse" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendBillResponse", propOrder = {
    "applicationResponse"
})
public class SendBillResponse {

    protected byte[] applicationResponse;

    /**
     * Obtiene el valor de la propiedad applicationResponse.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getApplicationResponse() {
        return applicationResponse;
    }

    /**
     * Define el valor de la propiedad applicationResponse.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setApplicationResponse(byte[] value) {
        this.applicationResponse = value;
    }

}
