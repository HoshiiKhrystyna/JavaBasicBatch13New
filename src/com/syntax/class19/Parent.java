package com.syntax.class19;

public class Parent {
    String name="Khrystyna";
    double money=100000;

}
class Child extends Parent {
    void printInfo(){
        System.out.println("My full name is Khrystyna "+name);
    }
    void buyCar(){
        System.out.println("Hehehe buing car Papas money "+money);
    }
}
class Tester{
    public static void main (String [] args){
        Child child=new Child();
        child.printInfo();
        child.buyCar();
    }
}