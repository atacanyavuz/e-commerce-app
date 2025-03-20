package com.atacanyavuz.ecommerce.messaging.dto;

public record Customer(
        String id,
        String firstname,
        String lastname,
        String email
) {
}
