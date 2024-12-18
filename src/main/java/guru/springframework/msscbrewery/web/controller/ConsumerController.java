package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.services.beer.BeerService;
import guru.springframework.msscbrewery.services.consumer.ConsumerService;
import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.ConsumerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@RequestMapping("/api/v1/consumer")
@RestController
public class ConsumerController {
    private final ConsumerService consumerService;
    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }
    @GetMapping({"/{consumerId}"})
    public ResponseEntity<ConsumerDto> getBeer(@PathVariable("consumerId") UUID consumerId){
        return new ResponseEntity<>(consumerService.getConsumerById(consumerId), HttpStatus.OK);
    }
}
