package com.giovicente.basic.search.tests;

import com.giovicente.basic.search.Elements;
import com.giovicente.basic.search.LinearSearch;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class LinearSearchTest {

    private static List<Integer> elements;
    private static LinearSearch ls;

    @BeforeClass
    public static void setUp() {
        elements = Elements.returnElements();
        ls = new LinearSearch();
    }

    @Test
    public void shouldFindNumber() {
        int desiredNumber = 15000000;
        Assert.assertTrue(ls.searchDesiredElement(desiredNumber, elements));
    }

    @Test
    public void shouldNotFindNumber() {
        int desiredNumber = 15000002;
        Assert.assertFalse(ls.searchDesiredElement(desiredNumber, elements));
    }
}
