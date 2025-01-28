package ArraysBasic;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximum(nums));
    }
    static int maximum(int[] nums){

        long maxi = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return (int) maxi;
    }
}
