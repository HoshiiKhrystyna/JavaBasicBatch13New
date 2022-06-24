package com.syntax.class18;

public class Car {
   private String make;
 private   String model;
   private String color;
   public Car(){

   }
    public Car(String carMake, String carModel, String carColor){
        make=carMake;
        model=carModel;
        color=carColor;
    }
    public Car(String carModel){
       model=carModel;
    }
    void printCarModel(){
        System.out.println("Model "+model);
    }
    void printInfo(){
        System.out.println("Carmake "+make+" model "+model+" color "+color);
    }

}
