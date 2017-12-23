package cn.morethink.kafkademo.service;

import cn.morethink.kafkademo.entity.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author 李文浩
 * @date 2017/12/23
 */


@Service
public class ReceiveService {

    private Gson gson = new GsonBuilder().create();

    @KafkaListener(topics = "topic-1")
    public void processMessage(String content) {
        Message message = gson.fromJson(content, Message.class);
        System.out.println("消费消息");
        System.out.println(message);
    }
}

