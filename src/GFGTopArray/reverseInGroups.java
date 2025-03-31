package GFGTopArray;

public class reverseInGroups {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        reverseInGroups(arr, k);

        // Print modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    static void reverseInGroups(int[] arr, int k){
        int n = arr.length-1;
        for (int i = 0; i < n; i+=k) {
            int left = i;
            int right = Math.min(i+k-1,n-1);

            while(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }
    }

}
