package com.ice.ribbonconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ice
 * @date 19-11-14
 */
@FeignClient("service-provider")
public interface HelloService {

    /**
     *
     * @return
     */
    @RequestMapping("/hello")
    String hello();
}
