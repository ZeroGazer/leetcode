package q0067;

class Solution {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        char[] result = new char[a.length()];
        int carry = 0;

        int i = a.length() - 1, j = b.length() - 1;
        while (i > -1) {
            if (j < 0) {
                int sum = Character.getNumericValue(a.charAt(i)) + carry;
                result[i] = Character.forDigit(sum % 2, 10);
                carry = sum / 2;
            } else {
                int sum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(j)) + carry;
                result[i] = Character.forDigit(sum % 2, 10);
                carry = sum / 2;
                j--;
            }
            i--;
        }

        if (carry != 0) {
            char[] newResult = new char[result.length + 1];
            newResult[0] = Character.forDigit(carry, 10);
            for (int k = 0; k < result.length; k++) {
                newResult[k + 1] = result[k];
            }
            result = newResult;
        }
        return new String(result);
    }
}
