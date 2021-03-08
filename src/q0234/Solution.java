package q0234;

import java.util.Stack;

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
    public boolean isPalindrome(ListNode head) {
        int size = 0;
        ListNode pointer = head;
        while (pointer != null) {
            size++;
            pointer = pointer.next;
        }

        Stack<Integer> stack = new Stack<>();
        pointer = head;
        for (int i = 0; i < size / 2; i++) {
            stack.push(pointer.val);
            pointer = pointer.next;
        }

        if (size % 2 == 1) {
            pointer = pointer.next;
        }

        while (pointer != null) {
            if (stack.peek() == pointer.val) {
                stack.pop();
            } else {
                return false;
            }
            pointer = pointer.next;
        }

        return true;
    }
}
