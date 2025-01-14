package ArraysBasic;

public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1, 2, 3, 2, 4, 5, 1};

        int[] ans = moveZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }




    static int[] moveZeros(int[] nums ){
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                j = i;
                break;
            }

        }

        if( j == -1){
            return nums;
        }
        for (int i = j+1; i < nums.length; i++) {
            if(nums[i] != nums[j]){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }


        }

        return nums;
    }
}
