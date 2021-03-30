package com.ricorich.test;

import com.ricorich.config.RabbitMQConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test1() {
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME,
                "boot.haha", "hello springboot rabbitmq!!");
    }
}
