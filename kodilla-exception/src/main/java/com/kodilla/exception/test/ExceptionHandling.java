package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.3, 1.5));
        } catch (Exception e) {
            System.out.println("Exception: " + e + " in " + secondChallenge.getClass() + " class!");
        } finally {
            System.out.println("End of the program");
        }
    }

}
