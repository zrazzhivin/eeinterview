package katas;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class WhichAreInTest {

    @Test
    public void testKataName() {
        assertEquals("https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java", WhichAreIn.getKataName());
    }

    @Test
    public void testInArray1() {
        String[] param1 = new String[]{ "arp", "live", "strong" };
        String[] param2 = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] expectedResult = new String[] { "arp", "live", "strong" };

        assertArrayEquals(expectedResult, WhichAreIn.inArray(param1, param2));
    }

    @Test
    public void testInArray2() {
        String[] param1 = new String[]{ "tarp", "mice", "bull" };
        String[] param2 = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] expectedResult = new String[] { };

        assertArrayEquals(expectedResult, WhichAreIn.inArray(param1, param2));
    }

    @Test
    public void testInArray3() {
        String[] param1 = new String[]{ "sit", "bull", "strong" };
        String[] param2 = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] expectedResult = new String[] { "strong" };

        assertArrayEquals(expectedResult, WhichAreIn.inArray(param1, param2));
    }
}
