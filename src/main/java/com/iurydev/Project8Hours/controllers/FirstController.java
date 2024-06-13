package com.iurydev.Project8Hours.controllers;

import com.iurydev.Project8Hours.model.Order;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {



    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping("/order")
    public String order(@RequestBody Order order) {
//        order.setCustomerName(order.getCustomerName().toUpperCase());
//        order.setProductName(order.getProductName().toUpperCase());
//        order.setQuantity(order.getQuantity() * 2);
        return order.toString();
    }
}
