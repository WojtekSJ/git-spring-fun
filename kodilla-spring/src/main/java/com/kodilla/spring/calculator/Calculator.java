package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    private double val;

    @Autowired
    Display display;

    public void add(double a, double b) {
        display.displayValue(a+b);
    }
    public void sub(double a, double b) {
        display.displayValue(a-b);
    }
    public void mul(double a, double b) {
        display.displayValue(a*b);
    }
    public void div(double a, double b) {
        if (b==0) {
            System.out.println("Div by 0 exception");
        } else {
            display.displayValue(a / b);
        }
    }

}
