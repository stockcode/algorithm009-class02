import java.util.Arrays;

class Solution242 {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return new String(s1).equals(new String(t1));
    }
}