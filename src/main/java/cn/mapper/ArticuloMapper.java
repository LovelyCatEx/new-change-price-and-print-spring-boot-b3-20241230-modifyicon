package cn.mapper;

import cn.entity.Articulo;
import cn.entity.ArticuloClass;
import cn.entity.ArticuloDibujo;
import cn.entity.Proveedor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author haokai
 * @description articuloMapper
 * @date 2023-07-29
 */
public interface ArticuloMapper extends BaseMapper<Articulo> {
    @Update("UPDATE articulo SET PrecioDetalle = #{precioDetalle} where 1=1 and (ArticuloID =  #{articuloID} or CodigoBarra =  #{articuloID})")
    int updateOne(
        @Param(value = "articuloID") String articuloID,
        @Param(value = "precioDetalle") String precioDetalle
    );

    Articulo queryOne(@Param(value = "code") String code);

    @Select("select ArticuloID,CodigoBarra,NombreES,PrecioDetalle,UsarPrecioPorCantidad,Precio1,Descuento1,Cantidad1,Precio2,Descuento2,Cantidad2,Precio3,Descuento3,Cantidad3,Precio4,Descuento4,Cantidad4,Precio5,Descuento5,Cantidad5,Precio6,Descuento6 from articulo where ArticuloID like CONCAT('%',#{idOrCode},'%') or CodigoBarra like CONCAT('%',#{idOrCode},'%')  ")
    public List<Articulo> getByArticuloIDOrCodigoBarra(@Param("idOrCode") String idOrCode);

    @Update("update articulo set UsarPrecioPorCantidad=#{usarPrecioPorCantidad},PrecioDetalle=#{precioDetalle},Precio1 =#{precio1},Cantidad1 =#{cantidad1},Precio2 =#{precio2},Cantidad2 =#{cantidad2},Precio3 =#{precio3},Cantidad3 =#{cantidad3},Precio4 =#{precio4},Cantidad4 =#{cantidad4},Precio5 =#{precio5},Cantidad5 =#{cantidad5},Precio6 =#{precio6}  where ArticuloID like CONCAT('%',#{idOrCode},'%') or CodigoBarra like CONCAT('%',#{idOrCode},'%')")
    public int updateByArticuloIDOrCodigoBarra(@Param("usarPrecioPorCantidad") int usarPrecioPorCantidad,@Param("precioDetalle") BigDecimal precioDetalle, @Param("precio1") BigDecimal precio1, @Param("descuento1") Float descuento1,@Param("cantidad1") BigDecimal cantidad1,@Param("precio2") BigDecimal precio2, @Param("descuento2") Float descuento2,@Param("cantidad2") BigDecimal cantidad2,@Param("precio3") BigDecimal precio3, @Param("descuento3") Float descuento3,@Param("cantidad3") BigDecimal cantidad3,@Param("precio4") BigDecimal precio4, @Param("descuento4") Float descuento4,@Param("cantidad4") BigDecimal cantidad4,@Param("precio5") BigDecimal precio5, @Param("descuento5") Float descuento5,@Param("cantidad5") BigDecimal cantidad5,@Param("precio6") BigDecimal precio6,@Param("idOrCode") String idOrCode);

    @Select("SELECT	a.*,b.nombreES proveedordd,b.empresaid proveedorid,c.stock stockda,dbuj.Dibujo AS dibujo FROM articulo a	LEFT JOIN proveedor b ON a.EmpresaID = b.EmpresaID LEFT JOIN stock c ON a.articuloid = c.articuloid LEFT JOIN articulodibujo buj on buj.ArticuloID = a.ArticuloID and buj.OrdenNo=1 LEFT JOIN dibujo dbuj on buj.DibujoID = dbuj.DibujoID WHERE a.articuloid =#{id}")
    public Articulo getById(String id);

    @Select("select *,b.nombreES proveedordd,b.empresaid proveedorid,c.stock stockda,dbuj.Dibujo AS dibujo FROM articulo a left join proveedor b on a.EmpresaID = b.EmpresaID left join stock c on a.articuloid = c.articuloid LEFT JOIN articulodibujo buj on buj.ArticuloID = a.codigobarra LEFT JOIN dibujo dbuj on buj.DibujoID = dbuj.DibujoID where a.codigobarra=#{codigobarra}")
    public Articulo getByCoding(String codigobarra);


    @Update("update articulo set preciodetalle =#{preciodetalle} where  articuloid=#{articuloid}")
    public int updatePreci(@Param("articuloid") String articuloid, @Param("preciodetalle") BigDecimal preciodetalle);

    @Update("update articulo set preciodetalle =#{preciodetalle}  where codigobarra=#{codigobarra}")
    public int updateByCode(@Param("codigobarra") String codigobarra, @Param("preciodetalle") BigDecimal preciodetalle);

    @Select("SELECT	count(*) from articulodibujo WHERE ArticuloId =#{articuloid}")
    public int getDibujoCountById(@Param("articuloid") String articuloid);

    @Select("SELECT	count(*) from dibujo ")
    public int getDibujoCount();

    @Select("SELECT	* from articulodibujo WHERE ArticuloId =#{articuloid} order by OrdenNo desc")
    public List<ArticuloDibujo> getDibujosCountById(@Param("articuloid") String articuloid);


    @Insert("INSERT INTO articulodibujo (`ArticuloID`, `DibujoMD5`,`DibujoID`,`OrdenNo`) VALUES (#{articuloDibujo.articuloid}, #{articuloDibujo.dibujoMD5}" +
            ", #{articuloDibujo.dibujoID}, #{articuloDibujo.ordenNo})")
    public int insertArtDibujo(@Param("articuloDibujo") ArticuloDibujo
            articuloDibujo);

    @Insert("INSERT INTO dibujo (`DibujoID`, `Dibujo`) VALUES (#{dibujoID}, #{dibujo})")
    public int insertDibujoById(@Param("dibujoID") int dibujoID, @Param("dibujo") byte[] dibujo);

//    @Update("update articulodibujo set Dibujo =#{dibujo} where ArticuloId=#{articuloid}")
//    public int updateDibujoById(@Param("articuloid") String articuloid, @Param("dibujo") byte[] dibujo);

    @Update("update dibujo set Dibujo =#{dibujo} where dibujoID=#{dibujoID}")
    public int updateDibujoById(@Param("dibujoID") int dibujoID, @Param("dibujo") byte[] dibujo);


    @Select("select * from articuloclase")
    public List<ArticuloClass> getAcClass();

    @Select("select * from proveedor")
    public List<Proveedor> getProveedor();

    @Update("update stock set stock = #{stock} where ArticuloId=#{articuloid}")
	public void updateStock(@Param("stock")String stockda, @Param("articuloid")String articuloid);
    
    @Insert("INSERT INTO stock (`ArticuloID`, `stock`) VALUES (#{articuloid}, #{stock})")
    public int insertStock(@Param("articuloid") String articuloid, @Param("stock")String stockda);

    @Select("SELECT	count(*) from stock WHERE ArticuloId =#{articuloid}")
    public int getStock(@Param("articuloid") String articuloid);

    @Select("SELECT COUNT(*)  FROM articulo  WHERE ArticuloID LIKE CONCAT(#{codePrefix}, '%') AND LENGTH(ArticuloID) = #{codeLength}")
    public int countByPrefixAndLength(@Param("codePrefix") String codePrefix, @Param("codeLength") int codeLength);

    public void insertArticulo(Articulo articulo);

}
