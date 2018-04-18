package com.coconason.snacksassistantconsumer;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@ServletComponentScan
public class SnacksAssistantConsumerApplication {

	public static void main(String[] args) {
		//new SpringApplicationBuilder(SnacksAssistantConsumerApplication.class).web(true).run(args);
		new SpringApplicationBuilder(SnacksAssistantConsumerApplication.class).web(WebApplicationType.SERVLET).run(args);
	}
}
