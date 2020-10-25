package katas;

public class DigPow {

    private static final String kataName = "https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java";

    public static String getKataName() {
        return kataName;
    }

    public static long digPow(int n, int p) {
        long sum = 0;
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); ++i) {
            sum += (long) Math.pow(Character.digit(str.charAt(i), 10), p + i);
        }
        return sum % n == 0 ? sum / n : -1;
    }
}
