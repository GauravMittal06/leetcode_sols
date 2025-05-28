class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
        {
            return head;
        }
        ListNode curr=head;
        ListNode next=curr.next;
        ListNode count=head;
        int c=1;
        while(count.next!=null)
        {
            count=count.next;
            c++;
        }
        if(k>=c)
        {
            k=k%c;
        }
        for(int i=1;i<=k;i++)
        {
            while(next.next!=null)
            {
                curr=curr.next;
                next=next.next;
            }
            curr.next=null;
            next.next=head;
            head=next;
            curr=head;
            next=next.next;
        }
        return head;
    }
}
