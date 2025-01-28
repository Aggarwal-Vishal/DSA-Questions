package ArraysBasic;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean rem = duplicates(nums);
        System.out.println(rem);

    }


    // TC n2 works with small arrays
    static boolean dupli(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }

            }

        }
        return false;
    }


    static boolean duplicates(int[] nums){
        Set<Integer> ans = new HashSet<>();

        for(int num : nums){
            if(ans.contains(num)) {
                return true;
            }
            ans.add(num);
        }
        return false;
    }


}
