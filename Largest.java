import java.util.*;
public class Largest {
    public static void largest(int arr[],int n){
        int l=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }
        System.out.println("The largest in the array is"+l);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        largest(arr,n);
    }
    
}
