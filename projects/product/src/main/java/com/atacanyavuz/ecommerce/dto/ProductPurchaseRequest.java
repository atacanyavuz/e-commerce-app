package com.atacanyavuz.ecommerce.dto;

import jakarta.validation.constraints.NotNull;

public record ProductPurchaseRequest(
    @NotNull(message = "Product is Mandatory")
    Integer productId,
    @NotNull(message = "Quantity is Mandatory")
    double quantity
) {
}
