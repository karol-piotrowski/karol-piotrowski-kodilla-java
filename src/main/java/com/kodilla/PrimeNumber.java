package com.kodilla;

import static java.lang.Math.sqrt;

public class PrimeNumber {

    public int getPrime(int n) throws PrimeNumberWrongArgument {
        if (n <= 0) {
            throw new PrimeNumberWrongArgument();
        }


        int i = 0;
        int currentNumber = 2;
        while (i < n) {
            if (isPrime(currentNumber)) {
                i++;
            }
            currentNumber++;
        }
        return currentNumber - 1;
    }

    public boolean isPrime(int number) {
        for (int i = 2; i < (int) sqrt(number) + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
