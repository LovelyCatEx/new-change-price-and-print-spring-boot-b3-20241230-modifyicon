package cn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @description articulo
 * @author zhengkai.blog.csdn.net
 * @date 2023-09-18
 */

public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.UUID)
    /**
    * articuloid
    */
    private String articuloid;

    private String empresaid;
    
    @TableField(exist = false)
	private String stockda;
    
    public String getArticuloid() {
        return articuloid;
    }


    public String getEmpresaid() {
        return empresaid;
    }

    public void setEmpresaid(String empresaid) {
        this.empresaid = empresaid;
    }

    public String getStockda() {
		return stockda;
	}



	public void setStockda(String stockda) {
		this.stockda = stockda;
	}



	public void setArticuloid(String articuloid) {
        this.articuloid = articuloid;
    }
    /**
    * codigobarra
    */
    private String codigobarra;

    public String getCodigobarra() {
        return codigobarra;
    }

    public void setCodigobarra(String codigobarra) {
        this.codigobarra = codigobarra;
    }
    /**
    * descripcion
    */
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
    * preciodetalle
    */
    private BigDecimal preciodetalle;

    public BigDecimal getPreciodetalle() {
        return preciodetalle;
    }

    public void setPreciodetalle(BigDecimal preciodetalle) {
        this.preciodetalle = preciodetalle;
    }
    /**
    * preciodomicilio
    */
    private BigDecimal preciodomicilio;

    public BigDecimal getPreciodomicilio() {
        return preciodomicilio;
    }

    public void setPreciodomicilio(BigDecimal preciodomicilio) {
        this.preciodomicilio = preciodomicilio;
    }
    /**
    * preciosocio
    */
    private BigDecimal preciosocio;

    public BigDecimal getPreciosocio() {
        return preciosocio;
    }

    public void setPreciosocio(BigDecimal preciosocio) {
        this.preciosocio = preciosocio;
    }
    /**
    * preciomayor
    */
    private BigDecimal preciomayor;

    public BigDecimal getPreciomayor() {
        return preciomayor;
    }

    public void setPreciomayor(BigDecimal preciomayor) {
        this.preciomayor = preciomayor;
    }
    /**
    * preciofactura
    */
    private BigDecimal preciofactura;

    public BigDecimal getPreciofactura() {
        return preciofactura;
    }

    public void setPreciofactura(BigDecimal preciofactura) {
        this.preciofactura = preciofactura;
    }
    /**
    * preciointernet
    */
    private BigDecimal preciointernet;

    public BigDecimal getPreciointernet() {
        return preciointernet;
    }

    public void setPreciointernet(BigDecimal preciointernet) {
        this.preciointernet = preciointernet;
    }
    /**
    * precioamigo
    */
    private BigDecimal precioamigo;

    public BigDecimal getPrecioamigo() {
        return precioamigo;
    }

    public void setPrecioamigo(BigDecimal precioamigo) {
        this.precioamigo = precioamigo;
    }
    /**
    * precioespecial
    */
    private BigDecimal precioespecial;

    public BigDecimal getPrecioespecial() {
        return precioespecial;
    }

    public void setPrecioespecial(BigDecimal precioespecial) {
        this.precioespecial = precioespecial;
    }
    /**
    * preciooferta
    */
    private BigDecimal preciooferta;

    public BigDecimal getPreciooferta() {
        return preciooferta;
    }

    public void setPreciooferta(BigDecimal preciooferta) {
        this.preciooferta = preciooferta;
    }
    /**
    * preciocoste
    */
    private BigDecimal preciocoste;

    public BigDecimal getPreciocoste() {
        return preciocoste;
    }

    public void setPreciocoste(BigDecimal preciocoste) {
        this.preciocoste = preciocoste;
    }
    /**
    * nombrees
    */
    private String nombrees;

    public String getNombrees() {
        return nombrees;
    }

    public void setNombrees(String nombrees) {
        this.nombrees = nombrees;
    }
    /**
    * primeraletra
    */
    private String primeraletra;

    public String getPrimeraletra() {
        return primeraletra;
    }

    public void setPrimeraletra(String primeraletra) {
        this.primeraletra = primeraletra;
    }
    /**
    * nombrecn
    */
    private String nombrecn;

    public String getNombrecn() {
        return nombrecn;
    }

    public void setNombrecn(String nombrecn) {
        this.nombrecn = nombrecn;
    }
    /**
    * pinyin
    */
    private String pinyin;

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
    /**
    * cantidadporunidad
    */
    private BigDecimal cantidadporunidad;

    public BigDecimal getCantidadporunidad() {
        return cantidadporunidad;
    }

    public void setCantidadporunidad(BigDecimal cantidadporunidad) {
        this.cantidadporunidad = cantidadporunidad;
    }
    /**
    * cantidadporunidad2
    */
    private BigDecimal cantidadporunidad2;

    public BigDecimal getCantidadporunidad2() {
        return cantidadporunidad2;
    }

    public void setCantidadporunidad2(BigDecimal cantidadporunidad2) {
        this.cantidadporunidad2 = cantidadporunidad2;
    }
    /**
    * volumenpeso
    */
    private BigDecimal volumenpeso;

    public BigDecimal getVolumenpeso() {
        return volumenpeso;
    }

    public void setVolumenpeso(BigDecimal volumenpeso) {
        this.volumenpeso = volumenpeso;
    }
