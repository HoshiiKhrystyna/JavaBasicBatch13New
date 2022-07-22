package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.add("Come");
       words.add("Frame");
       // wordsadd("Game");
      //  for (String word : words) {
      //      if(word.endsWith("e")){
        //        words.remove(word);
       //     }

     //   }
      //  for(int i=0; i< words.size(); i++){
        //    if(words.get(i).endsWith("e")){
         //       words.remove(i);
          //
         //   }
       // }
      //  System.out.println(words);
        Iterator<String> iterator=words.iterator();
      //  System.out.println(iterator.hasNext());
      //  System.out.println(iterator.next());
      //  System.out.println(iterator.hasNext());
     //   System.out.println(iterator.next());
       // System.out.println(iterator.hasNext());
      //  System.out.println(iterator.next());//error
      while (iterator.hasNext()){
         if(iterator.next().endsWith(("e"))){
             iterator.remove();
         }
      }
        System.out.println(words);
    }
}
//word.removeIf(n -> n.endsWith("e"));  enother way, n is String name it how you want
//System.out.println(words)
