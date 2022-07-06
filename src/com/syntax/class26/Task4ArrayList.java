package com.syntax.class26;

import java.util.ArrayList;

public class Task4ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
      for(int i=1; i<500; i++){
          if(i%2==0){
              numbers.add(i);
          }
      }
      for(int i=0; i<numbers.size(); i++){
          if(numbers.get(i)/5==0){
              numbers.remove(i);

          }
      }
        System.out.println(numbers);
    }
}
