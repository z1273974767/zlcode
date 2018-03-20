package com.example.servicehystrix2.service;

import com.example.servicehystrix2.serviceImpl.SericeFeginHiImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi" ,fallback = SericeFeginHiImpl.class)
public interface SericeFeginHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(@RequestParam(value = "name") String name);
}
