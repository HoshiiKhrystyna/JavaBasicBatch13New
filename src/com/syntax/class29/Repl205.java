package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Repl205 {
    public static void main(String[] args) {
        HashMap<String,String> obj=new HashMap<>();
        obj.put("Street","Patrick ST");
        obj.put("Suite","265");
        obj.put("City","Vienna");
        obj.put("Zip","22180");
        obj.put("Country","United State");
        for (String value : obj.values()) {
            System.out.println(value.toUpperCase());
        }




    }
}
