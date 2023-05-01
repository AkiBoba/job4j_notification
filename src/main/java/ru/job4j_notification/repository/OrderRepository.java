package ru.job4j_notification.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j_notification.model.OrderStatus;

public interface OrderRepository extends CrudRepository<OrderStatus, Integer> {
}
