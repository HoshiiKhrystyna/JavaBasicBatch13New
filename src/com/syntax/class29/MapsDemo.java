package com.syntax.class29;

import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<String,Double>fruit=new HashMap<>();
        fruit.put("mango",20.0);
        fruit.put("pear",10.0);
        fruit.put("Apple",4.0);
        fruit.put("orange",20.5);
        fruit.put("kiwi",10.5);
        System.out.println(fruit);
        System.out.println(fruit.get("kiwi"));
        System.out.println( fruit.remove("orange"));
        System.out.println(fruit.containsKey("kiwi"));
        System.out.println(fruit.containsValue(10.5));
        System.out.println(fruit.isEmpty());
        fruit.replace("kiwi",14.2);
        System.out.println(fruit);


    }
}
