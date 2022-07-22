package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("mango",20.0);
        fruit.put("pear",10.0);
        fruit.put("Apple",4.0);
        fruit.put("orange",20.5);
        fruit.put("kiwi",10.5);

       Set<String> keys= fruit.keySet();
       //error, cannot use this
     //  for(String key:keys){
        //   if(key.contains("e")) {
          //     fruit.remove(key);
         //  }
      // }
        Iterator<String> iterator= keys.iterator();
        while(iterator.hasNext()){
            if(iterator.next().contains("e")){
                iterator.remove();
            }
        }
        System.out.println(fruit);
        System.out.println("==============================");

        keys.removeIf(s -> s.contains("e"));
        System.out.println(fruit);
    }
}
