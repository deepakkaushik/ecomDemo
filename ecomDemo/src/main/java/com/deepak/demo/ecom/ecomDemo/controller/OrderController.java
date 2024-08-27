package com.deepak.demo.ecom.ecomDemo.controller;

import com.deepak.demo.ecom.ecomDemo.model.*;
import com.deepak.demo.ecom.ecomDemo.remote.PaymentServiceRest;
import com.deepak.demo.ecom.ecomDemo.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private PaymentServiceRest paymentServiceRest;
    @Autowired
    private PaymentService paymentService;
    @PostMapping("/submit")
    public ResponseEntity<PaymentViewViewModel> submit(@RequestBody Order order){
        PaymentInfoDao paymentInfoDao = paymentService.createPaymentInfo(order);
        //Request to payment gateway, should be done from FE (actual payment gateway)
        paymentServiceRest.submitPaymentRequest(new PaymentRequest(paymentInfoDao.getPaymentId(),paymentInfoDao.getAmount()));
        return ResponseEntity.status(HttpStatus.OK).body(new PaymentViewViewModel(paymentInfoDao.getCustomerId(),paymentInfoDao.getPaymentId(),PaymentStatus.valueOf(paymentInfoDao.getPaymentStatus())));
    }

    @GetMapping("/status")
    public ResponseEntity<PaymentViewViewModel> submit(@RequestParam String paymentId){
        PaymentInfoDao paymentInfoDao = paymentService.getPaymentInfo(paymentId);

        return ResponseEntity.status(HttpStatus.OK).body(new PaymentViewViewModel(paymentInfoDao.getCustomerId(),paymentInfoDao.getPaymentId(),PaymentStatus.valueOf(paymentInfoDao.getPaymentStatus())));
    }
}
