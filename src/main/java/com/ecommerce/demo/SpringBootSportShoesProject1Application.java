package com.ecommerce.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan({"com.ecommerce.controller", "com.ecommerce.entity", "com.ecommerce.dao", "com.ecommerce.service"})
@EnableJpaRepositories
public class SpringBootSportShoesProject1Application {

	public static void main(String[] args)  {
	
		SpringApplication.run(SpringBootSportShoesProject1Application.class, args);
	
	
	
	}
}

