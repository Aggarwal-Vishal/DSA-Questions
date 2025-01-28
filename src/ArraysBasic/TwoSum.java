package ArraysBasic;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int k = 6;
        int[] result = twoSumo(nums,k);
        System.out.println(Arrays.toString(result));
    }

    static boolean twosumb(int[] nums , int k){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == k){
                    return true;
                }

            }

        }
        return false;

    }

    static int[] twosumbrute(int[] nums , int k){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    static int[] twosumhash(int[] nums , int k){
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int snum = k - nums[i];
            if(map.containsKey(snum)){
                ans[0] = map.get(snum);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i] , i);
        }

        return ans;


    }

    static int[] twoSumo(int[] nums , int k){

        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum == k){
                return new int[]{start , end};
            } else if (sum < k) {
                start++;
            }else end--;
        }
        return new int[]{-1,-1};
    }
}
