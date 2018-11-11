package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbersOnly = new ArrayList<Integer>();
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                evenNumbersOnly.add(i);
            }
        }

        return evenNumbersOnly;
    }

}
