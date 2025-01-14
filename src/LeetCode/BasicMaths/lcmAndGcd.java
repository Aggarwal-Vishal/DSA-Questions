package LeetCode.BasicMaths;

// Not solved //

public class lcmAndGcd {
    public static void main(String[] args) {
        System.out.println(lcmAndGcd(5,10));

    }
    static long[] lcmAndGcd(long a , long b){

        long numA = a;
        long numB = b;

        while(a > 0 && b > 0){
            if(a > b){
                a = a % b;
            }
            else b = b % a;
        }
        long gcd = (a == 0) ? b : a;

        long lcm = (numA * numB) / gcd;

        return new long[] {gcd,lcm};
    }
}
