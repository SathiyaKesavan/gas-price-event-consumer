package com.price.gas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class GasPriceEventConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GasPriceEventConsumerApplication.class, args);
	}

}
