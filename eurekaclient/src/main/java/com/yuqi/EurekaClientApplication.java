package com.yuqi;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @Description: TODO
 * @Author: Hardy
 * @DateTime: 2019/6/28 16:22
 * @Verstion 1.0
 */
@SpringCloudApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
