package com.syntax.class29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double>fruit=new HashMap<>();
        fruit.put("mango",20.0);
        fruit.put("pear",10.0);
        fruit.put("Apple",4.0);
        fruit.put("orange",20.5);
        fruit.put("kiwi",10.5);
        Set<String> keys=fruit.keySet();
        for (String key : keys) {
            System.out.println("key = "+key);
        }
        //All the values in the form of a collection
Collection<Double> values=  fruit.values();
        for(Double value:values){
            System.out.println("value ="+value);
        }

    }
}
