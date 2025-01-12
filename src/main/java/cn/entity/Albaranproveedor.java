package cn.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName albaranproveedor
 */
@TableName(value ="albaranproveedor")
public class Albaranproveedor implements Serializable {
    @TableId(value = "DocumentoNo")
    private Long documentoNo;
    @TableField(value = "DocumentoNoEnServidor")
    private Long documentoNoEnServidor;
    @TableField(value = "DocumentoNoOriginal")
    private Long documentoNoOriginal;
    @TableField(value = "EmpresaID")
    private Long empresaID;
    @TableField(value = "SucursalID")
    private Integer sucursalID;
    @TableField(value = "Descuento")
    private BigDecimal descuento;
    @TableField(value = "Descuento2")
    private BigDecimal descuento2;
    @TableField(value = "DescuentoDirecto")
    private BigDecimal descuentoDirecto;
    @TableField(value = "ReglaIVA")
    private Integer reglaIVA;
    @TableField(value = "IVASerie")
    private Integer IVASerie;
    @TableField(value = "PrecioUsado")
    private Integer precioUsado;
    @TableField(value = "Total")
    private BigDecimal total;
    @TableField(value = "DescuentoTotal")
    private BigDecimal descuentoTotal;
    @TableField(value = "DescuentoExtra")
    private BigDecimal descuentoExtra;
    @TableField(value = "Ganancias")
    private BigDecimal ganancias;
    @TableField(value = "PagoTotal")
    private BigDecimal pagoTotal;
    @TableField(value = "CantidadTotal")
    private BigDecimal cantidadTotal;
    @TableField(value = "PaqueteTotal")
    private BigDecimal paqueteTotal;
    @TableField(value = "CajaTotal")
    private BigDecimal cajaTotal;
    @TableField(value = "VolumenPesoTotal")
    private BigDecimal volumenPesoTotal;
    @TableField(value = "LineaTotal")
    private Integer lineaTotal;
    @TableField(value = "Fecha")
    private Date fecha;
    @TableField(value = "FechaEntrada")
    private Date fechaEntrada;
    @TableField(value = "FechaOriginal")
    private Date fechaOriginal;
    @TableField(value = "TiempoUltimoEditar")
    private Date tiempoUltimoEditar;
    @TableField(value = "TiempoUltimoActualizar")
    private Date tiempoUltimoActualizar;
    @TableField(value = "DocumentoOrigenTipo")
    private String documentoOrigenTipo;
    @TableField(value = "DocumentoOrigenNo")
    private Long documentoOrigenNo;
    @TableField(value = "DocumentoDestinoTipo")
    private String documentoDestinoTipo;
    @TableField(value = "DocumentoDestinoNo")
    private Long documentoDestinoNo;
    @TableField(value = "AgenteID")
    private Integer agenteID;
    @TableField(value = "TransportistaID")
    private Integer transportistaID;
    @TableField(value = "TransporteModoID")
    private Integer transporteModoID;
    @TableField(value = "EnvioGasto")
    private BigDecimal envioGasto;
    @TableField(value = "OperadorID")
    private Integer operadorID;
    @TableField(value = "VerificadorID")
    private Integer verificadorID;
    @TableField(value = "AlmacenID")
    private Integer almacenID;
    @TableField(value = "DocumentoAdjuntoSimbolo")
    private String documentoAdjuntoSimbolo;
    @TableField(value = "OrdenadorNombre")
    private String ordenadorNombre;
    @TableField(value = "DeviceUUID")
    private String deviceUUID;
    @TableField(value = "DocumentoHash")
    private String documentoHash;
    @TableField(value = "SubTiendaID")
    private String subTiendaID;
    @TableField(value = "DocumentoIntercambioNo")
    private Long documentoIntercambioNo;
    @TableField(value = "Bloqueado")
    private Integer bloqueado;
    @TableField(value = "Anulado")
    private Integer anulado;
    @TableField(value = "Modificando")
    private Integer modificando;
    @TableField(value = "EmailMandado")
    private Integer emailMandado;
    @TableField(value = "ProgressID")
    private Integer progressID;
    @TableField(value = "ProgressStatus")
    private Integer progressStatus;
    @TableField(value = "LogID")
    private Long logID;
    @TableField(value = "HayAdjunto")
    private Integer hayAdjunto;
    @TableField(value = "Imprimido")
    private Integer imprimido;
    @TableField(value = "Observacion")
    private String observacion;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    @TableField(exist = false)
    private String ProNombreES;

