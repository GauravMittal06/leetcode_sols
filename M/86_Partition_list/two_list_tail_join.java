class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode d1=new ListNode(0);
        d1.next=head;
        ListNode prev=d1;
        ListNode curr=head;
        ListNode d2=new ListNode(0);
        ListNode pointer=d2;

        while(curr!=null)
        {
            if(curr.val<x)
            {
                curr=curr.next;
                prev=prev.next;
            }
            else
            {
                prev.next=curr.next;
                curr.next=null;
                pointer.next=curr;
                pointer=pointer.next;
                curr=prev.next;
            }
        }
        prev.next=d2.next;
        d2.next=null;
        return d1.next;
    }
}
