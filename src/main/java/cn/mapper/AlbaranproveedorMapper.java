package cn.mapper;

import cn.entity.Albaranproveedor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Administrator
* @description 针对表【albaranproveedor】的数据库操作Mapper
* @createDate 2025-01-12 00:27:54
* @Entity cn.entity.Albaranproveedor
*/
public interface AlbaranproveedorMapper extends BaseMapper<Albaranproveedor> {
    List<Albaranproveedor> queryList(@Param(value = "code") String code, @Param(value = "bloqueado") String bloqueado);

    Albaranproveedor queryByAlbaranProveedorNo(@Param(value = "code") String code);
}




