import java.util.*;
public class Fact {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()){
            System.out.println("please enter valid input");
            return;
        }
        int n=sc.nextInt();
        try{
            System.out.println(factorial(n)); 
        }
        catch(Exception e){
            System.out.println((e.getMessage()));

        }
        
    }
}
