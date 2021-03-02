package com.emp.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.emp.*"})
public class EmployeeGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeGatewayApplication.class, args);
	}

	
}
