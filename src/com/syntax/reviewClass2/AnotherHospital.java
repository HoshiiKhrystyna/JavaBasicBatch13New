package com.syntax.reviewClass2;

public class AnotherHospital {
    public static void main(String args[]) {
        Doctor doc = new Doctor("Sherlok", "Homes", "magic", 10);
        //access method to test visibility
        doc.printInfo();
        doc.work();
        doc.treat("LOg");
        Doctor.study("US");
    }
}