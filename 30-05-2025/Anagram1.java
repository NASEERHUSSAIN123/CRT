import java.util.*;

public class Anagram1 {
    public static boolean anagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String args[]) {
        String s = "earth";
        String t = "heart";
        System.out.println(anagram(s, t));
    }
}