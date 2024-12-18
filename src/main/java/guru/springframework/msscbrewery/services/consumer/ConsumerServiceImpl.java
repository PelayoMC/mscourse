package guru.springframework.msscbrewery.services.consumer;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.ConsumerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public ConsumerDto getConsumerById(UUID consumerId) {
        return ConsumerDto.builder().id(UUID.randomUUID())
                .name("Consumer name")
                .build();
    }
}
