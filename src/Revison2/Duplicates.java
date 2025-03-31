package Revison2;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(dupli(arr));

    }
    static boolean duplicates(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    static Set<Integer> dupli(int[] nums) {
        Set<Integer> map = new HashSet<>();
        Set<Integer> list = new HashSet<>();

        for(int val : nums){
            if(map.contains(val)){
                list.add(val);
            }
            map.add(val);
        }
        return list;

    }
}
