package com.syntax.class22;

public class Task3 {
}
class Programming{
    Programming(){
        System.out.println("I love programming");
    }
    Programming(String str){
        System.out.println("I love "+str);
    }
    public static void main (String [] args){
        new Programming();
        new Programming("Java");
    }
}
