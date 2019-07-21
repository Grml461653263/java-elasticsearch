package com.my.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class customer {

    @KafkaListener(topics = {"exception_topic"})
    public void receiveMessage(Map<String,Object> message){
        System.out.println("--------开始接收消息--------");
        System.out.println("        接收消息 ："+message);
        System.out.println("--------结束接收消息--------");
    }
}
