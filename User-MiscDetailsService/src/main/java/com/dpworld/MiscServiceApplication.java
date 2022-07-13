package com.dpworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiscServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiscServiceApplication.class, args);
		System.out.println( " =================================");
		System.out.println(" MiscServiceApplication Started");
		System.out.println(" http://localhost:8083");
		System.out.println( " =================================");
	}
}


