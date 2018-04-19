package com.coconason.snacksassistantbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SnacksAssistantBusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnacksAssistantBusApplication.class, args);
	}
}
