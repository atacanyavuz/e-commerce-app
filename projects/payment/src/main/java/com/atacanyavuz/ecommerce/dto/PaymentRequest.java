package com.atacanyavuz.ecommerce.dto;

import com.atacanyavuz.ecommerce.model.Customer;
import com.atacanyavuz.ecommerce.enums.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        Integer id,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        Customer customer

) {
}
