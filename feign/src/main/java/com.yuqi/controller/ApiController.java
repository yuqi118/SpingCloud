package com.yuqi.controller;

import com.yuqi.service.ApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @Author: Hardy
 * @DateTime: 2019/6/28 19:25
 * @Verstion 1.0
 */
@RestController
public class ApiController {

    @Resource
    private ApiService apiService;

    @RequestMapping("index")
    public String index(){
        return apiService.index();
    }
}