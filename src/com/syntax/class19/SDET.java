package com.syntax.class19;

public class SDET extends Human {
    boolean goodWithJava;
    SDET(String name,String eyeColor, String job,int age,boolean goodWithJava){
        this.name=name;
        this.eyeColor=eyeColor;
        this.age=age;
        this.job=job;
        this.goodWithJava=goodWithJava;
    }
    void printInfo(){
        System.out.println("My name is "+name+" i do "+job+" i good with Java "+goodWithJava);
    }
    public static void main (String [] args){
        SDET sdet=new SDET("Pavlo","brown","Tester",30,true);
        sdet.printInfo();
    }
}
