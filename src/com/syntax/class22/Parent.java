package com.syntax.class22;

public class Parent {
    String name;
    void getMarried(){
        System.out.println("Hey hamid we have found a girl for you");
    }
}
class Hamid extends Parent{
  //  void getMarried(){
    //    System.out.println("I want to try on Tara first");

    public static void main(String [] args){
        Hamid hamid=new Hamid();
        hamid.getMarried();
    }
}