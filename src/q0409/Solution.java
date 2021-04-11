package q0409;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int odd = 0;
        int sum = 0;

        for (int value: map.values()) {
            if (value % 2 == 0) {
                sum += value;
            } else {
                sum += value - 1;
                odd = 1;
            }
        }

        return sum + odd;
    }
}
