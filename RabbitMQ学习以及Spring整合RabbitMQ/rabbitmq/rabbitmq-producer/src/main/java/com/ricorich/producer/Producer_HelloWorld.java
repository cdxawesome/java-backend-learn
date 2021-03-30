package com.ricorich.producer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

// 发送消息的生产者
public class Producer_HelloWorld {
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

        // 6.发送消息
        /*
        basicPublish(String exchange, String routingKey, BasicProperties props, byte[] body)
        1. exchange:交换机名称。简单模式下交换机会使用默认的。这里给它一个空字符就行“”
        2. routingKey：路由名称
        3. props：参数信息
        4. body:要发送的消息数据
        */
        String body = "hello,rabbitmq~~~";
        // 这里的路由名称要和队列的名称一样，才能路由到对应的队列去
        channel.basicPublish("", "hello_world", null, body.getBytes());

        // 7.释放资源
        channel.close();
        connection.close();

    }
}
