package com.atacanyavuz.ecommerce.repository;

import com.atacanyavuz.ecommerce.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
