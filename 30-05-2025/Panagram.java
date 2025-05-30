import java.util.*;

public class Panagram {
    public static boolean checkPanagram(String s) {
        if (s.length() < 26) {
            return false;
        }
        int frequency[] = new int[26];
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                frequency[c - 'a']++;
            }
        }

        if (Arrays.asList(frequency).contains(0)) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String args[]) {
        String sentence = "aoehwfhidhhiudshfiuehfhhfhufgewhfggfwefihifhk";
        System.out.println(checkPanagram(sentence));
    }
}