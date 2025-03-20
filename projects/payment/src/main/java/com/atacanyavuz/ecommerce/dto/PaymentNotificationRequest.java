package com.atacanyavuz.ecommerce.notification;

import com.atacanyavuz.ecommerce.payment.PaymentMethod;
import java.math.BigDecimal;

public record PaymentNotificationRequest(
        String orderReference,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        String customerFirstname,
        String customerLastname,
        String customerEmail
) {
}
