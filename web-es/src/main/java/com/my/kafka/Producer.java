package com.my.kafka;


import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("producer")
public class Producer {
    /**
     * 配置kafka系统组件
     */
    @Autowired
    KafkaAdmin kafkaAdmin;

    /**
     * kafkaTemplate 发送消息Template
     */
    @Autowired
    KafkaTemplate kafkaTemplate;


    @PostMapping("send")
    public String sendKafka(@RequestBody JSONObject json) {
        kafkaTemplate.send("estopic", json.getString("message"));
        return "1";

    }
}
