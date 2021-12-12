package com.fullstackfriend.testerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.fullstackfriend.testerapp")
@EntityScan("com.fullstackfriend.entity")
@ComponentScan(basePackages = {"com.fullstackfriend.exception", "com.fullstackfriend.testerapp"})
public class TesterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesterAppApplication.class, args);
	}

}
