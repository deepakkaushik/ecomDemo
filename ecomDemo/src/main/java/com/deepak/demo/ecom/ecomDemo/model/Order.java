package com.deepak.demo.ecom.ecomDemo.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {
    private String customerId;
    private String customerName;
    private String quoteItems;
    private BigDecimal amount;

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

    public String getQuoteItems() {
        return quoteItems;
    }

    public void setQuoteItems(String quoteItems) {
        this.quoteItems = quoteItems;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
