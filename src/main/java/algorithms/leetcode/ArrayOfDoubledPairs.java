package algorithms.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array of even length arr, return true if it is possible to reorder arr such that arr[2 * i + 1] = 2 * arr[2 * i] for every 0 <= i < len(arr) / 2, or false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [3,1,3,6]
 * Output: false
 * Example 2:
 * <p>
 * Input: arr = [2,1,2,6]
 * Output: false
 * Example 3:
 * <p>
 * Input: arr = [4,-2,2,-4]
 * Output: true
 * Explanation: We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or [2,4,-2,-4].
 */
public class ArrayOfDoubledPairs {
    private int[] arr = {4, -2, 2, -4};

    public boolean canReorderDoubled() {
        if (arr.length % 2 != 0) {
            return false;
        }
        Map<Integer, Integer> occurences = new HashMap<>();
        Integer[] copyArr = new Integer[arr.length];
        //set number of occurrences of each number in array
        for (int i = 0; i < arr.length; i++) {
            occurences.put(arr[i], occurences.getOrDefault(arr[i], 0) + 1);
            copyArr[i] = arr[i];
        }
        Arrays.sort(copyArr, Comparator.comparingInt(Math::abs));
        for (Integer integer : copyArr) {
            if (occurences.get(integer) == 0) {
                continue;
            }
            if (occurences.getOrDefault(integer * 2, 0) <= 0) {
                return false;
            }
            //at this point the number has atleast 1 occurence and its double too
            occurences.put(integer, occurences.get(integer) - 1);
            occurences.put(integer * 2, occurences.get(integer * 2) - 1);
        }
        return true;
    }
}
