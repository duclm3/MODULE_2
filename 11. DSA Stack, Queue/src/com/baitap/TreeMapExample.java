package com.baitap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String string = "Lêeeee MMinh Đứcc";
//        map.put('a',1);
//        map.put('b',1);
//        map.put('c',1);
//        map.replace('c',1,10);
//        System.out.println(map);
        for (int i = 0; i < string.length(); i++) {
            if(map.get(string.charAt(i))==null){
                map.put(Character.toLowerCase(string.charAt(i)),1);
            }else {
                map.replace(string.charAt(i),map.get(string.charAt(i))+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
