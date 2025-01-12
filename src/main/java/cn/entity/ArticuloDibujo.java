package cn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



public class ArticuloDibujo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.UUID)
    /**
    * articuloid
    */
    private String articuloid;
    private String dibujoMD5;
    private int dibujoID;
    private int OrdenNo;

    public String getArticuloid() {
        return articuloid;
    }

    public void setArticuloid(String articuloid) {
        this.articuloid = articuloid;
    }

    public String getDibujoMD5() {
        return dibujoMD5;
    }

    public void setDibujoMD5(String dibujoMD5) {
        this.dibujoMD5 = dibujoMD5;
    }

    public int getDibujoID() {
        return dibujoID;
    }

    public void setDibujoID(int dibujoID) {
        this.dibujoID = dibujoID;
    }

    public int getOrdenNo() {
        return OrdenNo;
    }

    public void setOrdenNo(int ordenNo) {
        OrdenNo = ordenNo;
    }
}