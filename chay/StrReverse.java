import java.util.*;
public class StrReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s1=sc.next();
        StringBuffer s= new StringBuffer(s1);
        System.out.println(s.reverse());
    }
}
