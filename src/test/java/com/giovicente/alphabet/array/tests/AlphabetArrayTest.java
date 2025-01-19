package com.giovicente.alphabet.array.tests;

import com.giovicente.alphabet.array.AlphabetArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class AlphabetArrayTest {

    @Test
    public void shouldReturnCorrectAlphabetArray() {
        int numberOfLetters = 7;

        List<Character> expected = new LinkedList<>();
        expected.add('A');
        expected.add('B');
        expected.add('C');
        expected.add('D');
        expected.add('E');
        expected.add('F');
        expected.add('G');

        List<Character> actual = AlphabetArray.returnAlphabetLetters(numberOfLetters);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyAlphabetArray() {
        int numberOfLetters = 0;

        List<Character> expected = new LinkedList<>();
        List<Character> actual = AlphabetArray.returnAlphabetLetters(numberOfLetters);

        Assert.assertEquals(expected, actual);
    }
}
