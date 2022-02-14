package com.mark1708.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqListeners implements RabbitListenerConfigurer {

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void receivedMessage(MessageRequest request) {
        System.out.println("Listener received: " + request.getMessage() + " 🎉");
    }

    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar registrar) {

    }
}
