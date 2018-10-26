package com.shine.learn.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloHyStrixService implements HelloService{

    @Override
    public String hiService(String name){
        return "hi," + name + ",sorry,error!";
    }
}
