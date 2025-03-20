package com.atacanyavuz.ecommerce.repository;

import com.atacanyavuz.ecommerce.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
