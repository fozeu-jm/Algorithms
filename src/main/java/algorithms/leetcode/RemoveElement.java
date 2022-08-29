package algorithms.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }
}
