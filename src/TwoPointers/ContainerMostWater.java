package TwoPointers;

public class ContainerMostWater {
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxOptimal(nums));

    }
    public static int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int res=0;

        while(l < r){
            int area = Math.min(height[l],height[r]) * (r-l);
            res = Math.max(res,area);
            if(height[l] <= height[r]){
                l++;
            }else{
                r--;
            }
        }
        return res;

    }

    public static int maxBrute(int[] nums){
       int maxW = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                maxW = Math.max(maxW ,Math.min(nums[i] , nums[j]) * (j-i));
            }
        }
        return maxW;
    }


    public static int maxOptimal(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int res = 0;

        while(start <= end){
            int area = Math.min(nums[start] , nums[end]) * (end - start);
            res = Math.max(res , area);

            if(nums[start] <= nums[end]){
                start++;
            }else{
                end--;
            }
        }
        return res;
    }

}

