package com.yuqi;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description: TODO
 * @Author: Hardy
 * @DateTime: 2019/7/1 14:25
 * @Verstion 1.0
 */
@SpringCloudApplication
@EnableConfigServer
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
