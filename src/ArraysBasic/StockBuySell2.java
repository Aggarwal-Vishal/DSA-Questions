package ArraysBasic;

public class StockBuySell2 {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(stock(nums));
    }
    static int stock(int[] nums){
        int profit = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]){
                profit += nums[i] - nums[i-1];
            }
        }
        return profit;

        }
}
