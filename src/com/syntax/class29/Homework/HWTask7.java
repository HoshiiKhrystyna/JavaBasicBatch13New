package com.syntax.class29.Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HWTask7 {
    public static void main(String[] args) {
        HashMap <Integer,String> bestBuy=new HashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879885,"TV");
        bestBuy.put(3439434,"IPad");
        Set<Map.Entry<Integer, String>> entries = bestBuy.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
        }
    }
}
