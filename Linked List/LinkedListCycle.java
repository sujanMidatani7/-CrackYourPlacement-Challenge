public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode f=head,s=head;
        while(s!=null && s.next!=null){
            f=f.next;
            s=s.next.next;
            if(f==s) return true;
        }
        return false;

    }
}
