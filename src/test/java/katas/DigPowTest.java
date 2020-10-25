package katas;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class DigPowTest {

    @Test
    public void testKataName() {
        assertEquals("https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java", DigPow.getKataName());
    }

    @Test
    public void testDigPow() {
        assertEquals(1, DigPow.digPow(89, 1));
        assertEquals(-1, DigPow.digPow(92, 1));
        assertEquals(51, DigPow.digPow(46288, 3));
    }
}
