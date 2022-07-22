package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String,Integer>grocery=new TreeMap<>();
        grocery.put("Apple",20);
        grocery.put("Water lemon",25);
        grocery.put("Peach",10);
        grocery.put("Strawberry",100);

        HashMap<String,Integer>cosmetics=new HashMap<>();
        cosmetics.put("foundation",20);
        cosmetics.put("lipstick",25);
        cosmetics.put("mascara",10);
        cosmetics.put("blush",100);

        LinkedHashMap<String,Integer> gr=new LinkedHashMap<>();
        gr.putAll(grocery);
        gr.putAll(cosmetics);
        System.out.println(gr);

    }
}
