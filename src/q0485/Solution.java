package q0485;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1 && arr[i - 1] != 0) {
                arr[i] = nums[i] + arr[i - 1];
            } else {
                arr[i] = nums[i];
            }
            max = Math.max(max, arr[i]);
        }

        return max;
    }
}
