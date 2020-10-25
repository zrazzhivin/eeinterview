package katas;

public class TenMinWalk {

    private static final String kataName = "https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java";

    public static String getKataName() {
        return kataName;
    }

    public static boolean isValid(char[] walk) {
        int horizontal = 0, vertical = 0;
        for (char c : walk) {
            horizontal += c == 'e' ? 1 : (c == 'w' ? -1 : 0);
            vertical += c == 'n' ? 1 : (c == 's' ? -1 : 0);
        }
        return (walk.length == 10 && horizontal == 0 && vertical == 0);
    }
}
