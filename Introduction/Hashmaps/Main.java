package Hashmaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        // hashmap is a data structure that stores key-value pairs
        // keys are unique, but values can be repetitive
        // does not maintain order but is memory efficient
        // HashMap<key, value>

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("litchi", 200);
        hashMap.put("pineapple", 60);
        hashMap.put("banana", 50);
        hashMap.put("apple", 100);

        hashMap.remove("apple");

        System.out.println(hashMap);

        System.out.println(hashMap.get("litchi"));
        System.out.println(hashMap.containsKey("banana"));
        System.out.println(hashMap.containsValue(200));
        System.out.println(hashMap.size());

        for (String key : hashMap.keySet()){
            System.out.println(key + " ₹" + hashMap.get(key));
        }



//        hashMap.put("Litchi", 300); // overwrite the value not error




    }
}