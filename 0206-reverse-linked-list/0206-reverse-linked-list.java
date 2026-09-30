class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode current=head;
        ListNode prev=null,next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            }
            return prev;
        
    }
}