package cn.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName albaranproveedorarticulo
 */
@TableName(value ="albaranproveedorarticulo")
public class Albaranproveedorarticulo implements Serializable {
    @TableField(value = "DocumentoNo")
    private Long documentoNo;
    @TableField(value = "ArticuloID")
    private String articuloID;
    @TableField(value = "PropCount")
    private Integer propCount;
    @TableField(value = "PropID1")
    private String propID1;
    @TableField(value = "PropID2")
    private String propID2;
    @TableField(value = "Propiedad")
    private String propiedad;
    @TableField(value = "SerialNo")
    private String serialNo;
    @TableField(value = "CodigoBarra")
    private String codigoBarra;
    @TableField(value = "CodigoBarraBalanza")
    private Integer codigoBarraBalanza;
    @TableField(value = "NombreES")
    private String nombreES;
    @TableField(value = "NombreCN")
    private String nombreCN;
    @TableField(value = "Precio")
    private BigDecimal precio;
    @TableField(value = "Cantidad")
    private BigDecimal cantidad;
    @TableField(value = "IVA")
    private BigDecimal IVA;
    @TableField(value = "REQ")
    private BigDecimal REQ;
    @TableField(value = "Descuento")
    private BigDecimal descuento;
    @TableField(value = "DescuentoCambioProhibido")
    private Integer descuentoCambioProhibido;
    @TableField(value = "PrecioCoste")
    private BigDecimal precioCoste;
    @TableField(value = "Comentario")
    private String comentario;
    @TableField(value = "NecesitaSerialNo")
    private Integer necesitaSerialNo;
    @TableField(value = "Temporal")
    private Integer temporal;
    @TableField(value = "OrdenNo")
    private Integer ordenNo;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    @TableField
    private Articulo articulo;

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Long getDocumentoNo() {
        return documentoNo;
    }


    public void setDocumentoNo(Long documentoNo) {
        this.documentoNo = documentoNo;
    }


    public String getArticuloID() {
        return articuloID;
    }


    public void setArticuloID(String articuloID) {
        this.articuloID = articuloID;
    }


    public Integer getPropCount() {
        return propCount;
    }


    public void setPropCount(Integer propCount) {
        this.propCount = propCount;
    }


    public String getPropID1() {
        return propID1;
    }


    public void setPropID1(String propID1) {
        this.propID1 = propID1;
    }


    public String getPropID2() {
        return propID2;
    }


    public void setPropID2(String propID2) {
        this.propID2 = propID2;
    }


