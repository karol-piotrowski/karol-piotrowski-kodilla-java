package com.kodilla;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTestSuite {

    @Test
    public void testPrimeNumber5th() {
        PrimeNumber primeNumber = new PrimeNumber();
        int result = primeNumber.getPrime(5);
        Assert.assertEquals(11, result);
    }

    @Test
    public void testPrimeNumber1st() {
        PrimeNumber primeNumber = new PrimeNumber();
        int result = primeNumber.getPrime(1);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testPrimeNumber1000th() {
        PrimeNumber primeNumber = new PrimeNumber();
        int result = primeNumber.getPrime(1000);
        Assert.assertEquals(7919, result);
    }

    @Test(expected = PrimeNumberWrongArgument.class)
    public void testPrimeNumber0th() {
        PrimeNumber primeNumber = new PrimeNumber();
        int result = primeNumber.getPrime(0);
    }

    @Test(expected = PrimeNumberWrongArgument.class)
    public void testPrimeNumberNegative() {
        PrimeNumber primeNumber = new PrimeNumber();
        int result = primeNumber.getPrime(-2);
    }

}
