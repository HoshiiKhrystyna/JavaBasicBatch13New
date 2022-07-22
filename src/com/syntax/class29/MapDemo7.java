package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("mango",20.0);
        fruit.put("pear",10.0);
        fruit.put("Apple",4.0);
        fruit.put("orange",20.5);
        fruit.put("kiwi",10.5);
 Set<Map.Entry<String,Double>> entries=fruit.entrySet();
      //if key contains the letter "e" and if its price is greater than 10.2
      entries.removeIf(entry->entry.getKey().contains("e")&&entry.getValue()>10.2);
        System.out.println(fruit);
    }
}
