package q0001;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (temp.containsKey(target - nums[i])) {
                result[0] = temp.get(target - nums[i]);
                result[1] = i;
                break;
            }
            temp.put(nums[i], i);
        }
        return result;
    }
}