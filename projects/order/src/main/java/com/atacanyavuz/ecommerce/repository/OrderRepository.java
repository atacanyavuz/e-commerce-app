package com.atacanyavuz.ecommerce.repository;

import com.atacanyavuz.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
