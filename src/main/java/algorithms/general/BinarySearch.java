package algorithms.general;

public class BinarySearch {
    int[] tab = {3,7,12,13,15,17,18,21};

    public int execute(int n){
        int left = 0;
        int right = tab.length - 1;
        while (left <= right){
            int middle = (left + right)/2;
            if(n > tab[middle]){
                left = middle + 1;
            }else if(n < tab[middle]){
                right = middle - 1;
            }else {
                return 1;
            }
        }
        return -1;
    }
}
