package q0278;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 0, r = n;
        while (l < r) {
            int m = (r - l) / 2 + l;
            if (!isBadVersion(m)) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return r;
    }
}
