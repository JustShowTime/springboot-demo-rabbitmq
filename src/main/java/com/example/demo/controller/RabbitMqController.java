package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rabbit.producer.RabbitProducer;

/**
 * @author   czq
 * @Date 2020-06-24 17:15:53    
 */
@RestController
public class RabbitMqController {

	@Autowired
	private RabbitProducer rabbitProducer;
	
	@RequestMapping(value="/sendDemoQueue",method = RequestMethod.GET)
	public Object sendDemoQueue() {
		rabbitProducer.sendDemoQueue();
		return "success";
	}
	
	@RequestMapping(value="/sendFanout",method = RequestMethod.GET)
	public Object sendFanout() {
	    rabbitProducer.sendFanout();
	    return "success";
	}
	
	@RequestMapping(value="/sendTopicTopicAB",method = RequestMethod.GET)
	public Object sendTopicTopicAB() {
	    rabbitProducer.sendTopicTopicAB();
	    return "success";
	}

	@RequestMapping(value="/sendTopicTopicB",method = RequestMethod.GET)
	public Object sendTopicTopicB() {
	    rabbitProducer.sendTopicTopicB();
	    return "success";
	}

	@RequestMapping(value="/sendTopicTopicBC",method = RequestMethod.GET)
	public Object sendTopicTopicBC() {
	    rabbitProducer.sendTopicTopicBC();
	    return "success";
	}
}
