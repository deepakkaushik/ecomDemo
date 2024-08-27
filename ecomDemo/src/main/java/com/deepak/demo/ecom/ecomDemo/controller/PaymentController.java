package com.deepak.demo.ecom.ecomDemo.controller;

import com.deepak.demo.ecom.ecomDemo.model.PaymentInfoDao;
import com.deepak.demo.ecom.ecomDemo.model.PaymentStatusInfo;
import com.deepak.demo.ecom.ecomDemo.services.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/payment")
public class PaymentController {
    Logger logger = LoggerFactory.getLogger(PaymentController.class);
    @Autowired
    private PaymentService paymentService;
    @PostMapping("/update")
    public Boolean update(@RequestBody PaymentStatusInfo payment){
        PaymentInfoDao paymentInfoDao = paymentService.updatePaymentInfo(payment);
        logger.info("Callback Received for payment Id {} , status {}",payment.getPaymentId(),payment.getPaymentStatus());
        return paymentInfoDao.getPaymentStatus().equals(payment.getPaymentStatus().name());
    }
}
