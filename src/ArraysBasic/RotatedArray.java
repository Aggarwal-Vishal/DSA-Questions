package ArraysBasic;

public class RotatedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        k = k % nums.length;
        System.out.println(reverse(nums , 0 , nums.length-1));
        System.out.println(reverse(nums , 0 , k-1));
        System.out.println(reverse(nums,k,nums.length-1));


    }
    static int reverse(int[] nums , int start , int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return start;
    }
}
