package com.forezp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication(scanBasePackages = "com.forezp")
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class EurekaRibbonClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonClientApplication.class, args);
    }
}
