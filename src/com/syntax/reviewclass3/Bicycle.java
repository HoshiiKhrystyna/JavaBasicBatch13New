package com.syntax.reviewclass3;

public class Bicycle {
    String make;
    int years;
    int maxSpeed;

    public Bicycle(String make, int years, int maxSpeed) {
        this.make = make;
        this.years = years;
        this.maxSpeed = maxSpeed;
    }

    void ride(){
        System.out.println("Its time to drive Bicycles");
    }
    void applyBreak(){
        System.out.println("Applying brakes");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "make='" + make + '\'' +
                ", years=" + years +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

class MountainBikes extends Bicycle{
    boolean suspension=true;
    int seatHeight;

    public MountainBikes(String make, int years, int maxSpeed, int seatHeight) {
        super(make, years, maxSpeed);
        this.seatHeight=seatHeight;
    }

    void setSeatHeight(int seatHeight){
        this.seatHeight=seatHeight;
    }
}
class Test{
    public static void main(String[] args) {

        Bicycle bike = new Bicycle("Trek",4,30);
        Bicycle bike2=new Bicycle("Trek",4,30);
       // System.out.println(bike);
        System.out.println(bike==bike2);//we should never use ==to compare  nonprimitive data tipe
        System.out.println(bike.equals(bike2));
        String name=new String("Pavlo");
        String name2=new String("pavlo");
        System.out.println(name.equals(name2));
    }}