package com.example.rabbitmq;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

//订单下达，发送信息
@RunWith(SpringRunner.class)
@SpringBootTest
class RabbitmqApplicationTests {
    @Resource
    private RabbitTemplate rabbitTemplate;


    @Test
    public void basicQueueTest() {
        String queueName = "basicQueue";
        String message = "hello basicQueue";
        rabbitTemplate.convertAndSend(queueName, message);
    }

    @Test
    public void workQueueTest() throws InterruptedException {
        String queueName = "workQueue";
        String message = "hello workQueue";
        for(int i = 0; i < 100; i++) {
            rabbitTemplate.convertAndSend(queueName, message);
            Thread.sleep(1);
        }
    }

    @Test
    public void publishAndSubscribe() {

    }
}
