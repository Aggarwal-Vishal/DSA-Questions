package Recursion.Basic;

public class Fibonaci {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));

    }

     static int fib(int n) {

        if(n <= 1){
            return n;
        }

        int last = fib(n-1);
        int slast = fib(n-2);

        return last + slast;

    }
}
