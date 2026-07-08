package com.codewithshawn.store.services;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService{
    @Override
    public void processPayment(Double amount) {
        System.out.println("Paypal");
        System.out.println("Amount: " + amount);
    }
}
