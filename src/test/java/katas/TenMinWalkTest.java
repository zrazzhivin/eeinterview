package katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class TenMinWalkTest {

    @Test
    public void testKataName() {
        assertEquals("https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java", TenMinWalk.getKataName());
    }

    @Test
    public void testIsValid() {
        assertTrue(TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        assertFalse(TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        assertFalse(TenMinWalk.isValid(new char[]{'w'}));
        assertFalse(TenMinWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}
