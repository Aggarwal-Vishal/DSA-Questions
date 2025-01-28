package ArraysBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLeaders {

    public static void main(String[] args) {
        int[] nums = {10, 4, 2, 4, 1};
        ArrayList<Integer> ans = leaders(nums);
        Collections.sort(ans , Collections.reverseOrder());
        System.out.println(ans);
    }

    static ArrayList<Integer> leaders(int nums[]) {

        int n = nums.length;

        ArrayList<Integer> list = new ArrayList<>();

        int max = nums[n-1];
        list.add(nums[n-1]);

        for (int i = n-2; i >=0 ; i--) {
            if(nums[i] >= max){
                list.add(nums[i]);
                        max = nums[i];
            }
        }
        return list;



    }
}
