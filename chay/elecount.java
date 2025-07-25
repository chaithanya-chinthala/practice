import java.util.*;
public class elecount {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the ele to found: ");
        int fou=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==fou){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
