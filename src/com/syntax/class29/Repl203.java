package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Repl203 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> obj=new LinkedHashMap<>();
        obj.put("Street","Patrick ST");
        obj.put("Suite","265");
        obj.put("City","Vienna");
        obj.put("Zip","22180");
        obj.put("Country","United State");
        Iterator<Map.Entry<String,String>> iterator=obj.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String,String> en=iterator.next();
            System.out.println( en.getValue());
        }
        }
    }

