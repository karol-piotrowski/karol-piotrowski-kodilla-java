package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String textToDecorate = "The quick brown fox jumps over the lazy dog.";

        System.out.println("Decorating the following text: " + textToDecorate);
        System.out.println(poemBeautifier.beautify(textToDecorate, str -> "ABC" + str + "ABC"));
        System.out.println(poemBeautifier.beautify(textToDecorate, str -> str.toUpperCase()));
        System.out.println(poemBeautifier.beautify(textToDecorate, str -> {
            String resultString = "";
            for (int i = 0; i < str.length(); i++) {
                resultString = i % 2 == 0 ? resultString + str.substring(i, i + 1).toUpperCase() : resultString + str.substring(i, i + 1).toLowerCase();
            }
            return resultString;
        }));
        System.out.println(poemBeautifier.beautify(textToDecorate, str -> new StringBuilder(str).reverse().toString()));
    }
}
