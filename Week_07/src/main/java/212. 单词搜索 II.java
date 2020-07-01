import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution212 {
    private Trie trie = new Trie();
    private Set<String> list = new HashSet<String>();

    public List<String> findWords(char[][] board, String[] words) {

        for (String word: words) {
            trie.insert(word);
        }

        String word = "";

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                dfs(board, i, j, word);
            }
        }

        return new ArrayList<String>(list);
    }

    private void dfs(char[][] board, int i, int j, String word) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || board[i][j] == '#') return;

        if (board[i][j] != '#') {
            word += board[i][j];
        }
        char tmp = board[i][j];
        board[i][j] = '#';

        if (trie.search(word)) list.add(word);

        if (trie.startsWith(word)) {
            dfs(board, i, j - 1, word);
            dfs(board, i, j + 1, word);
            dfs(board, i - 1, j, word);
            dfs(board, i + 1, j, word);
        }

        board[i][j] = tmp;

    }
}