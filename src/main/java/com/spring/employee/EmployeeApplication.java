package com.spring.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.spring.employee.Repository")
public class EmployeeApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
}