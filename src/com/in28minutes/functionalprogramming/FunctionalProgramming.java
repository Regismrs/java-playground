package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
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

        // 3. Create a new list with the triple of each number
        System.out.println("\nTriple of numbers:");
        List<Number> numbers = IntStream.range(1, 11).map(n -> n * 3).boxed().collect(Collectors.toList());
        System.out.println(numbers);

        // 4. Refactor exercise 1 using reference methods
        System.out.println("\nEven Squares, using reference methods:");
        IntStream.range(1, 11)
                .filter(FunctionalProgramming::isEven)
                .map(FunctionalProgramming::numberSquare)
                .forEach(System.out::println);
    }

    public static boolean isEven(Integer number) {
        return number%2 == 0;
    }

    public static Integer numberSquare(Integer number) {
        return number * number;
    }
}
