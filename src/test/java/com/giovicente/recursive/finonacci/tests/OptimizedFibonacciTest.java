package com.giovicente.recursive.finonacci.tests;

import com.giovicente.recursive.fibonacci.OptimizedFibonacci;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class OptimizedFibonacciTest {
    private static OptimizedFibonacci optimizedFibonacci;

    @BeforeClass
    public static void setUp() {
        optimizedFibonacci = new OptimizedFibonacci();
    }

    @Test
    public void shouldReturnSixthNumberOfSequence() {
        int n = 6;
        long expected = 8;

        Assert.assertEquals(expected, optimizedFibonacci.fibonacci(n));
    }

    @Test
    public void shouldReturnNinthNumberOfSequence() {
        int n = 9;
        long expected = 34;

        Assert.assertEquals(expected, optimizedFibonacci.fibonacci(n));
    }

    @Test
    public void shouldReturnEighteenthNumberOfSequence() {
        int n = 18;
        long expected = 2584;

        Assert.assertEquals(expected, optimizedFibonacci.fibonacci(n));
    }
}
