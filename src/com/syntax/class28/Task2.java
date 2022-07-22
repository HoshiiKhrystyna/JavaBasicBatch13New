package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Togg");
        cars.add("Tesla");

        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("_____________________________________");
        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("-------------------------------------");
        System.out.println(cars);
        System.out.println("----------------------------------------");
        Iterator<String> iterator=cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------------------");
        cars.forEach(System.out::println);
    }
}
