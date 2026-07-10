package com.codewithshawn.store.services;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Stripe");
        System.out.println("Amount: " + amount);
    }
}
