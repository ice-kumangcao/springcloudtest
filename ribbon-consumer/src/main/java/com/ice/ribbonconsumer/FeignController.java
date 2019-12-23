package com.ice.ribbonconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ice
 * @date 19-11-14
 */
@RestController
public class FeignController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/feign-consumer")
    public String hello() {
        return helloService.hello();
    }
}
