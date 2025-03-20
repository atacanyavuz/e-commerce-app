package com.atacanyavuz.ecommerce.service;

import com.atacanyavuz.ecommerce.client.CustomerClient;
import com.atacanyavuz.ecommerce.dto.OrderRequest;
import com.atacanyavuz.ecommerce.dto.OrderResponse;
import com.atacanyavuz.ecommerce.exception.BusinessException;
import com.atacanyavuz.ecommerce.mapper.OrderMapper;
import com.atacanyavuz.ecommerce.messaging.event.OrderConfirmation;
import com.atacanyavuz.ecommerce.messaging.producer.OrderProducer;
import com.atacanyavuz.ecommerce.dto.OrderLineRequest;
import com.atacanyavuz.ecommerce.client.PaymentClient;
import com.atacanyavuz.ecommerce.client.dto.PaymentRequest;
import com.atacanyavuz.ecommerce.client.ProductClient;
import com.atacanyavuz.ecommerce.client.dto.PurchaseRequest;
import com.atacanyavuz.ecommerce.repository.OrderRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final CustomerClient customerClient;
    private final ProductClient productClient;
    private final OrderRepository repository;
    private final OrderMapper mapper;
    private final OrderLineService orderLineService;
    private final OrderProducer orderProducer;
    private final PaymentClient paymentClient;

    @Transactional
    public Integer createOrder(OrderRequest request) {
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(()-> new BusinessException("Cannot create order: No customer exists with the provided ID"));

        var purchaseProducts = this.productClient.purchaseProducts(request.products());
        var order = this.repository.save(mapper.toOrder(request));

        for (PurchaseRequest purchaseRequest : request.products()){
            orderLineService.saveOrderLine(new OrderLineRequest(
                    null,
                    order.getId(),
                    purchaseRequest.productId(),
                    purchaseRequest.quantity()
            ));
        }

        var paymentRequest = new PaymentRequest(
                request.amount(),
                request.paymentMethod(),
                order.getId(),
                order.getReference(),
                customer
        );
        paymentClient.requestOrderPayment(paymentRequest);

        orderProducer.sendOrderConfirmation(
                new OrderConfirmation(
                        request.reference(),
                        request.amount(),
                        request.paymentMethod(),
                        customer,
                        purchaseProducts
                )
        );

        return order.getId();
    }

    public List<OrderResponse> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::fromOrder)
                .collect(Collectors.toList());
    }

    public OrderResponse findById(Integer orderId) {
        return repository.findById(orderId)
                .map(mapper::fromOrder)
                .orElseThrow(()-> new EntityNotFoundException(String.format("No order found with the provider ID: %d", orderId)));
    }
}
