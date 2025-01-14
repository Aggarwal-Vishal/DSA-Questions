package Hashing;

import java.util.Scanner;

public class CountElements {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Print number of elements in array");
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Print array");
            arr[i] = in.nextInt();
        }
        // pre compute
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1; // hash[arr[i]] = hash[arr[i]] + 1;
        }
        //prefetching
        System.out.println("Print of query numbers");
        int q = in.nextInt();
        while(q-- != 0){
            System.out.println("Print the number you want to find");
            int number = in.nextInt();
            System.out.println("The number has occured " + hash[number] + " time");
        }




    }


}
