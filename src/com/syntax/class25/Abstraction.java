package com.syntax.class25;

public class Abstraction {
    public static void main(String[] args) {
    Lemon lemon=new Lemon("Lemon");
    lemon.addSugar();
    ChaiTea chai=new ChaiTea("Chai");
    chai.addSugar();


}
    }

abstract class Tea{
    String  teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar();
}
class Lemon extends Tea{

    Lemon(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For Lemon Tea we need 2 spoon of sugar");
    }
}
class ChaiTea extends Tea{


    ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For Chai Tea we need 1 spoon of sugar");
    }
}
