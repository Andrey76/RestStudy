package com.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = {"com.bus.Controller", "com.bus.model", "com.bus.Dao", "com.bus.Service"})
public class WebConfig{

    public static void main(String[] args) {
        SpringApplication.run(WebConfig.class, args);

    }

}
