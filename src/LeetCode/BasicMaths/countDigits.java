package LeetCode.BasicMaths;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(evenlyDivides(n));

    }
    static int evenlyDivides(int n) {


        int num = n;
        int count = 0;
        while(n > 0){
                int rem=n%10;
                if(rem!=0&&num%rem==0){
                count++;
                }
                n=n/10;
                }

        return count;



    }



    }
