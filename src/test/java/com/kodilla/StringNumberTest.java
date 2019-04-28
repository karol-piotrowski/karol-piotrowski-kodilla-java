package com.kodilla;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringNumberTest {

    @Test
    public void testIsPrimeNumberNotNumberCase() {
        StringNumber stringNumber = new StringNumber();
        String string = "ABC";

        boolean isPrime = stringNumber.isPrimeNumber(string);

        Assert.assertFalse(isPrime);
    }

    @Test
    public void testIsPrimeNumberPrimeNumberCase() {
        StringNumber stringNumber = new StringNumber();
        String string = "11";

        boolean isPrime = stringNumber.isPrimeNumber(string);

        Assert.assertTrue(isPrime);
    }

    @Test
    public void testIsPrimeNumberNotPrimeNumberCase() {
        StringNumber stringNumber = new StringNumber();
        String string = "256";

        boolean isPrime = stringNumber.isPrimeNumber(string);

        Assert.assertFalse(isPrime);
    }

    @Test
    public void testIsPrimeNumberEmptyStringCase() {
        StringNumber stringNumber = new StringNumber();
        String string = "";

        boolean isPrime = stringNumber.isPrimeNumber(string);

        Assert.assertFalse(isPrime);

    }

    @Test
    public void testIsPrimeNumberNullCase() {
        StringNumber stringNumber = new StringNumber();

        boolean isPrime = stringNumber.isPrimeNumber(null);

        Assert.assertFalse(isPrime);

    }

    @Test
    public void testIsPrimeNumberNegativeNumberCase() {
        StringNumber stringNumber = new StringNumber();
        String string = "-31";

        boolean isPrime = stringNumber.isPrimeNumber(string);

        Assert.assertFalse(isPrime);

    }

    @Test
    public void testIsPrimeNumberZeroCase() {
        StringNumber stringNumber = new StringNumber();
        String string = "0";

        boolean isPrime = stringNumber.isPrimeNumber(string);

        Assert.assertFalse(isPrime);

    }

    @Test
    public void testIsPrimeNumberOneCase() {
        StringNumber stringNumber = new StringNumber();
        String string = "1";

        boolean isPrime = stringNumber.isPrimeNumber(string);

        Assert.assertFalse(isPrime);

    }
}