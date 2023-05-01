package ru.job4j_notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

import static java.lang.System.out;

@SpringBootApplication
@Configuration
@EnableKafka
public class Job4jNotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(Job4jNotificationApplication.class, args);
        out.println("NotificationApplication run");
    }

}
