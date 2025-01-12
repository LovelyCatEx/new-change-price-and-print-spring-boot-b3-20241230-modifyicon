package cn.service.impl;

import cn.entity.Articulo;
import cn.entity.ArticuloClass;
import cn.entity.ArticuloDibujo;
import cn.entity.Proveedor;
import cn.mapper.ArticuloMapper;
import cn.param.ZbmParam;
import cn.service.ArticuloService;
import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/**
 * @author haokai
 * @description articulo
 * @date 2023-07-29
 */
@Service
public class ArticuloServiceImpl extends ServiceImpl<ArticuloMapper, Articulo> implements ArticuloService {

    @Resource
    private ArticuloMapper articuloMapper;

    @Override
    public ArticuloMapper getArticuloMapper() {
        return this.articuloMapper;
    }

    @Override
    public Articulo scan(Articulo ac) {
        Articulo articulo = articuloMapper.getById(ac.getArticuloid());
        if (ObjectUtils.isEmpty(articulo)) {
            return articuloMapper.getByCoding(ac.getArticuloid());
        }
        return articulo;
    }

    @Override
    public int edit(Articulo ac) {
        if (StringUtils.isEmpty(ac.getArticuloid())) {
            return articuloMapper.updateByCode(ac.getCodigobarra(), ac.getPreciodetalle());
        }

        boolean dibujo_b = !org.springframework.util.StringUtils.isEmpty(ac.getDibujo());
        byte[] dibujo = ac.getDibujo();

        ac.setDibujo(null);
//        ac.setHaydibujo(-1);


        if(ac.getStockda()!=null) {
        	int count = articuloMapper.getStock(ac.getArticuloid());
        	if(count>0) {
            	
        		articuloMapper.updateStock(ac.getStockda(),ac.getArticuloid());
        	}else {
        		articuloMapper.insertStock(ac.getArticuloid(),ac.getStockda());
        	}
        }
        if (ac.getEmpresaid().equals("")) {
            ac.setEmpresaid(null);
        }
        int ret = articuloMapper.updateById(ac);

        return ret;
    }

    @Override
    public int update(Articulo ac) {
        if (StringUtils.isEmpty(ac.getArticuloid())) {
            return articuloMapper.updateByCode(ac.getCodigobarra(), ac.getPreciodetalle());
        }

        boolean dibujo_b = !org.springframework.util.StringUtils.isEmpty(ac.getDibujo());
        byte[] dibujo = ac.getDibujo();

        ac.setDibujo(null);
//        ac.setHaydibujo(-1);


        if(ac.getStockda()!=null) {
            int count = articuloMapper.getStock(ac.getArticuloid());
            if(count>0) {

                articuloMapper.updateStock(ac.getStockda(),ac.getArticuloid());
            }else {
                articuloMapper.insertStock(ac.getArticuloid(),ac.getStockda());
            }
        }



        if (dibujo_b){
            List<ArticuloDibujo>  articuloDibujos = articuloMapper.getDibujosCountById(ac.getArticuloid());
            if (articuloDibujos.size() > 0) {
                ArticuloDibujo articuloDibujo = articuloDibujos.get(0);
                //直接更新第1张序号照片
                articuloMapper.updateDibujoById(articuloDibujo.getDibujoID(), dibujo);
            } else {
                //先增加图片数据  再去增加图片主表
                int curTotal = articuloMapper.getDibujoCount() + 1;

                ArticuloDibujo articuloDibujo = new ArticuloDibujo();
                articuloDibujo.setArticuloid(ac.getArticuloid());
                articuloDibujo.setDibujoMD5(UUID.randomUUID().toString());
                articuloDibujo.setDibujoID(curTotal);
                articuloDibujo.setOrdenNo(1);//从1开始
                //先新增图片主表
                articuloMapper.insertArtDibujo(articuloDibujo);
                //再真的新增图片数据
                articuloMapper.insertDibujoById(articuloDibujo.getDibujoID(), dibujo);

                ac.setDibujoid(curTotal);
            }
        }
        if (ac.getEmpresaid().equals("")) {
            ac.setEmpresaid(null);
            ac.setProveedordd(null);
        }
        int ret = articuloMapper.updateById(ac);

        return ret;
    }

