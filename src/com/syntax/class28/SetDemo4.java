package com.syntax.class28;

import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        TreeSet<String> letters=new TreeSet<>();
        letters.add("z");
        letters.add("b");
        letters.add("a");
        letters.add("c");
        System.out.println(letters);


        TreeSet<String> letters1=new TreeSet<>();
        letters1.add("az");
        letters1.add("bb");
        letters1.add("ca");
        letters1.add("dc");
        System.out.println(letters1);
    }
}
