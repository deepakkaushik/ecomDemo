package com.deepak.demo.ecom.ecomDemo.model;

import java.math.BigDecimal;

public class PaymentRequest {
    String paymentId;
    BigDecimal amount;

    public PaymentRequest(String paymentId, BigDecimal amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
