package com.syntax.class29.Homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HWTask3 {
    public static void main(String[] args) {
        Set<String> cities=new LinkedHashSet<>();
        cities.add("Kyiv");
        cities.add("Odesa");
        cities.add("Almaty");
        cities.add("Poltava");
        System.out.println(cities);
        Iterator<String> iterator= cities.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}
