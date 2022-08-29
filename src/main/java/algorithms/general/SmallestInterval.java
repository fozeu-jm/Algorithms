package algorithms.general;

import java.util.Arrays;

public class SmallestInterval {

    public int execute(int[] numbers) {
        Arrays.sort(numbers);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            if ((numbers[i] - numbers[i - 1]) < minDiff) {
                minDiff = numbers[i] - numbers[i - 1];
            }
        }
        return minDiff;
    }
}