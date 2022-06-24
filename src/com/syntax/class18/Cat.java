package com.syntax.class18;

public class Cat {
    String name;
    String breed;
    String color;
    int age;
    double weigth;

    public Cat(String name, String breed, String color, int age, double weigth) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weigth = weigth;
    }
    void print(){
        System.out.println(name);
    }
}
