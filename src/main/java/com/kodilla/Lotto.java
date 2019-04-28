package com.kodilla;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
    Set<Integer> myNumbers = new HashSet<>();

    public Lotto() {
        myNumbers.add(3);
        myNumbers.add(7);
        myNumbers.add(13);
        myNumbers.add(28);
        myNumbers.add(41);
        myNumbers.add(42);
    }

    public Set<Integer> getNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        while (numbers.size() < 6) {
            numbers.add(random.nextInt(49) + 1);
        }
        return numbers;
    }

    public int getGamesCount() {
        int gamesCount = 0;
        while (!myNumbers.equals(getNumbers())) {
            gamesCount++;
        }
        return gamesCount + 1;
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        System.out.println(lotto.getGamesCount());
    }

}
