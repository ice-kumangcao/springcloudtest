package com.ice.registercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ice
 * @date 19-11-6
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterCenterApp {

    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterApp.class, args);
    }
}

