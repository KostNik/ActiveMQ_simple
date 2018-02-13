package com.edu;

import com.edu.activemq.sender.MessageSender;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ActiveMQTest {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:META-INF/spring/jms-listener-app-context.xml",
                "classpath:META-INF/spring/jms-sender-app-context.xml");
        context.refresh();
//        context.start();

        MessageSender sender = context.getBean("messageSender", MessageSender.class);


        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(400);
                sender.sendMessage("Message : " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
