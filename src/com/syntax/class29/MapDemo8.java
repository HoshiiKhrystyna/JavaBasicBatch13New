package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo8 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("mango",20.0);
        fruit.put("pear",10.0);
        fruit.put("Apple",4.0);
        fruit.put("orange",20.5);
        fruit.put("kiwi",10.5);

        Iterator<Map.Entry<String,Double>>iterator=fruit.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Double> en=iterator.next();
            if(en.getKey().contains("e")&& en.getValue()>10.2){
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}
