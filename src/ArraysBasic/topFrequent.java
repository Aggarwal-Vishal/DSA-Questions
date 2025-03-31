package ArraysBasic;

import java.util.*;

public class topFrequent {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(top(nums, k)));
    }

    static int[] top(int[] nums , int k){
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i] == nums[j]){
                    count++;
                    i++;
                }else if(count > k){
                        ans[i] = i;
                    }
                }
            }
        return ans;
        }
        //My brute force which is incorrect



//         Optimal solution using Bucket sort
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> count = new HashMap<>();
            List<Integer>[] freq = new List[nums.length + 1];

            for (int i = 0; i < freq.length; i++) {
                freq[i] = new ArrayList<>();
            }

            for (int n : nums) {
                count.put(n, count.getOrDefault(n, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                freq[entry.getValue()].add(entry.getKey());
            }

            int[] res = new int[k];
            int index = 0;
            for (int i = freq.length - 1; i > 0 && index < k; i--) {
                for (int n : freq[i]) {
                    res[index++] = n;
                    if (index == k) {
                        return res;
                    }
                }
            }
            return res;
        }
    }



