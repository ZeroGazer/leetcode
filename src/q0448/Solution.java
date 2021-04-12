package q0448;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] booleans = new boolean[nums.length];

        for (int i = 0; i < booleans.length; i++) {
            booleans[i] = false;
        }

        for (int i = 0; i < nums.length; i++) {
            booleans[nums[i] - 1] = true;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < booleans.length; i++) {
            if (!booleans[i]) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
