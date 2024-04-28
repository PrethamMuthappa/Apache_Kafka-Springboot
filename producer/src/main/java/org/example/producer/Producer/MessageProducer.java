package org.example.producer.Producer;

import org.example.producer.Constants.Myconstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendBasicMessage(String message){
        CompletableFuture<SendResult<String , String >>future=this.kafkaTemplate.send(Myconstants.BASIC_MESSAGE,message);
        try {
           future.whenComplete((result,ex)->{
               if(ex==null){
                   System.out.println("Message sent by producer"+result.getProducerRecord());
               }
               else {
                   System.out.println("Producer message failed"+ex.getMessage());
               }
           });
        }
        catch (Exception e){
            System.out.println("Exception occured"+e.getMessage());
        }
    }

}
