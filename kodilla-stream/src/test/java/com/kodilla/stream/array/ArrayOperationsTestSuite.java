package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
//        Given
        int[] numbers = {1, 5, 23, 75, 2, 65, 23, 54, 37};
//        When
        double result = ArrayOperations.getAverage(numbers);
//        Then
        Assert.assertEquals(31.667, result, 0.001);
    }
}
