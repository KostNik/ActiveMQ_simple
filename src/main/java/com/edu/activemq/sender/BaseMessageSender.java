package com.edu.activemq.sender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;

@Slf4j
public class BaseMessageSender implements MessageSender {

    private final JmsTemplate jmsTemplate;

    public BaseMessageSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void sendMessage(String message) {
//        jmsTemplate.setDeliveryDelay(1000);
        log.info("Message was sent");
        jmsTemplate.convertAndSend(message);
    }
}
