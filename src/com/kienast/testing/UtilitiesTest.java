package com.kienast.testing;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @Before
    public void setup() {
        util = new Utilities();
        System.out.println("Running a test...");
    }

    @Test
    public void everyNthChar() {
        assertArrayEquals("hello".toCharArray(), util.everyNthChar("hello".toCharArray(), 10));
        assertArrayEquals("el".toCharArray(), util.everyNthChar("hello".toCharArray(), 2));
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
        assertNull("Did not get null returned when source null", util.removePairs(null));
    }

    @Test
    public void convert() {
        assertEquals(300, util.convert(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void convert_with_zero_divisor() {
        util.convert(10, 0);
        fail("Should have thrown arithmetic exception");
    }

    @Test
    public void nullIfOddLength() {
        assertEquals("even", util.nullIfOddLength("even"));
        assertNull("Did not get null returned when string length odd", util.nullIfOddLength("odd"));
    }
}