package com.iurydev.Project8Hours.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class PaymentRestController {

    @PostMapping("/payments")
    public ResponseEntity<PaymentInformation> initiatePayment(@RequestBody PaymentRequest paymentRequest) {

        // business code
        URI resultLocation = UriComponentsBuilder
                .fromPath("/payment/{id}")
                .buildAndExpand(confirmation.getId())
                .toUri();

        return ResponseEntity.created(resultLocation).body(confirmation);
    }
}
