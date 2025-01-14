package ArraysBasic;

public class SortedRoted {

    public static void main(String[] args) {
        int[] nums ={3,4,5,1,2};
        System.out.println(check(nums));

    }

    static boolean check(int[] nums){
        int n = nums.length;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(nums[i] > nums[(i+1) % n]){
                count++;
            }

        }
        return  (count <= 1);

    }
}
