package algorithms.leetcode;

import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicatesFromSortedArray(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
