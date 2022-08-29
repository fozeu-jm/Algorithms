package algorithms.general;

public class FibonacciSeries {

    public void print(int n){
        int f = 0, s = 1;
        for(int i = 0; i < n; i++){
            System.out.print(String.valueOf(f).concat(" "));
            int t = f + s;
            f = s;
            s = t;
        }
    }
}
