package com.syntax.class19;

public class ClassA {
    public static void printF(){
        System.out.println("Used static method");
    }
    public void printInfo() {
        System.out.println("A");
    }
}class ClassB extends ClassA{
    void printInfo1(){
        System.out.println(" B");
    }
}class ClassC extends ClassB{
    void printInfo2(){
        System.out.println("C");
    }
}
class TesterABC{
    public static void main (String [] args){
        ClassC a=new ClassC();
        a.printInfo(); a.printInfo1(); a.printInfo2(); ClassB.printF();
    }
}