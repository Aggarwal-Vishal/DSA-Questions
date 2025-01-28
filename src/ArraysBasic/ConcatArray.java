package ArraysBasic;

import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
        int[] num = {1,2,1};
        int[] rem = concat(num);
        System.out.println(Arrays.toString(rem));

    }

    static int[] concat(int[] nums){
        int[] ans = new int[2*nums.length];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;

    }
}
