package ArraysBasic;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {5,2,3,1,10,8,6,9,4};
        System.out.println(Arrays.toString(sort(nums)));

    }
    // Brute for time limit exceed
    static int[] sort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }
        return nums;
    }


        public int[] sortArray(int[] nums) {
            mergeSort(nums , 0 , nums.length-1);
            return nums;

        }
        private void mergeSort(int[] arr , int l , int r){
            if(l >= r) return;
            int m = (l+r) / 2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
        private void merge(int[] arr , int l , int m, int r){
            ArrayList<Integer> temp = new ArrayList<>();
            int i = l;
            int j = m+1;

            while(i <= m && j <= r){
                if(arr[i] <= arr[j]){
                    temp.add(arr[i]);
                    i++;
                }else{
                    temp.add(arr[j]);
                    j++;
                }
            }
            while(i <= m){
                temp.add(arr[i]);
                i++;
            }
            while(j <= r){
                temp.add(arr[j]);
                j++;
            }
            for( i = l; i <= r; i++){
                arr[i] = temp.get(i-l);
            }

        }
    }


