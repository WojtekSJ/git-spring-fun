package com.kodilla.spring.calculator;

import com.kodilla.spring.library.Library;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class CalculatorTestSuite {


        @Autowired
        private Calculator calculator;

        @Test
        public void testAdd() {
            //Given
            //When
            calculator.add(2, 5.6);
            //Then
            //do nothing
        }

        @Test
        public void testSub() {
            //Given
            //When
            calculator.sub(5, 2.5);
            //Then
            //do nothing
        }
    @Test
    public void testMul() {
        //Given
        //When
        calculator.mul(2, 2);
        //Then
        //do nothing
    }
    @Test
    public void testDiv() {
        //Given
        //When
        calculator.div(5, 1);
        //Then
        //do nothing
    }
    }