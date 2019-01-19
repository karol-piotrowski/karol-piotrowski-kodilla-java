package com.kodilla.good.patterns.challenges;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int a = 5/0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
            System.exit(0);

        } finally {
            System.out.println("Finally block");
        }
    }
}
