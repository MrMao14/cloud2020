package com.mrmao.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: MrMao
 * @Date: 2022/3/26
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced       //通过这个注解赋予负载均衡的能力，已经改为手写轮询算法
    public RestTemplate getRestTemple(){
        return new RestTemplate();
    }

}
