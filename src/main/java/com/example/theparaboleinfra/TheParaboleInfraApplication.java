package com.example.theparaboleinfra;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TheParaboleInfraApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheParaboleInfraApplication.class, args);
    }

}
