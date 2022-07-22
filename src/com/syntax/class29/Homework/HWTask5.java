package com.syntax.class29.Homework;

import java.util.Collection;
import java.util.HashMap;

public class HWTask5 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Google");
        map.put(2,"Syntax");
        map.put(3,"Store");
        map.put(1,"Shop");
        map.put(4,"Google");
        System.out.println(map.size());
        System.out.println(map.replace(1,"Pet store"));
        System.out.println(map.remove(2));
        System.out.println(map);


    }
}
