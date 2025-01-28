package ArraysBasic;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHash {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int k = 9;
        int[] ans = twoSum(nums,k);
        System.out.println(Arrays.toString(ans));

    }

    static int[] twoSum(int[] nums , int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = k - num;

            if(map.containsKey(diff)){
                return new int[]{map.get(diff) , i};
            }
            map.put(num , i);
        }
        return new int[]{};
    }
}
