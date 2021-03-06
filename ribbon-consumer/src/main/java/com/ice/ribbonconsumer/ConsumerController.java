package com.ice.ribbonconsumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ice
 * @date 19-11-7
 */
@RestController
public class ConsumerController {

    @LoadBalanced
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/ribbon-consumer")
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloConsumer() {
        return restTemplate.getForEntity(
                "http://SERVICE-PROVIDER/hello",
                String.class).getBody();
    }

    public String helloFallback() {
        return "error";
    }
}
