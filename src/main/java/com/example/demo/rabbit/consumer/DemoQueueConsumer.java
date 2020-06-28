package com.example.demo.rabbit.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author   czq
 * @Date 2020-06-24 17:13:15    
 */
@Component
@RabbitListener(queues="demoQueue")
public class DemoQueueConsumer {

	@RabbitHandler
	public void recieved(String msg) {
		System.out.println("[demoQueue] recieved message: "+msg);
	}
}
