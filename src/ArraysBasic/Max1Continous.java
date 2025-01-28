package ArraysBasic;

public class Max1Continous {

    public static void main(String[] args) {

        int[] nums = {0,1,1,1,0,1,1};
        System.out.println(Max1(nums));

    }


   static int Max1(int[] nums){
        int count =0;
        int sum=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
            }else{
                count=0;
            }
            sum = Math.max(count, sum);
        }
        return sum;

   }

}
