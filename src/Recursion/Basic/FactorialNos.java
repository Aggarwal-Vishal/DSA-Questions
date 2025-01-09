package Recursion.Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorialNos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        ArrayList<Integer> ans = getFactorial(n);

        int result = NormalFactorial(n);

//        System.out.println(ans);
        System.out.println(result);

    }
    static ArrayList<Integer> getFactorial(int n) {
        ArrayList<Integer> factorial = new ArrayList<>();
        int fact = 1;
        int i = 1;

        while (fact <= n) {
            factorial.add(fact);
            i++;
            fact = fact * i;
        }
        return factorial;
    }

    static int NormalFactorial(int n){
        if(n == 0){
            return 1; // we dont return zero bcoz it is multiplying the n with zero at last step it will make the function zero which will make the whole function zero //
        }

        return ( n * NormalFactorial(n-1));

    }


}
