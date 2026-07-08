package com.codewithshawn.store.services;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Stripe");
        System.out.println("Amount: " + amount);
    }
}
