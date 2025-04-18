package TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama ";
        System.out.println(valid(s));

    }

    public static boolean valid(String s){
        int l =0;
        int r = s.length()-1;

        while(l < r){
            while(l < r && !alpha(s.charAt(l))){
                l++;
            }
            while(r > l && !alpha(s.charAt(r))){
                r--;
            }

            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase((s.charAt(r)))){
                return false;
            }
            l++;r--;
        }
        return true;
    }

    public static boolean alpha(char c){
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9'
                );
    }

}
