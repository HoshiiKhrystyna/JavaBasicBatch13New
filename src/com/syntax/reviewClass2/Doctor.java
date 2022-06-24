package com.syntax.reviewClass2;

public class Doctor {
    String name,lastName,speciality;
    int experience;
    double salary;
    static String hospital;

    Doctor(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }

    Doctor(String name, String lastName, String speciality, int experience){
        this(name, lastName);
        this.speciality=speciality;
        this.experience=experience;
    }

    void printInfo(){
        System.out.println("Doctor name is "+name+" "+lastName+" and speciality is "+speciality);
    }
    void work(){
        System.out.println("Doctor name is "+name+" "+lastName+" works at "+hospital);
    }
}
