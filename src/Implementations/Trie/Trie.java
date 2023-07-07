package Implementations.Trie;

//Introduction
//1.Use to retrieve store data fastly
//2. Use in auto suggestion in google search

//                root -> h -> e -> y
public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    private class TrieNode {
        private TrieNode[] children;
        private boolean isWord;

        public TrieNode() {
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }

    public void insert(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Illegal Argument");
        }
        word = word.toLowerCase();
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';

            if (current.children[index] == null) {
                TrieNode node = new TrieNode();
                current.children[index] = node;
                current = node;
            } else {
                current = current.children[index];
            }
        }
        current.isWord = true;
    }

    public boolean search(String key) {
        key = key.toLowerCase();
        TrieNode current = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (current.children[index] == null) {
                return false;
            }
            if (i == key.length() - 1 && current.children[index].isWord == false) {
                return false;
            }

            current = current.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("Hey");
        trie.insert("bye");

        trie.insert("why");
        trie.insert("my");
        System.out.println(trie.search("hey"));
        System.out.println(trie.search("bye"));

    }
}
