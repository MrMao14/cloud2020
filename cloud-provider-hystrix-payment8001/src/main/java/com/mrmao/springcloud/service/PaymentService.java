package com.mrmao.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author: MrMao
 * @Date: 2023/2/12
 **/
@Service
public class PaymentService {

    /**
     * 模拟正常返回
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池:" + Thread.currentThread().getName() + "paymentInfo_OK,id:" + id;
    }

    /**
     * 延迟3秒的返回
     */
    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "线程池:" + Thread.currentThread().getName() + "paymentInfo_TimeOut,id:" + id + ",耗时" + timeNumber;
    }

}
