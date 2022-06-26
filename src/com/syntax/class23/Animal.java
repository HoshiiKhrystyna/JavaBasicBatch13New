package com.syntax.class23;

public class Animal {
    Animal(){
        System.out.println("Parent");
    }
    void eat(){
        System.out.println("all the animal eat");
    }
}
class Panda extends Animal{

    //no other class can inherit from animal class because it is declared final
    void eat(){
        System.out.println("all the animal eat");
    }
    Panda(){
        System.out.println("child");
    }
}
class Tester{
    public static void main(String [] args){
        new Panda();
    }
}