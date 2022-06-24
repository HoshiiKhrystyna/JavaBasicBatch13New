package com.syntax.class18;

public class CarTester {
    public static void main(String[] args){
        Car car=new Car("BMW","m4","black");
        car.printInfo();
Car car1=new Car("Audi", "Q8","white");
car1.printInfo();

Car car2=new Car("Tesla");
car2.printCarModel();
    }

}
