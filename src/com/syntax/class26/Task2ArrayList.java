package com.syntax.class26;

import java.util.ArrayList;

public class Task2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Jeep");
        cars.add("Audi");
for(String list:cars) {
    System.out.print(list + " ");
}
        System.out.println("------------------");
    for(int i=0; i<cars.size(); i++){
        System.out.print(cars.get(i)+" ");
    }
        System.out.println("--------------------");
        System.out.print(cars);
}
    }