    public String getPropiedad() {
        return propiedad;
    }


    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }


    public String getSerialNo() {
        return serialNo;
    }


    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }


    public String getCodigoBarra() {
        return codigoBarra;
    }


    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }


    public Integer getCodigoBarraBalanza() {
        return codigoBarraBalanza;
    }


    public void setCodigoBarraBalanza(Integer codigoBarraBalanza) {
        this.codigoBarraBalanza = codigoBarraBalanza;
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


    public BigDecimal getPrecio() {
        return precio;
    }


    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }


    public BigDecimal getCantidad() {
        return cantidad;
    }


    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }


    public BigDecimal getIVA() {
        return IVA;
    }


    public void setIVA(BigDecimal IVA) {
        this.IVA = IVA;
    }


    public BigDecimal getREQ() {
        return REQ;
    }


    public void setREQ(BigDecimal REQ) {
        this.REQ = REQ;
    }


    public BigDecimal getDescuento() {
        return descuento;
    }


    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }


    public Integer getDescuentoCambioProhibido() {
        return descuentoCambioProhibido;
    }


    public void setDescuentoCambioProhibido(Integer descuentoCambioProhibido) {
        this.descuentoCambioProhibido = descuentoCambioProhibido;
    }


    public BigDecimal getPrecioCoste() {
        return precioCoste;
    }


    public void setPrecioCoste(BigDecimal precioCoste) {
        this.precioCoste = precioCoste;
    }


    public String getComentario() {
        return comentario;
    }


    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


    public Integer getNecesitaSerialNo() {
        return necesitaSerialNo;
    }


    public void setNecesitaSerialNo(Integer necesitaSerialNo) {
        this.necesitaSerialNo = necesitaSerialNo;
    }


    public Integer getTemporal() {
        return temporal;
    }


    public void setTemporal(Integer temporal) {
        this.temporal = temporal;
    }


    public Integer getOrdenNo() {
        return ordenNo;
    }


    public void setOrdenNo(Integer ordenNo) {
        this.ordenNo = ordenNo;
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
        Albaranproveedorarticulo other = (Albaranproveedorarticulo) that;
        return (this.getDocumentoNo() == null ? other.getDocumentoNo() == null : this.getDocumentoNo().equals(other.getDocumentoNo()))
            && (this.getArticuloID() == null ? other.getArticuloID() == null : this.getArticuloID().equals(other.getArticuloID()))
            && (this.getPropCount() == null ? other.getPropCount() == null : this.getPropCount().equals(other.getPropCount()))
            && (this.getPropID1() == null ? other.getPropID1() == null : this.getPropID1().equals(other.getPropID1()))
            && (this.getPropID2() == null ? other.getPropID2() == null : this.getPropID2().equals(other.getPropID2()))
            && (this.getPropiedad() == null ? other.getPropiedad() == null : this.getPropiedad().equals(other.getPropiedad()))
            && (this.getSerialNo() == null ? other.getSerialNo() == null : this.getSerialNo().equals(other.getSerialNo()))
            && (this.getCodigoBarra() == null ? other.getCodigoBarra() == null : this.getCodigoBarra().equals(other.getCodigoBarra()))
            && (this.getCodigoBarraBalanza() == null ? other.getCodigoBarraBalanza() == null : this.getCodigoBarraBalanza().equals(other.getCodigoBarraBalanza()))
            && (this.getNombreES() == null ? other.getNombreES() == null : this.getNombreES().equals(other.getNombreES()))
            && (this.getNombreCN() == null ? other.getNombreCN() == null : this.getNombreCN().equals(other.getNombreCN()))
            && (this.getPrecio() == null ? other.getPrecio() == null : this.getPrecio().equals(other.getPrecio()))
            && (this.getCantidad() == null ? other.getCantidad() == null : this.getCantidad().equals(other.getCantidad()))
            && (this.getIVA() == null ? other.getIVA() == null : this.getIVA().equals(other.getIVA()))
            && (this.getREQ() == null ? other.getREQ() == null : this.getREQ().equals(other.getREQ()))
            && (this.getDescuento() == null ? other.getDescuento() == null : this.getDescuento().equals(other.getDescuento()))
            && (this.getDescuentoCambioProhibido() == null ? other.getDescuentoCambioProhibido() == null : this.getDescuentoCambioProhibido().equals(other.getDescuentoCambioProhibido()))
            && (this.getPrecioCoste() == null ? other.getPrecioCoste() == null : this.getPrecioCoste().equals(other.getPrecioCoste()))
            && (this.getComentario() == null ? other.getComentario() == null : this.getComentario().equals(other.getComentario()))
            && (this.getNecesitaSerialNo() == null ? other.getNecesitaSerialNo() == null : this.getNecesitaSerialNo().equals(other.getNecesitaSerialNo()))
            && (this.getTemporal() == null ? other.getTemporal() == null : this.getTemporal().equals(other.getTemporal()))
            && (this.getOrdenNo() == null ? other.getOrdenNo() == null : this.getOrdenNo().equals(other.getOrdenNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDocumentoNo() == null) ? 0 : getDocumentoNo().hashCode());
        result = prime * result + ((getArticuloID() == null) ? 0 : getArticuloID().hashCode());
        result = prime * result + ((getPropCount() == null) ? 0 : getPropCount().hashCode());
        result = prime * result + ((getPropID1() == null) ? 0 : getPropID1().hashCode());
        result = prime * result + ((getPropID2() == null) ? 0 : getPropID2().hashCode());
        result = prime * result + ((getPropiedad() == null) ? 0 : getPropiedad().hashCode());
        result = prime * result + ((getSerialNo() == null) ? 0 : getSerialNo().hashCode());
        result = prime * result + ((getCodigoBarra() == null) ? 0 : getCodigoBarra().hashCode());
        result = prime * result + ((getCodigoBarraBalanza() == null) ? 0 : getCodigoBarraBalanza().hashCode());
        result = prime * result + ((getNombreES() == null) ? 0 : getNombreES().hashCode());
        result = prime * result + ((getNombreCN() == null) ? 0 : getNombreCN().hashCode());
        result = prime * result + ((getPrecio() == null) ? 0 : getPrecio().hashCode());
        result = prime * result + ((getCantidad() == null) ? 0 : getCantidad().hashCode());
        result = prime * result + ((getIVA() == null) ? 0 : getIVA().hashCode());
        result = prime * result + ((getREQ() == null) ? 0 : getREQ().hashCode());
        result = prime * result + ((getDescuento() == null) ? 0 : getDescuento().hashCode());
        result = prime * result + ((getDescuentoCambioProhibido() == null) ? 0 : getDescuentoCambioProhibido().hashCode());
        result = prime * result + ((getPrecioCoste() == null) ? 0 : getPrecioCoste().hashCode());
        result = prime * result + ((getComentario() == null) ? 0 : getComentario().hashCode());
        result = prime * result + ((getNecesitaSerialNo() == null) ? 0 : getNecesitaSerialNo().hashCode());
        result = prime * result + ((getTemporal() == null) ? 0 : getTemporal().hashCode());
        result = prime * result + ((getOrdenNo() == null) ? 0 : getOrdenNo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", documentoNo=").append(documentoNo);
        sb.append(", articuloID=").append(articuloID);
        sb.append(", propCount=").append(propCount);
        sb.append(", propID1=").append(propID1);
        sb.append(", propID2=").append(propID2);
        sb.append(", propiedad=").append(propiedad);
        sb.append(", serialNo=").append(serialNo);
        sb.append(", codigoBarra=").append(codigoBarra);
        sb.append(", codigoBarraBalanza=").append(codigoBarraBalanza);
        sb.append(", nombreES=").append(nombreES);
        sb.append(", nombreCN=").append(nombreCN);
        sb.append(", precio=").append(precio);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", IVA=").append(IVA);
        sb.append(", REQ=").append(REQ);
        sb.append(", descuento=").append(descuento);
        sb.append(", descuentoCambioProhibido=").append(descuentoCambioProhibido);
        sb.append(", precioCoste=").append(precioCoste);
        sb.append(", comentario=").append(comentario);
        sb.append(", necesitaSerialNo=").append(necesitaSerialNo);
        sb.append(", temporal=").append(temporal);
        sb.append(", ordenNo=").append(ordenNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}