package com.yuqi.service;

import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author: Hardy
 * @DateTime: 2019/6/28 19:24
 * @Verstion 1.0
 */
@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "服务发生故障！";
    }
}
