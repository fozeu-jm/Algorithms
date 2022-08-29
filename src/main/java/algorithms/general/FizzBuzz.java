package algorithms.general;

public class FizzBuzz {
    public void execute(int n){
        StringBuilder builder = new StringBuilder("");
        if(n % 3 == 0){
            builder.append("Fizz");
        }
        if (n % 5 == 0){
            builder.append("Buzz");
        }
        System.out.println(builder.toString());
    }
}
