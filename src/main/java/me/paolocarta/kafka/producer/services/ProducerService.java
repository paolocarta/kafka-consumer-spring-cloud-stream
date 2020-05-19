package me.paolocarta.kafka.producer.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.Publisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProducerService {

    @Publisher(channel = Source.OUTPUT)
    public MessageDto send(long messageNumber) {

        long timestamp = System.currentTimeMillis();
        log.info("Sending message with id: {} ", messageNumber);

        return new MessageDto(messageNumber, timestamp);
    }
}
