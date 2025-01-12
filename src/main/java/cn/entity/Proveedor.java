package cn.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName proveedor
 */
@TableName(value ="proveedor")
public class Proveedor implements Serializable {
    @TableId(value = "EmpresaID")
    private Long empresaID;
    @TableField(value = "NombreES")
    private String nombreES;
    @TableField(value = "NombreCN")
    private String nombreCN;
    @TableField(value = "CIF")
    private String CIF;


    @TableField(value = "NumeroIVA")
    private String numeroIVA;


    @TableField(value = "Domicilio")
    private String domicilio;


    @TableField(value = "CodigoPostal")
    private String codigoPostal;


    @TableField(value = "Poblacion")
    private String poblacion;


    @TableField(value = "Provincia")
    private String provincia;


    @TableField(value = "Pais")
    private String pais;


    @TableField(value = "CountryID")
    private String countryID;


    @TableField(value = "PersonaContacto")
    private String personaContacto;


    @TableField(value = "Sexo")
    private Integer sexo;


    @TableField(value = "Cumpleano")
    private Date cumpleano;


    @TableField(value = "Telefono")
    private String telefono;


    @TableField(value = "Telefono2")
    private String telefono2;


    @TableField(value = "Fax")
    private String fax;


    @TableField(value = "Email")
    private String email;


    @TableField(value = "Web")
    private String web;


    @TableField(value = "IM")
    private String IM;


    @TableField(value = "IVAClase")
    private Integer IVAClase;


    @TableField(value = "ReglaIVA")
    private Integer reglaIVA;


    @TableField(value = "FacturaPorcentaje")
    private BigDecimal facturaPorcentaje;


    @TableField(value = "FacturaDescuento")
    private BigDecimal facturaDescuento;


    @TableField(value = "FacturaSDIID")
    private String facturaSDIID;


    @TableField(value = "FacturaCEC")
    private String facturaCEC;


    @TableField(value = "BancoCuentaNo")
    private String bancoCuentaNo;


    @TableField(value = "NecesitaFactura")
    private Integer necesitaFactura;


    @TableField(value = "AutoEmailDocumento")
    private Integer autoEmailDocumento;


    @TableField(value = "Descuento")
    private BigDecimal descuento;


    @TableField(value = "DescuentoSerie")
    private Integer descuentoSerie;


    @TableField(value = "DescuentoExtra")
    private BigDecimal descuentoExtra;


    @TableField(value = "MaxSobregiro")
    private BigDecimal maxSobregiro;


    @TableField(value = "SerSocio")
    private Integer serSocio;


    @TableField(value = "TarjetaSocioID")
    private String tarjetaSocioID;


    @TableField(value = "ClaseID")
    private Integer claseID;


    @TableField(value = "AgenteID")
    private Integer agenteID;


    @TableField(value = "TransportistaID")
    private Integer transportistaID;


    @TableField(value = "TransporteModoID")
    private Integer transporteModoID;


    @TableField(value = "EnvioGasto")
    private BigDecimal envioGasto;


    @TableField(value = "CocheNo")
    private String cocheNo;


    @TableField(value = "ChinoProhibido")
    private Integer chinoProhibido;


    @TableField(value = "Extrajero")
    private Integer extrajero;


    @TableField(value = "Idioma")
    private Integer idioma;


    @TableField(value = "IdiomaSerie")
    private Integer idiomaSerie;


    @TableField(value = "PrecioUsado")
    private Integer precioUsado;


    @TableField(value = "LoginEnabled")
    private Integer loginEnabled;


    @TableField(value = "ImprimirArticuloOrden")
    private Integer imprimirArticuloOrden;


    @TableField(value = "Bloqueado")
    private Integer bloqueado;


    @TableField(value = "Observacion")
    private String observacion;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


    public Long getEmpresaID() {
        return empresaID;
    }


    public void setEmpresaID(Long empresaID) {
        this.empresaID = empresaID;
    }


    public String getNombreES() {
        return nombreES;
    }


    public void setNombreES(String nombreES) {
        this.nombreES = nombreES;
    }


    public String getNombreCN() {
        return nombreCN;
    }


    public void setNombreCN(String nombreCN) {
        this.nombreCN = nombreCN;
    }


    public String getCIF() {
        return CIF;
    }


