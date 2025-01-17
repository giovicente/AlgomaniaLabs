package com.giovicente.alphabet.encrypter.tests;

import com.giovicente.alphabet.encrypter.BinarySearchEncrypter;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BinarySearchEncrypterTest {
    private static BinarySearchEncrypter encrypter;

    @BeforeClass
    public static void setUp() {
        encrypter = new BinarySearchEncrypter();
    }

    @Test
    public void shouldReturnCorrectEncryptedString() {
        String expectedEncryptedReturn = "615152118";
        String actualEncryptedReturn = encrypter.encrypt("Foo Bar");

        Assert.assertEquals(expectedEncryptedReturn, actualEncryptedReturn);
    }

    @Test
    public void shouldReturnCorrectEncryptedAAAString() {
        String expectedEncryptedReturn = "111";
        String actualEncryptedReturn = encrypter.encrypt("AAA");

        Assert.assertEquals(expectedEncryptedReturn, actualEncryptedReturn);
    }

    @Test
    public void shouldReturnCorrectEncryptedZZZString() {
        String expectedEncryptedReturn = "262626";
        String actualEncryptedReturn = encrypter.encrypt("ZZZ");

        Assert.assertEquals(expectedEncryptedReturn, actualEncryptedReturn);
    }

    @Test
    public void shouldReturnEmptyString() {
        String expectedEncryptedReturn = "";
        String actualEncryptedReturn = encrypter.encrypt("      ");

        Assert.assertEquals(expectedEncryptedReturn, actualEncryptedReturn);
    }

    @Test
    public void shouldReturnCorrectEncryptedLongString() {
        String expectedEncryptedReturn =
                "791522114149791522114149791522114149791522114149791522114149791522114149791522114149791522114149791522114149791522114149";
        String actualEncryptedReturn =
                encrypter.encrypt(
                "GIOVANNIGIOVANNIGIOVANNIGIOVANNIGIOVANNIGIOVANNIGIOVANNIGIOVANNIGIOVANNIGIOVANNI"
        );

        Assert.assertEquals(expectedEncryptedReturn, actualEncryptedReturn);
    }
}
