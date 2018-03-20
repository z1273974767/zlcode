package com.example.servicehystrix2.serviceImpl;

import com.example.servicehystrix2.service.SericeFeginHi;
import org.springframework.stereotype.Component;

@Component
public class SericeFeginHiImpl implements SericeFeginHi {
    @Override
    public String hi(String name) {
        return "sorry "+name;
    }
}
