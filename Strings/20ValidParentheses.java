class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> m=new HashMap<>();
        m.put('[',']');
        m.put('{','}');
        m.put('(',')');
        int k=0;
        for(char i:s.toCharArray()){
            if(i=='(' || i=='['||i=='{'){
                k++;
            stack.push(m.get(i));
            }
            else{
                if(k==0) return false;
                if(stack.pop()!=i){
                     return false;
                }
                k--;
            }
        }
        if(k>0)return false;
        return true;
    }
}
