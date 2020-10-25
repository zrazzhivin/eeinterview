package katas;

import java.util.Arrays;

public class WhichAreIn {

    private static final String kataName = "https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java";

    public static String getKataName() {
        return kataName;
    }

    public static String[] inArray(String[] array1, String[] array2) {
        String collect = String.join("", array2);
        return Arrays.stream(array1).filter(collect::contains).sorted().toArray(String[]::new);
    }
}
