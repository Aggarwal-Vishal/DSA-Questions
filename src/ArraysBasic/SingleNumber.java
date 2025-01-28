package ArraysBasic;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,1,4,1,4,5};
        int n = arr.length;
//        System.out.println(single(arr,n));
        System.out.println(singlexor(arr));
    }
    static int single(int[] arr , int n){

        int maxi = arr[0];

        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi , arr[i]);
        }

        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
           if (hash[arr[i]] == 1){
                return arr[i];
            }

        }
        return -1;
    }

    static int singlexor(int[] arr){
        int n = arr.length;
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;

    }
}
