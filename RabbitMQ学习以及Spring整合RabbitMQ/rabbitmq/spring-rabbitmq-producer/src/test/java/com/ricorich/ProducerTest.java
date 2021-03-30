package com.ricorich;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-rabbitmq-producer.xml")
public class ProducerTest {

    // 注入RabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testHelloWorld()
    {
        // 发消息
        rabbitTemplate.convertAndSend("spring_queue","Hello World Spring...");
    }

    @Test
    public void testFanout()
    {
        rabbitTemplate.convertAndSend("spring_fanout_exchange","","spring fanout...");
    }

    @Test
    public void testTopics()
    {
        rabbitTemplate.convertAndSend("spring_topic_exchange","heima.rabbitmq.spring","spring topic...");
    }
}
