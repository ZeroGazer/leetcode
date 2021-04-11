package q0350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i])) {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            } else {
                map1.put(nums1[i], 1);
            }
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map2.containsKey(nums2[i])) {
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            } else {
                map2.put(nums2[i], 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        map1.entrySet().forEach(x -> {
            if (map2.containsKey(x.getKey())) {
                int num = Math.min(x.getValue(), map2.get(x.getKey()));
                for (int i = 0; i < num; i++) {
                    result.add(x.getKey());
                }
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
