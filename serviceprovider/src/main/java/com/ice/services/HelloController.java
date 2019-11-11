package com.ice.services;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ice
 * @date 19-11-6
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "hello world";
    }
}
