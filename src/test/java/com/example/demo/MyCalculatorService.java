package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyCalculatorService {

    private Calculator calculator;
    //final로 해주면 널이었다가 생성자에서 바뀌게 됨. 한번 허용~>~
//
//    @Autowired
//    public MyCalculatorService(Calculator calculator){
//        this.calculator = calculator;
//    } //Autowired를 까먹었다고 생각하고 안써도 넣어줌,,그래도 써주자
//
    @Autowired
    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    } //세터
    //생성자는 반드시 필요하니까 Autowired가 자동으로 넣어졌는데 세터는 그럴 필요가 없으니 꼭 넣어줘야함

    public int calcAdd(int a, int b) {
        return calculator.add(a, b);
    }
}