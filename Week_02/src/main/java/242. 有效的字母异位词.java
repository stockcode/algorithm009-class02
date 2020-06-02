import java.util.Arrays;

class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sa = s.toCharArray();
        char[] st = t.toCharArray();

        Arrays.sort(sa);
        Arrays.sort(st);

        return Arrays.equals(sa, st);
    }
}