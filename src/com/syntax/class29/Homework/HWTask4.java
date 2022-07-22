package com.syntax.class29.Homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HWTask4 {
    public static void main(String[] args) {
        HashMap<String,String> objects=new HashMap<>();
        objects.put("Pavlo","123");
        objects.put("Khrystyna","124");
        objects.put("Sasha","125");
        Set<String> keys= objects.keySet();
        for (String key : keys) {
            System.out.println("Names of students= "+key);
        }
    }
}