    @Override
    public int add(Articulo ac) {

        boolean dibujo_b = !org.springframework.util.StringUtils.isEmpty(ac.getDibujo());
        byte[] dibujo = ac.getDibujo();

        ac.setDibujo(null);
//        ac.setHaydibujo(-1);
        if(ac.getStockda()!=null) {
        	int count = articuloMapper.getStock(ac.getArticuloid());
        	if(count>0) {
        	
        		articuloMapper.updateStock(ac.getStockda(),ac.getArticuloid());
        	}else {
        		articuloMapper.insertStock(ac.getArticuloid(),ac.getStockda());
        	}
        	
        }

        List<ArticuloDibujo>  articuloDibujos = articuloMapper.getDibujosCountById(ac.getArticuloid());
        if (articuloDibujos.size() > 0) {
            ArticuloDibujo articuloDibujo = articuloDibujos.get(0);
            //直接更新第1张序号照片
            articuloMapper.updateDibujoById(articuloDibujo.getDibujoID(), dibujo);
        } else {

            if (dibujo !=null && dibujo.length!=0) {
                //先增加图片数据  再去增加图片主表
                int curTotal = articuloMapper.getDibujoCount() + 1;

                ArticuloDibujo articuloDibujo = new ArticuloDibujo();
                articuloDibujo.setArticuloid(ac.getArticuloid());
                articuloDibujo.setDibujoMD5(UUID.randomUUID().toString());
                articuloDibujo.setDibujoID(curTotal);
                articuloDibujo.setOrdenNo(1);//从1开始
                //先新增图片主表
                articuloMapper.insertArtDibujo(articuloDibujo);
                //再真的新增图片数据
                articuloMapper.insertDibujoById(articuloDibujo.getDibujoID(), dibujo);

                //最后更新上皮你的图片字段信息
                ac.setDibujoid(curTotal);
            }


        }
        if (ac.getEmpresaid().equals("")) {
            ac.setEmpresaid(null);
            ac.setProveedordd(null);
        }
        int ret =  articuloMapper.insert(ac);

        return ret;
    }

    @Override
    public List<ArticuloClass> getAcClass() {
        return articuloMapper.getAcClass();
    }

    @Override
    public List<Proveedor> getProveedor() {
        return articuloMapper.getProveedor();
    }

    @Override
    public List<Articulo> getByArticuloIDOrCodigoBarra(String idOrCode) {
        return articuloMapper.getByArticuloIDOrCodigoBarra(idOrCode);
    }

    @Override
    public int updateByArticuloIDOrCodigoBarra(int usarprecioporcantidad,BigDecimal precioDetalle,BigDecimal precio1, Float descuento1, BigDecimal cantidad1, BigDecimal precio2, Float descuento2, BigDecimal cantidad2, BigDecimal precio3, Float descuento3, BigDecimal cantidad3, BigDecimal precio4, Float descuento4, BigDecimal cantidad4, BigDecimal precio5, Float descuento5, BigDecimal cantidad5,BigDecimal precio6,  String idOrCode) {
        return articuloMapper.updateByArticuloIDOrCodigoBarra(
                usarprecioporcantidad,
                precioDetalle,
                precio1,descuento1,cantidad1,
                precio2,descuento2,cantidad2,
                precio3,descuento3,cantidad3,
                precio4,descuento4,cantidad4,
                precio5,descuento5,cantidad5,
                precio6,
                idOrCode);
    }

    @Override
    public String zbm(ZbmParam zbmParam) {
        return generateArticuloCode(zbmParam.getCodePrefix(),zbmParam.getCodeLength());
    }


    private String generateArticuloCode(String codePrefix, int codeLength) {
        int count = articuloMapper.countByPrefixAndLength(codePrefix, codeLength);
        int nextNumber = count + 1;

        String nextCode = codePrefix + String.format("%0" + (codeLength - codePrefix.length()) + "d", nextNumber);
        return nextCode;
    }
}