//    /**
//    * soloporunidad
//    */
//    private int soloporunidad;
//
//    public int getSoloporunidad() {
//        return soloporunidad;
//    }
//
//    public void setSoloporunidad(int soloporunidad) {
//        this.soloporunidad = soloporunidad;
//    }
    /**
    * claseid
    */
    private Integer claseid;

    public Integer getClaseid() {
        return claseid;
    }

    public void setClaseid(Integer claseid) {
        this.claseid = claseid;
    }
    /**
    * unidadnombre
    */
    private String unidadnombre;

    public String getUnidadnombre() {
        return unidadnombre;
    }

    public void setUnidadnombre(String unidadnombre) {
        this.unidadnombre = unidadnombre;
    }
    /**
    * fechapreciocoste
    */
    private Date fechapreciocoste;

    public Date getFechapreciocoste() {
        return fechapreciocoste;
    }

    public void setFechapreciocoste(Date fechapreciocoste) {
        this.fechapreciocoste = fechapreciocoste;
    }
    /**
    * descuento
    */
    private Float descuento;

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }
    /**
    * valedescuento
    */
    private Float valedescuento;

    public Float getValedescuento() {
        return valedescuento;
    }

    public void setValedescuento(Float valedescuento) {
        this.valedescuento = valedescuento;
    }
    /**
    * facturaporcentaje
    */
    private Float facturaporcentaje;

    public Float getFacturaporcentaje() {
        return facturaporcentaje;
    }

    public void setFacturaporcentaje(Float facturaporcentaje) {
        this.facturaporcentaje = facturaporcentaje;
    }
    /**
    * fechacaducada
    */
    private Date fechacaducada;

    public Date getFechacaducada() {
        return fechacaducada;
    }

    public void setFechacaducada(Date fechacaducada) {
        this.fechacaducada = fechacaducada;
    }