    public void setCIF(String CIF) {
        this.CIF = CIF;
    }


    public String getNumeroIVA() {
        return numeroIVA;
    }


    public void setNumeroIVA(String numeroIVA) {
        this.numeroIVA = numeroIVA;
    }


    public String getDomicilio() {
        return domicilio;
    }


    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }


    public String getCodigoPostal() {
        return codigoPostal;
    }


    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    public String getPoblacion() {
        return poblacion;
    }


    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }


    public String getProvincia() {
        return provincia;
    }


    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }


    public String getPais() {
        return pais;
    }


    public void setPais(String pais) {
        this.pais = pais;
    }


    public String getCountryID() {
        return countryID;
    }


    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }


    public String getPersonaContacto() {
        return personaContacto;
    }


    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }


    public Integer getSexo() {
        return sexo;
    }


    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }


    public Date getCumpleano() {
        return cumpleano;
    }


    public void setCumpleano(Date cumpleano) {
        this.cumpleano = cumpleano;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getTelefono2() {
        return telefono2;
    }


    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }


    public String getFax() {
        return fax;
    }


    public void setFax(String fax) {
        this.fax = fax;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getWeb() {
        return web;
    }


    public void setWeb(String web) {
        this.web = web;
    }


    public String getIM() {
        return IM;
    }


    public void setIM(String IM) {
        this.IM = IM;
    }


    public Integer getIVAClase() {
        return IVAClase;
    }


    public void setIVAClase(Integer IVAClase) {
        this.IVAClase = IVAClase;
    }


    public Integer getReglaIVA() {
        return reglaIVA;
    }


    public void setReglaIVA(Integer reglaIVA) {
        this.reglaIVA = reglaIVA;
    }


    public BigDecimal getFacturaPorcentaje() {
        return facturaPorcentaje;
    }


    public void setFacturaPorcentaje(BigDecimal facturaPorcentaje) {
        this.facturaPorcentaje = facturaPorcentaje;
    }


    public BigDecimal getFacturaDescuento() {
        return facturaDescuento;
    }


    public void setFacturaDescuento(BigDecimal facturaDescuento) {
        this.facturaDescuento = facturaDescuento;
    }


    public String getFacturaSDIID() {
        return facturaSDIID;
    }


    public void setFacturaSDIID(String facturaSDIID) {
        this.facturaSDIID = facturaSDIID;
    }


    public String getFacturaCEC() {
        return facturaCEC;
    }


    public void setFacturaCEC(String facturaCEC) {
        this.facturaCEC = facturaCEC;
    }


    public String getBancoCuentaNo() {
        return bancoCuentaNo;
    }


    public void setBancoCuentaNo(String bancoCuentaNo) {
        this.bancoCuentaNo = bancoCuentaNo;
    }


    public Integer getNecesitaFactura() {
        return necesitaFactura;
    }


    public void setNecesitaFactura(Integer necesitaFactura) {
        this.necesitaFactura = necesitaFactura;
    }


    public Integer getAutoEmailDocumento() {
        return autoEmailDocumento;
    }


    public void setAutoEmailDocumento(Integer autoEmailDocumento) {
        this.autoEmailDocumento = autoEmailDocumento;
    }


    public BigDecimal getDescuento() {
        return descuento;
    }


    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }


    public Integer getDescuentoSerie() {
        return descuentoSerie;
    }


    public void setDescuentoSerie(Integer descuentoSerie) {
        this.descuentoSerie = descuentoSerie;
    }


    public BigDecimal getDescuentoExtra() {
        return descuentoExtra;
    }


    public void setDescuentoExtra(BigDecimal descuentoExtra) {
        this.descuentoExtra = descuentoExtra;
    }


    public BigDecimal getMaxSobregiro() {
        return maxSobregiro;
    }


    public void setMaxSobregiro(BigDecimal maxSobregiro) {
        this.maxSobregiro = maxSobregiro;
    }


    public Integer getSerSocio() {
        return serSocio;
    }


    public void setSerSocio(Integer serSocio) {
        this.serSocio = serSocio;
    }


    public String getTarjetaSocioID() {
        return tarjetaSocioID;
    }


    public void setTarjetaSocioID(String tarjetaSocioID) {
        this.tarjetaSocioID = tarjetaSocioID;
    }


    public Integer getClaseID() {
        return claseID;
    }


    public void setClaseID(Integer claseID) {
        this.claseID = claseID;
    }


    public Integer getAgenteID() {
        return agenteID;
    }


    public void setAgenteID(Integer agenteID) {
        this.agenteID = agenteID;
    }


    public Integer getTransportistaID() {
        return transportistaID;
    }


    public void setTransportistaID(Integer transportistaID) {
        this.transportistaID = transportistaID;
    }


    public Integer getTransporteModoID() {
        return transporteModoID;
    }


    public void setTransporteModoID(Integer transporteModoID) {
        this.transporteModoID = transporteModoID;
    }


    public BigDecimal getEnvioGasto() {
        return envioGasto;
    }


    public void setEnvioGasto(BigDecimal envioGasto) {
        this.envioGasto = envioGasto;
    }


    public String getCocheNo() {
        return cocheNo;
    }


    public void setCocheNo(String cocheNo) {
        this.cocheNo = cocheNo;
    }


    public Integer getChinoProhibido() {
        return chinoProhibido;
    }


    public void setChinoProhibido(Integer chinoProhibido) {
        this.chinoProhibido = chinoProhibido;
    }


    public Integer getExtrajero() {
        return extrajero;
    }


    public void setExtrajero(Integer extrajero) {
        this.extrajero = extrajero;
    }


    public Integer getIdioma() {
        return idioma;
    }


    public void setIdioma(Integer idioma) {
        this.idioma = idioma;
    }


    public Integer getIdiomaSerie() {
        return idiomaSerie;
    }


    public void setIdiomaSerie(Integer idiomaSerie) {
        this.idiomaSerie = idiomaSerie;
    }


    public Integer getPrecioUsado() {
        return precioUsado;
    }


    public void setPrecioUsado(Integer precioUsado) {
        this.precioUsado = precioUsado;
    }


    public Integer getLoginEnabled() {
        return loginEnabled;
    }


    public void setLoginEnabled(Integer loginEnabled) {
        this.loginEnabled = loginEnabled;
    }


    public Integer getImprimirArticuloOrden() {
        return imprimirArticuloOrden;
    }


    public void setImprimirArticuloOrden(Integer imprimirArticuloOrden) {
        this.imprimirArticuloOrden = imprimirArticuloOrden;
    }


    public Integer getBloqueado() {
        return bloqueado;
    }


    public void setBloqueado(Integer bloqueado) {
        this.bloqueado = bloqueado;
    }


    public String getObservacion() {
        return observacion;
    }


    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Proveedor other = (Proveedor) that;
        return (this.getEmpresaID() == null ? other.getEmpresaID() == null : this.getEmpresaID().equals(other.getEmpresaID()))
            && (this.getNombreES() == null ? other.getNombreES() == null : this.getNombreES().equals(other.getNombreES()))
            && (this.getNombreCN() == null ? other.getNombreCN() == null : this.getNombreCN().equals(other.getNombreCN()))
            && (this.getCIF() == null ? other.getCIF() == null : this.getCIF().equals(other.getCIF()))
            && (this.getNumeroIVA() == null ? other.getNumeroIVA() == null : this.getNumeroIVA().equals(other.getNumeroIVA()))
            && (this.getDomicilio() == null ? other.getDomicilio() == null : this.getDomicilio().equals(other.getDomicilio()))
            && (this.getCodigoPostal() == null ? other.getCodigoPostal() == null : this.getCodigoPostal().equals(other.getCodigoPostal()))
            && (this.getPoblacion() == null ? other.getPoblacion() == null : this.getPoblacion().equals(other.getPoblacion()))
            && (this.getProvincia() == null ? other.getProvincia() == null : this.getProvincia().equals(other.getProvincia()))
            && (this.getPais() == null ? other.getPais() == null : this.getPais().equals(other.getPais()))
            && (this.getCountryID() == null ? other.getCountryID() == null : this.getCountryID().equals(other.getCountryID()))
            && (this.getPersonaContacto() == null ? other.getPersonaContacto() == null : this.getPersonaContacto().equals(other.getPersonaContacto()))
            && (this.getSexo() == null ? other.getSexo() == null : this.getSexo().equals(other.getSexo()))
            && (this.getCumpleano() == null ? other.getCumpleano() == null : this.getCumpleano().equals(other.getCumpleano()))
            && (this.getTelefono() == null ? other.getTelefono() == null : this.getTelefono().equals(other.getTelefono()))
            && (this.getTelefono2() == null ? other.getTelefono2() == null : this.getTelefono2().equals(other.getTelefono2()))
            && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getWeb() == null ? other.getWeb() == null : this.getWeb().equals(other.getWeb()))
            && (this.getIM() == null ? other.getIM() == null : this.getIM().equals(other.getIM()))
            && (this.getIVAClase() == null ? other.getIVAClase() == null : this.getIVAClase().equals(other.getIVAClase()))
            && (this.getReglaIVA() == null ? other.getReglaIVA() == null : this.getReglaIVA().equals(other.getReglaIVA()))
            && (this.getFacturaPorcentaje() == null ? other.getFacturaPorcentaje() == null : this.getFacturaPorcentaje().equals(other.getFacturaPorcentaje()))
            && (this.getFacturaDescuento() == null ? other.getFacturaDescuento() == null : this.getFacturaDescuento().equals(other.getFacturaDescuento()))
            && (this.getFacturaSDIID() == null ? other.getFacturaSDIID() == null : this.getFacturaSDIID().equals(other.getFacturaSDIID()))
            && (this.getFacturaCEC() == null ? other.getFacturaCEC() == null : this.getFacturaCEC().equals(other.getFacturaCEC()))
            && (this.getBancoCuentaNo() == null ? other.getBancoCuentaNo() == null : this.getBancoCuentaNo().equals(other.getBancoCuentaNo()))
            && (this.getNecesitaFactura() == null ? other.getNecesitaFactura() == null : this.getNecesitaFactura().equals(other.getNecesitaFactura()))
            && (this.getAutoEmailDocumento() == null ? other.getAutoEmailDocumento() == null : this.getAutoEmailDocumento().equals(other.getAutoEmailDocumento()))
            && (this.getDescuento() == null ? other.getDescuento() == null : this.getDescuento().equals(other.getDescuento()))
            && (this.getDescuentoSerie() == null ? other.getDescuentoSerie() == null : this.getDescuentoSerie().equals(other.getDescuentoSerie()))
            && (this.getDescuentoExtra() == null ? other.getDescuentoExtra() == null : this.getDescuentoExtra().equals(other.getDescuentoExtra()))
            && (this.getMaxSobregiro() == null ? other.getMaxSobregiro() == null : this.getMaxSobregiro().equals(other.getMaxSobregiro()))
            && (this.getSerSocio() == null ? other.getSerSocio() == null : this.getSerSocio().equals(other.getSerSocio()))
            && (this.getTarjetaSocioID() == null ? other.getTarjetaSocioID() == null : this.getTarjetaSocioID().equals(other.getTarjetaSocioID()))
            && (this.getClaseID() == null ? other.getClaseID() == null : this.getClaseID().equals(other.getClaseID()))
            && (this.getAgenteID() == null ? other.getAgenteID() == null : this.getAgenteID().equals(other.getAgenteID()))
            && (this.getTransportistaID() == null ? other.getTransportistaID() == null : this.getTransportistaID().equals(other.getTransportistaID()))
            && (this.getTransporteModoID() == null ? other.getTransporteModoID() == null : this.getTransporteModoID().equals(other.getTransporteModoID()))
            && (this.getEnvioGasto() == null ? other.getEnvioGasto() == null : this.getEnvioGasto().equals(other.getEnvioGasto()))
            && (this.getCocheNo() == null ? other.getCocheNo() == null : this.getCocheNo().equals(other.getCocheNo()))
            && (this.getChinoProhibido() == null ? other.getChinoProhibido() == null : this.getChinoProhibido().equals(other.getChinoProhibido()))
            && (this.getExtrajero() == null ? other.getExtrajero() == null : this.getExtrajero().equals(other.getExtrajero()))
            && (this.getIdioma() == null ? other.getIdioma() == null : this.getIdioma().equals(other.getIdioma()))
            && (this.getIdiomaSerie() == null ? other.getIdiomaSerie() == null : this.getIdiomaSerie().equals(other.getIdiomaSerie()))
            && (this.getPrecioUsado() == null ? other.getPrecioUsado() == null : this.getPrecioUsado().equals(other.getPrecioUsado()))
            && (this.getLoginEnabled() == null ? other.getLoginEnabled() == null : this.getLoginEnabled().equals(other.getLoginEnabled()))
            && (this.getImprimirArticuloOrden() == null ? other.getImprimirArticuloOrden() == null : this.getImprimirArticuloOrden().equals(other.getImprimirArticuloOrden()))
            && (this.getBloqueado() == null ? other.getBloqueado() == null : this.getBloqueado().equals(other.getBloqueado()))
            && (this.getObservacion() == null ? other.getObservacion() == null : this.getObservacion().equals(other.getObservacion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmpresaID() == null) ? 0 : getEmpresaID().hashCode());
        result = prime * result + ((getNombreES() == null) ? 0 : getNombreES().hashCode());
        result = prime * result + ((getNombreCN() == null) ? 0 : getNombreCN().hashCode());
        result = prime * result + ((getCIF() == null) ? 0 : getCIF().hashCode());
        result = prime * result + ((getNumeroIVA() == null) ? 0 : getNumeroIVA().hashCode());
        result = prime * result + ((getDomicilio() == null) ? 0 : getDomicilio().hashCode());
        result = prime * result + ((getCodigoPostal() == null) ? 0 : getCodigoPostal().hashCode());
        result = prime * result + ((getPoblacion() == null) ? 0 : getPoblacion().hashCode());
        result = prime * result + ((getProvincia() == null) ? 0 : getProvincia().hashCode());
        result = prime * result + ((getPais() == null) ? 0 : getPais().hashCode());
        result = prime * result + ((getCountryID() == null) ? 0 : getCountryID().hashCode());
        result = prime * result + ((getPersonaContacto() == null) ? 0 : getPersonaContacto().hashCode());
        result = prime * result + ((getSexo() == null) ? 0 : getSexo().hashCode());
        result = prime * result + ((getCumpleano() == null) ? 0 : getCumpleano().hashCode());
        result = prime * result + ((getTelefono() == null) ? 0 : getTelefono().hashCode());
        result = prime * result + ((getTelefono2() == null) ? 0 : getTelefono2().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getWeb() == null) ? 0 : getWeb().hashCode());
        result = prime * result + ((getIM() == null) ? 0 : getIM().hashCode());
        result = prime * result + ((getIVAClase() == null) ? 0 : getIVAClase().hashCode());
        result = prime * result + ((getReglaIVA() == null) ? 0 : getReglaIVA().hashCode());
        result = prime * result + ((getFacturaPorcentaje() == null) ? 0 : getFacturaPorcentaje().hashCode());
        result = prime * result + ((getFacturaDescuento() == null) ? 0 : getFacturaDescuento().hashCode());
        result = prime * result + ((getFacturaSDIID() == null) ? 0 : getFacturaSDIID().hashCode());
        result = prime * result + ((getFacturaCEC() == null) ? 0 : getFacturaCEC().hashCode());
        result = prime * result + ((getBancoCuentaNo() == null) ? 0 : getBancoCuentaNo().hashCode());
        result = prime * result + ((getNecesitaFactura() == null) ? 0 : getNecesitaFactura().hashCode());
        result = prime * result + ((getAutoEmailDocumento() == null) ? 0 : getAutoEmailDocumento().hashCode());
        result = prime * result + ((getDescuento() == null) ? 0 : getDescuento().hashCode());
        result = prime * result + ((getDescuentoSerie() == null) ? 0 : getDescuentoSerie().hashCode());
        result = prime * result + ((getDescuentoExtra() == null) ? 0 : getDescuentoExtra().hashCode());
        result = prime * result + ((getMaxSobregiro() == null) ? 0 : getMaxSobregiro().hashCode());
        result = prime * result + ((getSerSocio() == null) ? 0 : getSerSocio().hashCode());
        result = prime * result + ((getTarjetaSocioID() == null) ? 0 : getTarjetaSocioID().hashCode());
        result = prime * result + ((getClaseID() == null) ? 0 : getClaseID().hashCode());
        result = prime * result + ((getAgenteID() == null) ? 0 : getAgenteID().hashCode());
        result = prime * result + ((getTransportistaID() == null) ? 0 : getTransportistaID().hashCode());
        result = prime * result + ((getTransporteModoID() == null) ? 0 : getTransporteModoID().hashCode());
        result = prime * result + ((getEnvioGasto() == null) ? 0 : getEnvioGasto().hashCode());
        result = prime * result + ((getCocheNo() == null) ? 0 : getCocheNo().hashCode());
        result = prime * result + ((getChinoProhibido() == null) ? 0 : getChinoProhibido().hashCode());
        result = prime * result + ((getExtrajero() == null) ? 0 : getExtrajero().hashCode());
        result = prime * result + ((getIdioma() == null) ? 0 : getIdioma().hashCode());
        result = prime * result + ((getIdiomaSerie() == null) ? 0 : getIdiomaSerie().hashCode());
        result = prime * result + ((getPrecioUsado() == null) ? 0 : getPrecioUsado().hashCode());
        result = prime * result + ((getLoginEnabled() == null) ? 0 : getLoginEnabled().hashCode());
        result = prime * result + ((getImprimirArticuloOrden() == null) ? 0 : getImprimirArticuloOrden().hashCode());
        result = prime * result + ((getBloqueado() == null) ? 0 : getBloqueado().hashCode());
        result = prime * result + ((getObservacion() == null) ? 0 : getObservacion().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empresaID=").append(empresaID);
        sb.append(", nombreES=").append(nombreES);
        sb.append(", nombreCN=").append(nombreCN);
        sb.append(", CIF=").append(CIF);
        sb.append(", numeroIVA=").append(numeroIVA);
        sb.append(", domicilio=").append(domicilio);
        sb.append(", codigoPostal=").append(codigoPostal);
        sb.append(", poblacion=").append(poblacion);
        sb.append(", provincia=").append(provincia);
        sb.append(", pais=").append(pais);
        sb.append(", countryID=").append(countryID);
        sb.append(", personaContacto=").append(personaContacto);
        sb.append(", sexo=").append(sexo);
        sb.append(", cumpleano=").append(cumpleano);
        sb.append(", telefono=").append(telefono);
        sb.append(", telefono2=").append(telefono2);
        sb.append(", fax=").append(fax);
        sb.append(", email=").append(email);
        sb.append(", web=").append(web);
        sb.append(", IM=").append(IM);
        sb.append(", IVAClase=").append(IVAClase);
        sb.append(", reglaIVA=").append(reglaIVA);
        sb.append(", facturaPorcentaje=").append(facturaPorcentaje);
        sb.append(", facturaDescuento=").append(facturaDescuento);
        sb.append(", facturaSDIID=").append(facturaSDIID);
        sb.append(", facturaCEC=").append(facturaCEC);
        sb.append(", bancoCuentaNo=").append(bancoCuentaNo);
        sb.append(", necesitaFactura=").append(necesitaFactura);
        sb.append(", autoEmailDocumento=").append(autoEmailDocumento);
        sb.append(", descuento=").append(descuento);
        sb.append(", descuentoSerie=").append(descuentoSerie);
        sb.append(", descuentoExtra=").append(descuentoExtra);
        sb.append(", maxSobregiro=").append(maxSobregiro);
        sb.append(", serSocio=").append(serSocio);
        sb.append(", tarjetaSocioID=").append(tarjetaSocioID);
        sb.append(", claseID=").append(claseID);
        sb.append(", agenteID=").append(agenteID);
        sb.append(", transportistaID=").append(transportistaID);
        sb.append(", transporteModoID=").append(transporteModoID);
        sb.append(", envioGasto=").append(envioGasto);
        sb.append(", cocheNo=").append(cocheNo);
        sb.append(", chinoProhibido=").append(chinoProhibido);
        sb.append(", extrajero=").append(extrajero);
        sb.append(", idioma=").append(idioma);
        sb.append(", idiomaSerie=").append(idiomaSerie);
        sb.append(", precioUsado=").append(precioUsado);
        sb.append(", loginEnabled=").append(loginEnabled);
        sb.append(", imprimirArticuloOrden=").append(imprimirArticuloOrden);
        sb.append(", bloqueado=").append(bloqueado);
        sb.append(", observacion=").append(observacion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}