    public String getProNombreES() {
        return ProNombreES;
    }

    public void setProNombreES(String proNombreES) {
        ProNombreES = proNombreES;
    }

    public Long getDocumentoNo() {
        return documentoNo;
    }


    public void setDocumentoNo(Long documentoNo) {
        this.documentoNo = documentoNo;
    }


    public Long getDocumentoNoEnServidor() {
        return documentoNoEnServidor;
    }


    public void setDocumentoNoEnServidor(Long documentoNoEnServidor) {
        this.documentoNoEnServidor = documentoNoEnServidor;
    }


    public Long getDocumentoNoOriginal() {
        return documentoNoOriginal;
    }


    public void setDocumentoNoOriginal(Long documentoNoOriginal) {
        this.documentoNoOriginal = documentoNoOriginal;
    }


    public Long getEmpresaID() {
        return empresaID;
    }


    public void setEmpresaID(Long empresaID) {
        this.empresaID = empresaID;
    }


    public Integer getSucursalID() {
        return sucursalID;
    }


    public void setSucursalID(Integer sucursalID) {
        this.sucursalID = sucursalID;
    }


    public BigDecimal getDescuento() {
        return descuento;
    }


    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }


    public BigDecimal getDescuento2() {
        return descuento2;
    }


    public void setDescuento2(BigDecimal descuento2) {
        this.descuento2 = descuento2;
    }


    public BigDecimal getDescuentoDirecto() {
        return descuentoDirecto;
    }


    public void setDescuentoDirecto(BigDecimal descuentoDirecto) {
        this.descuentoDirecto = descuentoDirecto;
    }


    public Integer getReglaIVA() {
        return reglaIVA;
    }


    public void setReglaIVA(Integer reglaIVA) {
        this.reglaIVA = reglaIVA;
    }


    public Integer getIVASerie() {
        return IVASerie;
    }


    public void setIVASerie(Integer IVASerie) {
        this.IVASerie = IVASerie;
    }


    public Integer getPrecioUsado() {
        return precioUsado;
    }


    public void setPrecioUsado(Integer precioUsado) {
        this.precioUsado = precioUsado;
    }


    public BigDecimal getTotal() {
        return total;
    }


    public void setTotal(BigDecimal total) {
        this.total = total;
    }


    public BigDecimal getDescuentoTotal() {
        return descuentoTotal;
    }


    public void setDescuentoTotal(BigDecimal descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }


    public BigDecimal getDescuentoExtra() {
        return descuentoExtra;
    }


    public void setDescuentoExtra(BigDecimal descuentoExtra) {
        this.descuentoExtra = descuentoExtra;
    }


    public BigDecimal getGanancias() {
        return ganancias;
    }


    public void setGanancias(BigDecimal ganancias) {
        this.ganancias = ganancias;
    }


    public BigDecimal getPagoTotal() {
        return pagoTotal;
    }


    public void setPagoTotal(BigDecimal pagoTotal) {
        this.pagoTotal = pagoTotal;
    }


    public BigDecimal getCantidadTotal() {
        return cantidadTotal;
    }


    public void setCantidadTotal(BigDecimal cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }


    public BigDecimal getPaqueteTotal() {
        return paqueteTotal;
    }


    public void setPaqueteTotal(BigDecimal paqueteTotal) {
        this.paqueteTotal = paqueteTotal;
    }


    public BigDecimal getCajaTotal() {
        return cajaTotal;
    }


    public void setCajaTotal(BigDecimal cajaTotal) {
        this.cajaTotal = cajaTotal;
    }


    public BigDecimal getVolumenPesoTotal() {
        return volumenPesoTotal;
    }


    public void setVolumenPesoTotal(BigDecimal volumenPesoTotal) {
        this.volumenPesoTotal = volumenPesoTotal;
    }


    public Integer getLineaTotal() {
        return lineaTotal;
    }


    public void setLineaTotal(Integer lineaTotal) {
        this.lineaTotal = lineaTotal;
    }


    public Date getFecha() {
        return fecha;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public Date getFechaEntrada() {
        return fechaEntrada;
    }


    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }


    public Date getFechaOriginal() {
        return fechaOriginal;
    }


    public void setFechaOriginal(Date fechaOriginal) {
        this.fechaOriginal = fechaOriginal;
    }


    public Date getTiempoUltimoEditar() {
        return tiempoUltimoEditar;
    }


    public void setTiempoUltimoEditar(Date tiempoUltimoEditar) {
        this.tiempoUltimoEditar = tiempoUltimoEditar;
    }


    public Date getTiempoUltimoActualizar() {
        return tiempoUltimoActualizar;
    }


    public void setTiempoUltimoActualizar(Date tiempoUltimoActualizar) {
        this.tiempoUltimoActualizar = tiempoUltimoActualizar;
    }


    public String getDocumentoOrigenTipo() {
        return documentoOrigenTipo;
    }


    public void setDocumentoOrigenTipo(String documentoOrigenTipo) {
        this.documentoOrigenTipo = documentoOrigenTipo;
    }


    public Long getDocumentoOrigenNo() {
        return documentoOrigenNo;
    }


    public void setDocumentoOrigenNo(Long documentoOrigenNo) {
        this.documentoOrigenNo = documentoOrigenNo;
    }


    public String getDocumentoDestinoTipo() {
        return documentoDestinoTipo;
    }


    public void setDocumentoDestinoTipo(String documentoDestinoTipo) {
        this.documentoDestinoTipo = documentoDestinoTipo;
    }


    public Long getDocumentoDestinoNo() {
        return documentoDestinoNo;
    }


    public void setDocumentoDestinoNo(Long documentoDestinoNo) {
        this.documentoDestinoNo = documentoDestinoNo;
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


    public Integer getOperadorID() {
        return operadorID;
    }


    public void setOperadorID(Integer operadorID) {
        this.operadorID = operadorID;
    }


    public Integer getVerificadorID() {
        return verificadorID;
    }


    public void setVerificadorID(Integer verificadorID) {
        this.verificadorID = verificadorID;
    }


    public Integer getAlmacenID() {
        return almacenID;
    }


    public void setAlmacenID(Integer almacenID) {
        this.almacenID = almacenID;
    }


    public String getDocumentoAdjuntoSimbolo() {
        return documentoAdjuntoSimbolo;
    }


    public void setDocumentoAdjuntoSimbolo(String documentoAdjuntoSimbolo) {
        this.documentoAdjuntoSimbolo = documentoAdjuntoSimbolo;
    }


    public String getOrdenadorNombre() {
        return ordenadorNombre;
    }


    public void setOrdenadorNombre(String ordenadorNombre) {
        this.ordenadorNombre = ordenadorNombre;
    }


    public String getDeviceUUID() {
        return deviceUUID;
    }


    public void setDeviceUUID(String deviceUUID) {
        this.deviceUUID = deviceUUID;
    }


    public String getDocumentoHash() {
        return documentoHash;
    }


    public void setDocumentoHash(String documentoHash) {
        this.documentoHash = documentoHash;
    }


    public String getSubTiendaID() {
        return subTiendaID;
    }


    public void setSubTiendaID(String subTiendaID) {
        this.subTiendaID = subTiendaID;
    }


    public Long getDocumentoIntercambioNo() {
        return documentoIntercambioNo;
    }


    public void setDocumentoIntercambioNo(Long documentoIntercambioNo) {
        this.documentoIntercambioNo = documentoIntercambioNo;
    }


    public Integer getBloqueado() {
        return bloqueado;
    }


    public void setBloqueado(Integer bloqueado) {
        this.bloqueado = bloqueado;
    }


    public Integer getAnulado() {
        return anulado;
    }


    public void setAnulado(Integer anulado) {
        this.anulado = anulado;
    }


    public Integer getModificando() {
        return modificando;
    }


    public void setModificando(Integer modificando) {
        this.modificando = modificando;
    }


    public Integer getEmailMandado() {
        return emailMandado;
    }


    public void setEmailMandado(Integer emailMandado) {
        this.emailMandado = emailMandado;
    }


    public Integer getProgressID() {
        return progressID;
    }


    public void setProgressID(Integer progressID) {
        this.progressID = progressID;
    }


    public Integer getProgressStatus() {
        return progressStatus;
    }


    public void setProgressStatus(Integer progressStatus) {
        this.progressStatus = progressStatus;
    }


    public Long getLogID() {
        return logID;
    }


    public void setLogID(Long logID) {
        this.logID = logID;
    }


    public Integer getHayAdjunto() {
        return hayAdjunto;
    }


    public void setHayAdjunto(Integer hayAdjunto) {
        this.hayAdjunto = hayAdjunto;
    }


    public Integer getImprimido() {
        return imprimido;
    }


    public void setImprimido(Integer imprimido) {
        this.imprimido = imprimido;
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
        Albaranproveedor other = (Albaranproveedor) that;
        return (this.getDocumentoNo() == null ? other.getDocumentoNo() == null : this.getDocumentoNo().equals(other.getDocumentoNo()))
            && (this.getDocumentoNoEnServidor() == null ? other.getDocumentoNoEnServidor() == null : this.getDocumentoNoEnServidor().equals(other.getDocumentoNoEnServidor()))
            && (this.getDocumentoNoOriginal() == null ? other.getDocumentoNoOriginal() == null : this.getDocumentoNoOriginal().equals(other.getDocumentoNoOriginal()))
            && (this.getEmpresaID() == null ? other.getEmpresaID() == null : this.getEmpresaID().equals(other.getEmpresaID()))
            && (this.getSucursalID() == null ? other.getSucursalID() == null : this.getSucursalID().equals(other.getSucursalID()))
            && (this.getDescuento() == null ? other.getDescuento() == null : this.getDescuento().equals(other.getDescuento()))
            && (this.getDescuento2() == null ? other.getDescuento2() == null : this.getDescuento2().equals(other.getDescuento2()))
            && (this.getDescuentoDirecto() == null ? other.getDescuentoDirecto() == null : this.getDescuentoDirecto().equals(other.getDescuentoDirecto()))
            && (this.getReglaIVA() == null ? other.getReglaIVA() == null : this.getReglaIVA().equals(other.getReglaIVA()))
            && (this.getIVASerie() == null ? other.getIVASerie() == null : this.getIVASerie().equals(other.getIVASerie()))
            && (this.getPrecioUsado() == null ? other.getPrecioUsado() == null : this.getPrecioUsado().equals(other.getPrecioUsado()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getDescuentoTotal() == null ? other.getDescuentoTotal() == null : this.getDescuentoTotal().equals(other.getDescuentoTotal()))
            && (this.getDescuentoExtra() == null ? other.getDescuentoExtra() == null : this.getDescuentoExtra().equals(other.getDescuentoExtra()))
            && (this.getGanancias() == null ? other.getGanancias() == null : this.getGanancias().equals(other.getGanancias()))
            && (this.getPagoTotal() == null ? other.getPagoTotal() == null : this.getPagoTotal().equals(other.getPagoTotal()))
            && (this.getCantidadTotal() == null ? other.getCantidadTotal() == null : this.getCantidadTotal().equals(other.getCantidadTotal()))
            && (this.getPaqueteTotal() == null ? other.getPaqueteTotal() == null : this.getPaqueteTotal().equals(other.getPaqueteTotal()))
            && (this.getCajaTotal() == null ? other.getCajaTotal() == null : this.getCajaTotal().equals(other.getCajaTotal()))
            && (this.getVolumenPesoTotal() == null ? other.getVolumenPesoTotal() == null : this.getVolumenPesoTotal().equals(other.getVolumenPesoTotal()))
            && (this.getLineaTotal() == null ? other.getLineaTotal() == null : this.getLineaTotal().equals(other.getLineaTotal()))
            && (this.getFecha() == null ? other.getFecha() == null : this.getFecha().equals(other.getFecha()))
            && (this.getFechaEntrada() == null ? other.getFechaEntrada() == null : this.getFechaEntrada().equals(other.getFechaEntrada()))
            && (this.getFechaOriginal() == null ? other.getFechaOriginal() == null : this.getFechaOriginal().equals(other.getFechaOriginal()))
            && (this.getTiempoUltimoEditar() == null ? other.getTiempoUltimoEditar() == null : this.getTiempoUltimoEditar().equals(other.getTiempoUltimoEditar()))
            && (this.getTiempoUltimoActualizar() == null ? other.getTiempoUltimoActualizar() == null : this.getTiempoUltimoActualizar().equals(other.getTiempoUltimoActualizar()))
            && (this.getDocumentoOrigenTipo() == null ? other.getDocumentoOrigenTipo() == null : this.getDocumentoOrigenTipo().equals(other.getDocumentoOrigenTipo()))
            && (this.getDocumentoOrigenNo() == null ? other.getDocumentoOrigenNo() == null : this.getDocumentoOrigenNo().equals(other.getDocumentoOrigenNo()))
            && (this.getDocumentoDestinoTipo() == null ? other.getDocumentoDestinoTipo() == null : this.getDocumentoDestinoTipo().equals(other.getDocumentoDestinoTipo()))
            && (this.getDocumentoDestinoNo() == null ? other.getDocumentoDestinoNo() == null : this.getDocumentoDestinoNo().equals(other.getDocumentoDestinoNo()))
            && (this.getAgenteID() == null ? other.getAgenteID() == null : this.getAgenteID().equals(other.getAgenteID()))
            && (this.getTransportistaID() == null ? other.getTransportistaID() == null : this.getTransportistaID().equals(other.getTransportistaID()))
            && (this.getTransporteModoID() == null ? other.getTransporteModoID() == null : this.getTransporteModoID().equals(other.getTransporteModoID()))
            && (this.getEnvioGasto() == null ? other.getEnvioGasto() == null : this.getEnvioGasto().equals(other.getEnvioGasto()))
            && (this.getOperadorID() == null ? other.getOperadorID() == null : this.getOperadorID().equals(other.getOperadorID()))
            && (this.getVerificadorID() == null ? other.getVerificadorID() == null : this.getVerificadorID().equals(other.getVerificadorID()))
            && (this.getAlmacenID() == null ? other.getAlmacenID() == null : this.getAlmacenID().equals(other.getAlmacenID()))
            && (this.getDocumentoAdjuntoSimbolo() == null ? other.getDocumentoAdjuntoSimbolo() == null : this.getDocumentoAdjuntoSimbolo().equals(other.getDocumentoAdjuntoSimbolo()))
            && (this.getOrdenadorNombre() == null ? other.getOrdenadorNombre() == null : this.getOrdenadorNombre().equals(other.getOrdenadorNombre()))
            && (this.getDeviceUUID() == null ? other.getDeviceUUID() == null : this.getDeviceUUID().equals(other.getDeviceUUID()))
            && (this.getDocumentoHash() == null ? other.getDocumentoHash() == null : this.getDocumentoHash().equals(other.getDocumentoHash()))
            && (this.getSubTiendaID() == null ? other.getSubTiendaID() == null : this.getSubTiendaID().equals(other.getSubTiendaID()))
            && (this.getDocumentoIntercambioNo() == null ? other.getDocumentoIntercambioNo() == null : this.getDocumentoIntercambioNo().equals(other.getDocumentoIntercambioNo()))
            && (this.getBloqueado() == null ? other.getBloqueado() == null : this.getBloqueado().equals(other.getBloqueado()))
            && (this.getAnulado() == null ? other.getAnulado() == null : this.getAnulado().equals(other.getAnulado()))
            && (this.getModificando() == null ? other.getModificando() == null : this.getModificando().equals(other.getModificando()))
            && (this.getEmailMandado() == null ? other.getEmailMandado() == null : this.getEmailMandado().equals(other.getEmailMandado()))
            && (this.getProgressID() == null ? other.getProgressID() == null : this.getProgressID().equals(other.getProgressID()))
            && (this.getProgressStatus() == null ? other.getProgressStatus() == null : this.getProgressStatus().equals(other.getProgressStatus()))
            && (this.getLogID() == null ? other.getLogID() == null : this.getLogID().equals(other.getLogID()))
            && (this.getHayAdjunto() == null ? other.getHayAdjunto() == null : this.getHayAdjunto().equals(other.getHayAdjunto()))
            && (this.getImprimido() == null ? other.getImprimido() == null : this.getImprimido().equals(other.getImprimido()))
            && (this.getObservacion() == null ? other.getObservacion() == null : this.getObservacion().equals(other.getObservacion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDocumentoNo() == null) ? 0 : getDocumentoNo().hashCode());
        result = prime * result + ((getDocumentoNoEnServidor() == null) ? 0 : getDocumentoNoEnServidor().hashCode());
        result = prime * result + ((getDocumentoNoOriginal() == null) ? 0 : getDocumentoNoOriginal().hashCode());
        result = prime * result + ((getEmpresaID() == null) ? 0 : getEmpresaID().hashCode());
        result = prime * result + ((getSucursalID() == null) ? 0 : getSucursalID().hashCode());
        result = prime * result + ((getDescuento() == null) ? 0 : getDescuento().hashCode());
        result = prime * result + ((getDescuento2() == null) ? 0 : getDescuento2().hashCode());
        result = prime * result + ((getDescuentoDirecto() == null) ? 0 : getDescuentoDirecto().hashCode());
        result = prime * result + ((getReglaIVA() == null) ? 0 : getReglaIVA().hashCode());
        result = prime * result + ((getIVASerie() == null) ? 0 : getIVASerie().hashCode());
        result = prime * result + ((getPrecioUsado() == null) ? 0 : getPrecioUsado().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getDescuentoTotal() == null) ? 0 : getDescuentoTotal().hashCode());
        result = prime * result + ((getDescuentoExtra() == null) ? 0 : getDescuentoExtra().hashCode());
        result = prime * result + ((getGanancias() == null) ? 0 : getGanancias().hashCode());
        result = prime * result + ((getPagoTotal() == null) ? 0 : getPagoTotal().hashCode());
        result = prime * result + ((getCantidadTotal() == null) ? 0 : getCantidadTotal().hashCode());
        result = prime * result + ((getPaqueteTotal() == null) ? 0 : getPaqueteTotal().hashCode());
        result = prime * result + ((getCajaTotal() == null) ? 0 : getCajaTotal().hashCode());
        result = prime * result + ((getVolumenPesoTotal() == null) ? 0 : getVolumenPesoTotal().hashCode());
        result = prime * result + ((getLineaTotal() == null) ? 0 : getLineaTotal().hashCode());
        result = prime * result + ((getFecha() == null) ? 0 : getFecha().hashCode());
        result = prime * result + ((getFechaEntrada() == null) ? 0 : getFechaEntrada().hashCode());
        result = prime * result + ((getFechaOriginal() == null) ? 0 : getFechaOriginal().hashCode());
        result = prime * result + ((getTiempoUltimoEditar() == null) ? 0 : getTiempoUltimoEditar().hashCode());
        result = prime * result + ((getTiempoUltimoActualizar() == null) ? 0 : getTiempoUltimoActualizar().hashCode());
        result = prime * result + ((getDocumentoOrigenTipo() == null) ? 0 : getDocumentoOrigenTipo().hashCode());
        result = prime * result + ((getDocumentoOrigenNo() == null) ? 0 : getDocumentoOrigenNo().hashCode());
        result = prime * result + ((getDocumentoDestinoTipo() == null) ? 0 : getDocumentoDestinoTipo().hashCode());
        result = prime * result + ((getDocumentoDestinoNo() == null) ? 0 : getDocumentoDestinoNo().hashCode());
        result = prime * result + ((getAgenteID() == null) ? 0 : getAgenteID().hashCode());
        result = prime * result + ((getTransportistaID() == null) ? 0 : getTransportistaID().hashCode());
        result = prime * result + ((getTransporteModoID() == null) ? 0 : getTransporteModoID().hashCode());
        result = prime * result + ((getEnvioGasto() == null) ? 0 : getEnvioGasto().hashCode());
        result = prime * result + ((getOperadorID() == null) ? 0 : getOperadorID().hashCode());
        result = prime * result + ((getVerificadorID() == null) ? 0 : getVerificadorID().hashCode());
        result = prime * result + ((getAlmacenID() == null) ? 0 : getAlmacenID().hashCode());
        result = prime * result + ((getDocumentoAdjuntoSimbolo() == null) ? 0 : getDocumentoAdjuntoSimbolo().hashCode());
        result = prime * result + ((getOrdenadorNombre() == null) ? 0 : getOrdenadorNombre().hashCode());
        result = prime * result + ((getDeviceUUID() == null) ? 0 : getDeviceUUID().hashCode());
        result = prime * result + ((getDocumentoHash() == null) ? 0 : getDocumentoHash().hashCode());
        result = prime * result + ((getSubTiendaID() == null) ? 0 : getSubTiendaID().hashCode());
        result = prime * result + ((getDocumentoIntercambioNo() == null) ? 0 : getDocumentoIntercambioNo().hashCode());
        result = prime * result + ((getBloqueado() == null) ? 0 : getBloqueado().hashCode());
        result = prime * result + ((getAnulado() == null) ? 0 : getAnulado().hashCode());
        result = prime * result + ((getModificando() == null) ? 0 : getModificando().hashCode());
        result = prime * result + ((getEmailMandado() == null) ? 0 : getEmailMandado().hashCode());
        result = prime * result + ((getProgressID() == null) ? 0 : getProgressID().hashCode());
        result = prime * result + ((getProgressStatus() == null) ? 0 : getProgressStatus().hashCode());
        result = prime * result + ((getLogID() == null) ? 0 : getLogID().hashCode());
        result = prime * result + ((getHayAdjunto() == null) ? 0 : getHayAdjunto().hashCode());
        result = prime * result + ((getImprimido() == null) ? 0 : getImprimido().hashCode());
        result = prime * result + ((getObservacion() == null) ? 0 : getObservacion().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", documentoNo=").append(documentoNo);
        sb.append(", documentoNoEnServidor=").append(documentoNoEnServidor);
        sb.append(", documentoNoOriginal=").append(documentoNoOriginal);
        sb.append(", empresaID=").append(empresaID);
        sb.append(", sucursalID=").append(sucursalID);
        sb.append(", descuento=").append(descuento);
        sb.append(", descuento2=").append(descuento2);
        sb.append(", descuentoDirecto=").append(descuentoDirecto);
        sb.append(", reglaIVA=").append(reglaIVA);
        sb.append(", IVASerie=").append(IVASerie);
        sb.append(", precioUsado=").append(precioUsado);
        sb.append(", total=").append(total);
        sb.append(", descuentoTotal=").append(descuentoTotal);
        sb.append(", descuentoExtra=").append(descuentoExtra);
        sb.append(", ganancias=").append(ganancias);
        sb.append(", pagoTotal=").append(pagoTotal);
        sb.append(", cantidadTotal=").append(cantidadTotal);
        sb.append(", paqueteTotal=").append(paqueteTotal);
        sb.append(", cajaTotal=").append(cajaTotal);
        sb.append(", volumenPesoTotal=").append(volumenPesoTotal);
        sb.append(", lineaTotal=").append(lineaTotal);
        sb.append(", fecha=").append(fecha);
        sb.append(", fechaEntrada=").append(fechaEntrada);
        sb.append(", fechaOriginal=").append(fechaOriginal);
        sb.append(", tiempoUltimoEditar=").append(tiempoUltimoEditar);
        sb.append(", tiempoUltimoActualizar=").append(tiempoUltimoActualizar);
        sb.append(", documentoOrigenTipo=").append(documentoOrigenTipo);
        sb.append(", documentoOrigenNo=").append(documentoOrigenNo);
        sb.append(", documentoDestinoTipo=").append(documentoDestinoTipo);
        sb.append(", documentoDestinoNo=").append(documentoDestinoNo);
        sb.append(", agenteID=").append(agenteID);
        sb.append(", transportistaID=").append(transportistaID);
        sb.append(", transporteModoID=").append(transporteModoID);
        sb.append(", envioGasto=").append(envioGasto);
        sb.append(", operadorID=").append(operadorID);
        sb.append(", verificadorID=").append(verificadorID);
        sb.append(", almacenID=").append(almacenID);
        sb.append(", documentoAdjuntoSimbolo=").append(documentoAdjuntoSimbolo);
        sb.append(", ordenadorNombre=").append(ordenadorNombre);
        sb.append(", deviceUUID=").append(deviceUUID);
        sb.append(", documentoHash=").append(documentoHash);
        sb.append(", subTiendaID=").append(subTiendaID);
        sb.append(", documentoIntercambioNo=").append(documentoIntercambioNo);
        sb.append(", bloqueado=").append(bloqueado);
        sb.append(", anulado=").append(anulado);
        sb.append(", modificando=").append(modificando);
        sb.append(", emailMandado=").append(emailMandado);
        sb.append(", progressID=").append(progressID);
        sb.append(", progressStatus=").append(progressStatus);
        sb.append(", logID=").append(logID);
        sb.append(", hayAdjunto=").append(hayAdjunto);
        sb.append(", imprimido=").append(imprimido);
        sb.append(", observacion=").append(observacion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * 已变更为 EmpresaID, 请使用 getEmpresaId()
     * @return ProveedorID
     */
    @Deprecated
    public String getProveedorID() {
        return this.empresaID.toString();
    }
}