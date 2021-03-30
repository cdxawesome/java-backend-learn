package com.ricorich.consumer;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Consumer_Routing2 {
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


        // 5.接收消息
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
                System.out.println("body:" + new String(body));
                System.out.println("接收到的消息打印在控制台...");
            }
        };
        channel.basicConsume("test_direct_queue2", true, consumer);

        // 7.消费者处于一直监听的状态，不用释放资源
//        channel.close();
//        connection.close();
    }
}
