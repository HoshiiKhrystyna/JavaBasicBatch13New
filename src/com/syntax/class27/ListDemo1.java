package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> legends=new ArrayList<>();
        //we can store the object of a class inside a variable of type parent class
        //interface if that class implements that interface
        legends.add("Pavlo");
        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Khrystyna"));//
Object [] arr=legends.toArray();
        System.out.println(arr[0]);
        System.out.println(legends);
        legends.remove("Pavlo");
        System.out.println(legends);
List<String> someStudents=new ArrayList<>();
someStudents.add("Abdul");
someStudents.add("Hamid");
        System.out.println(legends.containsAll(someStudents));








    }
}
