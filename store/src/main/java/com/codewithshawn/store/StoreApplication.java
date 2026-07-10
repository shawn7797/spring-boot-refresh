package com.codewithshawn.store;

import com.codewithshawn.store.services.OrderService;
import com.codewithshawn.store.services.PaypalPaymentService;
import com.codewithshawn.store.services.StripePaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }
}
