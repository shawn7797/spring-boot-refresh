package com.codewithshawn.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class OrderService {
    private final PaypalPaymentService paypalPaymentService;
    private final StripePaymentService stripePaymentService;

    public OrderService(
            PaypalPaymentService paypalPaymentService,
            StripePaymentService stripePaymentService) {
        this.paypalPaymentService = paypalPaymentService;
        this.stripePaymentService = stripePaymentService;
    }

    public void payWithPaypal() {
        paypalPaymentService.processPayment(10.55);
    }

    public void payWithStripe() {
        stripePaymentService.processPayment(10.55);
    }

    public void placeOrder() {
        payWithPaypal();
    }

    public void placeOrder(String paymentMethod) {
        if (Objects.equals(paymentMethod, "stripe")) {
            payWithStripe();
        } else {
            payWithPaypal();
        }
    }
}