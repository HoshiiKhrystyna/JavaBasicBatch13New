package com.syntax.class16continue;

public class Student {
    String name;
    int ID;
    static int numberOfStudents;
    public static void main (String [] args){
     Student student1=new Student();
     student1.name="Khrystyna";
     student1.ID=15;
     student1.numberOfStudents++;
        System.out.println("Student name is "+student1.name+" ID is "+student1.ID);
        System.out.println(Student.numberOfStudents);
     Student student2=new Student();
        student2.name="Sasha";
        student2.ID=16;
        student2.numberOfStudents++;
        System.out.println("Student name is "+student2.name+" ID is "+student2.ID);
        System.out.println(Student.numberOfStudents);
        Student student3=new Student();
        student3.name="Pavlo";
        student3.ID=17;
        student3.numberOfStudents++;
        System.out.println("Student name is "+student3.name+" ID is "+student3.ID);
        System.out.println(Student.numberOfStudents);
    }

}
