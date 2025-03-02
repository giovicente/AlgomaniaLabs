package com.giovicente.verify.upper.initial.tests;

import com.giovicente.verify.upper.initial.VerifyUpperInitial;
import org.junit.Assert;
import org.junit.Test;

public class VerifyUpperInitialTest {

    @Test
    public void shouldReturnTrueUpperCaseVerification() {
        String word = "Giovanni";
        Assert.assertTrue(VerifyUpperInitial.verify(word));
    }

    @Test
    public void shouldReturnFalseUpperCaseVerification() {
        String word = "giovanni";
        Assert.assertFalse(VerifyUpperInitial.verify(word));
    }
}
