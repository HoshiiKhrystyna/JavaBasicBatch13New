package com.syntax.class21;

public class Programming {


     void programming(){
        System.out.println("I love programming language");
    }
    void programming (String str){
        System.out.println("I love "+str);
    }

    public static void main (String [] args){
         Programming pro=new Programming();
         pro.programming();
         pro.programming("Java");
    }
}
