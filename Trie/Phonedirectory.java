class Node{
    public Node[] in;
    public boolean isEnd;
    public ArrayList<Integer> index;
    public Node(){
        in = new Node[26];
        index=new ArrayList<>();
    }
}
class Trie {
    public Node start;
    public Trie() {
        start=new Node();
    }
    
    public void insert(String word,int ind) {
        Node temp=start;
        for(char i:word.toCharArray()){
            int index=i-97;
            if(temp.in[index]==null) temp.in[index]=new Node();
            temp=temp.in[index];
            temp.index.add(ind);
           
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
    
    public ArrayList<Integer> startsWith(String prefix) {
        Node temp=start;
        for(char i:prefix.toCharArray()){
            int index=i-97;
            if(temp.in[index]==null) return new ArrayList<Integer>();
            temp=temp.in[index];
        }
        return temp.index;
    }
    
}
//User function Template for Java

class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        Trie t=new Trie();
        ArrayList<ArrayList<String>> out=new ArrayList<>();
        for(int i=0;i<n;i++) t.insert(contact[i],i);
        String temp="";
        for(char i:s.toCharArray()){
            temp+=i;
            // System.out.println(temp);
            TreeSet<String> a=new TreeSet<>();
            int k=0;
            for(int j:t.startsWith(temp)){a.add(contact[j]);k++;}
            if (k==0) a.add("0");
            ArrayList<String> p=new ArrayList<>(a);
            out.add(p);
            
        }
        return out;
        
    }
}
