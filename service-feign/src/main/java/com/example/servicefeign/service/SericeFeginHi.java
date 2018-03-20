package com.example.servicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-hi")
public interface SericeFeginHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(@RequestParam(value="name") String name);
}
