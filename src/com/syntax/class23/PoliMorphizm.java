package com.syntax.class23;

public class PoliMorphizm {

    void doSomething(String name){
        System.out.println("downloading a movie from the internet "+name);
    }
    void doSomething(int num){
        System.out.println("calculating the text based on new rules ");
    }
}
class PoloMorphizmTester{
    public static void main (String [] args){
        PoliMorphizm p=new PoliMorphizm();
        p.doSomething(10);

    }
}