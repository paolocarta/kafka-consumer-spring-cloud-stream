package me.paolocarta.kafka.producer.services;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MessageDto {

    private long messageNumber;
    private long timestamp;
}
