package com.giovicente.right.triangle;

import java.util.LinkedList;
import java.util.List;

public class RightTriangle {

    public static void main(String[] args) {
        final int MAX_NUMBER_OF_ASTERISKS = 21;

        List<String> triangle = generateTriangle(MAX_NUMBER_OF_ASTERISKS);
        triangle.forEach(System.out::println);
    }

    public static List<String> generateTriangle(int maxNumberOfAsterisks) {
        List<String> triangle = new LinkedList<>();

        for (int i = 0; i < maxNumberOfAsterisks; i++) {
            triangle.add(printAsterisks(i));
        }

        return triangle;
    }

    static String printAsterisks(int numberOfAsterisks) {
        /*
        * An alternative method to implement a function in a single line.
        * return String.valueOf("* ".repeat(Math.max(0, (numberOfAsterisks + 1))));
        * */

        StringBuilder triangleLine = new StringBuilder();

        for (int i = 0; i < numberOfAsterisks + 1; i++) {
            triangleLine.append("* ");
        }

        return String.valueOf(triangleLine);
    }
}
