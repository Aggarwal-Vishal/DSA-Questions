package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = " Hello   World ";
        System.out.println(reverse(str));

    }

    static String reverse(String str){
        String[] s = str.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = s.length-1; i >= 0 ; i--) {
            sb.append(s[i]);
            if( i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}
