import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrieTest {

    @Test
    public void testTrie() {
        Trie trie = new Trie();

        trie.insert("apple");
        Assert.assertTrue(trie.search("apple"));   // 返回 true
        Assert.assertFalse(trie.search("app"));     // 返回 false
        Assert.assertTrue(trie.startsWith("app")); // 返回 true
        trie.insert("app");
        Assert.assertTrue(trie.search("app"));     // 返回 true

    }
}