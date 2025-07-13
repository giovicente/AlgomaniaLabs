package com.giovicente.uppercase.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseList {

    public static void main(String[] args) {
        String word = "EUreKa AnD ZuuL Are TOOLs of The Netflix OSS STacK";

        /*
        * Expected Outputs
        * 1. [E, U, K, A, D, Z, L, A, T, O, O, L, T, N, O, S, S, S, T, K]
        * 2. [A, A, D, E, K, K, L, L, N, O, O, O, S, S, S, T, T, T, U, Z]
        * 3. [Z, U, T, T, T, S, S, S, O, O, O, N, L, L, K, K, E, D, A, A]
        * */

        printAsterisks();

        System.out.println(verifyUpperCaseStream(word) + " -> Stream");
        System.out.println(verifyUpperCaseLoop(word) + " -> loop");

        printAsterisks();

        System.out.println(invertCharsOrder(verifyUpperCaseStream(word)) + " -> Inverted Stream");
        System.out.println(invertCharsOrder(verifyUpperCaseLoop(word)) + " -> Inverted loop");

        printAsterisks();
    }

    public static List<Character> verifyUpperCaseStream(String word) {
        return word.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> (char) c)
                .sorted() // Part 2 of the challenge, which is when I'll ask for sorting.
                .collect(Collectors.toList());
    }

    public static List<Character> verifyUpperCaseLoop(String word) {
        List<Character> upperCaseLetters = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (Character.isUpperCase(c)) {
                upperCaseLetters.add(c);
            }
        }

        Collections.sort(upperCaseLetters); // Part 2 of the challenge, which is when I'll ask for sorting.
        return upperCaseLetters;
    }

    private static List<Character> invertCharsOrder(List<Character> upperCaseLetters) {
        List<Character> invertedOrderChars = new ArrayList<>(); // Part 3 of the challenge, where I ask the person to return the characters in descending order
        for (int i = upperCaseLetters.size(); i > 0; i--) {
            invertedOrderChars.add(upperCaseLetters.get(i - 1));
        }

        return invertedOrderChars;
    }

    private static void printAsterisks() {
        final int NUMBER_OF_ASTERISKS = 40;

        for (int i = 0; i < NUMBER_OF_ASTERISKS; i++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}
