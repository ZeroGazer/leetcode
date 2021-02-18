package q0066;

class Solution {
    public int[] plusOne(int[] digits) {
        int sum = digits[digits.length - 1] + 1;

        if (sum == 10) {
            int a = 1;
            for (int i = digits.length - 1; i > -1; i--) {
                int b = digits[i] + a;
                digits[i] = b % 10;
                a = b / 10;
                if (a == 0) {
                    return digits;
                }
            }

            int[] d = new int[digits.length + 1];
            d[0] = a;
            for (int i = 0; i < digits.length; i++) {
                d[i + 1] = digits[i];
            }
            return d;
        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
    }
}
