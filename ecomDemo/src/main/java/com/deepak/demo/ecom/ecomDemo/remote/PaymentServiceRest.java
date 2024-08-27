package com.deepak.demo.ecom.ecomDemo.remote;

import com.deepak.demo.ecom.ecomDemo.model.PaymentStatusInfo;
import com.deepak.demo.ecom.ecomDemo.model.PaymentRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentServiceRest {
    public static final String paymentGatewayURL = "http://localhost:8082/v1/payment/submit";

    public PaymentStatusInfo submitPaymentRequest(PaymentRequest paymentRequest) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(paymentGatewayURL,paymentRequest, PaymentStatusInfo.class);
    }
}
