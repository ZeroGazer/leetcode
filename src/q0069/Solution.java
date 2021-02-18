package q0069;

class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int upper = x;
        int lower = 0;

        while (lower <= upper) {
            int mid = (upper - lower) / 2 + lower;
            if (mid < x / mid) {
                lower = mid + 1;
            } else if (mid > x / mid) {
                upper = mid - 1;
            } else {
                return mid;
            }
        }
        return --lower;
    }
}
