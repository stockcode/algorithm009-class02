class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
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
}