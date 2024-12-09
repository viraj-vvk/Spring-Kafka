package spring.kafka.Spring_Kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "sampleTopic", groupId = "myGroup")
    public void consumeMessage(String message) {
        LOGGER.info("Consumed message: {}", message);
    }
}
