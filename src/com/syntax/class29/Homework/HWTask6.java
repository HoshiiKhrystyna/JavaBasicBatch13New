package com.syntax.class29.Homework;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HWTask6 {
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington");
        countries.put("Ukraine","Kyiv");
        countries.put("GB","London");
        countries.put("Pakistan","Islamabad");
        countries.put("Australia","Canverra");

        for (String s : countries.keySet()) {
            System.out.println("All keys = "+s);
        }

        Iterator<String> iterator=countries.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------------------------");
        for (String value : countries.values()) {
            System.out.println("All values = "+value);
        }
        Iterator<String> itr = countries.values().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
