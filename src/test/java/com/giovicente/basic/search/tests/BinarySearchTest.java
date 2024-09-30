package com.giovicente.basic.search.tests;

import com.giovicente.basic.search.BinarySearch;
import com.giovicente.basic.search.Elements;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class BinarySearchTest {
    private static List<Integer> elements;
    private static BinarySearch bs;

    @BeforeClass
    public static void setUp() {
        elements = Elements.returnElements();
        bs = new BinarySearch();
    }

    @Test
    public void shouldFindNumber() {
        int desiredNumber = 15000000;
        Assert.assertTrue(bs.searchDesiredElement(desiredNumber, elements));
    }

    @Test
    public void shouldNotFindNumber() {
        int desiredNumber = 15000002;
        Assert.assertFalse(bs.searchDesiredElement(desiredNumber, elements));
    }
}
