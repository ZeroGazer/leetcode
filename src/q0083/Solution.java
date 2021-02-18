package q0083;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = null;
        ListNode pointer = null;
        Integer currentValue = null;

        while (head != null) {
            if (currentValue == null || currentValue != head.val) {
                if (pointer == null) {
                    pointer = new ListNode(head.val);
                    result = pointer;
                } else {
                    pointer.next = new ListNode(head.val);
                    pointer = pointer.next;
                }
                currentValue = head.val;
            }
            head = head.next;
        }

        return result;
    }
}
