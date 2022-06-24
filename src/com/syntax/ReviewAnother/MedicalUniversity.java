package com.syntax.ReviewAnother;

import com.syntax.reviewClass2.Doctor;

public class MedicalUniversity {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Gohn","Smith");
        doc.printInfo();
        Doctor.study("GW");
    }
}