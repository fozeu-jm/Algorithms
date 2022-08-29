package algorithms.leetcode;

public class PlusOne {

    public int[] execute(int[] digits) {
        int k = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + k < 10) {
                digits[i] = digits[i] + k;
                k = 0;
                break;
            }
            digits[i] = 0;
        }
        //return if no remainder
        if (k == 0) return digits;

        int[] res = new int[digits.length + 1];
        res[0] = k;
        System.arraycopy(digits, 0, res, 1, digits.length);
        return res;
    }

    class Solution {

        public int[] plusOne(int[] digits) {
            int k = 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] + k < 10) {
                    digits[i] = digits[i] + k;
                    k = 0;
                    break;
                }
                digits[i] = 0;
            }
            //return if no remainder
            if (k == 0) return digits;

            int[] res = new int[digits.length + 1];
            res[0] = k;
            System.arraycopy(digits, 0, res, 1, digits.length);
            return res;
        }
    }

}
