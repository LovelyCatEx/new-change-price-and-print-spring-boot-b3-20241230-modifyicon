package cn.service;

import cn.entity.Albaranproveedor;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author Administrator
* @description 针对表【albaranproveedor】的数据库操作Service
* @createDate 2025-01-12 00:27:54
*/
public interface AlbaranproveedorService extends IService<Albaranproveedor> {
    List<Albaranproveedor> dy_dz_order(String code, String Bloqueado);

    Albaranproveedor queryByAlbaranProveedorNo(String code);
}
