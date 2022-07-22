package com.syntax.class27;

import com.syntax.class25.Abstraction;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> legends=new ArrayList<>();
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        ArrayList<String> moreStudents=new ArrayList<>();
        moreStudents.add("Jason");
        moreStudents.add("Handan");

        ArrayList<String> allStudends=new ArrayList<>();
        allStudends.addAll(legends);
        allStudends.addAll(moreStudents);
        System.out.println(allStudends);
        allStudends.removeAll(legends);
        System.out.println(allStudends);
allStudends.clear();
        System.out.println(allStudends);



    }
}