//    /**
//    * proveedorid
//    */
//    private String proveedorid;
//
//    public String getProveedorid() {
//        return proveedorid;
//    }
//
//    public void setProveedorid(String proveedorid) {
//        this.proveedorid = proveedorid;
//    }
    /**
    * oferta
    */
    private int oferta;
    @TableField(exist = false)
    private String proveedordd;

    public String getProveedordd() {
        return proveedordd;
    }

    public void setProveedordd(String proveedordd) {
        this.proveedordd = proveedordd;
    }

    public int getOferta() {
        return oferta;
    }

    public void setOferta(int oferta) {
        this.oferta = oferta;
    }
    /**
    * privado
    */
    private int privado;

    public int getPrivado() {
        return privado;
    }

    public void setPrivado(int privado) {
        this.privado = privado;
    }
    /**
    * usarprecioporcantidad
    */
    private int usarprecioporcantidad;

    public int getUsarprecioporcantidad() {
        return usarprecioporcantidad;
    }

    public void setUsarprecioporcantidad(int usarprecioporcantidad) {
        this.usarprecioporcantidad = usarprecioporcantidad;
    }
    /**
    * usardescuentoporcantidad
    */
    private int usardescuentoporcantidad;

    public int getUsardescuentoporcantidad() {
        return usardescuentoporcantidad;
    }

    public void setUsardescuentoporcantidad(int usardescuentoporcantidad) {
        this.usardescuentoporcantidad = usardescuentoporcantidad;
    }
    /**
    * precio1
    */
    private BigDecimal precio1;

    public BigDecimal getPrecio1() {
        return precio1;
    }

    public void setPrecio1(BigDecimal precio1) {
        this.precio1 = precio1;
    }
    /**
    * descuento1
    */
    private Float descuento1;

    public Float getDescuento1() {
        return descuento1;
    }

    public void setDescuento1(Float descuento1) {
        this.descuento1 = descuento1;
    }
    /**
    * cantidad1
    */
    private BigDecimal cantidad1;

    public BigDecimal getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(BigDecimal cantidad1) {
        this.cantidad1 = cantidad1;
    }
    /**
    * precio2
    */
    private BigDecimal precio2;

    public BigDecimal getPrecio2() {
        return precio2;
    }

    public void setPrecio2(BigDecimal precio2) {
        this.precio2 = precio2;
    }
    /**
    * descuento2
    */
    private Float descuento2;

    public Float getDescuento2() {
        return descuento2;
    }

    public void setDescuento2(Float descuento2) {
        this.descuento2 = descuento2;
    }
    /**
    * cantidad2
    */
    private BigDecimal cantidad2;

    public BigDecimal getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(BigDecimal cantidad2) {
        this.cantidad2 = cantidad2;
    }
    /**
    * precio3
    */
    private BigDecimal precio3;

    public BigDecimal getPrecio3() {
        return precio3;
    }

    public void setPrecio3(BigDecimal precio3) {
        this.precio3 = precio3;
    }
    /**
    * descuento3
    */
    private Float descuento3;

    public Float getDescuento3() {
        return descuento3;
    }

    public void setDescuento3(Float descuento3) {
        this.descuento3 = descuento3;
    }
    /**
    * cantidad3
    */
    private BigDecimal cantidad3;

    public BigDecimal getCantidad3() {
        return cantidad3;
    }

    public void setCantidad3(BigDecimal cantidad3) {
        this.cantidad3 = cantidad3;
    }
    /**
    * precio4
    */
    private BigDecimal precio4;

    public BigDecimal getPrecio4() {
        return precio4;
    }

    public void setPrecio4(BigDecimal precio4) {
        this.precio4 = precio4;
    }
    /**
    * descuento4
    */
    private Float descuento4;

    public Float getDescuento4() {
        return descuento4;
    }

    public void setDescuento4(Float descuento4) {
        this.descuento4 = descuento4;
    }
    /**
    * cantidad4
    */
    private BigDecimal cantidad4;

    public BigDecimal getCantidad4() {
        return cantidad4;
    }

    public void setCantidad4(BigDecimal cantidad4) {
        this.cantidad4 = cantidad4;
    }
    /**
    * precio5
    */
    private BigDecimal precio5;

    public BigDecimal getPrecio5() {
        return precio5;
    }

    public void setPrecio5(BigDecimal precio5) {
        this.precio5 = precio5;
    }
    /**
    * descuento5
    */
    private Float descuento5;

    public Float getDescuento5() {
        return descuento5;
    }

    public void setDescuento5(Float descuento5) {
        this.descuento5 = descuento5;
    }
    /**
    * cantidad5
    */
    private BigDecimal cantidad5;

    public BigDecimal getCantidad5() {
        return cantidad5;
    }
    public void setCantidad5(BigDecimal cantidad5) {
        this.cantidad5 = cantidad5;
    }
//    private BigDecimal cantidad6;
//
//    public BigDecimal getCantidad6() {
//        return cantidad6;
//    }
//    public void setCantidad6(BigDecimal cantidad6) {
//        this.cantidad6 = cantidad6;
//    }

    /**
    * precio6
    */
    private BigDecimal precio6;

    public BigDecimal getPrecio6() {
        return precio6;
    }

    public void setPrecio6(BigDecimal precio6) {
        this.precio6 = precio6;
    }
    /**
    * descuento6
    */
    private Float descuento6;

    public Float getDescuento6() {
        return descuento6;
    }

    public void setDescuento6(Float descuento6) {
        this.descuento6 = descuento6;
    }
    /**
    * sitioenalmacen
    */
    private String sitioenalmacen;

    public String getSitioenalmacen() {
        return sitioenalmacen;
    }

    public void setSitioenalmacen(String sitioenalmacen) {
        this.sitioenalmacen = sitioenalmacen;
    }
    /**
    * ministock
    */
    private BigDecimal ministock;

    public BigDecimal getMinistock() {
        return ministock;
    }

    public void setMinistock(BigDecimal ministock) {
        this.ministock = ministock;
    }
    /**
    * maxistock
    */
    private BigDecimal maxistock;

    public BigDecimal getMaxistock() {
        return maxistock;
    }

    public void setMaxistock(BigDecimal maxistock) {
        this.maxistock = maxistock;
    }
