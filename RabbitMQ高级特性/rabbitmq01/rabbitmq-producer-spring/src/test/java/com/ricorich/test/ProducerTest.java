package com.ricorich.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-rabbitmq-producer.xml")
public class ProducerTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /*
    确认模式：
        步骤：
        1. 确认模式开启: ConnectionFactory中开启publisher-confirm = "true"
        2. 在rabbitTemplate定义ConfirmBack回调函数
     */
    @Test
    public void testConfirm() throws InterruptedException {
        // 2. 定义回调函数
        rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
            /**
             *
             * @param correlationData 相关配置信息
             * @param b exchange交换机 是否成功收到了消息。true：成功，false：失败
             * @param s 失败原因
             */
            @Override
            public void confirm(CorrelationData correlationData, boolean b, String s) {
                System.out.println("confirm方法被执行了");
                if (b) {
                    // 接收消息成功
                    System.out.println("接收消息成功" + s);
                } else {
                    // 接收消息失败
                    System.out.println("接收消息失败" + s);
                }
            }
        });

        // 发送消息
        rabbitTemplate.convertAndSend("test_exchange_confirm", "confirm", "hello confirm...");
//        Thread.sleep(500);
    }

    /*
    回退模式：
        步骤：
        1. 回退模式开启: ConnectionFactory中开启publisher-return = "true"
        2. 在rabbitTemplate定义ReturnCallBack回调函数
        3. 设置Exchange处理消息的模式：
            1. 如果消息没有路由到queue，则丢弃消息(默认)
            2. 如果消息没有路由到queue，则返回消息给发送方
     */
    @Test
    public void testReturn() throws InterruptedException {
        // 设置处理消息的模式为上述第二种
        rabbitTemplate.setMandatory(true);

        rabbitTemplate.setReturnCallback(new RabbitTemplate.ReturnCallback() {
            /**
             * 回退模式的回调函数，只有当消息处理模式设置为setMandatory(true)时才会调用
             * @param message 消息对象
             * @param i 响应码
             * @param s 响应信息
             * @param s1 交换机名称
             * @param s2 路由键
             */
            @Override
            public void returnedMessage(Message message, int i, String s, String s1, String s2) {
                System.out.println("returnedMessage run...");
                System.out.println(new String(message.getBody()));
                System.out.println(i);
                System.out.println(s);
                System.out.println(s1);
                System.out.println(s2);
            }
        });

        // 发送消息
        rabbitTemplate.convertAndSend("test_exchange_confirm", "confirm", "message confirm...");
//        Thread.sleep(500);
    }

    @Test
    public void testTTL() {
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend("test_exchange_ttl", "ttl.message", "message ttl...");
        }
    }

    @Test
    public void testTTL2() {

        // 消息后处理对象，设置一些消息的参数信息
        MessagePostProcessor messagePostProcessor = new MessagePostProcessor() {
            @Override
            public Message postProcessMessage(Message message) throws AmqpException {
                // 设置消息的过期时间为5秒
                message.getMessageProperties().setExpiration("5000");
                return message;
            }
        };
        for (int i = 0; i < 10; i++) {
            // 使设置有过期时间的消息处于消息队列的中间位置
            if (i == 5) {
                rabbitTemplate.convertAndSend("test_exchange_ttl",
                        "ttl.message", "message ttl...", messagePostProcessor);
            } else {
                rabbitTemplate.convertAndSend("test_exchange_ttl",
                        "ttl.message", "message ttl...");
            }
        }

    }

    /**
     * 测试死信队列的三种情况
     * 1.消息设置了过期时间
     * 2.队列设置了长度限制
     * 3.消费端拒收消息，并且消息没有重回队列
     */
    @Test
    public void testDLX() {
        // 测试消息过期时间
//        rabbitTemplate.convertAndSend("test_exchange_normal","normal.haha", "我是一条消息，我会死吗");

        // 测试长度限制
//        for (int i = 0; i < 20; i++) {
//            rabbitTemplate.convertAndSend("test_exchange_normal",
//                    "normal.haha", "我是一条消息，我会死吗");
//        }


        // 测试消费端拒收
        rabbitTemplate.convertAndSend("test_exchange_normal","normal.haha", "我是一条消息，我会死吗");

    }

    /**
     * 测试延迟队列
     */
    @Test
    public void testDelay()
    {
        // 发送消息
        rabbitTemplate.convertAndSend("test_exchange_order","test.order.someOrder", "订单id:1;订单时间:2021年3月31日13:20:33");
    }
}
