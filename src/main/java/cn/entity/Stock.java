package cn.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName stock
 */
@TableName(value ="stock")
public class Stock implements Serializable {
    @TableId(value = "AlmacenID")
    private Integer almacenID;
    @TableId(value = "ArticuloID")
    private String articuloID;
    @TableId(value = "PropID1")
    private String propID1;
    @TableId(value = "PropID2")
    private String propID2;
    @TableField(value = "PropCount")
    private Integer propCount;
    @TableField(value = "stock")
    private BigDecimal stock;
    @TableField(value = "SitioEnAlmacen")
    private String sitioEnAlmacen;
    @TableField(value = "SitioEnEstante")
    private String sitioEnEstante;
    @TableField(value = "MiniStock")
    private BigDecimal miniStock;
    @TableField(value = "MaxiStock")
    private BigDecimal maxiStock;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Integer getAlmacenID() {
        return almacenID;
    }


    public void setAlmacenID(Integer almacenID) {
        this.almacenID = almacenID;
    }


    public String getArticuloID() {
        return articuloID;
    }


    public void setArticuloID(String articuloID) {
        this.articuloID = articuloID;
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


    public Integer getPropCount() {
        return propCount;
    }


    public void setPropCount(Integer propCount) {
        this.propCount = propCount;
    }


    public BigDecimal getStock() {
        return stock;
    }


    public void setStock(BigDecimal stock) {
        this.stock = stock;
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
        Stock other = (Stock) that;
        return (this.getAlmacenID() == null ? other.getAlmacenID() == null : this.getAlmacenID().equals(other.getAlmacenID()))
            && (this.getArticuloID() == null ? other.getArticuloID() == null : this.getArticuloID().equals(other.getArticuloID()))
            && (this.getPropID1() == null ? other.getPropID1() == null : this.getPropID1().equals(other.getPropID1()))
            && (this.getPropID2() == null ? other.getPropID2() == null : this.getPropID2().equals(other.getPropID2()))
            && (this.getPropCount() == null ? other.getPropCount() == null : this.getPropCount().equals(other.getPropCount()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getSitioEnAlmacen() == null ? other.getSitioEnAlmacen() == null : this.getSitioEnAlmacen().equals(other.getSitioEnAlmacen()))
            && (this.getSitioEnEstante() == null ? other.getSitioEnEstante() == null : this.getSitioEnEstante().equals(other.getSitioEnEstante()))
            && (this.getMiniStock() == null ? other.getMiniStock() == null : this.getMiniStock().equals(other.getMiniStock()))
            && (this.getMaxiStock() == null ? other.getMaxiStock() == null : this.getMaxiStock().equals(other.getMaxiStock()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAlmacenID() == null) ? 0 : getAlmacenID().hashCode());
        result = prime * result + ((getArticuloID() == null) ? 0 : getArticuloID().hashCode());
        result = prime * result + ((getPropID1() == null) ? 0 : getPropID1().hashCode());
        result = prime * result + ((getPropID2() == null) ? 0 : getPropID2().hashCode());
        result = prime * result + ((getPropCount() == null) ? 0 : getPropCount().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getSitioEnAlmacen() == null) ? 0 : getSitioEnAlmacen().hashCode());
        result = prime * result + ((getSitioEnEstante() == null) ? 0 : getSitioEnEstante().hashCode());
        result = prime * result + ((getMiniStock() == null) ? 0 : getMiniStock().hashCode());
        result = prime * result + ((getMaxiStock() == null) ? 0 : getMaxiStock().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", almacenID=").append(almacenID);
        sb.append(", articuloID=").append(articuloID);
        sb.append(", propID1=").append(propID1);
        sb.append(", propID2=").append(propID2);
        sb.append(", propCount=").append(propCount);
        sb.append(", stock=").append(stock);
        sb.append(", sitioEnAlmacen=").append(sitioEnAlmacen);
        sb.append(", sitioEnEstante=").append(sitioEnEstante);
        sb.append(", miniStock=").append(miniStock);
        sb.append(", maxiStock=").append(maxiStock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}