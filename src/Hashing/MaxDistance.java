package Hashing;

import java.util.HashMap;

public class MaxDistance {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 1, 3, 4, 2, 5, 6, 5};
        System.out.println(maxC(nums));

    }

    static int max(int[] nums){
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i] == nums[j]){
                    res = Math.max(res,j-i);
                }

            }

        }
        return res;
    }

    static int maxC(int[] nums){
        int res = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!mpp.containsKey(nums[i])){
                mpp.put(nums[i] , i);
            }
            res = Math.max(res,i-mpp.get(nums[i]));
        }
        return res;
    }

}
