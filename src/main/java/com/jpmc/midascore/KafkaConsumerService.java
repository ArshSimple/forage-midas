package com.jpmc.midascore;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(
            topics = "${general.kafka-topic}",
            groupId = "midas-core",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void listen(Transaction transaction) {
        System.out.println("Received transaction: " + transaction);
    }
}
