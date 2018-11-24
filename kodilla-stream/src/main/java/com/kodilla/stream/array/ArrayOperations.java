package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers){
        if(numbers.length == 0) {
            System.out.println("The array is empty. Could not calculate the average value.");
            return 0;
        }
        System.out.println("Elements of the array:");
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);
        System.out.println("Average value:");
        double result = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();
        System.out.println(result);
        return result;
    }
}
