package com.atacanyavuz.ecommerce.repository;

import com.atacanyavuz.ecommerce.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
}
