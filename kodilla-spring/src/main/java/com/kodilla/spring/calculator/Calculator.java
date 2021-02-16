package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    Display display;

    public double add(double a, double b) {
         return (a+b);
    }
    public double sub(double a, double b) {
        return (a-b);
    }
    public double mul(double a, double b) {
        return (a*b);
    }
    public double div(double a, double b) {
        if (b==0) {
            System.out.println("Div by 0 exception");
            return 0;
        }
            return (a / b);

    }

}