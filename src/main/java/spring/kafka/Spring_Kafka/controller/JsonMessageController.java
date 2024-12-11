package spring.kafka.Spring_Kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.kafka.Spring_Kafka.model.User;
import spring.kafka.Spring_Kafka.service.JsonKafkaProducer;

@RestController
@RequestMapping("/api/kafka/v1")
public class JsonMessageController {

    private final JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/json/publish")
    public ResponseEntity<String> publishJsonMessage(@RequestBody User user) {
        jsonKafkaProducer.sendJsonMessage(user);
        return ResponseEntity.ok("Json message published to kafka");
    }

}
