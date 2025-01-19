package com.giovicente.right.triangle;

import java.util.LinkedList;
import java.util.List;

public class OptimizedRightTriangle {

    public static void main(String[] args) {
        final int MAX_NUMBER_OF_ASTERISKS = 6;

        List<String> triangle = generateTriangle(MAX_NUMBER_OF_ASTERISKS);
        triangle.forEach(System.out::println);
    }

    public static List<String> generateTriangle(int maxNumberOfAsterisks) {
        List<String> triangle = new LinkedList<>();

        for (int i = 0; i < maxNumberOfAsterisks; i++) {
            triangle.add("* ".repeat(i + 1).trim());
        }

        return triangle;
    }
}
