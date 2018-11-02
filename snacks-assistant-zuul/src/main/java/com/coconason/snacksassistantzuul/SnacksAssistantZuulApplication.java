package com.coconason.snacksassistantzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class SnacksAssistantZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(SnacksAssistantZuulApplication.class, args);
	}
}
