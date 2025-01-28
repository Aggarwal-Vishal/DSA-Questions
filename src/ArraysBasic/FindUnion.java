package ArraysBasic;

import java.util.ArrayList;

public class FindUnion {
    public static void main(String[] args) {
        int n = 10, m = 7;
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = findUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }


    static ArrayList<Integer> UnionFind(int[] arr1, int[] arr2, int n , int m ){
        ArrayList<Integer> Union = new ArrayList<>();
        int i=0;
        int j=0;

        // For cases where i < j it will add elements in a sorted way without duplicates
        while (i < n && j < m){
            if(arr1[i] < arr2[j]){
                if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[i]){
                    Union.add(arr1[i]);
                    i++;
                }
                else{
                    if(Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]){
                        Union.add(arr2[j]);

                    }
                    j++;

                }
            }
        }
        // If any element left in array 1 & 2 then add those
        while(i < n){
            if(Union.get(Union.size() - 1) != arr1[i]){
                Union.add(arr1[i]);
            }
            i++;

        }

        while( j < m){
            if(Union.get(Union.size() - 1) != arr2[j]){
                Union.add(arr2[j]);
            }
            j++;

        }

        return Union;

    };
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[] , int n , int m) {
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2

        ArrayList<Integer> Union = new ArrayList<>();

        // Merge two arrays into the Union list
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                // Add arr1[i] to Union if not already added
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                // Add arr2[j] to Union if not already added
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
            } else {
                // If both elements are the same, add any one to Union
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < n) {
            if (Union.get(Union.size() - 1) != arr1[i]) {
                Union.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2
        while (j < m) {
            if (Union.get(Union.size() - 1) != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }

        return Union;
    }

}
