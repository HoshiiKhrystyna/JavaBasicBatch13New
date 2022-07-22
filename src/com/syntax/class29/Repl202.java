package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Repl202 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> obj=new LinkedHashMap<>();
        obj.put("1 item","apple");
        obj.put("2 item","banana");
        obj.put("3 item","pear");
        obj.put("4 item","tomato");
        obj.put("5 item","mango");
        obj.put("6 item","kiwi");
        for (Map.Entry<String, String> entry : obj.entrySet()) {
            System.out.println("key is "+entry.getKey()+" abd value is "+entry.getValue());
        }
    }
}
