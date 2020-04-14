package com.ems.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventManagementSystemApplication {

	static ConfigurableApplicationContext context;
	public static void main(String[] args) {
		context =  SpringApplication.run(EventManagementSystemApplication.class, args);
	}

}
