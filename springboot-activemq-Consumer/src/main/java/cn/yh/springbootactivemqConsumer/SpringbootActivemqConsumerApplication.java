package cn.yh.springbootactivemqConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringbootActivemqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootActivemqConsumerApplication.class, args);
	}
}
