package cn.hycat.basicQueue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Consumer {

    @RabbitListener(queues = "basicQueue")
    public void basicQueueListener(String msg) {
        System.out.println(msg + LocalTime.now());
    }

    @RabbitListener(queues = "workQueue")
    public void workQueueListener1(String msg) {
        System.out.println("消费者1" + msg + LocalTime.now());
    }

    @RabbitListener(queues = "workQueue")
    public void workQueueListener2(String msg) {
        System.out.println("消费者2" + msg + LocalTime.now());
    }


}
