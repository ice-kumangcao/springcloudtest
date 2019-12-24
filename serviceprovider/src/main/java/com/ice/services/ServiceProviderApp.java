package com.ice.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ice
 * @date 19-11-6
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderApp.class);
    }
}
