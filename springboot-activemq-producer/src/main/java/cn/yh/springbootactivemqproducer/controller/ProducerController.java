package cn.yh.springbootactivemqproducer.controller;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.yh.springbootactivemqproducer.producer.Producer;

@RestController
public class ProducerController {
	@Autowired
	private Producer producer;
	@RequestMapping("test")
	public void producer(){
		Destination destination = new ActiveMQQueue("mytest.queue");
		Destination destination2 = new ActiveMQTopic("mytest.topic");
		for(int i=0; i<100; i++){
			producer.sendMessage(destination2, "myname is yh!!!");
		}
	}
	
}
