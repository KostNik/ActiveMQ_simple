package com.edu.activemq.listener;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQTextMessage;

import javax.jms.Message;
import javax.jms.MessageListener;

@Slf4j
public class BaseMessageListener implements MessageListener {


    @Override
    @SneakyThrows
    public void onMessage(Message message) {
        log.info("Message {}", ((ActiveMQTextMessage) message).getText());

    }

}
