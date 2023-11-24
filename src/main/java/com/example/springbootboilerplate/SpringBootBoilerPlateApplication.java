package com.example.springbootboilerplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootBoilerPlateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBoilerPlateApplication.class, args);
    }

}
