package com.syntax.class26;

abstract class Vehicle {
  static  double vehiclePrice;
     abstract double calculateSalePrice();}
class Sedan extends Vehicle{
double length;
double calculateSalePrice() {
        if(length>20){
        vehiclePrice=vehiclePrice*0.05;
        }else{
            vehiclePrice=vehiclePrice*0.1;
        }
    return vehiclePrice;
}}
class Truck extends Vehicle{
   double weight;
   double calculateSalePrice(){

 if(weight>2000){
   vehiclePrice=vehiclePrice*0.1;
 }else{
     vehiclePrice=vehiclePrice*0.2;
 }
       return vehiclePrice;
   }
}
class TesterVehicle{
    public static void main(String[] args) {
Vehicle.vehiclePrice=30000;
Sedan sedan=new Sedan();
sedan.length=20;
        System.out.println("Sedan price is "+ sedan.calculateSalePrice());
        Truck truck=new Truck();
        truck.weight=12000;
        System.out.println("Truck price is "+truck.calculateSalePrice());

    }
}