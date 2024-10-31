package com.example.donworry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.donworry")
@EntityScan(basePackages = "com.example.donworry")
public class CapstoneDonWorryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoneDonWorryApplication.class, args);
	}

}
