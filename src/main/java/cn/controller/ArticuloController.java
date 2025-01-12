package cn.controller;

import cn.entity.Articulo;
import cn.entity.Proveedor;
import cn.param.ZbmParam;
import cn.service.ArticuloService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/articulo")
public class ArticuloController {

    @Resource
    private ArticuloService articuloService;

   
    /**
    * 查询 根据主键 id 查询
    * @author haokai
    * @date 2023/07/29
    **/
    @PostMapping("/scan")
    public Map<String , Object > load(@RequestBody Articulo ac){
    	Map<String,Object> map = new HashMap<String, Object>();
    	map.put("code","200");
		map.put("message", "扫描成功");

        Articulo articulo = articuloService.scan(ac);

        if(articulo != null){
            // 如果值为 null，默认为 0
            BigDecimal preciocoste = articulo.getPreciocoste() != null ? articulo.getPreciocoste().stripTrailingZeros() : BigDecimal.ZERO;
            BigDecimal preciodetalle = articulo.getPreciodetalle() != null ? articulo.getPreciodetalle().stripTrailingZeros() : BigDecimal.ZERO;
            BigDecimal preciomayor = articulo.getPreciomayor() != null ? articulo.getPreciomayor().stripTrailingZeros() : BigDecimal.ZERO;

            String stockda = articulo.getStockda();
            BigDecimal stockdaValue = stockda != null ? new BigDecimal(stockda).stripTrailingZeros() : BigDecimal.ZERO;
            stockda = stockdaValue.toPlainString(); // 转换为字符串表示

            articulo.setPreciocoste(preciocoste);
            articulo.setPreciodetalle(preciodetalle);
            articulo.setPreciomayor(preciomayor);
            articulo.setStockda(stockda);
        }

        map.put("data", articulo);
        return map;
    }
    
    @PostMapping("/update")
    public Map<String , Object > update(@RequestBody Articulo ac){
    	Map<String,Object> map = new HashMap<String, Object>();
    	map.put("code","200");
		map.put("message", "修改价格成功");
		map.put("data", articuloService.update(ac));
        return map;
    }

    @PostMapping("/edit")
    public Map<String , Object > edit(@RequestBody Articulo ac){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("code","200");
        map.put("message", "修改价格成功");
        map.put("data", articuloService.edit(ac));
        return map;
    }
    
    @PostMapping("/add")
    public Map<String , Object > add(@RequestBody Articulo ac){
    	Map<String,Object> map = new HashMap<String, Object>();
    	map.put("code","200");
		map.put("message", "添加商品成功");
		map.put("data", articuloService.add(ac));
        return map;
    }
    @PostMapping("/getClass")
    public Map<String , Object > add(){
    	Map<String,Object> map = new HashMap<String, Object>();
    	map.put("code","200");
		map.put("message", "获取商品类别成功");
		map.put("data", articuloService.getAcClass());
        return map;
    }
    
    @PostMapping("/proveedor")
    public Map<String , Object > getProveedor(){
    	Map<String,Object> map = new HashMap<String, Object>();
    	map.put("code","200");
		map.put("message", "获取供应商成功");

        List<Proveedor> proveedor = articuloService.getProveedor();
        List<Proveedor> proveedor2 = new ArrayList<>();

        Proveedor proveedor1 = new Proveedor();
        proveedor1.setEmpresaID(0L);
        proveedor1.setNombreES("");
        proveedor2.add(proveedor1);
        proveedor2.addAll(proveedor);

        map.put("data", proveedor2);

        return map;
    }


    @PostMapping("/updateByArticuloIDOrCodigoBarra")
    public Map<String , Object > updateByArticuloIDOrCodigoBarra(@RequestBody Articulo ac){
        Map<String,Object> map = new HashMap<String, Object>();

        int num = articuloService.updateByArticuloIDOrCodigoBarra(
                ac.getUsarprecioporcantidad(),
                ac.getPreciodetalle(),
                ac.getPrecio1(),ac.getDescuento1(),ac.getCantidad1(),
                ac.getPrecio2(),ac.getDescuento2(),ac.getCantidad2(),
                ac.getPrecio3(),ac.getDescuento3(),ac.getCantidad3(),
                ac.getPrecio4(),ac.getDescuento4(),ac.getCantidad4(),
                ac.getPrecio5(),ac.getDescuento5(),ac.getCantidad5(),
                ac.getPrecio6(),
                ac.getArticuloid()
        );

        map.put("code","200");
        map.put("message", "修改按量定价信息成功"+num);
        map.put("data", articuloService.getByArticuloIDOrCodigoBarra(ac.getArticuloid()).get(0));
        return map;
    }


    @PostMapping("/getByArticuloIDOrCodigoBarra")
    public Map<String , Object > getByArticuloIDOrCodigoBarra(@RequestBody Articulo ac){


        List<Articulo> articuloList = articuloService.getByArticuloIDOrCodigoBarra(ac.getArticuloid());
        if(articuloList.size() > 1 ){
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("code","1001");
            map.put("message", "请填写完整编号后再查询，目前编号查询出多个");
            map.put("data", null);
            return map;
        }else if(articuloList.size() == 0 ){
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("code","1002");
            map.put("message", "未查询到商品");
            map.put("data", null);
            return map;
        }else{
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("code","200");
            map.put("message", "查询产品信息成功");
            map.put("data", articuloService.getByArticuloIDOrCodigoBarra(ac.getArticuloid()).get(0));
            return map;
        }
    }

    @PostMapping("/zbm")
    public Map<String , Object > zbm(@RequestBody ZbmParam zbmParam){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("code","200");
        map.put("message", "获取新自编码成功");
        map.put("data", articuloService.zbm(zbmParam));
        return map;
    }

}
