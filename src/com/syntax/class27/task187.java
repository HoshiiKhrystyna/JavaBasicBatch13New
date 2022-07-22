package com.syntax.class27;

import java.util.ArrayList;
import java.util.Scanner;

public class task187 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("hi");
        list.add("yo");
        list.add("sup");
        list.add("yolo");
        list.add("boop");

        System.out.print(list.get(1)+" ");
        System.out.print(list.get(3));

        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0; i<5; i++){
            list1.add(scanner.nextInt());
        }
    for(int list2:list1){
        System.out.print(list2);
    }
    }
}
