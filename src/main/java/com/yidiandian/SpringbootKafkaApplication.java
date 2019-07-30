package com.yidiandian;

import com.yidiandian.province.KafkaSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootKafkaApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context = SpringApplication.run(SpringbootKafkaApplication.class, args);
		KafkaSender sender = context.getBean(KafkaSender.class);
		sender.send();
/*		for (int i = 0;i< 3;i++){
			//调用消息发送类中的消息发送方法
			sender.send();
			try {
				Thread.sleep(3000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}*/
	}

}
