package cn.service.impl;

import cn.entity.Articulo;
import cn.service.ArticuloService;
import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.entity.Albaranproveedorarticulo;
import cn.service.AlbaranproveedorarticuloService;
import cn.mapper.AlbaranproveedorarticuloMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
* @author Administrator
* @description 针对表【albaranproveedorarticulo】的数据库操作Service实现
* @createDate 2025-01-12 00:27:54
*/
@Service
public class AlbaranproveedorarticuloServiceImpl extends ServiceImpl<AlbaranproveedorarticuloMapper, Albaranproveedorarticulo>
    implements AlbaranproveedorarticuloService {

    @Resource
    private AlbaranproveedorarticuloMapper albaranproveedorarticuloMapper;

    @Resource
    private ArticuloService articuloService;

    @Override
    public Albaranproveedorarticulo queryOne(String code, String ArticuloID) {
        Albaranproveedorarticulo albaranproveedorarticulo = albaranproveedorarticuloMapper.queryOne(code, ArticuloID);
        Articulo articulo = articuloService.queryOne(ArticuloID);
        if (albaranproveedorarticulo != null && articulo!=null) {
            albaranproveedorarticulo.setArticulo(articulo);
        }
        return albaranproveedorarticulo;
    }

    @Override
    public List<Albaranproveedorarticulo> queryList(String code, String ArticuloID, String Bloqueado) {
        List<Albaranproveedorarticulo> albaranproveedorarticulos = albaranproveedorarticuloMapper.queryList(code, ArticuloID, Bloqueado);
        for (Albaranproveedorarticulo albaranproveedorarticulo : albaranproveedorarticulos) {
            Articulo articulo = articuloService.queryOne(albaranproveedorarticulo.getArticuloID());
            if (articulo != null) {
                albaranproveedorarticulo.setArticulo(articulo);
            }
        }
        return albaranproveedorarticulos;
    }

    @Transactional
    @Override
    public int updateOne(String articuloID, String precio, String precioDetalle, String comentario, String comentarioMax) {
        int i0 = 0;
        if(!StringUtils.isEmpty(precio) || !StringUtils.isEmpty(comentario)  || !StringUtils.isEmpty(comentarioMax)){
            i0  += albaranproveedorarticuloMapper.updateOne(articuloID, precio, comentario, comentarioMax);
        }
        if(!StringUtils.isEmpty(precioDetalle)){
            i0  += articuloService.getArticuloMapper().updateOne(articuloID, precioDetalle);
        }
        return i0;
    }

    @Transactional
    @Override
    public int dy_dz_order_status(String code, String bloqueado) {
        List<Albaranproveedorarticulo> albaranproveedorarticulos = albaranproveedorarticuloMapper.queryByAlbaranProveedorNo(code);

        StringBuilder sql = new StringBuilder();

        if (bloqueado.equals("1")) {
            bloqueado = "0";
        } else {
            bloqueado = "1";
            for (Albaranproveedorarticulo albaranproveedorarticulo : albaranproveedorarticulos) {
                sql.append("UPDATE articulo SET PrecioCoste = '").append(albaranproveedorarticulo.getPrecio())
                    .append("' WHERE ArticuloID = '").append(albaranproveedorarticulo.getArticuloID()).append("';");
            }
        }
        // FIX: AlbaranProveedorNo -> DocumentoNo
        sql.append("UPDATE albaranproveedor SET Bloqueado = ").append(bloqueado).append(" WHERE DocumentoNo = '").append(code).append("';");

        // TODO: 更新人
        // sql.append("update albaranproveedor set VerificadorID = 8 , Bloqueado = -1 where AlbaranProveedorNo = '"+code+"';");
        // FIX: AlbaranProveedorNo -> DocumentoNo
        sql.append("UPDATE albaranproveedor SET VerificadorID = 8  WHERE DocumentoNo = '").append(code).append("';");

        int counter = 0;
        for (String statement : sql.toString().split(";")) {
            counter += albaranproveedorarticuloMapper.execSql(statement);
        }
        return counter;
    }

    /**
     * 订单校对接口
     * @param code Code
     * @return int
     */
    @Transactional
    @Override
    public int dy_dz_order_jiaodui(String code) {
        /**
         * TODO: 订单校对接口未完成, 若已实现请移除该接口的 @Deprecated 修饰
         */
        List<Albaranproveedorarticulo> albaranproveedorarticulos = albaranproveedorarticuloMapper.queryByAlbaranProveedorNo(code);
        StringBuilder stringBuilder = new StringBuilder();
        BigDecimal zongkouchu = new BigDecimal(0);
        for (Albaranproveedorarticulo albaranproveedorarticulo : albaranproveedorarticulos) {
            BigDecimal Comentario = (albaranproveedorarticulo.getComentario()!=null && !albaranproveedorarticulo.getComentario().equals(""))?new BigDecimal(albaranproveedorarticulo.getComentario()):new BigDecimal(0);
            BigDecimal chashu = Comentario.subtract(albaranproveedorarticulo.getCantidad());
            BigDecimal danjia = albaranproveedorarticulo.getPrecio();
            BigDecimal chajia = chashu.multiply(danjia);
            zongkouchu = zongkouchu.add(chajia);
            // FIX: AlbaranProveedorNo -> DocumentoNo
            stringBuilder.append("UPDATE albaranproveedorarticulo SET Cantidad = '").append(albaranproveedorarticulo.getComentario()).append("' WHERE DocumentoNo = '").append(code).append("' ");
            stringBuilder.append("UPDATE stock SET Stock = Stock + ").append(chashu).append(" WHERE ArticuloID = '").append(albaranproveedorarticulo.getArticuloID()).append("' ");
        }
        // FIX: AlbaranProveedorNo -> DocumentoNo
        stringBuilder.append("UPDATE albaranproveedor SET Total = Total + ").append(zongkouchu).append(" WHERE DocumentoNo = '").append(code).append("' ");

        // TODO: 该接口返回不明意义的 INT 0
        return 0;
    }
}




