package com.ricorich.consumer;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Consumer_HelloWorld {
    public static void main(String[] args) throws IOException, TimeoutException {
        // 1.创建工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();

        // 2.设置参数
        connectionFactory.setHost("120.77.203.191");
        connectionFactory.setPort(5672);
        connectionFactory.setVirtualHost("/ricohost");
        connectionFactory.setUsername("rico");
        connectionFactory.setPassword("199418");

        // 3.创建连接connection
        Connection connection = connectionFactory.newConnection();

        // 4.创建channel
        Channel channel = connection.createChannel();

        // 5.创建队列queue
        /*
        queueDeclare(String queue, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments)
        1. queue:队列名称
        2. durable：是否持久化(当mq重启后还在)
        3. exclusive：
            - 是否独占(只能有一个消费者监听这个队列)
            - 当connection关闭时，是否删除队列
        4. autoDelete：是否自动删除(当没有consumer时，自动删除)
        5. argument：参数
        */
        // 如果有一个队列名字叫做"hello world，则不会创建。如果没有则会创建"
        channel.queueDeclare("hello_world", true, false, false, null);

        // 6.接收消息
        /*
        public String basicConsume(String queue, boolean autoAck, Consumer callback)
        1. queue：队列名称
        2. autoAck：是否自动确认
        3. callback：回调对象
        */
        Consumer consumer = new DefaultConsumer(channel) {
            // 回调方法。当接收到消息之后自动执行该方法
            /*
            参数：
            1. consumerTag：消息标识
            2. envelope：获取一些信息，比如交换机、路由key
            3. properties：配置信息
            4. body：消息数据
             */
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("consumerTag:" + consumerTag);
                System.out.println("Exchange:" + envelope.getExchange());
                System.out.println("routingKey:" + envelope.getRoutingKey());
                System.out.println("properties:" + properties);
                System.out.println("body:" + new String(body));
            }
        };
        channel.basicConsume("hello_world", consumer);

        // 7.消费者处于一直监听的状态，不用释放资源
//        channel.close();
//        connection.close();
    }
}
