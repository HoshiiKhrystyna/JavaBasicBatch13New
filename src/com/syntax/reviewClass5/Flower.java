package com.syntax.reviewClass5;

public class Flower {
    String color;
    Flower(String color){
        this.color=color;//we can use this keyword to distinquish
        //a local and instance variables
    }

    void showColor(){
        System.out.println("Flowers have beautiful colors");
    }
    void smell(){
        System.out.println("Flowers smell very good");
    }
    void bloom(){
        System.out.println("generally bloom in Spring");
    }
    class Rose extends Flower{
        Rose(String color) {
            super(color);
        }

        void showColor(){
            System.out.println("Roses have "+"Colors");
        }
    }
}
