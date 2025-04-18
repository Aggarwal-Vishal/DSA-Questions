package SlidingWindow;

public class BuySell {
    public static void main(String[] args) {
        int[] nums = {2,9,1,3};
        System.out.println(buyselloptimal(nums));

    }
    static int buysellbrute(int[] nums){
        int res =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int buy = nums[i];
                int sell = nums[j];
                int profit = sell - buy;
                res = Math.max(res,profit);
            }
        }
        return res;
    }

    static int buyselloptimal(int[] nums){
        int maxP=0;
        int l=0;
        int r=1;
        while(r < nums.length){
            if(nums[l] < nums[r]){
                int profit = nums[r] - nums[l];
                maxP = Math.max(maxP,profit);
            }else{
                l=r;
            }
            r++;
        }
        return maxP;
    }
}
