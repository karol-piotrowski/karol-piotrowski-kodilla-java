package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        if (calculator.add(15,8)==23) {
            System.out.println("Calculator.add() method: test OK");
        } else {
            System.out.println("Calculator.add() method: Error!");
        }

        if (calculator.subtract(15,8)==7) {
            System.out.println("Calculator.subtract() method: test OK");
        } else {
            System.out.println("Calculator.subtract() method: Error!");
        }
    }
}
