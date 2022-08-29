package algorithms.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefix {
    public String execute(String[] strs) {
        String prefix = "";
        for (String txt : strs) {
            if (prefix.isEmpty()) {
                prefix = txt;
            } else {
                // enter loop only if @prefix is not a prefix to current @txt 1
                while(txt.indexOf(prefix) != 0){
                    //remove last character from prefix and verify again 1
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
            if (prefix.isEmpty())
                break;
        }
        return prefix;
    }

}
