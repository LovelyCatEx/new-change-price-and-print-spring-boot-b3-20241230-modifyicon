package cn.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName articulo
 */
@TableName(value ="articulo")
public class Articulo implements Serializable {
    @TableId(value = "ArticuloID")
    private String articuloID;
    @TableField(value = "CodigoBarra")
    private String codigoBarra;
    @TableField(value = "Prop1Titulo")
    private String prop1Titulo;
    @TableField(value = "Prop2Titulo")
    private String prop2Titulo;
    @TableField(value = "PropCount")
    private Integer propCount;
    @TableField(value = "NombreES")
    private String nombreES;
    @TableField(value = "NombreCN")
    private String nombreCN;
    @TableField(value = "Descripcion")
    private String descripcion;
    @TableField(value = "PrecioDetalle")
    private BigDecimal precioDetalle;
    @TableField(value = "PrecioDomicilio")
    private BigDecimal precioDomicilio;
    @TableField(value = "PrecioSocio")
    private BigDecimal precioSocio;
    @TableField(value = "PrecioMayor")
    private BigDecimal precioMayor;
    @TableField(value = "PrecioFactura")
    private BigDecimal precioFactura;
    @TableField(value = "PrecioInternet")
    private BigDecimal precioInternet;
    @TableField(value = "PrecioAmigo")
    private BigDecimal precioAmigo;
    @TableField(value = "PrecioEspecial")
    private BigDecimal precioEspecial;
    @TableField(value = "PrecioOferta")
    private BigDecimal precioOferta;
    @TableField(value = "PrecioCoste")
    private BigDecimal precioCoste;
    @TableField(value = "CantidadPorUnidad")
    private BigDecimal cantidadPorUnidad;
    @TableField(value = "CantidadPorUnidad2")
    private BigDecimal cantidadPorUnidad2;
    @TableField(value = "VolumenPeso")
    private BigDecimal volumenPeso;
    @TableField(value = "UnidadUsarRegla")
    private Integer unidadUsarRegla;
    @TableField(value = "ClaseID")
    private Integer claseID;
    @TableField(value = "UnidadNombre")
    private String unidadNombre;
    @TableField(value = "FechaPrecioCoste")
    private Date fechaPrecioCoste;
    @TableField(value = "Descuento")
    private BigDecimal descuento;
    @TableField(value = "FacturaPorcentaje")
    private BigDecimal facturaPorcentaje;
    @TableField(value = "FechaCaducada")
    private Date fechaCaducada;
    @TableField(value = "EmpresaID")
    private Long empresaID;
    @TableField(value = "Oferta")
    private Integer oferta;
    @TableField(value = "Privado")
    private Integer privado;
    @TableField(value = "UsarPrecioPorCantidad")
    private Integer usarPrecioPorCantidad;
    @TableField(value = "UsarDescuentoPorCantidad")
    private Integer usarDescuentoPorCantidad;
    @TableField(value = "Precio1")
    private BigDecimal precio1;
    @TableField(value = "Descuento1")
    private BigDecimal descuento1;
    @TableField(value = "Cantidad1")
    private BigDecimal cantidad1;
    @TableField(value = "Precio2")
    private BigDecimal precio2;
    @TableField(value = "Descuento2")
    private BigDecimal descuento2;
    @TableField(value = "Cantidad2")
    private BigDecimal cantidad2;
    @TableField(value = "Precio3")
    private BigDecimal precio3;
    @TableField(value = "Descuento3")
    private BigDecimal descuento3;
    @TableField(value = "Cantidad3")
    private BigDecimal cantidad3;
    @TableField(value = "Precio4")
    private BigDecimal precio4;
    @TableField(value = "Descuento4")
    private BigDecimal descuento4;
    @TableField(value = "Cantidad4")
    private BigDecimal cantidad4;
    @TableField(value = "Precio5")
    private BigDecimal precio5;
    @TableField(value = "Descuento5")
    private BigDecimal descuento5;
    @TableField(value = "Cantidad5")
    private BigDecimal cantidad5;
    @TableField(value = "Precio6")
    private BigDecimal precio6;
    @TableField(value = "Descuento6")
    private BigDecimal descuento6;
    @TableField(value = "Nombre1")
    private String nombre1;
    @TableField(value = "Nombre2")
    private String nombre2;
    @TableField(value = "Nombre3")
    private String nombre3;
    @TableField(value = "Nombre4")
    private String nombre4;
    @TableField(value = "Nombre5")
    private String nombre5;
    @TableField(value = "Nombre6")
    private String nombre6;
    @TableField(value = "Nombre7")
    private String nombre7;
    @TableField(value = "Nombre8")
    private String nombre8;
    @TableField(value = "Nombre9")
    private String nombre9;
    @TableField(value = "SitioEnAlmacen")
    private String sitioEnAlmacen;
    @TableField(value = "SitioEnEstante")
    private String sitioEnEstante;
    @TableField(value = "SerialNo")
    private String serialNo;
    @TableField(value = "MiniStock")
    private BigDecimal miniStock;
    @TableField(value = "MaxiStock")
    private BigDecimal maxiStock;
    @TableField(value = "DibujoID")
    private Long dibujoID;
    @TableField(value = "Recomendado")
    private Integer recomendado;
    @TableField(value = "DescuentoCambioProhibido")
    private Integer descuentoCambioProhibido;
    @TableField(value = "AliIngrediente")
    private String aliIngrediente;
    @TableField(value = "AliPesoTotal")
    private String aliPesoTotal;
    @TableField(value = "AliPesoNeto")
    private String aliPesoNeto;
    @TableField(value = "AliFechaCaducada")
    private String aliFechaCaducada;
    @TableField(value = "AliLugarFabricante")
    private String aliLugarFabricante;
    @TableField(value = "AliImportador")
    private String aliImportador;
    @TableField(value = "AliNumeroSanitario")
    private String aliNumeroSanitario;
    @TableField(value = "AliNumeroLote")
    private String aliNumeroLote;
    @TableField(value = "AliAdjuncion")
    private String aliAdjuncion;
    @TableField(value = "MultiCodigo")
    private String multiCodigo;
    @TableField(value = "OrdenNo")
    private Integer ordenNo;
    @TableField(value = "OrdenNoFinal")
    private Long ordenNoFinal;
    @TableField(value = "Bloqueado")
    private Integer bloqueado;
    @TableField(value = "Observacion")
    private String observacion;
    private static final long serialVersionUID = 1L;

