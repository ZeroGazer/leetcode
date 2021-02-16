package q0020;

import java.util.Map;
import java.util.Stack;

class Solution {

    private Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (map.containsKey(c)) {
                    if (stack.peek() == map.get(c)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }
}
