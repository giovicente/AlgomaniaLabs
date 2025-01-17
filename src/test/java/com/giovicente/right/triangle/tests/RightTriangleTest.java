package com.giovicente.right.triangle.tests;

import com.giovicente.right.triangle.RightTriangle;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RightTriangleTest {

    @Test
    public void shouldReturnCorrectRightTriangleOutput() {
        int maxNumberOfAsterisks = 32000;
        List<String> result = RightTriangle.generateTriangle(maxNumberOfAsterisks);

        assertEquals(maxNumberOfAsterisks, result.size());

        assertEquals("* ", result.get(0));
        assertEquals("* * ", result.get(1));
        assertEquals("* * * ", result.get(2));
        assertEquals("* * * * ", result.get(3));
        assertEquals("* * * * * ", result.get(4));
    }

    @Test
    public void shouldReturnEmptyTriangle() {
        int maxNumberOfAsterisks = 0;
        assertTrue(RightTriangle.generateTriangle(maxNumberOfAsterisks).isEmpty());
    }
}
