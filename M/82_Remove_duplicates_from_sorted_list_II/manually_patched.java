class Solution { //just works (somehow)
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        if(head.next.next==null && head.next.val==head.val)
        {
            return null;
        }
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        ListNode dup=curr.next;
        while(dup.next!=null)
        {
            if(dup.val==curr.val)
            {
                while(dup.val==curr.val && dup.next!=null)
                {
                    dup=dup.next;
                }
                if(dup.next==null)
                {
                    prev.next=dup;
                    break;
                }
                prev.next=dup;
                curr=prev.next;
                dup=curr.next;
            }
            else
            {
                dup=dup.next;
                curr=curr.next;
                prev=prev.next;
            }
        }
        if(dup.next==null && dup.val==curr.val)
        {
            prev.next=null;
        }
        return dummy.next;
    }
}
