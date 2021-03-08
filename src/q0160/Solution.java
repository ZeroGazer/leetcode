package q0160;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0, lengthB = 0;

        ListNode pointerA = headA;
        ListNode pointerB = headB;
        while (pointerA != null) {
            lengthA++;
            pointerA = pointerA.next;
        }
        while (pointerB != null) {
            lengthB++;
            pointerB = pointerB.next;
        }

        pointerA = headA;
        pointerB = headB;
        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                pointerA = pointerA.next;
            }
        }
        if (lengthB > lengthA) {
            for (int i = 0; i < lengthB - lengthA; i++) {
                pointerB = pointerB.next;
            }
        }

        while (pointerA != null) {
            if (pointerA == pointerB) {
                return pointerA;
            } else {
                pointerA = pointerA.next;
                pointerB = pointerB.next;
            }
        }

        return null;
    }
}
