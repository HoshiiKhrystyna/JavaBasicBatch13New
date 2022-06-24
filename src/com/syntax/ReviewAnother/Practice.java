package com.syntax.ReviewAnother;

import com.syntax.reviewClass2.Doctor;

public class Practice extends Doctor {
    Practice(String name,String lastName){
        super(name,lastName);
    }
    public static void main (String [] args){
Doctor doc=new Doctor("John","Smith");
doc.printInfo();

    }
}
