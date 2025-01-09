package Recursion.Basic;

public class ReverseArray {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        reverse(arr,0,n-1);
        printArray(arr,n);

    }

    static void printArray(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
   static void reverse(int[] arr, int start , int end){
        if(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start + 1 , end - 1);
        }
   }


}
