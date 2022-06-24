package com.syntax.class22;

public class Task2 {
    static void sayHello(){
        System.out.println("Hello Batch 13");
    }
    static void sayHello(String str){
        System.out.println(str);
    }
    static void sayHello(String str,int times){
        for(int i=0;i<times;i++)
        System.out.println(str);
    }
    public static void main(String [] args){
        sayHello("Pavlo",5);
    }
}
