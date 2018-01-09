package Utills;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = {  "Controller", "Model", "Dao", "Service", "Utills"})
public class WebConfig{

    public static void main(String[] args) {
        SpringApplication.run(WebConfig.class, args);

    }

}
