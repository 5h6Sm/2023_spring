package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyCalculatorService {
    @Autowired
    private Calculator calculator;
    public int calcAdd(int a, int b) {
        return calculator.add(a, b);
    }
}