package com.baeldung.spring.cloud.archaius.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BasicArchaiusApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(BasicArchaiusApplication.class, args);
    }

}
