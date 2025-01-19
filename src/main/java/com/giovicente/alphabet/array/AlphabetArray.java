package com.giovicente.alphabet.array;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlphabetArray {

    public static void main(String[] args) {
        System.out.println(returnAlphabetLetters((26)));
    }

    public static List<Character> returnAlphabetLetters(int numberOfLetters) {
        final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<Character> alphabetLetters = new LinkedList<>();

        Logger logger = Logger.getLogger(AlphabetArray.class.getName());

        if (numberOfLetters < 1 || numberOfLetters > 26) {
            logger.log(Level.SEVERE, "Invalid Input! It must be a number between 1 and 26!");
        } else {
            for (int i = 0; i < numberOfLetters; i++) {
            alphabetLetters.add(ALPHABET.charAt(i));
            }
        }

        return alphabetLetters;
    }
}
