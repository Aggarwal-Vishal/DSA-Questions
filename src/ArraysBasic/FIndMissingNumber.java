package ArraysBasic;

public class FIndMissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int n = nums.length;
        System.out.println(missing(nums , n));

    }
    static int missing(int[] nums , int n){
        int s1 = n*(n+1)/2;
        int s2 =0;
        for (int i = 0; i < n; i++) {
            s2+=nums[i];
        }
        return s1-s2;
    }
}
