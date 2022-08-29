package algorithms.general;

/**
 * check if a string is a palindrome
 * a palindrome is a word that can be read the same letf to right or vice versa
 * example kayak, nun, non.
 */
public class IsPalindrome {
    public boolean execute(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        while (left <= right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    class Solution {
        public int mySqrt(int x) {
            if (x == 0) return 0;
            long i = x;
            while (i > x / i) {
                i = (i + x / i) / 2;
            }
            return (int) i;
        }
    }

/**
 * One liner solution
 * return word.equals(new StringBuilder(word).reverse().toString());
 */
}
