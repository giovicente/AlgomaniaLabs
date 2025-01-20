package com.giovicente.alphabet.array;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlphabetArray {

    public static void main(String[] args) {
        System.out.println(returnAlphabetLetters((26)));
    }

    /**
     * We are using {@code LinkedList} because it is more efficient for insertions and deletions
     * than for element lookups.
     *
     * <p>In this case, the goal is to perform insertions and then print the elements sequentially,
     * making {@code LinkedList} more suitable than {@code ArrayList}. The {@code ArrayList} relies
     * on an underlying array, which requires resizing and copying the array whenever an insertion
     * or deletion occurs.
     *
     * <p>The {@code LinkedList}, on the other hand, uses a doubly linked list under the hood.
     * It rearranges the pointers of the nodes instead of resizing arrays, making it more efficient
     * in scenarios where insertions are more frequent than lookups.
     *
     * <p>Conversely, {@code ArrayList} is significantly more efficient for searches because it can
     * directly access the index of the item being searched. In contrast, {@code LinkedList} must
     * traverse the nodes one by one to find the desired element.
     *
     * <p>Reference video for further details:
     * <a href="https://www.youtube.com/watch?v=5dscMs2hnDI">https://www.youtube.com/watch?v=5dscMs2hnDI</a>
     */
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
