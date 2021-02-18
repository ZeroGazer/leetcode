package q0066;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> d = new ArrayList<>(digits.length);
        for (int i = 0; i < digits.length; i++) {
            d.add(0);
        }
        int a = 1;
        for (int i = digits.length - 1; i > -1; i--) {
            int b = digits[i] + a;
            d.set(i, b % 10);
            a = b / 10;
        }
        if (a == 1) {
            d.add(0, 1);
        }
        return d.stream().mapToInt(Integer::intValue).toArray();
    }
}
