package com.syntax.class19;

public class Task5Student {
    double g1Marks;
    double g2Marks;
    double g3Marks;
String name;
    Task5Student(String name, double grade1Marks,double grade2Marks, double grade3Marks ){
g1Marks=grade1Marks;
g2Marks=grade2Marks;
g3Marks=grade3Marks;
this.name=name;
    }
    public void calculateAverageGrade(){
        double avarageGrade=(g1Marks+g2Marks+g3Marks)/3;
        System.out.println(name+avarageGrade);
    }
}
