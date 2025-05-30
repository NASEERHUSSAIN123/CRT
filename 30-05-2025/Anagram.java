public class Anagram {
    public static boolean anagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        int frequency[] = new int[26];
        if (l1 != l2) {
            return false;
        }
        for (int i = 0; i < l1; i++) {
            frequency[s.charAt(i) - 'a']++;
            frequency[s.charAt(i) - 'a']--;
        }
        for (int i : frequency) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String s = "heart";
        String t = "earth";
        System.out.println(anagram(s, t));
    }
}