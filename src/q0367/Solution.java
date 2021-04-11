package q0367;

class Solution {
    public boolean isPerfectSquare(int num) {
        int r = 1;
        while (r * r <= num) {
            r *= 2;
        }
        int l = r / 2;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (m * m == num) {
                return true;
            } else if (m * m > num) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
}
