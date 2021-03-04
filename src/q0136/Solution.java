package q0136;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
            sum += num;
        }

        int sum2 = set.stream().reduce(0, (a, b) -> a + b) * 2;

        return sum2 - sum;
    }
}
