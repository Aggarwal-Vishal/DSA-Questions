package LeetCode.BasicMaths;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(reverse(n));
//        int ans =0;
//
//            while (n > 0) {
//
//                int rem = n % 10;
//                ans = (ans * 10) + rem;
//                n = n / 10;
//
//
//
//            }
//        System.out.println(ans);


        }
        static int reverse(int n){
        int ans = 0;
           while(n > 0){
               int rem = n % 10;
               ans = ans * 10 + rem;
               n = n /10;
           }
           return ans;
        }
    }

