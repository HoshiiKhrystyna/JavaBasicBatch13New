package com.syntax.class29.Homework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HWTask2 {
    public static void main(String[] args) {
        Set<String> countries=new TreeSet<>();
        countries.add("Ukraine");
        countries.add("USA");
        countries.add("Pakistan");
        countries.add("New York");
        System.out.println(countries);

        System.out.println("-------------------------");

        for (String country : countries) {
            System.out.println(country);
        }
    }
}
