package com.syntax.class27;

import java.util.ArrayList;

public class a {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(111);
        obj.add(222);
        obj.add(333);
        obj.add(444);
        obj.add(555);
        obj.add(666);
        System.out.println(obj);
        obj.clear();
        System.out.println(obj);
    }
}
