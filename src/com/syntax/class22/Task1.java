package com.syntax.class22;

public class Task1 {
/*
Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
 */
static void area(double length,double width){
    System.out.println("Area of rectangel "+length*width);
}
    static void area(double s){
        System.out.println("Area of square"+s*s);
    }

    void volume(double length,double width, double higth){
        System.out.println("Area of box "+(length*width*higth));
    }
    public static void main (String [] args){
    area(10);
    area(2,4);

    }
}
