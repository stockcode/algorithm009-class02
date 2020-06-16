import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList == null || !wordList.contains(endWord)) return 0;

        boolean[] visited = new boolean[wordList.size()];
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;

            for (int j = 0; j < size; j++) {
                String str = queue.poll();

                for (int i = 0; i < wordList.size(); i++) {
                    if (visited[i]) continue;

                    if (!canConvert(str, wordList.get(i))) continue;

                    if (endWord.equals(wordList.get(i))) return depth+1;

                    visited[i] = true;
                    queue.add(wordList.get(i));
                }
            }
        }

        return 0;
    }

    private boolean canConvert(String str, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (str.charAt(i) != s.charAt(i)) {
                count++;
                if (count > 1) return false;
            }
        }

        return count == 1;
    }
}