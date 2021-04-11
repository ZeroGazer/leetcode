package q0412;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = i + 1;
            if (num % 15 == 0) {
                result.add("FizzBuzz");
            } else if (num % 5 == 0) {
                result.add("Buzz");
            } else if (num % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(Integer.toString(num));
            }
        }
        return result;
    }
}