    @TableField(exist = false)
    private String dibujomd5;

    public String getDibujomd5() {
        return dibujomd5;
    }

    public void setDibujomd5(String dibujomd5) {
        this.dibujomd5 = dibujomd5;
    }

    /**
     * dibujo
     */
    @TableField(exist = false)
    private byte[] dibujo;

    public byte[] getDibujo() {
        return dibujo;
    }

    public void setDibujo(byte[] dibujo) {
        this.dibujo = dibujo;
    }

    @TableField(exist = false)
    private String proveedordd;

    public String getProveedordd() {
        return proveedordd;
    }

    public void setProveedordd(String proveedordd) {
        this.proveedordd = proveedordd;
    }

    @TableField(exist = false)
    private String stockda;

    public String getStockda() {
        return stockda;
    }

    public void setStockda(String stockda) {
        this.stockda = stockda;
    }

    public String getArticuloID() {
        return articuloID;
    }

  
    public void setArticuloID(String articuloID) {
        this.articuloID = articuloID;
    }

  
    public String getCodigoBarra() {
        return codigoBarra;
    }

  
    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

  
    public String getProp1Titulo() {
        return prop1Titulo;
    }

  
    public void setProp1Titulo(String prop1Titulo) {
        this.prop1Titulo = prop1Titulo;
    }

  
    public String getProp2Titulo() {
        return prop2Titulo;
    }

  
    public void setProp2Titulo(String prop2Titulo) {
        this.prop2Titulo = prop2Titulo;
    }

  
    public Integer getPropCount() {
        return propCount;
    }

  
    public void setPropCount(Integer propCount) {
        this.propCount = propCount;
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

  
    public String getDescripcion() {
        return descripcion;
    }

  
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

  
    public BigDecimal getPrecioDetalle() {
        return precioDetalle;
    }

  
    public void setPrecioDetalle(BigDecimal precioDetalle) {
        this.precioDetalle = precioDetalle;
    }

  
    public BigDecimal getPrecioDomicilio() {
        return precioDomicilio;
    }

  
    public void setPrecioDomicilio(BigDecimal precioDomicilio) {
        this.precioDomicilio = precioDomicilio;
    }

  
    public BigDecimal getPrecioSocio() {
        return precioSocio;
    }

  
    public void setPrecioSocio(BigDecimal precioSocio) {
        this.precioSocio = precioSocio;
    }

  
    public BigDecimal getPrecioMayor() {
        return precioMayor;
    }

  
    public void setPrecioMayor(BigDecimal precioMayor) {
        this.precioMayor = precioMayor;
    }

  
    public BigDecimal getPrecioFactura() {
        return precioFactura;
    }

  
    public void setPrecioFactura(BigDecimal precioFactura) {
        this.precioFactura = precioFactura;
    }

  
    public BigDecimal getPrecioInternet() {
        return precioInternet;
    }

  
    public void setPrecioInternet(BigDecimal precioInternet) {
        this.precioInternet = precioInternet;
    }

  
    public BigDecimal getPrecioAmigo() {
        return precioAmigo;
    }

  
    public void setPrecioAmigo(BigDecimal precioAmigo) {
        this.precioAmigo = precioAmigo;
    }

  
    public BigDecimal getPrecioEspecial() {
        return precioEspecial;
    }

  
    public void setPrecioEspecial(BigDecimal precioEspecial) {
        this.precioEspecial = precioEspecial;
    }

  
    public BigDecimal getPrecioOferta() {
        return precioOferta;
    }

  
    public void setPrecioOferta(BigDecimal precioOferta) {
        this.precioOferta = precioOferta;
    }

  
    public BigDecimal getPrecioCoste() {
        return precioCoste;
    }

  
    public void setPrecioCoste(BigDecimal precioCoste) {
        this.precioCoste = precioCoste;
    }

  
    public BigDecimal getCantidadPorUnidad() {
        return cantidadPorUnidad;
    }

  
    public void setCantidadPorUnidad(BigDecimal cantidadPorUnidad) {
        this.cantidadPorUnidad = cantidadPorUnidad;
    }

  
    public BigDecimal getCantidadPorUnidad2() {
        return cantidadPorUnidad2;
    }

  
    public void setCantidadPorUnidad2(BigDecimal cantidadPorUnidad2) {
        this.cantidadPorUnidad2 = cantidadPorUnidad2;
    }

  
    public BigDecimal getVolumenPeso() {
        return volumenPeso;
    }

  
    public void setVolumenPeso(BigDecimal volumenPeso) {
        this.volumenPeso = volumenPeso;
    }

  
    public Integer getUnidadUsarRegla() {
        return unidadUsarRegla;
    }

  
    public void setUnidadUsarRegla(Integer unidadUsarRegla) {
        this.unidadUsarRegla = unidadUsarRegla;
    }

  
    public Integer getClaseID() {
        return claseID;
    }

  
    public void setClaseID(Integer claseID) {
        this.claseID = claseID;
    }

  
    public String getUnidadNombre() {
        return unidadNombre;
    }

  
    public void setUnidadNombre(String unidadNombre) {
        this.unidadNombre = unidadNombre;
    }

  
    public Date getFechaPrecioCoste() {
        return fechaPrecioCoste;
    }

  
    public void setFechaPrecioCoste(Date fechaPrecioCoste) {
        this.fechaPrecioCoste = fechaPrecioCoste;
    }

  
    public BigDecimal getDescuento() {
        return descuento;
    }

  
    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

  
    public BigDecimal getFacturaPorcentaje() {
        return facturaPorcentaje;
    }

  
    public void setFacturaPorcentaje(BigDecimal facturaPorcentaje) {
        this.facturaPorcentaje = facturaPorcentaje;
    }

  
    public Date getFechaCaducada() {
        return fechaCaducada;
    }

  
    public void setFechaCaducada(Date fechaCaducada) {
        this.fechaCaducada = fechaCaducada;
    }

  
    public Long getEmpresaID() {
        return empresaID;
    }

  
    public void setEmpresaID(Long empresaID) {
        this.empresaID = empresaID;
    }

  
    public Integer getOferta() {
        return oferta;
    }

  
    public void setOferta(Integer oferta) {
        this.oferta = oferta;
    }

  
    public Integer getPrivado() {
        return privado;
    }

  
    public void setPrivado(Integer privado) {
        this.privado = privado;
    }

  
    public Integer getUsarPrecioPorCantidad() {
        return usarPrecioPorCantidad;
    }

  
    public void setUsarPrecioPorCantidad(Integer usarPrecioPorCantidad) {
        this.usarPrecioPorCantidad = usarPrecioPorCantidad;
    }

  
    public Integer getUsarDescuentoPorCantidad() {
        return usarDescuentoPorCantidad;
    }

  
    public void setUsarDescuentoPorCantidad(Integer usarDescuentoPorCantidad) {
        this.usarDescuentoPorCantidad = usarDescuentoPorCantidad;
    }

  
    public BigDecimal getPrecio1() {
        return precio1;
    }

  
    public void setPrecio1(BigDecimal precio1) {
        this.precio1 = precio1;
    }

  
    public BigDecimal getDescuento1() {
        return descuento1;
    }

  
    public void setDescuento1(BigDecimal descuento1) {
        this.descuento1 = descuento1;
    }

  
    public BigDecimal getCantidad1() {
        return cantidad1;
    }

  
    public void setCantidad1(BigDecimal cantidad1) {
        this.cantidad1 = cantidad1;
    }

  
    public BigDecimal getPrecio2() {
        return precio2;
    }

  
    public void setPrecio2(BigDecimal precio2) {
        this.precio2 = precio2;
    }

  
    public BigDecimal getDescuento2() {
        return descuento2;
    }

  
    public void setDescuento2(BigDecimal descuento2) {
        this.descuento2 = descuento2;
    }

  
    public BigDecimal getCantidad2() {
        return cantidad2;
    }

  
    public void setCantidad2(BigDecimal cantidad2) {
        this.cantidad2 = cantidad2;
    }

  
    public BigDecimal getPrecio3() {
        return precio3;
    }

  
    public void setPrecio3(BigDecimal precio3) {
        this.precio3 = precio3;
    }

  
    public BigDecimal getDescuento3() {
        return descuento3;
    }

  
    public void setDescuento3(BigDecimal descuento3) {
        this.descuento3 = descuento3;
    }

  
    public BigDecimal getCantidad3() {
        return cantidad3;
    }

  
    public void setCantidad3(BigDecimal cantidad3) {
        this.cantidad3 = cantidad3;
    }

  
    public BigDecimal getPrecio4() {
        return precio4;
    }

  
    public void setPrecio4(BigDecimal precio4) {
        this.precio4 = precio4;
    }

  
    public BigDecimal getDescuento4() {
        return descuento4;
    }

  
    public void setDescuento4(BigDecimal descuento4) {
        this.descuento4 = descuento4;
    }

  
    public BigDecimal getCantidad4() {
        return cantidad4;
    }

  
    public void setCantidad4(BigDecimal cantidad4) {
        this.cantidad4 = cantidad4;
    }

  
    public BigDecimal getPrecio5() {
        return precio5;
    }

  
    public void setPrecio5(BigDecimal precio5) {
        this.precio5 = precio5;
    }

  
    public BigDecimal getDescuento5() {
        return descuento5;
    }

  
    public void setDescuento5(BigDecimal descuento5) {
        this.descuento5 = descuento5;
    }

  
    public BigDecimal getCantidad5() {
        return cantidad5;
    }

  
    public void setCantidad5(BigDecimal cantidad5) {
        this.cantidad5 = cantidad5;
    }

  
    public BigDecimal getPrecio6() {
        return precio6;
    }

  
    public void setPrecio6(BigDecimal precio6) {
        this.precio6 = precio6;
    }

  
    public BigDecimal getDescuento6() {
        return descuento6;
    }

  
    public void setDescuento6(BigDecimal descuento6) {
        this.descuento6 = descuento6;
    }

  
    public String getNombre1() {
        return nombre1;
    }

  
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

  
    public String getNombre2() {
        return nombre2;
    }

  
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

  
    public String getNombre3() {
        return nombre3;
    }

  
    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

  
    public String getNombre4() {
        return nombre4;
    }

  
    public void setNombre4(String nombre4) {
        this.nombre4 = nombre4;
    }

  
    public String getNombre5() {
        return nombre5;
    }

  
    public void setNombre5(String nombre5) {
        this.nombre5 = nombre5;
    }

  
    public String getNombre6() {
        return nombre6;
    }

  
    public void setNombre6(String nombre6) {
        this.nombre6 = nombre6;
    }

  
    public String getNombre7() {
        return nombre7;
    }

  
    public void setNombre7(String nombre7) {
        this.nombre7 = nombre7;
    }

  
    public String getNombre8() {
        return nombre8;
    }

  
    public void setNombre8(String nombre8) {
        this.nombre8 = nombre8;
    }

  
    public String getNombre9() {
        return nombre9;
    }

  
    public void setNombre9(String nombre9) {
        this.nombre9 = nombre9;
    }

  
    public String getSitioEnAlmacen() {
        return sitioEnAlmacen;
    }

  
    public void setSitioEnAlmacen(String sitioEnAlmacen) {
        this.sitioEnAlmacen = sitioEnAlmacen;
    }

  
    public String getSitioEnEstante() {
        return sitioEnEstante;
    }

  
    public void setSitioEnEstante(String sitioEnEstante) {
        this.sitioEnEstante = sitioEnEstante;
    }

  
    public String getSerialNo() {
        return serialNo;
    }

  
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

  
    public BigDecimal getMiniStock() {
        return miniStock;
    }

  
    public void setMiniStock(BigDecimal miniStock) {
        this.miniStock = miniStock;
    }

  
    public BigDecimal getMaxiStock() {
        return maxiStock;
    }

  
    public void setMaxiStock(BigDecimal maxiStock) {
        this.maxiStock = maxiStock;
    }

  
    public Long getDibujoID() {
        return dibujoID;
    }

  
    public void setDibujoID(Long dibujoID) {
        this.dibujoID = dibujoID;
    }

  
    public Integer getRecomendado() {
        return recomendado;
    }

  
    public void setRecomendado(Integer recomendado) {
        this.recomendado = recomendado;
    }

  
    public Integer getDescuentoCambioProhibido() {
        return descuentoCambioProhibido;
    }

  
    public void setDescuentoCambioProhibido(Integer descuentoCambioProhibido) {
        this.descuentoCambioProhibido = descuentoCambioProhibido;
    }

  
    public String getAliIngrediente() {
        return aliIngrediente;
    }

  
    public void setAliIngrediente(String aliIngrediente) {
        this.aliIngrediente = aliIngrediente;
    }

  
    public String getAliPesoTotal() {
        return aliPesoTotal;
    }

  
    public void setAliPesoTotal(String aliPesoTotal) {
        this.aliPesoTotal = aliPesoTotal;
    }

  
    public String getAliPesoNeto() {
        return aliPesoNeto;
    }

  
    public void setAliPesoNeto(String aliPesoNeto) {
        this.aliPesoNeto = aliPesoNeto;
    }

  
    public String getAliFechaCaducada() {
        return aliFechaCaducada;
    }

  
    public void setAliFechaCaducada(String aliFechaCaducada) {
        this.aliFechaCaducada = aliFechaCaducada;
    }

  
    public String getAliLugarFabricante() {
        return aliLugarFabricante;
    }

  
    public void setAliLugarFabricante(String aliLugarFabricante) {
        this.aliLugarFabricante = aliLugarFabricante;
    }

  
    public String getAliImportador() {
        return aliImportador;
    }

  
    public void setAliImportador(String aliImportador) {
        this.aliImportador = aliImportador;
    }

  
    public String getAliNumeroSanitario() {
        return aliNumeroSanitario;
    }

  
    public void setAliNumeroSanitario(String aliNumeroSanitario) {
        this.aliNumeroSanitario = aliNumeroSanitario;
    }

  
    public String getAliNumeroLote() {
        return aliNumeroLote;
    }

  
    public void setAliNumeroLote(String aliNumeroLote) {
        this.aliNumeroLote = aliNumeroLote;
    }

  
    public String getAliAdjuncion() {
        return aliAdjuncion;
    }

  
    public void setAliAdjuncion(String aliAdjuncion) {
        this.aliAdjuncion = aliAdjuncion;
    }

  
    public String getMultiCodigo() {
        return multiCodigo;
    }

  
    public void setMultiCodigo(String multiCodigo) {
        this.multiCodigo = multiCodigo;
    }

  
    public Integer getOrdenNo() {
        return ordenNo;
    }

  
    public void setOrdenNo(Integer ordenNo) {
        this.ordenNo = ordenNo;
    }

  
    public Long getOrdenNoFinal() {
        return ordenNoFinal;
    }

  
    public void setOrdenNoFinal(Long ordenNoFinal) {
        this.ordenNoFinal = ordenNoFinal;
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
        Articulo other = (Articulo) that;
        return (this.getArticuloID() == null ? other.getArticuloID() == null : this.getArticuloID().equals(other.getArticuloID()))
            && (this.getCodigoBarra() == null ? other.getCodigoBarra() == null : this.getCodigoBarra().equals(other.getCodigoBarra()))
            && (this.getProp1Titulo() == null ? other.getProp1Titulo() == null : this.getProp1Titulo().equals(other.getProp1Titulo()))
            && (this.getProp2Titulo() == null ? other.getProp2Titulo() == null : this.getProp2Titulo().equals(other.getProp2Titulo()))
            && (this.getPropCount() == null ? other.getPropCount() == null : this.getPropCount().equals(other.getPropCount()))
            && (this.getNombreES() == null ? other.getNombreES() == null : this.getNombreES().equals(other.getNombreES()))
            && (this.getNombreCN() == null ? other.getNombreCN() == null : this.getNombreCN().equals(other.getNombreCN()))
            && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()))
            && (this.getPrecioDetalle() == null ? other.getPrecioDetalle() == null : this.getPrecioDetalle().equals(other.getPrecioDetalle()))
            && (this.getPrecioDomicilio() == null ? other.getPrecioDomicilio() == null : this.getPrecioDomicilio().equals(other.getPrecioDomicilio()))
            && (this.getPrecioSocio() == null ? other.getPrecioSocio() == null : this.getPrecioSocio().equals(other.getPrecioSocio()))
            && (this.getPrecioMayor() == null ? other.getPrecioMayor() == null : this.getPrecioMayor().equals(other.getPrecioMayor()))
            && (this.getPrecioFactura() == null ? other.getPrecioFactura() == null : this.getPrecioFactura().equals(other.getPrecioFactura()))
            && (this.getPrecioInternet() == null ? other.getPrecioInternet() == null : this.getPrecioInternet().equals(other.getPrecioInternet()))
            && (this.getPrecioAmigo() == null ? other.getPrecioAmigo() == null : this.getPrecioAmigo().equals(other.getPrecioAmigo()))
            && (this.getPrecioEspecial() == null ? other.getPrecioEspecial() == null : this.getPrecioEspecial().equals(other.getPrecioEspecial()))
            && (this.getPrecioOferta() == null ? other.getPrecioOferta() == null : this.getPrecioOferta().equals(other.getPrecioOferta()))
            && (this.getPrecioCoste() == null ? other.getPrecioCoste() == null : this.getPrecioCoste().equals(other.getPrecioCoste()))
            && (this.getCantidadPorUnidad() == null ? other.getCantidadPorUnidad() == null : this.getCantidadPorUnidad().equals(other.getCantidadPorUnidad()))
            && (this.getCantidadPorUnidad2() == null ? other.getCantidadPorUnidad2() == null : this.getCantidadPorUnidad2().equals(other.getCantidadPorUnidad2()))
            && (this.getVolumenPeso() == null ? other.getVolumenPeso() == null : this.getVolumenPeso().equals(other.getVolumenPeso()))
            && (this.getUnidadUsarRegla() == null ? other.getUnidadUsarRegla() == null : this.getUnidadUsarRegla().equals(other.getUnidadUsarRegla()))
            && (this.getClaseID() == null ? other.getClaseID() == null : this.getClaseID().equals(other.getClaseID()))
            && (this.getUnidadNombre() == null ? other.getUnidadNombre() == null : this.getUnidadNombre().equals(other.getUnidadNombre()))
            && (this.getFechaPrecioCoste() == null ? other.getFechaPrecioCoste() == null : this.getFechaPrecioCoste().equals(other.getFechaPrecioCoste()))
            && (this.getDescuento() == null ? other.getDescuento() == null : this.getDescuento().equals(other.getDescuento()))
            && (this.getFacturaPorcentaje() == null ? other.getFacturaPorcentaje() == null : this.getFacturaPorcentaje().equals(other.getFacturaPorcentaje()))
            && (this.getFechaCaducada() == null ? other.getFechaCaducada() == null : this.getFechaCaducada().equals(other.getFechaCaducada()))
            && (this.getEmpresaID() == null ? other.getEmpresaID() == null : this.getEmpresaID().equals(other.getEmpresaID()))
            && (this.getOferta() == null ? other.getOferta() == null : this.getOferta().equals(other.getOferta()))
            && (this.getPrivado() == null ? other.getPrivado() == null : this.getPrivado().equals(other.getPrivado()))
            && (this.getUsarPrecioPorCantidad() == null ? other.getUsarPrecioPorCantidad() == null : this.getUsarPrecioPorCantidad().equals(other.getUsarPrecioPorCantidad()))
            && (this.getUsarDescuentoPorCantidad() == null ? other.getUsarDescuentoPorCantidad() == null : this.getUsarDescuentoPorCantidad().equals(other.getUsarDescuentoPorCantidad()))
            && (this.getPrecio1() == null ? other.getPrecio1() == null : this.getPrecio1().equals(other.getPrecio1()))
            && (this.getDescuento1() == null ? other.getDescuento1() == null : this.getDescuento1().equals(other.getDescuento1()))
            && (this.getCantidad1() == null ? other.getCantidad1() == null : this.getCantidad1().equals(other.getCantidad1()))
            && (this.getPrecio2() == null ? other.getPrecio2() == null : this.getPrecio2().equals(other.getPrecio2()))
            && (this.getDescuento2() == null ? other.getDescuento2() == null : this.getDescuento2().equals(other.getDescuento2()))
            && (this.getCantidad2() == null ? other.getCantidad2() == null : this.getCantidad2().equals(other.getCantidad2()))
            && (this.getPrecio3() == null ? other.getPrecio3() == null : this.getPrecio3().equals(other.getPrecio3()))
            && (this.getDescuento3() == null ? other.getDescuento3() == null : this.getDescuento3().equals(other.getDescuento3()))
            && (this.getCantidad3() == null ? other.getCantidad3() == null : this.getCantidad3().equals(other.getCantidad3()))
            && (this.getPrecio4() == null ? other.getPrecio4() == null : this.getPrecio4().equals(other.getPrecio4()))
            && (this.getDescuento4() == null ? other.getDescuento4() == null : this.getDescuento4().equals(other.getDescuento4()))
            && (this.getCantidad4() == null ? other.getCantidad4() == null : this.getCantidad4().equals(other.getCantidad4()))
            && (this.getPrecio5() == null ? other.getPrecio5() == null : this.getPrecio5().equals(other.getPrecio5()))
            && (this.getDescuento5() == null ? other.getDescuento5() == null : this.getDescuento5().equals(other.getDescuento5()))
            && (this.getCantidad5() == null ? other.getCantidad5() == null : this.getCantidad5().equals(other.getCantidad5()))
            && (this.getPrecio6() == null ? other.getPrecio6() == null : this.getPrecio6().equals(other.getPrecio6()))
            && (this.getDescuento6() == null ? other.getDescuento6() == null : this.getDescuento6().equals(other.getDescuento6()))
            && (this.getNombre1() == null ? other.getNombre1() == null : this.getNombre1().equals(other.getNombre1()))
            && (this.getNombre2() == null ? other.getNombre2() == null : this.getNombre2().equals(other.getNombre2()))
            && (this.getNombre3() == null ? other.getNombre3() == null : this.getNombre3().equals(other.getNombre3()))
            && (this.getNombre4() == null ? other.getNombre4() == null : this.getNombre4().equals(other.getNombre4()))
            && (this.getNombre5() == null ? other.getNombre5() == null : this.getNombre5().equals(other.getNombre5()))
            && (this.getNombre6() == null ? other.getNombre6() == null : this.getNombre6().equals(other.getNombre6()))
            && (this.getNombre7() == null ? other.getNombre7() == null : this.getNombre7().equals(other.getNombre7()))
            && (this.getNombre8() == null ? other.getNombre8() == null : this.getNombre8().equals(other.getNombre8()))
            && (this.getNombre9() == null ? other.getNombre9() == null : this.getNombre9().equals(other.getNombre9()))
            && (this.getSitioEnAlmacen() == null ? other.getSitioEnAlmacen() == null : this.getSitioEnAlmacen().equals(other.getSitioEnAlmacen()))
            && (this.getSitioEnEstante() == null ? other.getSitioEnEstante() == null : this.getSitioEnEstante().equals(other.getSitioEnEstante()))
            && (this.getSerialNo() == null ? other.getSerialNo() == null : this.getSerialNo().equals(other.getSerialNo()))
            && (this.getMiniStock() == null ? other.getMiniStock() == null : this.getMiniStock().equals(other.getMiniStock()))
            && (this.getMaxiStock() == null ? other.getMaxiStock() == null : this.getMaxiStock().equals(other.getMaxiStock()))
            && (this.getDibujoID() == null ? other.getDibujoID() == null : this.getDibujoID().equals(other.getDibujoID()))
            && (this.getRecomendado() == null ? other.getRecomendado() == null : this.getRecomendado().equals(other.getRecomendado()))
            && (this.getDescuentoCambioProhibido() == null ? other.getDescuentoCambioProhibido() == null : this.getDescuentoCambioProhibido().equals(other.getDescuentoCambioProhibido()))
            && (this.getAliIngrediente() == null ? other.getAliIngrediente() == null : this.getAliIngrediente().equals(other.getAliIngrediente()))
            && (this.getAliPesoTotal() == null ? other.getAliPesoTotal() == null : this.getAliPesoTotal().equals(other.getAliPesoTotal()))
            && (this.getAliPesoNeto() == null ? other.getAliPesoNeto() == null : this.getAliPesoNeto().equals(other.getAliPesoNeto()))
            && (this.getAliFechaCaducada() == null ? other.getAliFechaCaducada() == null : this.getAliFechaCaducada().equals(other.getAliFechaCaducada()))
            && (this.getAliLugarFabricante() == null ? other.getAliLugarFabricante() == null : this.getAliLugarFabricante().equals(other.getAliLugarFabricante()))
            && (this.getAliImportador() == null ? other.getAliImportador() == null : this.getAliImportador().equals(other.getAliImportador()))
            && (this.getAliNumeroSanitario() == null ? other.getAliNumeroSanitario() == null : this.getAliNumeroSanitario().equals(other.getAliNumeroSanitario()))
            && (this.getAliNumeroLote() == null ? other.getAliNumeroLote() == null : this.getAliNumeroLote().equals(other.getAliNumeroLote()))
            && (this.getAliAdjuncion() == null ? other.getAliAdjuncion() == null : this.getAliAdjuncion().equals(other.getAliAdjuncion()))
            && (this.getMultiCodigo() == null ? other.getMultiCodigo() == null : this.getMultiCodigo().equals(other.getMultiCodigo()))
            && (this.getOrdenNo() == null ? other.getOrdenNo() == null : this.getOrdenNo().equals(other.getOrdenNo()))
            && (this.getOrdenNoFinal() == null ? other.getOrdenNoFinal() == null : this.getOrdenNoFinal().equals(other.getOrdenNoFinal()))
            && (this.getBloqueado() == null ? other.getBloqueado() == null : this.getBloqueado().equals(other.getBloqueado()))
            && (this.getObservacion() == null ? other.getObservacion() == null : this.getObservacion().equals(other.getObservacion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArticuloID() == null) ? 0 : getArticuloID().hashCode());
        result = prime * result + ((getCodigoBarra() == null) ? 0 : getCodigoBarra().hashCode());
        result = prime * result + ((getProp1Titulo() == null) ? 0 : getProp1Titulo().hashCode());
        result = prime * result + ((getProp2Titulo() == null) ? 0 : getProp2Titulo().hashCode());
        result = prime * result + ((getPropCount() == null) ? 0 : getPropCount().hashCode());
        result = prime * result + ((getNombreES() == null) ? 0 : getNombreES().hashCode());
        result = prime * result + ((getNombreCN() == null) ? 0 : getNombreCN().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        result = prime * result + ((getPrecioDetalle() == null) ? 0 : getPrecioDetalle().hashCode());
        result = prime * result + ((getPrecioDomicilio() == null) ? 0 : getPrecioDomicilio().hashCode());
        result = prime * result + ((getPrecioSocio() == null) ? 0 : getPrecioSocio().hashCode());
        result = prime * result + ((getPrecioMayor() == null) ? 0 : getPrecioMayor().hashCode());
        result = prime * result + ((getPrecioFactura() == null) ? 0 : getPrecioFactura().hashCode());
        result = prime * result + ((getPrecioInternet() == null) ? 0 : getPrecioInternet().hashCode());
        result = prime * result + ((getPrecioAmigo() == null) ? 0 : getPrecioAmigo().hashCode());
        result = prime * result + ((getPrecioEspecial() == null) ? 0 : getPrecioEspecial().hashCode());
        result = prime * result + ((getPrecioOferta() == null) ? 0 : getPrecioOferta().hashCode());
        result = prime * result + ((getPrecioCoste() == null) ? 0 : getPrecioCoste().hashCode());
        result = prime * result + ((getCantidadPorUnidad() == null) ? 0 : getCantidadPorUnidad().hashCode());
        result = prime * result + ((getCantidadPorUnidad2() == null) ? 0 : getCantidadPorUnidad2().hashCode());
        result = prime * result + ((getVolumenPeso() == null) ? 0 : getVolumenPeso().hashCode());
        result = prime * result + ((getUnidadUsarRegla() == null) ? 0 : getUnidadUsarRegla().hashCode());
        result = prime * result + ((getClaseID() == null) ? 0 : getClaseID().hashCode());
        result = prime * result + ((getUnidadNombre() == null) ? 0 : getUnidadNombre().hashCode());
        result = prime * result + ((getFechaPrecioCoste() == null) ? 0 : getFechaPrecioCoste().hashCode());
        result = prime * result + ((getDescuento() == null) ? 0 : getDescuento().hashCode());
        result = prime * result + ((getFacturaPorcentaje() == null) ? 0 : getFacturaPorcentaje().hashCode());
        result = prime * result + ((getFechaCaducada() == null) ? 0 : getFechaCaducada().hashCode());
        result = prime * result + ((getEmpresaID() == null) ? 0 : getEmpresaID().hashCode());
        result = prime * result + ((getOferta() == null) ? 0 : getOferta().hashCode());
        result = prime * result + ((getPrivado() == null) ? 0 : getPrivado().hashCode());
        result = prime * result + ((getUsarPrecioPorCantidad() == null) ? 0 : getUsarPrecioPorCantidad().hashCode());
        result = prime * result + ((getUsarDescuentoPorCantidad() == null) ? 0 : getUsarDescuentoPorCantidad().hashCode());
        result = prime * result + ((getPrecio1() == null) ? 0 : getPrecio1().hashCode());
        result = prime * result + ((getDescuento1() == null) ? 0 : getDescuento1().hashCode());
        result = prime * result + ((getCantidad1() == null) ? 0 : getCantidad1().hashCode());
        result = prime * result + ((getPrecio2() == null) ? 0 : getPrecio2().hashCode());
        result = prime * result + ((getDescuento2() == null) ? 0 : getDescuento2().hashCode());
        result = prime * result + ((getCantidad2() == null) ? 0 : getCantidad2().hashCode());
        result = prime * result + ((getPrecio3() == null) ? 0 : getPrecio3().hashCode());
        result = prime * result + ((getDescuento3() == null) ? 0 : getDescuento3().hashCode());
        result = prime * result + ((getCantidad3() == null) ? 0 : getCantidad3().hashCode());
        result = prime * result + ((getPrecio4() == null) ? 0 : getPrecio4().hashCode());
        result = prime * result + ((getDescuento4() == null) ? 0 : getDescuento4().hashCode());
        result = prime * result + ((getCantidad4() == null) ? 0 : getCantidad4().hashCode());
        result = prime * result + ((getPrecio5() == null) ? 0 : getPrecio5().hashCode());
        result = prime * result + ((getDescuento5() == null) ? 0 : getDescuento5().hashCode());
        result = prime * result + ((getCantidad5() == null) ? 0 : getCantidad5().hashCode());
        result = prime * result + ((getPrecio6() == null) ? 0 : getPrecio6().hashCode());
        result = prime * result + ((getDescuento6() == null) ? 0 : getDescuento6().hashCode());
        result = prime * result + ((getNombre1() == null) ? 0 : getNombre1().hashCode());
        result = prime * result + ((getNombre2() == null) ? 0 : getNombre2().hashCode());
        result = prime * result + ((getNombre3() == null) ? 0 : getNombre3().hashCode());
        result = prime * result + ((getNombre4() == null) ? 0 : getNombre4().hashCode());
        result = prime * result + ((getNombre5() == null) ? 0 : getNombre5().hashCode());
        result = prime * result + ((getNombre6() == null) ? 0 : getNombre6().hashCode());
        result = prime * result + ((getNombre7() == null) ? 0 : getNombre7().hashCode());
        result = prime * result + ((getNombre8() == null) ? 0 : getNombre8().hashCode());
        result = prime * result + ((getNombre9() == null) ? 0 : getNombre9().hashCode());
        result = prime * result + ((getSitioEnAlmacen() == null) ? 0 : getSitioEnAlmacen().hashCode());
        result = prime * result + ((getSitioEnEstante() == null) ? 0 : getSitioEnEstante().hashCode());
        result = prime * result + ((getSerialNo() == null) ? 0 : getSerialNo().hashCode());
        result = prime * result + ((getMiniStock() == null) ? 0 : getMiniStock().hashCode());
        result = prime * result + ((getMaxiStock() == null) ? 0 : getMaxiStock().hashCode());
        result = prime * result + ((getDibujoID() == null) ? 0 : getDibujoID().hashCode());
        result = prime * result + ((getRecomendado() == null) ? 0 : getRecomendado().hashCode());
        result = prime * result + ((getDescuentoCambioProhibido() == null) ? 0 : getDescuentoCambioProhibido().hashCode());
        result = prime * result + ((getAliIngrediente() == null) ? 0 : getAliIngrediente().hashCode());
        result = prime * result + ((getAliPesoTotal() == null) ? 0 : getAliPesoTotal().hashCode());
        result = prime * result + ((getAliPesoNeto() == null) ? 0 : getAliPesoNeto().hashCode());
        result = prime * result + ((getAliFechaCaducada() == null) ? 0 : getAliFechaCaducada().hashCode());
        result = prime * result + ((getAliLugarFabricante() == null) ? 0 : getAliLugarFabricante().hashCode());
        result = prime * result + ((getAliImportador() == null) ? 0 : getAliImportador().hashCode());
        result = prime * result + ((getAliNumeroSanitario() == null) ? 0 : getAliNumeroSanitario().hashCode());
        result = prime * result + ((getAliNumeroLote() == null) ? 0 : getAliNumeroLote().hashCode());
        result = prime * result + ((getAliAdjuncion() == null) ? 0 : getAliAdjuncion().hashCode());
        result = prime * result + ((getMultiCodigo() == null) ? 0 : getMultiCodigo().hashCode());
        result = prime * result + ((getOrdenNo() == null) ? 0 : getOrdenNo().hashCode());
        result = prime * result + ((getOrdenNoFinal() == null) ? 0 : getOrdenNoFinal().hashCode());
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
        sb.append(", articuloID=").append(articuloID);
        sb.append(", codigoBarra=").append(codigoBarra);
        sb.append(", prop1Titulo=").append(prop1Titulo);
        sb.append(", prop2Titulo=").append(prop2Titulo);
        sb.append(", propCount=").append(propCount);
        sb.append(", nombreES=").append(nombreES);
        sb.append(", nombreCN=").append(nombreCN);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", precioDetalle=").append(precioDetalle);
        sb.append(", precioDomicilio=").append(precioDomicilio);
        sb.append(", precioSocio=").append(precioSocio);
        sb.append(", precioMayor=").append(precioMayor);
        sb.append(", precioFactura=").append(precioFactura);
        sb.append(", precioInternet=").append(precioInternet);
        sb.append(", precioAmigo=").append(precioAmigo);
        sb.append(", precioEspecial=").append(precioEspecial);
        sb.append(", precioOferta=").append(precioOferta);
        sb.append(", precioCoste=").append(precioCoste);
        sb.append(", cantidadPorUnidad=").append(cantidadPorUnidad);
        sb.append(", cantidadPorUnidad2=").append(cantidadPorUnidad2);
        sb.append(", volumenPeso=").append(volumenPeso);
        sb.append(", unidadUsarRegla=").append(unidadUsarRegla);
        sb.append(", claseID=").append(claseID);
        sb.append(", unidadNombre=").append(unidadNombre);
        sb.append(", fechaPrecioCoste=").append(fechaPrecioCoste);
        sb.append(", descuento=").append(descuento);
        sb.append(", facturaPorcentaje=").append(facturaPorcentaje);
        sb.append(", fechaCaducada=").append(fechaCaducada);
        sb.append(", empresaID=").append(empresaID);
        sb.append(", oferta=").append(oferta);
        sb.append(", privado=").append(privado);
        sb.append(", usarPrecioPorCantidad=").append(usarPrecioPorCantidad);
        sb.append(", usarDescuentoPorCantidad=").append(usarDescuentoPorCantidad);
        sb.append(", precio1=").append(precio1);
        sb.append(", descuento1=").append(descuento1);
        sb.append(", cantidad1=").append(cantidad1);
        sb.append(", precio2=").append(precio2);
        sb.append(", descuento2=").append(descuento2);
        sb.append(", cantidad2=").append(cantidad2);
        sb.append(", precio3=").append(precio3);
        sb.append(", descuento3=").append(descuento3);
        sb.append(", cantidad3=").append(cantidad3);
        sb.append(", precio4=").append(precio4);
        sb.append(", descuento4=").append(descuento4);
        sb.append(", cantidad4=").append(cantidad4);
        sb.append(", precio5=").append(precio5);
        sb.append(", descuento5=").append(descuento5);
        sb.append(", cantidad5=").append(cantidad5);
        sb.append(", precio6=").append(precio6);
        sb.append(", descuento6=").append(descuento6);
        sb.append(", nombre1=").append(nombre1);
        sb.append(", nombre2=").append(nombre2);
        sb.append(", nombre3=").append(nombre3);
        sb.append(", nombre4=").append(nombre4);
        sb.append(", nombre5=").append(nombre5);
        sb.append(", nombre6=").append(nombre6);
        sb.append(", nombre7=").append(nombre7);
        sb.append(", nombre8=").append(nombre8);
        sb.append(", nombre9=").append(nombre9);
        sb.append(", sitioEnAlmacen=").append(sitioEnAlmacen);
        sb.append(", sitioEnEstante=").append(sitioEnEstante);
        sb.append(", serialNo=").append(serialNo);
        sb.append(", miniStock=").append(miniStock);
        sb.append(", maxiStock=").append(maxiStock);
        sb.append(", dibujoID=").append(dibujoID);
        sb.append(", recomendado=").append(recomendado);
        sb.append(", descuentoCambioProhibido=").append(descuentoCambioProhibido);
        sb.append(", aliIngrediente=").append(aliIngrediente);
        sb.append(", aliPesoTotal=").append(aliPesoTotal);
        sb.append(", aliPesoNeto=").append(aliPesoNeto);
        sb.append(", aliFechaCaducada=").append(aliFechaCaducada);
        sb.append(", aliLugarFabricante=").append(aliLugarFabricante);
        sb.append(", aliImportador=").append(aliImportador);
        sb.append(", aliNumeroSanitario=").append(aliNumeroSanitario);
        sb.append(", aliNumeroLote=").append(aliNumeroLote);
        sb.append(", aliAdjuncion=").append(aliAdjuncion);
        sb.append(", multiCodigo=").append(multiCodigo);
        sb.append(", ordenNo=").append(ordenNo);
        sb.append(", ordenNoFinal=").append(ordenNoFinal);
        sb.append(", bloqueado=").append(bloqueado);
        sb.append(", observacion=").append(observacion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}