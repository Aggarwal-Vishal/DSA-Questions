package Recursion.Basic;

public class PrintNto1 {
    public static void main(String[] args) {
        printNos(5);

    }
    static void printNos(int N){
        if(N == 0){
            return;
        }
        System.out.println(N);
        printNos(N-1);
    }
}
