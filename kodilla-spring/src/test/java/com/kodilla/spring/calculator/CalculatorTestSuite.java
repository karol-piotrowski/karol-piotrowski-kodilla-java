package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult =  calculator.add(5,7);
        double subResult = calculator.sub(9,4);
        double mulResult = calculator.mul(9,7);
        double divResult = calculator.div(120,3);
        //Then
        Assert.assertEquals(12, addResult, 0);
        Assert. assertEquals(5, subResult, 0);
        Assert.assertEquals(63, mulResult, 0);
        Assert.assertEquals(40, divResult, 0);
    }
}
