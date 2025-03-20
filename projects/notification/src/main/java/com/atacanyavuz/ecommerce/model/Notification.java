package com.atacanyavuz.ecommerce.model;


import com.atacanyavuz.ecommerce.enums.NotificationType;
import com.atacanyavuz.ecommerce.messaging.event.OrderConfirmation;
import com.atacanyavuz.ecommerce.messaging.event.PaymentConfirmation;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
public class Notification {
    @Id
    private String id;
    private NotificationType type;
    private LocalDateTime notificationDate;
    private OrderConfirmation orderConfirmation;
    private PaymentConfirmation paymentConfirmation;
}
