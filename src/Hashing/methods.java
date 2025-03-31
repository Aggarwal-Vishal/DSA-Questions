package Hashing;

import java.util.HashMap;

public class methods {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
//        map.put("Alice" , 21);
//        map.put("King" , 25);
//        map.put("Leo" , 22);
//        System.out.println(map.getOrDefault("Alice",0));
//        System.out.println(map.getOrDefault("Leo",0));

//        map.put("Vishal" , 20);
//        map.put("Keerti" , 21);
//        map.putIfAbsent("Vishal",20);
//        map.putIfAbsent("Alice" , 21);
//        System.out.println(map);


//        map.put("X",20);
//        System.out.println(map.containsKey("X"));
//        System.out.println(map.containsValue(20));

        map.put("A",20);
//        System.out.println(map.remove("A"));
        System.out.println(map.remove("A",20));
        System.out.println(map);
    }
    static void method(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Alice" , 21);
        map.put("King" , 25);
        map.put("Leo" , 22);


        System.out.println(map.getOrDefault("Alice",0));
        System.out.println(map.getOrDefault("Vishal",0));
    }
}
