import java.util.HashMap;
import java.util.Map;

class Solution290 {
    public boolean wordPattern1(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.indexOf( pattern.charAt(i)) != indexArrayOf(words, words[i])) {
                return false;
            }
        }

        return true;
    }

    private int indexArrayOf(String[] words, String word) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) return i;
        }

        return  -1;
    }

    public boolean wordPattern2(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) return false;

        Map map = new HashMap();

        for (Integer i = 0; i < words.length; i++) {
            if (map.put(pattern.charAt(i), i) != map.put(words[i], i)) return false;
        }

        return true;
    }
}