package com.iurydev.Project8Hours.controllers;

import com.iurydev.Project8Hours.OrderRecord;
import com.iurydev.Project8Hours.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/orderRecord")
    public String order(@RequestBody OrderRecord order) {
//        order.setCustomerName(order.getCustomerName().toUpperCase());
//        order.setProductName(order.getProductName().toUpperCase());
//        order.setQuantity(order.getQuantity() * 2);
        return order.toString();
    }


    @GetMapping("/hello/{userName}")
    public String pathVar(@PathVariable String userName) {
        return "my var = " + userName;
    }

    @GetMapping("/hello/rqparam")
    public String paraVar(@RequestParam String userName, @RequestParam String userName2) {
        return "my var = " + userName + " " + userName2;
    }
}
