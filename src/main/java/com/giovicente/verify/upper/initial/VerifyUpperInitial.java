package com.giovicente.verify.upper.initial;

public class VerifyUpperInitial {

    private VerifyUpperInitial() {
        throw new IllegalStateException("This class can't be instantiated");
    }

    public static boolean verify(String word) {
        final String UPPER_CASE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
        return UPPER_CASE_ALPHABET.contains(String.valueOf(word.charAt(0)));
    }
}
