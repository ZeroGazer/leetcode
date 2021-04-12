package q0492;

class Solution {
    public int[] constructRectangle(int area) {
        int bound = (int) (Math.sqrt(area));
        for (int i = bound; i > 0; i--) {
            if (area % i == 0) {
                return new int[] {area / i, i};
            }
        }
        return new int[] {area, 1};
    }
}
