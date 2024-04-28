package org.example.producer.Service;


import lombok.RequiredArgsConstructor;
import org.example.producer.Producer.MessageProducer;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProducerService {

    private final MessageProducer messageProducer;

    public String sendMessage(){
        String message="Hello world";
        this.messageProducer.sendBasicMessage(message);
        return "message sent";
    }
}
