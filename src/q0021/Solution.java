package q0021;

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode head = null;
        ListNode last = null;
        while (l1 != null && l2 != null) {
            ListNode n = null;
            if (l1.val < l2.val) {
                n = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                n = new ListNode(l2.val);
                l2 = l2.next;
            }
            if (head == null) {
                head = n;
            }
            if (last != null) {
                last.next = n;
            }
            last = n;
        }
        if (l1 != null) {
            last.next = l1;
        }
        if (l2 != null) {
            last.next = l2;
        }
        return head;
    }
}