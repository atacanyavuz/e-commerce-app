package com.atacanyavuz.ecommerce.controller;

import com.atacanyavuz.ecommerce.dto.PaymentRequest;
import com.atacanyavuz.ecommerce.service.PaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/payments")
public class PaymentController {
    private final PaymentService service;

    @PostMapping
    public ResponseEntity<Integer> createPayment(
            @RequestBody @Valid PaymentRequest request
    ){
        return ResponseEntity.ok(service.createPayment(request));
    }
}
