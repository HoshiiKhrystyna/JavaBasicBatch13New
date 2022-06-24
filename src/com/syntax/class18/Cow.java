package com.syntax.class18;

public class Cow {
    String breed;
    String color;
    int age;
    double weigth;
    Cow(String breed, String color, int age, double weigth){
        //when we have samename variables as local
        //or instance a class always local variables are
        //preferd over instance variables in java in block
        //of code
        this.breed=breed;
        this.color=color;
        this.age=age;
        this.weigth=weigth;
    }
    String getCowInfo(){

        return "Breed "+breed+"Color "+color+"age "+age+"weigth "+weigth;
    }
}
