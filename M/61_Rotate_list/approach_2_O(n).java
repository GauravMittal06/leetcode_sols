class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
        {
            return head;
        }
        ListNode tail=head;
        int c=1;
        while(tail.next!=null)
        {
            tail=tail.next;
            c++;
        }
        tail.next=head; //formed the circular list
        k=k%c; //effective number of rotations
        int target_tail = c-k-1;
        ListNode newTail = head; //initialized the new tail as head, and will traverse it to the 'target_tail' index

        for(int i=0;i<target_tail;i++)
        {
            newTail=newTail.next;
        } //newTail reached the desired location
        ListNode newHead = newTail.next; //the next index to 'newTail' will be the head
        newTail.next=null; //break the next pointer of the newTail to make it a 'Tail'
        return newHead;
    }
}
