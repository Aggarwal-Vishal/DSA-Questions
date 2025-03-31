package TwoPointers;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k =3;
        k = k % nums.length;
        System.out.println(Arrays.toString(reverse(nums,0, nums.length-1)));
        System.out.println(Arrays.toString(reverse(nums, k, nums.length-1)));
        System.out.println(Arrays.toString(reverse(nums,0,k-1)));

    }
    static int[] reverse(int[] nums , int a , int b){
        while(a < b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
        return nums;
    }

}
