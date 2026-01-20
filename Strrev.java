public class Strrev {
    public static void rev(String str){
        char[] arr=str.toCharArray();
        int low=0;
        int high=arr.length-1;
        while(low<high){
            char temp=arr[low];
            arr[low]= arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
    public static void main(String args[]){
        String str="hello";
        rev(str);
    }
}
