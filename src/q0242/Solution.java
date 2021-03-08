package q0242;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (mapS.containsKey(cs)) {
                mapS.put(cs, mapS.get(cs) + 1);
            } else {
                mapS.put(cs, 1);
            }

            if (mapT.containsKey(ct)) {
                mapT.put(ct, mapT.get(ct) + 1);
            } else {
                mapT.put(ct, 1);
            }
        }

        if (mapS.keySet().size() != mapT.size()) {
            return false;
        }

        for (Character keyS: mapS.keySet()) {
            if (!mapT.containsKey(keyS)) {
                return false;
            }

            if (!mapS.get(keyS).equals(mapT.get(keyS))) {
                return false;
            }
        }

        return true;
    }
}
