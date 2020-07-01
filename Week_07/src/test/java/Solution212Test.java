import org.junit.Test;

import static org.junit.Assert.*;

public class Solution212Test {

    @Test
    public void findWords() {
        Solution212 solution212 = new Solution212();
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}};

        String[] words = {"oath", "pea", "eat", "rain"};

        System.out.println(solution212.findWords(board, words));

        board = new char[][]{
                {'a'},{'a'}
        };

        words = new String[]{"a"};

        System.out.println(solution212.findWords(board, words));
    }
}