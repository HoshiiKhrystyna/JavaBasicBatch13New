package com.syntax.class20;

public class Bird {
    String name;
    String color;
    int age;
    double weigth;
    Bird(String name,String color, int age, double weigth){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weigth=weigth;
    }
    void printInfo(){
        System.out.println("Name "+name+" Color "+color);
    }
}
class Parrot extends Bird{
   Parrot(String name, String color, int age, double weigth){
       super(name,color,age,weigth);
   }

}
class Sparrow extends Bird{
    Sparrow(String name, String color, int age, double weigth){
        super(name,color,age,weigth);
    }

}