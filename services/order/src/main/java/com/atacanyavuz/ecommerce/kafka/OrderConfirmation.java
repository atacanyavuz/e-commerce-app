package com.atacanyavuz.ecommerce.kafka;

import com.atacanyavuz.ecommerce.customer.CustomerResponse;
import com.atacanyavuz.ecommerce.order.PaymentMethod;
import com.atacanyavuz.ecommerce.product.PurchaseResponse;

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
