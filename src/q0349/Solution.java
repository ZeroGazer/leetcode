package q0349;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        Set<Integer> result = new HashSet<>();
        set1.forEach(x -> {
            if (set2.contains(x)) {
                result.add(x);
            }
        });
        set2.forEach(x -> {
            if (set1.contains(x)) {
                result.add(x);
            }
        });

        int[] resultArray = new int[result.size()];
        int i = 0;
        for (Integer x : result) {
            resultArray[i++] = x;
        }
        return resultArray;
    }
}