//    /**
//    * haydibujo
//    */
//    private int haydibujo;
//
//    public int getHaydibujo() {
//        return haydibujo;
//    }
//
//    public void setHaydibujo(int haydibujo) {
//        this.haydibujo = haydibujo;
//    }
    /**
    * dibujomd5
    */
    private String dibujomd5;

    public String getDibujomd5() {
        return dibujomd5;
    }

    public void setDibujomd5(String dibujomd5) {
        this.dibujomd5 = dibujomd5;
    }
    /**
    * tiempodibujomodificado
    */
    private Date tiempodibujomodificado;

    public Date getTiempodibujomodificado() {
        return tiempodibujomodificado;
    }

    public void setTiempodibujomodificado(Date tiempodibujomodificado) {
        this.tiempodibujomodificado = tiempodibujomodificado;
    }
    /**
    * descuentocambioprohibido
    */
    private int descuentocambioprohibido;

    public int getDescuentocambioprohibido() {
        return descuentocambioprohibido;
    }

    public void setDescuentocambioprohibido(int descuentocambioprohibido) {
        this.descuentocambioprohibido = descuentocambioprohibido;
    }
//    /**
//    * imprimirsigno
//    */
//    private int imprimirsigno;
//
//    public int getImprimirsigno() {
//        return imprimirsigno;
//    }
//
//    public void setImprimirsigno(int imprimirsigno) {
//        this.imprimirsigno = imprimirsigno;
//    }
//    /**
//    * tiempoimprimirsigno
//    */
//    private Date tiempoimprimirsigno;
//
//    public Date getTiempoimprimirsigno() {
//        return tiempoimprimirsigno;
//    }
//
//    public void setTiempoimprimirsigno(Date tiempoimprimirsigno) {
//        this.tiempoimprimirsigno = tiempoimprimirsigno;
//    }
//    /**
//    * agregarporadjunto
//    */
//    private int agregarporadjunto;
//
//    public int getAgregarporadjunto() {
//        return agregarporadjunto;
//    }
//
//    public void setAgregarporadjunto(int agregarporadjunto) {
//        this.agregarporadjunto = agregarporadjunto;
//    }
    private int unidadusarregla = 0;

    public int getUnidadusarregla() {
        return unidadusarregla;
    }

    public void setUnidadusarregla(int unidadusarregla) {
        this.unidadusarregla = unidadusarregla;
    }

    /**
    * multicodigo
    */
    private String multicodigo;

    public String getMulticodigo() {
        return multicodigo;
    }

    public void setMulticodigo(String multicodigo) {
        this.multicodigo = multicodigo;
    }
    /**
    * consultaparcial
    */
    private String consultaparcial;

    public String getConsultaparcial() {
        return consultaparcial;
    }

    public void setConsultaparcial(String consultaparcial) {
        this.consultaparcial = consultaparcial;
    }
    /**
    * fechaentrada
    */
    private Date fechaentrada;

    public Date getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(Date fechaentrada) {
        this.fechaentrada = fechaentrada;
    }
    /**
    * bloqueado
    */
    private int bloqueado;

    public int getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(int bloqueado) {
        this.bloqueado = bloqueado;
    }
    /**
    * signoespecial
    */
    private Integer signoespecial;

    public Integer getSignoespecial() {
        return signoespecial;
    }

    public void setSignoespecial(Integer signoespecial) {
        this.signoespecial = signoespecial;
    }
    /**
    * observacion
    */
    private String observacion;

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    /**
     * dibujo
     */
    private byte[] dibujo;

    public byte[] getDibujo() {
        return dibujo;
    }

    public void setDibujo(byte[] dibujo) {
        this.dibujo = dibujo;
    }

    public Articulo() {}

    private int dibujoid;

    public int getDibujoid() {
        return dibujoid;
    }

    public void setDibujoid(int dibujoid) {
        this.dibujoid = dibujoid;
    }
}