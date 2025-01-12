package cn.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lovelycat
 * @version 1.0
 * @since 2025-01-12 00:46
 */
public class ResponseUtils {
    public static Map<String, Object> buildResponse(
        Integer code,
        String message,
        Object data
    ) {
        Map<String,Object> map = new HashMap<>();
        map.put("code", (code == null) ? 200 : code.toString());
        map.put("message", (message == null || "".equals(message)) ? "" : message);
        map.put("data", data);
        return map;
    }

    public static Map<String, Object> buildSuccessResponse(String message, Object data) {
        return buildResponse(200, message, data);
    }

    public static Map<String, Object> buildSuccessResponse(Object data) {
        return buildResponse(200, null, data);
    }

    public static Map<String, Object> buildInternalServerErrorResponse(String message, Object data) {
        return buildResponse(500, message, data);
    }

}
