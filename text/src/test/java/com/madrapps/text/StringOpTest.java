package com.madrapps.text;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringOpTest {

    @Test
    public void testEndsWith() {
        final StringOp stringOp = new StringOp();
        final boolean actual = stringOp.endsWith("something", "thing");
        assertTrue(actual);
    }

    @Test
    public void testStartsWith() {
        final StringOp stringOp = new StringOp();
        final boolean actual = stringOp.startsWith("something", "thing");
        assertFalse(actual);
    }

    @Test
    public void testBeginWith() {
        final StringOp stringOp = new StringOp();
        final boolean actual = stringOp.beginWith("something", "thing");
        assertFalse(actual);
    }
}
