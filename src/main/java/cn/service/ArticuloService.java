package cn.service;

import cn.entity.Articulo;
import cn.entity.ArticuloClass;
import cn.entity.Proveedor;
import cn.mapper.ArticuloMapper;
import cn.param.ZbmParam;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;
import java.util.List;

public interface ArticuloService extends IService<Articulo> {
	ArticuloMapper getArticuloMapper();
	public Articulo scan(Articulo ac);

	public int update(Articulo ac);

	public int edit(Articulo ac);

	public int add(Articulo ac);

	public List<ArticuloClass> getAcClass();

	public List<Proveedor> getProveedor();

	public List<Articulo> getByArticuloIDOrCodigoBarra(String idOrCode);


	public int updateByArticuloIDOrCodigoBarra(int usarprecioporcantidad,BigDecimal precioDetalle,BigDecimal precio1, Float descuento1,  BigDecimal cantidad1,  BigDecimal precio2, Float descuento2,  BigDecimal cantidad2,  BigDecimal precio3,  Float descuento3,  BigDecimal cantidad3,  BigDecimal precio4,  Float descuento4,  BigDecimal cantidad4, BigDecimal precio5,  Float descuento5,  BigDecimal cantidad5,BigDecimal precio6, String idOrCode);

	public String zbm(ZbmParam zbmParam);
}
