class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=null; //the new head of the reversed list should point towards 'null' (temporarily)
        ListNode curr=head;
        ListNode node=head;
        //check whether there are 'k' nodes from 'curr'
        for(int i=1;i<=k;i++)
        {
            if(node==null)
            {
                return head; //returns the 'head' if there are not enough 'k' nodes
            }
            node=node.next;
        }

        //recursion
        ListNode newHead = reverseKGroup(node,k);

        //reversing the 1st 'k' nodes
        for(int i=1;i<=k;i++)
        {
            ListNode nextNode=curr.next;
            curr.next=prev;

            prev=curr;
            curr=nextNode;
            //after reversing:- PREV = is the new head
        }
        head.next = newHead;   
        return prev;          

    }
}
