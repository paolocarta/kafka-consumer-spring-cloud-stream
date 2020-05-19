package me.paolocarta.kafka.consumer.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StreamListenerService {

    @StreamListener(Sink.INPUT)
    public void logMessage(final MessageDto message) {

        log.info("Received message {}", message);
    }
}
