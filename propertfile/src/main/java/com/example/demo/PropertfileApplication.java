package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertfileApplication {

	public static void main(String[] args) {
//		System.setProperty("spring.profiles.default", "devtool");
		SpringApplication.run(PropertfileApplication.class, args);
	}

}
