package com.mrmao.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: MrMao
 * @Date: 2022/4/18
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/MrMao")
    public String payment() {
        return "spring-cloud with zookeeper:" + serverPort + "\t" + UUID.randomUUID();
    }

}
