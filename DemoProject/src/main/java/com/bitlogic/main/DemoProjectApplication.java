package com.bitlogic.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
		System.out.println("main class");
		SpringApplication.run(DemoProjectApplication.class, args);
	}

}
