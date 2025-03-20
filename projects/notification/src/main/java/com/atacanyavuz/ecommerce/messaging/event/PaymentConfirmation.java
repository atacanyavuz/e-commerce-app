package com.atacanyavuz.ecommerce.messaging.event;

import com.atacanyavuz.ecommerce.messaging.enums.PaymentMethod;

import java.math.BigDecimal;

public record PaymentConfirmation(
        String orderReference,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        String customerFirstname,
        String customerLastname,
        String customerEmail
) {
}
