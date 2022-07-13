package com.dpworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonelServiceApplication.class, args);

		System.out.println( " =================================");
		System.out.println(" PersonelServiceApplication Started");
		System.out.println(" http://localhost:8084");
		System.out.println( " =================================");
	}
}


