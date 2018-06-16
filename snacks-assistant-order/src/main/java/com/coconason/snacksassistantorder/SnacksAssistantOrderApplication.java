package com.coconason.snacksassistantorder;

import com.alibaba.druid.pool.DruidDataSource;
import com.coconason.snacksassistantorder.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.sql.DataSource;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@ServletComponentScan
@EnableSwagger2
@EnableBinding(SendService.class)
public class SnacksAssistantOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnacksAssistantOrderApplication.class, args);
	}

}
