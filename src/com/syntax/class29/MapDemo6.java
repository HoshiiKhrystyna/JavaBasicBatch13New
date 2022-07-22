package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("mango",20.0);
        fruit.put("pear",10.0);
        fruit.put("Apple",4.0);
        fruit.put("orange",20.5);
        fruit.put("kiwi",10.5);
        Collection<Double> values=fruit.values();
        values.removeIf(value->value>10.2);
        System.out.println(fruit);
    }
}
