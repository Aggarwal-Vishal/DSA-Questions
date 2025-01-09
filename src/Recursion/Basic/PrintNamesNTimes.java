package Recursion.Basic;

import java.util.Scanner;

public class PrintNamesNTimes {
    public static void main(String[] args) {
        PrintName(1,2);

    }

    static void PrintName(int i , int N){
        if(i > N){
            return;
        }
        System.out.println("Vishal");
        PrintName(i+1 , N);

    }

}
