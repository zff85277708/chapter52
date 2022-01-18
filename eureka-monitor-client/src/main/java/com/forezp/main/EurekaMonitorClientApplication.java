package com.forezp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.forezp")
@EnableEurekaClient
public class EurekaMonitorClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMonitorClientApplication.class, args);
    }
}
