package com.example.counttext;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utils.TextUtils;

public class TextUtilsTest {
    @Test
    public void getCharsCount_Given_EmptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_Given_SpacesString_Result_Four() {
        String givenString = "    ";
        int expectedValue = 4;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_Given_NormalString_Result_Fifteen() {
        String givenString = "Testing program";
        int expectedValue = 15;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_Given_NumberString_Result_Ten() {
        String givenString = "0123456789";
        int expectedValue = 10;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_Given_SymbolString_Result_Five() {
        String givenString = "/*-+.";
        int expectedValue = 5;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test (expected = NullPointerException.class)
    public void getCharsCount_Given_NullString_Result_Exception() {
        String givenString = null;
        int actualValue = TextUtils.getCharsCount(givenString);
    }

    @Test
    public void getWordsCount_Given_EmptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_SpacesString_Result_Four() {
        String givenString = "    ";
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_NormalString_Result_Fifteen() {
        String givenString = "Testing program";
        int expectedValue = 2;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_NumberString_Result_Ten() {
        String givenString = "0123456789";
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_SymbolString_Result_Five() {
        String givenString = "/*-+.";
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test (expected = NullPointerException.class)
    public void getWordsCount_Given_NullString_Result_Exception() {
        String givenString = null;
        int actualValue = TextUtils.getWordsCount(givenString);
    }
}
