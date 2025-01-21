
package org.coderic.ws.sunat.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validaCDPcriterios complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType name="validaCDPcriterios">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="rucEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tipoCDP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="serieCDP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numeroCDP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tipoDocIdReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numeroDocIdReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="importeTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nroAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validaCDPcriterios", propOrder = {
    "rucEmisor",
    "tipoCDP",
    "serieCDP",
    "numeroCDP",
    "tipoDocIdReceptor",
    "numeroDocIdReceptor",
    "fechaEmision",
    "importeTotal",
    "nroAutorizacion"
})
public class ValidaCDPcriterios {

    protected String rucEmisor;
    protected String tipoCDP;
    protected String serieCDP;
    protected String numeroCDP;
    protected String tipoDocIdReceptor;
    protected String numeroDocIdReceptor;
    protected String fechaEmision;
    protected Double importeTotal;
    protected String nroAutorizacion;

    /**
     * Obtiene el valor de la propiedad rucEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucEmisor() {
        return rucEmisor;
    }

    /**
     * Define el valor de la propiedad rucEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucEmisor(String value) {
        this.rucEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCDP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCDP() {
        return tipoCDP;
    }

    /**
     * Define el valor de la propiedad tipoCDP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCDP(String value) {
        this.tipoCDP = value;
    }

    /**
     * Obtiene el valor de la propiedad serieCDP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieCDP() {
        return serieCDP;
    }

    /**
     * Define el valor de la propiedad serieCDP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieCDP(String value) {
        this.serieCDP = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCDP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCDP() {
        return numeroCDP;
    }

    /**
     * Define el valor de la propiedad numeroCDP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCDP(String value) {
        this.numeroCDP = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocIdReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocIdReceptor() {
        return tipoDocIdReceptor;
    }

    /**
     * Define el valor de la propiedad tipoDocIdReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocIdReceptor(String value) {
        this.tipoDocIdReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocIdReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocIdReceptor() {
        return numeroDocIdReceptor;
    }

    /**
     * Define el valor de la propiedad numeroDocIdReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocIdReceptor(String value) {
        this.numeroDocIdReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEmision(String value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteTotal(Double value) {
        this.importeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad nroAutorizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroAutorizacion() {
        return nroAutorizacion;
    }

    /**
     * Define el valor de la propiedad nroAutorizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroAutorizacion(String value) {
        this.nroAutorizacion = value;
    }

}
