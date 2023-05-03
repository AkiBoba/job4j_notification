package ru.job4j_notification.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.job4j_notification.model.OrderStatus;
import ru.job4j_notification.repository.OrderRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;

    @KafkaListener(topics = "preorder")
    public void receiveOrder(OrderStatus newOrder) {
        repository.save(newOrder);
        log.info("Получен и сохранен ордер {}", newOrder);

    }
}
