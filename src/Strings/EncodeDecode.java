package Strings;

import java.util.Arrays;

public class EncodeDecode {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Java"};
        String[] word = {"Hello World Java"};
        System.out.println(encode(words));
        System.out.println(Arrays.toString(decode(String.valueOf(word))));

    }

    static String encode(String s[]){
        StringBuilder sb = new StringBuilder();
        for(String x : s){
            sb.append(x+ " ");
        }
        return sb.toString().trim();
    }

    static String[] decode(String s){
        String[] st = s.split(" ");
        return st;
    }
}
