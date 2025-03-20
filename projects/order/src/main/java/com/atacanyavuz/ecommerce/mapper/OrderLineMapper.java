package com.atacanyavuz.ecommerce.mapper;

import com.atacanyavuz.ecommerce.model.Order;
import com.atacanyavuz.ecommerce.model.OrderLine;
import com.atacanyavuz.ecommerce.dto.OrderLineRequest;
import com.atacanyavuz.ecommerce.dto.OrderLineResponse;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest request) {
        return OrderLine.builder()
                .id(request.id())
                .quantity(request.quantity())
                .order(
                        Order.builder().id(request.orderId()).build()
                )
                .productId(request.productId())
                .build();
    }

    public OrderLineResponse toOrderLineResponse(OrderLine orderLine) {
        return new OrderLineResponse(
                orderLine.getId(),
                orderLine.getQuantity()
        );
    }
}
