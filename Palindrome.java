import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String s){
        char[] arr=s.toCharArray();
        int low=0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]!=arr[high]){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean r=palindrome(s);
        System.out.println(r);
    }
}
