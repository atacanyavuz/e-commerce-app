package com.atacanyavuz.ecommerce.messaging.event;

import com.atacanyavuz.ecommerce.client.dto.CustomerResponse;
import com.atacanyavuz.ecommerce.enums.PaymentMethod;
import com.atacanyavuz.ecommerce.client.dto.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReferance,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
