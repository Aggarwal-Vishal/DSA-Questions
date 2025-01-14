package LeetCode.BasicMaths;

public class isPalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1));

    }
    static boolean isPalindrome(int n){
        int ans = 0;

        int num = n;
        while(n > 0){
            int rem = n % 10;
            ans = ans * 10 +rem;
            n = n / 10;
        }
        return (num == ans);
    }
}
