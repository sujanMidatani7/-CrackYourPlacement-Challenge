class Node{
    public Node[] in;
    public boolean isEnd;
    public Node(){
        in = new Node[26];
    }
}
class Trie {
    public Node start;
    public Trie() {
        start=new Node();
    }
    
    public void insert(String word) {
        Node temp=start;
        for(char i:word.toCharArray()){
            int index=i-97;
            if(temp.in[index]==null) temp.in[index]=new Node();
            temp=temp.in[index];
           
        }
        temp.isEnd=true;
    }
    
    public boolean search(String word) {
        Node temp=start;
        for(char i:word.toCharArray()){
            int index=i-97;
            if(temp.in[index]==null) return false;
            temp=temp.in[index];
        }
        return temp.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Node temp=start;
        for(char i:prefix.toCharArray()){
            int index=i-97;
            if(temp.in[index]==null) return false;
            temp=temp.in[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
