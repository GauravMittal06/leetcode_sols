class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode standHead = new ListNode(0);
        ListNode curr = standHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            // l1
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // l2
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return standHead.next;
    }
}
