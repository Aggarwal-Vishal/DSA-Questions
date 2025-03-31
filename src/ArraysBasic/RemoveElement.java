package ArraysBasic;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        ArrayList<Integer> rm = removeElement(nums,val);
        System.out.println(rm);


    }

    static ArrayList<Integer> removeElement(int[] nums, int val) {
        int[] map = new int[nums.length];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] % val != 0){
                ans.add(nums[i]);
            }

        }
        return ans;
    }
}
