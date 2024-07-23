class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val) head=head.next;
        if(head==null) return head;
        ListNode prev=head,next=head.next;
        while(next!=null){
            if(next.val==val)
            { prev.next=next.next;next=prev.next;
            }
            else{
                prev=next;
                next=next.next;
            }
        }
        return head;
    }
}
