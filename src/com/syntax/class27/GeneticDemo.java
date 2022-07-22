package com.syntax.class27;

import java.util.ArrayList;

public class GeneticDemo {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        //names.add(10); error can only insert String
        ArrayList all=new ArrayList();
        all.add(10);
        all.add("Name");
        all.add(10.5);
    }
}
