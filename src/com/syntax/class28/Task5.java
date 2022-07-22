package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers=new ArrayList<>();
        for(int i=2; i<500; i+=2){
            evenNumbers.add(i);
        }
        System.out.println(evenNumbers);
      Iterator<Integer> iterator= evenNumbers.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }
        System.out.println(evenNumbers);

        System.out.println("============================");
        evenNumbers.removeIf(integer -> integer%5==0);
        System.out.println(evenNumbers);

    }
}
