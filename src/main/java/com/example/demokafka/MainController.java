package com.example.demokafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping
    public void test() {
        kafkaTemplate.send("topicName", "test");
    }
}
