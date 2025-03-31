package Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubSet {
    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 7, 1, 13};
//        System.out.println(sub(a,b));
        System.out.println(subb(a, b));
    }

    static boolean sub(int a[], int b[]) {
        Set<Integer> dup = new HashSet<>();

        for (int num : a) {
            dup.add(num);
        }

        for (int num : b) {
            if (!dup.contains(num)) {
                return false;
            }
        }
        return true;
    }

    static boolean chk(int a[], int b[]) {
        Set<Integer> map = new HashSet<>();
        for (int num : a) {
            map.add(num);
        }

        for (int num : b) {
            if (!map.contains(num)) {
                return false;
            }
        }
        return true;
    }

    static boolean subb(int a[] , int b[]){
        Set<Integer> map = new HashSet<>();
        for(int val : a){
            map.add(val);
        }
        for(int val : b){
            if(!map.contains(val)){
                return false;
            }
        }
        return true;
    }
}

