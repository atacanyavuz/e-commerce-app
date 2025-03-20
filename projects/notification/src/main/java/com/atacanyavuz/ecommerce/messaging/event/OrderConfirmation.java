package com.atacanyavuz.ecommerce.messaging.event;

import com.atacanyavuz.ecommerce.messaging.enums.PaymentMethod;
import com.atacanyavuz.ecommerce.messaging.dto.Customer;
import com.atacanyavuz.ecommerce.messaging.dto.Product;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        Customer customer,
        List<Product> products
) {
}
