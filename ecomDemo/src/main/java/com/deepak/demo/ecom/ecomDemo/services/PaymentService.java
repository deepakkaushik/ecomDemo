package com.deepak.demo.ecom.ecomDemo.services;

import com.deepak.demo.ecom.ecomDemo.model.Order;
import com.deepak.demo.ecom.ecomDemo.model.PaymentInfoDao;
import com.deepak.demo.ecom.ecomDemo.model.PaymentStatusInfo;
import org.springframework.stereotype.Component;

@Component
public interface PaymentService {
    PaymentInfoDao createPaymentInfo(Order order);
    PaymentInfoDao getPaymentInfo(String paymentId);

    PaymentInfoDao updatePaymentInfo(PaymentStatusInfo paymentStatusInfo);
}
