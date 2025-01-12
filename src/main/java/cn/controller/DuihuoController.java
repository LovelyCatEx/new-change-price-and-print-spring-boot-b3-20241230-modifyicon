package cn.controller;

import cn.entity.Albaranproveedor;
import cn.service.AlbaranproveedorService;
import cn.service.AlbaranproveedorarticuloService;
import cn.util.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lovelycat
 * @version 1.0
 * @since 2025-01-12 00:31
 */
@RestController
@RequestMapping(value = "/Scem")
public class DuihuoController {
    @Autowired
    private AlbaranproveedorService albaranproveedorService;

    @Autowired
    private AlbaranproveedorarticuloService albaranproveedorarticuloService;

    @GetMapping("/dy_dz_order")
    public Map<String, Object > dy_dz_order(
        @RequestParam(defaultValue = "") String code,
        @RequestParam(defaultValue = "0") String Bloqueado
    ) {
        return ResponseUtils.buildSuccessResponse(albaranproveedorService.dy_dz_order(code, Bloqueado));
    }

    @GetMapping("/dy_dz_order_info2")
    public Map<String, Object> dy_dz_order_info2(
        @RequestParam String code,
        @RequestParam String ArticuloID
    ) {
        return ResponseUtils.buildSuccessResponse(albaranproveedorarticuloService.queryOne(code, ArticuloID));
    }

    @GetMapping("/dy_dz_order_info")
    public Map<String, Object> dy_dz_order_info(
        @RequestParam String code,
        @RequestParam(defaultValue = "") String ArticuloID,
        @RequestParam String Bloqueado
    ) {
        return ResponseUtils.buildSuccessResponse(albaranproveedorarticuloService.queryList(code, ArticuloID, Bloqueado));
    }

    @GetMapping("/dy_dz_order_edit")
    public Map<String, Object> dy_dz_order_edit(
        @RequestParam String ArticuloID,
        @RequestParam(required = false) String Precio,
        @RequestParam(required = false) String PrecioDetalle,
        @RequestParam(required = false) String Comentario,
        @RequestParam(required = false) String ComentarioMax
    ) {
        return ResponseUtils.buildSuccessResponse(albaranproveedorarticuloService.updateOne(ArticuloID, Precio, PrecioDetalle, Comentario, ComentarioMax));
    }

    @GetMapping("/dy_dz_order_status")
    public Map<String, Object> dy_dz_order_status(
        @RequestParam String code,
        @RequestParam String Bloqueado
    ) {
        Albaranproveedor albaranproveedor = albaranproveedorService.queryByAlbaranProveedorNo(code);
        if (albaranproveedor == null) {
            // Map<String, Object> map = new HashMap<>();
            // bmap.put("code","500");
            // bmap.put("message", "单据不存在");
            // bmap.put("data", "");
            // FIX: 疑似逻辑错误
            return ResponseUtils.buildInternalServerErrorResponse("单据不存在", "");
        }

        return ResponseUtils.buildSuccessResponse(albaranproveedorarticuloService.dy_dz_order_status(code, Bloqueado));
    }

    @GetMapping("/dy_dz_order_jiaodui")
    public Map<String, Object> dy_dz_order_jiaodui(@RequestParam String code) {
        Albaranproveedor albaranproveedor = albaranproveedorService.queryByAlbaranProveedorNo(code);
        if (albaranproveedor == null) {
            // Map<String, Object> map = new HashMap<>();
            // map.put("code","500");
            // map.put("message", "单据不存在");
            // map.put("data", "");
            // FIX: 疑似逻辑错误
            return ResponseUtils.buildInternalServerErrorResponse("单据不存在", "");
        }

        return ResponseUtils.buildSuccessResponse("校对完成", albaranproveedorarticuloService.dy_dz_order_jiaodui(code));
    }
}
