package com.mrmao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: MrMao
 * @Date: 2022/3/26
 **/
@SpringBootApplication
@EnableEurekaClient
/*
  开启Ribbon负载均衡需要开启如下的注解
  @see com.mrmao.springcloud.config.ApplicationContextConfig
 */
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

}
