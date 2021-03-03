package com.emp.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class FallBackController {

	@GetMapping("/employeeFallBack")
	public String employeeServiceFallBack() {
		log.info("Employee Service is taking long time respond, Please try again Later");
		return "Employee Service is taking long time respond, Please try again Later";
	}
	@GetMapping("/pharmacyFallBack")
	public String pharmacyServiceFallBack() {
		log.info("Pharmacy Service is taking long time respond, Please try again Later");
		return "Pharmacy Service is taking long time respond, Please try again Later";
	}
}
