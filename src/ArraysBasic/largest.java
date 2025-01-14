package ArraysBasic;

public class largest {

    public static void main(String[] args) {
        int[] arr = {92,8,7,91,93};
        int sum=0;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > sum){
                sum = arr[i];
            }
        }
        System.out.println(sum);

    }
}
