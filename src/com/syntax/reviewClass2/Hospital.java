package com.syntax.reviewClass2;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Pavlo","Hoshii");
        System.out.println(doc.name);
        System.out.println(doc.lastName);
        Doctor.hospital="USPS";
        doc.printInfo();
        doc.work();
        //creating another doctor
        Doctor doctor=new Doctor("Joe","Doe","cardiology",10);
        doctor.printInfo();
        doctor.work();
        //changing value of static variables
        Doctor.hospital="Washington";
        doc.work();
        doctor.work();
        doc.lastName="Obama";
        doc.printInfo();
        doctor.printInfo();
        doc.hospital="Mayo Clinic";
        doc.work();
        doctor.work();
    }
}