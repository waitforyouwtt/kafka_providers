package com.yidiandian.province;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yidiandian.entity.OmpActivity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/26 15:09
 * @Email: 15290810931@163.com
 * 消息发送类
 */
@Component
@Slf4j
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    //发送消息方法
    public void send(){
     // Message message = new Message();
     // message.setId(System.currentTimeMillis());
     // message.setOmpActivity(Data.buildOmpActivityData());
    //  message.setSendTime(new Date());

        OmpActivity ompActivity = Data.buildOmpActivityData();
      log.info("△△△△△△△△△△△△△ 发送的 message：{} ",gson.toJson(Data.buildOmpActivityData()));
      kafkaTemplate.send("FH-Borther",gson.toJson(ompActivity));
    }

}
