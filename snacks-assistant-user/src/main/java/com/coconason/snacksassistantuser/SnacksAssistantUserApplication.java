package com.coconason.snacksassistantuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;


@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.coconason.snacksassistantuser.dao.*")
public class SnacksAssistantUserApplication {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//String port = scan.nextLine();
		SpringApplication.run(SnacksAssistantUserApplication.class, args);
		//new SpringApplicationBuilder(SnacksAssistantUserApplication.class).properties("server.port="+port).run(args);
	}
	@RestController
	class ServiceInstanceRestController {

		@Autowired
		private DiscoveryClient discoveryClient;

		@RequestMapping("/service-instances/{applicationName}")
		public List<ServiceInstance> serviceInstancesByApplicationName(
				@PathVariable String applicationName) {
			return this.discoveryClient.getInstances(applicationName);
		}
	}
}
