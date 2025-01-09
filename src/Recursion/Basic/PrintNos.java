package Recursion.Basic;

import java.util.Scanner;

public class PrintNos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        PrintNos(1,n);
        PrintNos2(n);

    }
    static void PrintNos(int i , int N){
        if(i > N){
            return;
        }
        System.out.println(i);
        PrintNos(i+1 , N);
    }
    static void PrintNos2(int N){
        if(N < 1){
            return;
        }
        PrintNos2(N-1);
        System.out.println(N);
    }
}
