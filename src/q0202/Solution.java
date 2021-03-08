package q0202;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isHappy(int n) {
        Map<Integer, Boolean> visited = new HashMap<>();

        while (n > 3) {
            if (visited.containsKey(n)) {
                return false;
            } else {
                visited.put(n, true);
            }

            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
        }

        return n == 1;
    }
}
