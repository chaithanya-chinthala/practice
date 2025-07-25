import java.util.*;
public class elefound {
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
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==fou){
             flag=true;
        }
        }
        if(flag){
            System.out.println("Ele found");
        }
        else{
            System.out.println(("Ele not found"));
        }

        }


    }
