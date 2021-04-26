package q0013;

import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('M', 1000, 'D', 500, 'C', 100, 'L', 50, 'X', 10, 'V', 5, 'I', 1);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i != s.length() - 1 && map.get(c) < map.get(s.charAt(i + 1))) {
                sum -= map.get(c);
            } else {
                sum += map.get(c);
            }
        }
        return sum;
    }
}
