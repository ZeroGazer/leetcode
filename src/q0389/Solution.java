package q0389;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sMap.containsKey(c)) {
                sMap.put(c, sMap.get(c) + 1);
            } else {
                sMap.put(c, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (tMap.containsKey(c)) {
                tMap.put(c, tMap.get(c) + 1);
            } else {
                tMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> tEntry: tMap.entrySet()) {
            if (!sMap.containsKey(tEntry.getKey())) {
                return tEntry.getKey();
            } else {
                if (sMap.get(tEntry.getKey()) < tEntry.getValue()) {
                    return tEntry.getKey();
                }
            }
        }

        throw new RuntimeException();
    }
}
