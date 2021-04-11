package q0383;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> rMap = new HashMap<>();
        Map<Character, Integer> mMap = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (rMap.containsKey(c)) {
                rMap.put(c, rMap.get(c) + 1);
            } else {
                rMap.put(c, 1);
            }
        }

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (mMap.containsKey(c)) {
                mMap.put(c, mMap.get(c) + 1);
            } else {
                mMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry: rMap.entrySet()) {
            if (!mMap.containsKey(entry.getKey()) || entry.getValue() > mMap.get(entry.getKey())) {
                return false;
            }
        }
        return true;
    }
}
