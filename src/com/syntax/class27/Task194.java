package com.syntax.class27;

import java.util.LinkedList;
import java.util.List;

public class Task194 {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        for(int i=0; i<countries.size(); i++){
            if(countries.get(i).startsWith("A")){
                countries.remove(i);
            }
        }
        System.out.println(countries);
    }
}


