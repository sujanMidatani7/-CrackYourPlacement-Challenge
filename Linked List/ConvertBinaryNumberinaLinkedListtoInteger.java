class Solution {
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> a=new ArrayList<>(30);
        int n=0;
        while(head!=null){
            if(head.val==1) a.add(n);
            head=head.next;
            n++;
        }
        n--;
        int out=0;
        for(int i:a){
            out+=Math.pow(2,n-i);
            // System.out.println(n);
        }
        return out;
    }
}
