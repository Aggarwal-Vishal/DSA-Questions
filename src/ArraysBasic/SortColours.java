package ArraysBasic;

import java.util.Arrays;

public class SortColours {
    public static void main(String[] args) {
        int[] nums = {2,0,1,2,0,2};
        int[] ans = sort(nums);
        System.out.println(Arrays.toString(ans));

    }
    private static int[] sort(int[] nums){
        int i = 0;
        int l = 0;
        int r = nums.length-1;

        while(i <= r){
            if(nums[i] == 0){
                swap(nums,l,i);
                l++;
            }
            if(nums[i] == 2){
                swap(nums,i,r);
                r--;
                i--;
            }
            i++;
        }
        return nums;
    }
    private static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }
}
