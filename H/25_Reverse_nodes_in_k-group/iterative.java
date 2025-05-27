class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy, prev = dummy, next = dummy;

        // Count number of nodes in the list
        int count = 0;
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        // Loop until count < k
        while (count >= k) {
            curr = prev.next;
            next = curr.next;

            // Reverse k nodes
            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }

            // Move prev to curr
            prev = curr;
            count -= k;
        }

        return dummy.next;
    }
}
