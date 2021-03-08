package q0009;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        if (x == 0)
            return true;

        if (x % 10 == 0)
            return false;

        int temp1 = x;
        int temp2 = 0;
        while (temp1 != 0) {
            temp2 = temp2 * 10 + temp1 % 10;
            temp1 /= 10;
        }
        return x == temp2;
    }
}
