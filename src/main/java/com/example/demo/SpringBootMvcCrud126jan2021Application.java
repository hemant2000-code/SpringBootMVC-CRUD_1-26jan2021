package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.example.*")
@EnableJpaRepositories("com.example.dao")
@EntityScan(basePackages="com.example.model")
public class SpringBootMvcCrud126jan2021Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcCrud126jan2021Application.class, args);
	}

}
