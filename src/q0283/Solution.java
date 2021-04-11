package q0283;

class Solution {
    public void moveZeroes(int[] nums) {
        int firstZeroAt = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (firstZeroAt > -1) {
                    nums[firstZeroAt] = nums[i];
                    nums[i] = 0;
                    firstZeroAt++;
                }
            } else {
                if (firstZeroAt == -1) {
                    firstZeroAt = i;
                }
            }
        }
    }
}
