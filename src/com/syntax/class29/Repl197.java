package com.syntax.class29;

import java.util.*;

public class Repl197 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> obj=new LinkedHashMap<>();
        obj.put("Street","Patrick ST");
        obj.put("Suite","265");
        obj.put("City","Vienna");
        obj.put("Zip","22180");
        obj.put("Country","United State");
        Set<Map.Entry<String,String>> entries =obj.entrySet();
        System.out.println(  entries.size());
        entries.removeAll(entries);
        System.out.println(entries.size());


    }
}
