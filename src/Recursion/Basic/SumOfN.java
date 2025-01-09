package Recursion.Basic;

public class SumOfN {
    public static void main(String[] args) {
        int result  = sumOfN(5);
//        System.out.println(result);
        int ans = sumOfCubeOfNos(4);
        System.out.println(ans);
    }

    static int sumOfN(int N){
        if(N == 0){
            return 0;
        }
        return ( N + sumOfN(N-1));
    }

    static int sumOfCubeOfNos(int N){
        if(N == 0){
            return 0;
        }
        return (N*N*N + sumOfCubeOfNos(N-1));
    }
}
