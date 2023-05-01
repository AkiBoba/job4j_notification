package ru.job4j_notification.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.job4j_notification.model.OrderStatus;
import ru.job4j_notification.repository.OrderRepository;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @KafkaListener(topics = "preorder")
    public void receiveOrder(String newOrder) throws JsonProcessingException {
        OrderStatus orderStatus = OBJECT_MAPPER.readValue(newOrder, OrderStatus.class);
        repository.save(orderStatus);
    }
}
