package q0007;

class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int r = x % 10;
            x = x / 10;

            if (Integer.MAX_VALUE / 10 < rev) return 0;
            else if (Integer.MAX_VALUE / 10 == rev && Integer.MAX_VALUE - r < rev * 10) return 0;
            if (Integer.MIN_VALUE / 10 > rev) return 0;
            else if (Integer.MIN_VALUE / 10 == rev && Integer.MIN_VALUE - r > rev * 10) return 0;

            rev = rev * 10 + r;
        }

        return rev;
    }
}
