package ArraysBasic;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,1};
//        int ans = majority(nums);
        System.out.println(element(nums));

    }

    static int element(int[] nums){
        for(int num : nums){
            int count = 0;
            for(int i : nums){
                if(i == num){
                    count++;
                }
            }
            if(count > nums.length / 2){
                return num;
            }

        }
        return -1;
    }

    static int majority(int[] nums){
        HashMap<Integer , Integer> mpp = new HashMap<>();

        // Adding the elements
        for (int i = 0; i < nums.length; i++) {
            int value = mpp.getOrDefault(nums[i] , 0);
            mpp.put(nums[i] , value+1);
        }
        //Finding the majority element
        for (Map.Entry<Integer , Integer> it : mpp.entrySet()){
            if(it.getValue() > (nums.length / 2)){
                return it.getKey();
            }
        }
        return -1;
    }
}
