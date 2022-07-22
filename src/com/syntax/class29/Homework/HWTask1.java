package com.syntax.class29.Homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HWTask1 {
    public static void main(String[] args) {
       // How can you remove all duplicates from ArrayList?
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        HashSet<String> hs=new HashSet<>(aList);
        System.out.println(hs);




    }
}
