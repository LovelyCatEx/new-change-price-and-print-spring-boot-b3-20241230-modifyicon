package cn.service.impl;

import cn.entity.Proveedor;
import cn.mapper.ProveedorMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.entity.Albaranproveedor;
import cn.service.AlbaranproveedorService;
import cn.mapper.AlbaranproveedorMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
* @author Administrator
* @description 针对表【albaranproveedor】的数据库操作Service实现
* @createDate 2025-01-12 00:27:54
*/
@Service
public class AlbaranproveedorServiceImpl extends ServiceImpl<AlbaranproveedorMapper, Albaranproveedor>
    implements AlbaranproveedorService{

    private static final Logger log = LoggerFactory.getLogger(AlbaranproveedorServiceImpl.class);

    @Resource
    private AlbaranproveedorMapper albaranproveedorMapper;

    @Resource
    private ProveedorMapper proveedorMapper;

    @Override
    public List<Albaranproveedor> dy_dz_order(String code, String Bloqueado) {
        log.info("开始查询订货单数据.....");
        // 先查询订货单列表
        List<Albaranproveedor> albaranproveedors = albaranproveedorMapper.queryList(code,Bloqueado);

        // 循环处理供应商信息 有供应商信息则设置
        // log.info("开始处理订货单供应商数据.....");
        // for (Albaranproveedor albaranproveedor : albaranproveedors) {
        //     String proveedorID = albaranproveedor.getProveedorID();
        //     if(!StringUtils.isEmpty(proveedorID)){
        //         Proveedor proveedor = proveedorMapper.queryOne(proveedorID);
        //         albaranproveedor.setProveedor(proveedor);
        //     }
        // }

        log.info("处理完成请求响应.....");
        return albaranproveedors;
    }

    @Override
    public Albaranproveedor queryByAlbaranProveedorNo(String code) {
        return albaranproveedorMapper.queryByAlbaranProveedorNo(code);
    }
}




