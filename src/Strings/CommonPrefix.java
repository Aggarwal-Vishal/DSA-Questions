package Strings;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower" , "flow" , "flight"};
        System.out.println(longestCommonPrefix(str));


    }

    static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            int j = 0;
            while( j < Math.min(prefix.length(),strs[i].length())){
                if(prefix.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            prefix = prefix.substring(0,j);

        }
        return prefix;
    }
}
