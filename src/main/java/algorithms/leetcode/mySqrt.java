package algorithms.leetcode;

public class mySqrt {
    public int execute(int x){
        if(x == 0) return 0;
        long i = x;
        while (i > (x/i)){
            i = ((x/i) + i) / 2;
        }
        return (int) i;
    }
}