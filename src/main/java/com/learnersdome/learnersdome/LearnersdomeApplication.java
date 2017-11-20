package com.learnersdome.learnersdome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.learnersdome.controller", "com.learnersdome.util", "com.learnersdome.service"})
@EntityScan("com.learnersdome.domain")
@EnableJpaRepositories("com.learnersdome.repository")
public class LearnersdomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnersdomeApplication.class, args);
	}
}
