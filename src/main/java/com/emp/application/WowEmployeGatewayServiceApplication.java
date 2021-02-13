package com.emp.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.emp.filters.EmployeeZuulFilter;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication(scanBasePackages = {"com.emp.*"})
public class WowEmployeGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WowEmployeGatewayServiceApplication.class, args);
	}

	@Bean
	public EmployeeZuulFilter employeeZuulFilter() {
		return new EmployeeZuulFilter();
	}
}
