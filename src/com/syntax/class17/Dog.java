package com.syntax.class17;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weigth;
    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeigth){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        if(dogAge<25){
            age=dogAge;
        }else{
            System.out.println("noth");
        }
        weigth=dogWeigth;

    }
    void printInfo(){
        System.out.println("name "+name+" breed "+breed+" color"+color+" weigth "+weigth);

    }
    public static void main (String[] args){
     //   Dog dog=new Dog();
       // dog.name="Jek";
       // dog.breed="Gernan";
       // dog.color="black";
       // dog.age=15;
       // dog.weigth=28;
        //dog.printInfo();

       // Dog dog1=new Dog();
       // dog1.name="Jeksr";
       // dog1.breed="Gernany";
       // dog1.color="white";
       // dog1.age=16;
      //  dog1.weigth=28;
       // dog1.printInfo();

}
         }