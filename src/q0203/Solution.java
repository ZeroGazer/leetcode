package q0203;

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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null) {
            if (head.val == val) {
                head = head.next;
            } else {
                break;
            }
        }

        if (head == null) {
            return null;
        }

        ListNode newHead = new ListNode(head.val);
        ListNode pointer = head.next;
        ListNode newPointer = newHead;

        while (pointer != null) {
            if (pointer.val != val) {
                newPointer.next = new ListNode(pointer.val);
                newPointer = newPointer.next;
            }
            pointer = pointer.next;
        }


        return newHead;
    }
}
