package com.hjc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.hjc.springcloud"})
@ComponentScan("com.hjc.springcloud")
public class DeptConsumer_feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_feign_App.class, args);
    }
}
