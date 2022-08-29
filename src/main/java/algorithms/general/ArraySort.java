package algorithms.general;

import java.util.Arrays;

public class ArraySort {

    //selection sort
    public void Sort(int tabs []) {
        for (int i = 0; i < tabs.length; i++) {
            int minIndex = i;
            for (int j = minIndex; j < tabs.length - 1; j++) {
                if (tabs[j + 1] < tabs[minIndex]) {
                    minIndex = j + 1;
                }
            }
            swapValues(tabs, i, minIndex);
        }

        Arrays.stream(tabs).forEach(x -> System.out.print(x + ", "));
    }

    public void swapValues(int[] tab, int left, int right) {
        int c = tab[left];
        tab[left] = tab[right];
        tab[right] = c;
    }
    /****************QUICK SORT*************/
    public void quickSort(int[] values, int low, int high) {
        if (low < high) {
            int pi = partitioning(values, high, low);
            quickSort(values, low, pi - 1);
            quickSort(values, pi + 1, high);
        }
    }

    public int partitioning(int[] values, int pi, int first) {
        int i = first - 1;
        for (int j = first; j < pi; j++) {
            if (values[j] <= values[pi]) {
                i++;
                swapValues(values, i, j);
            }
        }
        swapValues(values, i + 1, pi);
        return (i + 1);
    }

}
