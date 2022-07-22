package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;

public class Pepl203 {
    public static void main(String[] args) {
        HashMap<String,Integer> obj=new HashMap<>();
        obj.put("mango",10);
        obj.put("apple",30);
        obj.put("orange",20);
        obj.put("mango",40);
        obj.put("mango",40);
        for (Map.Entry<String, Integer> entry : obj.entrySet()) {
            System.out.println("Key = "+entry.getKey()+" and value = "+entry.getValue());
        }
    }
}
