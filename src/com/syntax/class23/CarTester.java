package com.syntax.class23;

public class CarTester {
    public static void main (String [] args){
       // Car car=new Tesla();
     //   car.start();
      //  car=new Toyota();
      //  car.start();

        Car car=new BMW();
        car.start();
        car.stop();
        car.park();
        Car[] cars={new BMW(), new Tesla(),new Toyota()};
        for(Car c:cars){
            c.start();
            c.stop();
            c.park();
        }
    }
}
