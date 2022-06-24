package com.syntax.class21;

public class Task3 {
    static void print(){
        System.out.println("First overloading");
    }
    static void print(String str){
        System.out.println(str+" overloading");
    }
    static void print(int num){
        System.out.println("Overloading "+num);
    }
    public static void main (String [] args){
        print();
        print(3);
        print("The second");
    }
}
