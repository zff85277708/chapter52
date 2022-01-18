package com.forezp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication(scanBasePackages = "com.forezp")
@EnableEurekaClient
@EnableFeignClients("com.forezp.service")
@EnableHystrixDashboard
public class EurekaFeignClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignClientApplication.class, args);
    }
}
