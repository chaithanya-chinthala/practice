import java.util.*;
public class PeopleCount {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //int n=sc.nextInt();
        int arr[]=new int[20];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            System.out.println(i);
        }

    }
}
