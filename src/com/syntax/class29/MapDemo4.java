package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("mango",20.0);
        fruit.put("pear",10.0);
        fruit.put("Apple",4.0);
        fruit.put("orange",20.5);
        fruit.put("kiwi",10.5);
        Set<Map.Entry<String,Double>> entries=fruit.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println("entry = "+entry);
        }
    }
}
