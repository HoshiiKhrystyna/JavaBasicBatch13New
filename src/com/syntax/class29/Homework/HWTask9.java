package com.syntax.class29.Homework;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HWTask9 {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();
        map.put("Pavlo", 50000.0);
        map.put("Sasha", 4000000.0);
        map.put("Khrystyna", 5000000.0);

        Set<Map.Entry<String, Double>> info = map.entrySet();
        Iterator<Map.Entry<String, Double>> iterator = info.iterator();
        Double maxValue = 0.0;

        String name = null;
        while (iterator.hasNext()) {
            Map.Entry<String, Double> it = iterator.next();
            if (it.getValue() > maxValue) {
                maxValue = it.getValue();
                name = it.getKey();
            }
        }
        System.out.println(name + "&"+ maxValue);
    }
}
