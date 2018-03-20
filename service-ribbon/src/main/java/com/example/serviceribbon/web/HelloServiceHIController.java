package com.example.serviceribbon.web;

import com.example.serviceribbon.Service.HelloServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceHIController {
    @Autowired
    HelloServiceHi  helloServiceHi;
    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return helloServiceHi.hi(name);
    }
}
