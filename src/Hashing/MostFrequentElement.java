package Hashing;

import java.util.HashSet;
import java.util.Set;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(most(nums,k));

    }

      static Set<Integer> most(int[] nums , int k) {
          Set<Integer> map = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
                if(count > 1){
                    map.add(nums[i]);
                }
            }
        }
      return map;
    }
}
