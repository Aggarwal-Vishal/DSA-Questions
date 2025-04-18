package SlidingWindow;

public class MaxSubString {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2,8,9};
        int m = 3;
        System.out.println(maxSub(arr,m));
    }

    static int maxSub(int [] nums , int k){
        int MaxSum = 0;
        for (int i = 0; i < k; i++) {
            MaxSum += nums[i];
        }
        int currSum = MaxSum;

        for (int i = k; i < nums.length ; i++) {
            currSum += nums[i] - nums[i-k];
            MaxSum = Math.max(MaxSum,currSum);
        }
        return MaxSum;
    }
}
