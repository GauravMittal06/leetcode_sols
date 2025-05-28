  class Solution { //this code handles all the edge cases without 'brute force'
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;

        while(curr!=null)
        {
            if(curr.next!=null && curr.val==curr.next.val) // 'curr.next!=null' is supposed to be first
            {
                while(curr.next!=null && curr.val==curr.next.val) // 'curr.next!=null' is supposed to be first
                {
                    curr=curr.next;
                }
                prev.next=curr.next;
            }
            else
            {
                prev=prev.next;
            }
            curr=curr.next;
        }
        return dummy.next;
    }
}
