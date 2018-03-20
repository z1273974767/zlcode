package com.example.servicefeign.web;


import com.example.servicefeign.service.SericeFeginHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    SericeFeginHi sericeFeginHi;
    @RequestMapping(value = "/hi" ,method = RequestMethod.GET)
    public  String  hi(@RequestParam("name") String name){
        return sericeFeginHi.hi(name);
    };
}
