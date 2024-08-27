package com.deepak.demo.ecom.ecomDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name="PaymentInfo")
public class PaymentInfoDao {
    @Id
    private String paymentId;
    private String customerId;
    private String customerName;
    private String paymentStatus;
    private String items;
    private BigDecimal amount;

    public PaymentInfoDao() {
    }

    public PaymentInfoDao(String customerId, String customerName, String paymentId, String paymentStatus, String items, BigDecimal amount) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
        this.items = items;
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
