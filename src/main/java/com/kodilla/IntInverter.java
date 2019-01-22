package com.kodilla;

public class IntInverter {
    public int invert(int number) {
        String numberString = String.valueOf(number);
        String invertedString = "";
        for (int i = numberString.length() - 1; i >= 0; i--) {
            invertedString = invertedString + numberString.charAt(i);
        }
        return Integer.parseInt(invertedString);
    }

    public int invertWithInt(int number) {
        int result = 0;
        while (number != 0) {
            result *= 10;
            result += number % 10;
            number /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        IntInverter intInverter = new IntInverter();
        long start = System.nanoTime();
        int number = intInverter.invert(34567);
        long end = System.nanoTime();
        System.out.println(number);
        System.out.println("Time: " + (end - start));

        start = System.nanoTime();
        number = intInverter.invertWithInt(34567);
        end = System.nanoTime();
        System.out.println(number);
        System.out.println("Time: " + (end - start));

    }

}
