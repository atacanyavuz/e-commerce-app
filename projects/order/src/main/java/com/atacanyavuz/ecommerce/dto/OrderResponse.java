package com.atacanyavuz.ecommerce.dto;

import com.atacanyavuz.ecommerce.enums.PaymentMethod;

import java.math.BigDecimal;

public record OrderResponse(
        Integer id,
        String reference,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        String customerId
) {

}
