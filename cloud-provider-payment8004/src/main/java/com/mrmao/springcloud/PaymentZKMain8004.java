package com.mrmao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: MrMao
 * @Date: 2022/4/18
 **/
@SpringBootApplication
@EnableDiscoveryClient      //该注解用于向使用consul或zookeeper作为注册中心时注册服务
public class PaymentZKMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentZKMain8004.class, args);
    }
}
