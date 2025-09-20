package opgave4;

public class Opgave04 {
    public static void main(String[] args) {
        System.out.println(pallidrom("ABBA"));
    }

    public static boolean pallidrom(String word) {

        char[] word1 = word.toCharArray();
        char[] dorw = new char[word1.length];

        for (int index = 0; index < dorw.length; index++) {

            dorw[index] = word1[word.length() - 1 - index];

        }

        String original = new String(word1);
        String reversed = new String(dorw);

        if (original.equals(reversed)) {

            return true;
        } else {
            return false;

        }
    }
}

