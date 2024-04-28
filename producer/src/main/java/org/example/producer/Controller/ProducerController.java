package org.example.producer.Controller;


import lombok.RequiredArgsConstructor;
import org.example.producer.Service.ProducerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProducerController {

    private final ProducerService producerService;

    @GetMapping
    public ResponseEntity<?> getmessage(){
        String response=this.producerService.sendMessage();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
