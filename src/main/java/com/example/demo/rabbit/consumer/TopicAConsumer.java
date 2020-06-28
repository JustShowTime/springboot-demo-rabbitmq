package com.example.demo.rabbit.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author   czq
 * @Date 2020-06-24 17:41:04    
 */
@Component
@RabbitListener(queues = "topic.a")
public class TopicAConsumer {

    /**
     * 消息消费
     * @RabbitHandler 代表此方法为接受到消息后的处理方法
     */
    @RabbitHandler
    public void recieved(String msg) {
        System.out.println("[topic.a] recieved message: " + msg);
    }
}
