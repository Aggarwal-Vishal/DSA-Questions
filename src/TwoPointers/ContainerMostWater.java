package TwoPointers;

public class ContainerMostWater {
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));

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
}

