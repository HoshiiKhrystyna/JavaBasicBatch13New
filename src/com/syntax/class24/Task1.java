package com.syntax.class24;

public class Task1 {
}
class Student{
     void study(){
        System.out.println("Student must study");
    }
    void doHW(){
        System.out.println("Student must to do HW");
    }
    void practice(){
        System.out.println("Student must practice");
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax student must learn programming");
    }
    void doHW(){
        System.out.println("Syntax student must do repls");
    }
    void practice(){
        System.out.println("Syntax student must practice to get a good job");
    }
}
class CollegeStudent extends Student{
    @Override
    void practice() {
        System.out.println("College students must practice to get good grades");
    }
}
class SchoolStudent extends Student{

}