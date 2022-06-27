package com.example.rabbitmq.cn.hycat;

import com.rabbitmq.client.ConnectionFactory;

/**
 * @author 吕泽浩业
 * @version 1.0
 */
public class Producer {
    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.233.128");
        factory.setUsername("admin");
        factory.setPassword("lzhycat");

    }
}
