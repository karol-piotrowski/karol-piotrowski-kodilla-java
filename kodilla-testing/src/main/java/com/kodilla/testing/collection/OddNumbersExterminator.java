package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbersOnly = new ArrayList<Integer>();
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                evenNumbersOnly.add(i);
            }
        }

        return evenNumbersOnly;
    }

}
