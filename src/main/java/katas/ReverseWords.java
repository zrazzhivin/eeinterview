package katas;

public class ReverseWords {

    private static final String kataName = "https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java";

    public static String getKataName() {
        return kataName;
    }

    public static String reverseWords(final String original) {
        StringBuilder stringBuilder = new StringBuilder();
        int from = -1;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == ' ') {
                if (from != -1) {
                    stringBuilder.append(new StringBuilder(original.substring(from, i)).reverse());
                    from = -1;
                }
                stringBuilder.append(original.charAt(i));
            } else if (from == -1) {
                from = i;
            }
        }
        if (from != -1) {
            stringBuilder.append(new StringBuilder(original.substring(from)).reverse());
        }

        return stringBuilder.toString();
    }
}
