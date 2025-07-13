package com.giovicente.human.readable.time;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanReadableTimeTest {

    @Test
    public void makeReadable_ShouldReturnCorrectHumanReadableTime() {
        assertEquals("makeReadable(0)", "00:00:00", HumanReadableTime.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", HumanReadableTime.makeReadable(5));
        assertEquals("makeReadable(122)", "00:02:02", HumanReadableTime.makeReadable(122));
        assertEquals("makeReadable(60)", "00:01:00", HumanReadableTime.makeReadable(60));
        assertEquals("makeReadable(86399)", "23:59:59", HumanReadableTime.makeReadable(86399));
        assertEquals("makeReadable(359999)", "99:59:59", HumanReadableTime.makeReadable(359999));
        assertEquals("makeReadable(171212)", "47:33:32", HumanReadableTime.makeReadable(171212));
    }

    @Test
    public void makeReadable_ShouldReturnInvalidInputMessage() {
        assertEquals("makeReadable(-1)", "Invalid Input", HumanReadableTime.makeReadable(-1));
        assertEquals("makeReadable(360000)", "Invalid Input", HumanReadableTime.makeReadable(360000));
    }
}
