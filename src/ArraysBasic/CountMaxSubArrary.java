package ArraysBasic;

public class CountMaxSubArrary {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        System.out.println(subarraySum(nums , k));


    }

    static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count=0;

        for (int i = 0; i < n ; i++) {
            int sum=0;

            for (int j = i; j < n; j++) {

                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }

    }
