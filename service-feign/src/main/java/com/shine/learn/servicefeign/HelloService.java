package com.shine.learn.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client1",fallback = HelloHyStrixService.class)
public interface HelloService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hiService(@RequestParam(value="name") String name);
}
