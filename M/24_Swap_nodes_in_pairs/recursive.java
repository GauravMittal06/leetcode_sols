class Solution {
    public ListNode swapPairs(ListNode head) {
    //base case
    if(head==null || head.next==null)
    {
        return head;
    }    

    ListNode first=head;
    ListNode second=head.next;

    // first.next becomes second.next (next pointer of 1-->3)
    first.next=swapPairs(second.next);

    // while unstacking (from end node) (next pointer of 2-->1)
    second.next=first;

    //return the second (as unstacking occurs from end and goes till second)
    return second;

    }
}
