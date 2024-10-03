package com.giovicente.basic.search.tests;

import com.giovicente.basic.search.BinarySearchArray;
import com.giovicente.basic.search.Elements;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class BynarySearchArrayTest {
    private static List<Integer> elements;
    private static BinarySearchArray bsa;

    @BeforeClass
    public static void setUp() {
        elements = Elements.returnElements();
        bsa = new BinarySearchArray();
    }

    @Test
    public void shouldFindNumber() {
        int desiredNumber = 15000000;
        Assert.assertTrue(bsa.searchDesiredElement(desiredNumber, elements));
    }

    @Test
    public void shouldNotFindNumber() {
        int desiredNumber = 15000002;
        Assert.assertFalse(bsa.searchDesiredElement(desiredNumber, elements));
    }
}
