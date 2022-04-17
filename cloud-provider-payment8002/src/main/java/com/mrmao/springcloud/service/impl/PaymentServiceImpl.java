package com.mrmao.springcloud.service.impl;

import com.mrmao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import com.mrmao.springcloud.dao.PaymentDao;
import com.mrmao.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author: MrMao
 * @Date: 2022/3/26
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id) {
        return paymentDao.getPaymentById(id);
    }

}
