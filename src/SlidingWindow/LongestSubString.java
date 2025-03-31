package SlidingWindow;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> charSet = new HashSet<>();
        int l=0;
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            while (charSet.contains(s.charAt(i))){
                charSet.remove(s.charAt(i));
                l++;
            }
            charSet.add(s.charAt(i));
            res = Math.max(res,i-l+1);
        }
        return res;

    }
}
