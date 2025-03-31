package Hashing;

public class GroupAnagram {
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carracc";

        System.out.println(groupAnagram(s,t));

    }

    static boolean groupAnagram(String s , String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int val : count){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}
