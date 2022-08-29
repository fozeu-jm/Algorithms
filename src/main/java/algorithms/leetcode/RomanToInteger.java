package algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        s = s.toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i ++) {
            Integer prev = map.get(s.charAt(i));
            Integer next = (i + 1) >= s.length() ? -1 : map.get(s.charAt(i+1));
            if (prev < next) {
                result += (next - prev);
                i++;
            } else {
                result += prev;
            }
        }
        return result;
    }
}
