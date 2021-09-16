package com.br.sfb.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.br.sfb.dto.OrderStatus;


@Component
public class ConsumerOrder {
	
	 @RabbitListener(queues = "message_queue")
	    public void consumeMessageFromQueue(OrderStatus orderStatus) {
	        System.out.println("Message recieved from queue : " + orderStatus);
	    }
}
