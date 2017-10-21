package com.learnersdome.learnersdome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.learnersdome.controller"})
public class LearnersdomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnersdomeApplication.class, args);
	}
}
