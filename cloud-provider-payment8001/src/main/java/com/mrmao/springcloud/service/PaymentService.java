package com.mrmao.springcloud.service;

import com.mrmao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: MrMao
 * @Date: 2022/3/26
 **/
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
