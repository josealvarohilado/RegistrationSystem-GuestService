package com.javaprojects.guest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GuestServiceApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(GuestServiceApplication.class, args);
	}

}
