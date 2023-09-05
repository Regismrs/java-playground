package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming {
    public static void main(String[] args) {
        // 1. Print square of first 10 numbers
        System.out.println("\nOdd Squares:");
        IntStream.range(1, 10)
                .filter(n -> n%2 == 1)
                .map(n -> n * n)
                .forEach(n -> System.out.println(n));

        // 2. Convert all words to lowercase and print
        System.out.println("\nLowerCase Words:");
        List<String> words = List.of("Alpha", "Beta", "Cat");
        words.stream()
                .map(word -> word.toLowerCase())
                .forEach(word -> System.out.println(word));
    }
}
