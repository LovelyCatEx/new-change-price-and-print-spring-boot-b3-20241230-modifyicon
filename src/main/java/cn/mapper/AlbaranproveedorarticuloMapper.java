package cn.mapper;

import cn.entity.Albaranproveedorarticulo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Administrator
* @description 针对表【albaranproveedorarticulo】的数据库操作Mapper
* @createDate 2025-01-12 00:27:54
* @Entity cn.entity.Albaranproveedorarticulo
*/
public interface AlbaranproveedorarticuloMapper extends BaseMapper<Albaranproveedorarticulo> {
    Albaranproveedorarticulo queryOne(@Param(value = "code") String code, @Param(value = "ArticuloID") String ArticuloID);

    List<Albaranproveedorarticulo> queryList(@Param(value = "code") String code, @Param(value = "ArticuloID") String ArticuloID, @Param(value = "Bloqueado") String Bloqueado);

    int updateOne(
        @Param(value = "articuloID") String articuloID,
        @Param(value = "precio") String precio,
        @Param(value = "comentario") String comentario,
        @Param(value = "comentarioMax") String comentarioMax
    );

    int execSql(@Param(value = "sql") String sql);

    List<Albaranproveedorarticulo> queryByAlbaranProveedorNo(@Param(value = "AlbaranProveedorNo") String code);
}




