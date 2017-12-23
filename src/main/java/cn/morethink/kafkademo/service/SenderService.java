package cn.morethink.kafkademo.service;

import cn.morethink.kafkademo.entity.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author 李文浩
 * @date 2017/12/23
 */


@Service
public class SenderService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    public void sendMessage(Message message) {
        kafkaTemplate.send("topic-1", gson.toJson(message));
    }
}
