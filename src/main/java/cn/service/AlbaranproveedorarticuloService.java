package cn.service;

import cn.entity.Albaranproveedorarticulo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author Administrator
* @description 针对表【albaranproveedorarticulo】的数据库操作Service
* @createDate 2025-01-12 00:27:54
*/
public interface AlbaranproveedorarticuloService extends IService<Albaranproveedorarticulo> {
    Albaranproveedorarticulo queryOne(String code, String ArticuloID);

    List<Albaranproveedorarticulo> queryList(String code, String ArticuloID, String Bloqueado);

    int updateOne(String articuloID, String precio, String precioDetalle, String comentario, String comentarioMax);

    int dy_dz_order_status(String code, String bloqueado);

    @Deprecated
    int dy_dz_order_jiaodui(String code);
}
