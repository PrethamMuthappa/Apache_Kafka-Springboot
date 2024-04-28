package org.example.producer.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.example.producer.Constants.Myconstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {

    @Bean
    public NewTopic newTopic(){
        return new NewTopic(Myconstants.BASIC_MESSAGE,1,(short) 1);
    }
}
