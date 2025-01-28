package ArraysBasic;

public class StockBuySell {

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(stock(nums));

    }

    static int stock(int[] nums){
        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < nums.length; i++) {

            buy = Math.min(buy , nums[i]);
            profit = Math.max(profit , nums[i]-buy);
        }
        return profit;
    }
}
