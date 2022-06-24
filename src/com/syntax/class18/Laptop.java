package com.syntax.class18;

public class Laptop {
    String make;
    String model;
    String storage;
    String memory;
    double screenSize;

    public Laptop(String make) {
        this.make = make;

    }

    public Laptop(String make, String model, String storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;

    }

    public Laptop(String make, String model, String storage, String memory) {
        //this.make = make;
       // this.model = model;
       // this.storage = storage;
       // this.memory = memory;
this(make, model, storage);
this.memory=memory;
    }
    public Laptop(String make, String model, String storage, String memory,double screenSize) {
        //this.make = make;
       // this.model = model;
       // this.storage = storage;
        //this.memory = memory;
        this(make,model,storage,memory);
this.screenSize=screenSize;
    }
    public static void main (String[] args){
        Laptop apple=new Laptop("Apple","MPRO14","123","123",123);
    }
}