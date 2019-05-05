package com.blogcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
//주석 추가
	public static void main(String[] args) {
		System.out.println("Startup!!!!");
		
		SpringApplication.run(Application.class, args);
		
		System.out.println("Started!!!!");
		
		System.out.println("push!!!");
	}
}
