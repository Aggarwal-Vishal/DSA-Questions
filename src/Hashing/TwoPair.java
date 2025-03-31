package Hashing;

import java.util.HashSet;
import java.util.Set;

public class TwoPair {
    public static void main(String[] args) {
        int[] nums = {0, -1, 2, -3,1};
        int k = 3;
        System.out.println(twos(nums,k));

    }
    static boolean two(int[] nums, int k){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i] + nums[j] == k){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean twos(int[] nums , int k){
        Set<Integer> hashset = new HashSet<>();
        for (int num : nums) {
            int diff = k - num;
            if (hashset.contains(diff)) {
                return true;
            }
            hashset.add(num);
        }
        return false;
    }
}
