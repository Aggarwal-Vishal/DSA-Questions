package TwoPointers;

import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[] nums = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(twoSumO(nums, target)));

    }

    public static int[] twoSum(int [] nums , int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[] {i+1,j+1};
                }
            }
        }
        return new int[] {-1,-1};

    }

    public static int[] twoSumO(int [] nums , int target) {

        int start = 0;
        int end = nums.length-1;
        int sum = nums[start] + nums[end];

        while(start <= end){
            if(sum > target){
                end--;
            }
            if(sum < target){
                start++;
            }
            return new int[]{start+1,end+1};
        }
        return new int[]{-1,-1};
    }

        }
