package com.example.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.jwt.jpa")
public class BootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootJwtApplication.class, args);
		System.out.print("Hello JWT !!");
	}

}
