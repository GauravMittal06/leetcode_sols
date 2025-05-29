class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode prev1=d;
        for(int i=1;i<=left-1;i++)
        {
            prev1=prev1.next;
        }
        ListNode prev=prev1.next;
        ListNode curr=prev1.next;
        ListNode next=curr.next;
        head=prev1.next;
        for(int i=0;i<(right-left)+1;i++)
        {
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next==null)
                break;
            next=next.next;
        }
        prev1.next=prev;
        head.next=curr;
        return d.next;
    }
}
