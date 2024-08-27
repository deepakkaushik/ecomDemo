package com.deepak.demo.ecom.ecomDemo.services;

import com.deepak.demo.ecom.ecomDemo.model.*;
import com.deepak.demo.ecom.ecomDemo.repository.PaymentInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentInfoRepo paymentInfoRepo;

    @Override
    public PaymentInfoDao createPaymentInfo(Order order) {
        PaymentInfoDao paymentInfoDao = new PaymentInfoDao(order.getCustomerId(),order.getCustomerName(),generateUniquePaymentId(), PaymentStatus.CREATED.name(),
                order.getQuoteItems(),order.getAmount());

        return paymentInfoRepo.save(paymentInfoDao);
    }

    private String generateUniquePaymentId(){
        return UUID.randomUUID().toString();
    }

    @Override
    public PaymentInfoDao getPaymentInfo(String paymentId) {
        return paymentInfoRepo.findById(paymentId).orElseThrow(RuntimeException::new);
    }

    @Override
    public PaymentInfoDao updatePaymentInfo(PaymentStatusInfo payment) {
        PaymentInfoDao paymentInfoDao = paymentInfoRepo.findById(payment.getPaymentId()).orElseThrow(RuntimeException::new);
        paymentInfoDao.setPaymentStatus(payment.getPaymentStatus().name());
        return paymentInfoRepo.save(paymentInfoDao);
    }
}
