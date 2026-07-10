package com.codewithshawn.store.controllers;

import com.codewithshawn.store.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/store")
public class StoreController {

    private OrderService orderService;

    public StoreController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public void initStore() {
        orderService.placeOrder();
    }

    @GetMapping("{paymentMethod}")
    public void processPayment(@PathVariable String paymentMethod) {
        orderService.placeOrder(paymentMethod);
    }
}
