package com.kienast.testing;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private Utilities util;
    private String input;
    private String expected;

    public UtilitiesTestParameterized(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setup() {
        util = new Utilities();
        System.out.println("Running a test...");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"},
        });
    }

    @Test
    public void removePairs() {
        TestCase.assertEquals(expected, util.removePairs(input));
    }

}
