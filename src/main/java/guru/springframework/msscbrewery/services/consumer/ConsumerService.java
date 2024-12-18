package guru.springframework.msscbrewery.services.consumer;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.ConsumerDto;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
public interface ConsumerService {
    ConsumerDto getConsumerById(UUID consumerId);
}
