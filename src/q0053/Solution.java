package q0053;

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int maxIncludeCurrentElement = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxIncludeCurrentElement = Math.max(maxIncludeCurrentElement + nums[i], nums[i]);
            max = Math.max(max, maxIncludeCurrentElement);
        }

        return max;
    }
}
