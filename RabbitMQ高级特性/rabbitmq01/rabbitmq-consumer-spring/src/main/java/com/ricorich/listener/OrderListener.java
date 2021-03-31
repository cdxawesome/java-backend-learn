package com.ricorich.listener;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener implements ChannelAwareMessageListener {

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        // 获取deliveryTag
        long deliveryTag = message.getMessageProperties().getDeliveryTag();

        /*
        用try catch包裹起来。如果消息处理失败，则进入catch手动拒收消息
         */
        try
        {
            // 接收并转换消息
            System.out.println(new String(message.getBody()));

            // 处理业务逻辑
            System.out.println("处理业务逻辑...");
            System.out.println("订单处理中....");
            System.out.println("订单未支付，回滚库存...");

            // 签收消息 第二个参数代表是否允许一次签收多个消息
            channel.basicAck(deliveryTag,true);
        }
        catch (Exception e)
        {
            // 第二个参数代表是否允许一次拒收多个消息
            // 第三个参数表示是否要消息重回队列，这样broker会重新给消费端发消息
            channel.basicNack(deliveryTag,true,false);
            System.out.println("拒收消息");
        }


    }
}
