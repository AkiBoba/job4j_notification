package ru.job4j_notification.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class OrderStatus {
    @Id
    private int id;
    @Column(name = "status_id")
    private int statusId;
}
