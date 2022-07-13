package com.dpworld.flyway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayPocApplication {
    @Value("${welcome.message}")
    private static String profile;
    public static void main(String[] args) {
        SpringApplication.run(FlywayPocApplication.class, args);
        System.out.println(" =================================== ");
        System.out.println( " Flyway POC Started ...");
        System.out.println( "http://localhost:8181/");
        System.out.println( "http://localhost:8181/actuator/refresh");

       // System.out.println( "Active Profile is : "+profile);
        System.out.println(" =================================== ");
    }

}