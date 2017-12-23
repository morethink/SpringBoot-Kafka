package cn.morethink.kafkademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KafkaDemoApplication {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext app = SpringApplication.run(KafkaDemoApplication.class, args);
    }
}
