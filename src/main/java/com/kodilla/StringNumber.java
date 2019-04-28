package com.kodilla;

import static java.lang.Math.sqrt;

public class StringNumber {
    public boolean isPrimeNumber(String string) {
        try {
            int number = Integer.parseInt(string);
            if (isPrime(number)) {
                return true;
            }

        } catch (NumberFormatException e) {
            return false;
        }

        return false;
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;

        }
        for (int i = 2; i <= sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
