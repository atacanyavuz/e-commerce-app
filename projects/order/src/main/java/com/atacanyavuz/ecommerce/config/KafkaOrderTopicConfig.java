package com.atacanyavuz.ecommerce.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaOrderTopicConfig {

    // todo Topic Name will be taken from Environment Variables
    @Bean
    public NewTopic orderTopic(){
        return TopicBuilder
                .name("order-topic")
                .build();
    }
}
