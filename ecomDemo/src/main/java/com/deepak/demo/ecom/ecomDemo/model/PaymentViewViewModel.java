package com.deepak.demo.ecom.ecomDemo.model;

import lombok.Data;

public class PaymentViewViewModel {
    private String customerId;
    private String paymentId;
    private PaymentStatus paymentStatus;

    public PaymentViewViewModel(String customerId, String paymentId, PaymentStatus paymentStatus) {
        this.customerId = customerId;
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
