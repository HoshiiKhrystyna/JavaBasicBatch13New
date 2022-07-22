package com.syntax.class28;

public class Task6 {
    public static void main(String[] args) {

    }
}
abstract class Insurance{
    String insuranceName;
    public abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Insurance{
String carModel;

    @Override
    public void getQuote() {

    }

    @Override
    void cancelInsurance() {

    }
}
class Pet extends Insurance{
    String petType;

    @Override
    public void getQuote() {

    }

    @Override
    void cancelInsurance() {

    }
}
class Health extends Insurance{

    @Override
    public void getQuote() {

    }

    @Override
    void cancelInsurance() {

    }
}