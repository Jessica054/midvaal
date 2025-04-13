package com.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@SpringBootApplication
public class BackendApplication {

	@Autowired
	EmployeeRepo employeeRepo;

	@GetMapping("/employees")
	public String testInq() {
		return employeeRepo.findAll().stream().collect(Collectors.toList()).toString();
	}



	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
