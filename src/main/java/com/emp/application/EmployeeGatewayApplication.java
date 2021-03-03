package com.emp.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class EmployeeGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeGatewayApplication.class, args);
	}

	
}
