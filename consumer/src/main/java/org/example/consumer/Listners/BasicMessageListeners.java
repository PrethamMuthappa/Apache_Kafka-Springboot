package org.example.consumer.Listners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BasicMessageListeners {


    @KafkaListener(topics = "basicmessagetopic",groupId = "basic-msg-group")
    public void listener(String message) {
        System.out.println("Inside listner msg group");
        System.out.println("received messgae " + message);
        System.out.println("exit listner");
    }

}
